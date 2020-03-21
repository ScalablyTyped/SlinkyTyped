package typingsSlinky.actionsOnGoogle.helperHelperMod

import typingsSlinky.actionsOnGoogle.commonMod.ProtoAny
import typingsSlinky.actionsOnGoogle.conversationConversationMod.InputValueSpec
import typingsSlinky.actionsOnGoogle.conversationConversationMod.Intent
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2ExpectedIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/helper", "Helper")
@js.native
class Helper[TIntent /* <: Intent */, TValueSpec] protected () extends GoogleActionsV2ExpectedIntent {
  def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  @JSName("inputValueData")
  var inputValueData_Helper: ProtoAny[InputValueSpec, TValueSpec] = js.native
}

