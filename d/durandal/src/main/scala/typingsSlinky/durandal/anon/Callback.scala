package typingsSlinky.durandal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var routePattern: js.RegExp
  def callback(fragment: String): Unit
}

object Callback {
  @scala.inline
  def apply(callback: String => Unit, routePattern: js.RegExp): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), routePattern = routePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}

