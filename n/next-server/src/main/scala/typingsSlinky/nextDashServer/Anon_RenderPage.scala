package typingsSlinky.nextDashServer

import typingsSlinky.nextDashServer.distLibUtilsMod.ComponentsEnhancer
import typingsSlinky.nextDashServer.distLibUtilsMod.RenderPage
import typingsSlinky.nextDashServer.distLibUtilsMod.RenderPageResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RenderPage extends js.Object {
  var renderPage: RenderPage
}

object Anon_RenderPage {
  @scala.inline
  def apply(
    renderPage: /* options */ js.UndefOr[ComponentsEnhancer] => RenderPageResult | js.Promise[RenderPageResult]
  ): Anon_RenderPage = {
    val __obj = js.Dynamic.literal(renderPage = js.Any.fromFunction1(renderPage))
  
    __obj.asInstanceOf[Anon_RenderPage]
  }
}

