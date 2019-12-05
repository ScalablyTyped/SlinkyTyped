package typingsSlinky.actionsDashOnDashGoogle

import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCardOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardButtonMod.ButtonOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardTableMod.TableOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod._RichResponseItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationResponseCardMod extends js.Object {
  @js.native
  class BasicCard protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCard
       with _RichResponseItem {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @js.native
  class Button protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardButtonMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @js.native
  class Table protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardTableMod.Table
       with _RichResponseItem {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
}

