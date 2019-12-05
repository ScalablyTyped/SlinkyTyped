package typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseHtmlMod

import typingsSlinky.actionsDashOnDashGoogle.distCommonMod.JsonObject
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/html", "HtmlResponse")
@js.native
/**
  * @param options Canvas options
  * @public
  */
class HtmlResponse[TData /* <: JsonObject */] () extends GoogleActionsV2UiElementsHtmlResponse {
  def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
  def this(options: HtmlResponseOptions[TData]) = this()
  /** @public */
  /** @public */
  var data: TData = js.native
  /** @public */
  /** @public */
  var suppress: Boolean = js.native
}

