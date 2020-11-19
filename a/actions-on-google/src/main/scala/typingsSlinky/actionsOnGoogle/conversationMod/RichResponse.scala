package typingsSlinky.actionsOnGoogle.conversationMod

import typingsSlinky.actionsOnGoogle.richMod.RichResponseItem
import typingsSlinky.actionsOnGoogle.richMod.RichResponseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation", "RichResponse")
@js.native
class RichResponse protected ()
  extends typingsSlinky.actionsOnGoogle.responseMod.RichResponse {
  /**
    * @param items RichResponse items
    * @public
    */
  def this(items: RichResponseItem*) = this()
  /**
    * @param items RichResponse items
    * @public
    */
  def this(items: js.Array[RichResponseItem]) = this()
  /**
    * @param options RichResponse options
    * @public
    */
  def this(options: RichResponseOptions) = this()
}
