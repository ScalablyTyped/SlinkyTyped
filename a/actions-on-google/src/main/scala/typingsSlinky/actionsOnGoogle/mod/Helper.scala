package typingsSlinky.actionsOnGoogle.mod

import typingsSlinky.actionsOnGoogle.conversationConversationMod.Intent
import typingsSlinky.actionsOnGoogle.helperHelperMod.HelperOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "Helper")
@js.native
class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
  extends typingsSlinky.actionsOnGoogle.actionssdkMod.Helper[TIntent, TValueSpec] {
  def this(options: HelperOptions[TIntent, TValueSpec]) = this()
}

