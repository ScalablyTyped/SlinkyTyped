package typingsSlinky.actionsOnGoogle.conversationMod

import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import typingsSlinky.actionsOnGoogle.htmlMod.HtmlResponseOptions
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsHtmlResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "HtmlResponse")
@js.native
/**
  * @param options Canvas options
  * @public
  */
class HtmlResponse[TData /* <: JsonObject */] ()
  extends typingsSlinky.actionsOnGoogle.responseMod.HtmlResponse[TData] {
  def this(options: HtmlResponseOptions[TData]) = this()
  def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
}
