package typingsSlinky.actionsOnGoogle.mod

import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import typingsSlinky.actionsOnGoogle.htmlMod.HtmlResponseOptions
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsHtmlResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "HtmlResponse")
@js.native
/**
  * @param options Canvas options
  * @public
  */
class HtmlResponse[TData /* <: JsonObject */] ()
  extends typingsSlinky.actionsOnGoogle.actionssdkMod.HtmlResponse[TData] {
  def this(options: HtmlResponseOptions[TData]) = this()
  def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
}

