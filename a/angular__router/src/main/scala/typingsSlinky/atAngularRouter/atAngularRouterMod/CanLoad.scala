package typingsSlinky.atAngularRouter.atAngularRouterMod

import typingsSlinky.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanLoad extends js.Object {
  def canLoad(route: Route, segments: js.Array[UrlSegment]): Observable[Boolean] | js.Promise[Boolean] | Boolean
}

object CanLoad {
  @scala.inline
  def apply(canLoad: (Route, js.Array[UrlSegment]) => Observable[Boolean] | js.Promise[Boolean] | Boolean): CanLoad = {
    val __obj = js.Dynamic.literal(canLoad = js.Any.fromFunction2(canLoad))
  
    __obj.asInstanceOf[CanLoad]
  }
}

