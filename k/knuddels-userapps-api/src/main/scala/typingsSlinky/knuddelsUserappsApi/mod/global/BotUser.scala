package typingsSlinky.knuddelsUserappsApi.mod.global

import typingsSlinky.knuddelsUserappsApi.anon.DisplayReasonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/BotUser.html
	 */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.knuddelsUserappsApi.mod.KnuddelsJsonData because Already inherited
- typingsSlinky.knuddelsUserappsApi.mod.KnuddelsSerializable because Already inherited */ @JSGlobal("BotUser")
@js.native
class BotUser () extends User {
  def sendPostMessage(topic: java.lang.String, text: java.lang.String, receivingUser: User): Unit = js.native
  def sendPrivateMessage(message: java.lang.String, users: js.Array[User]): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_sendPublicActionMessage
  		 */
  def sendPublicActionMessage(actionMessage: java.lang.String): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_sendPublicMessage
  		 */
  def sendPublicMessage(message: java.lang.String): Unit = js.native
  def transferKnuddel(receivingUserOrAccount: KnuddelAccount, knuddelAmount: KnuddelAmount): Unit = js.native
  def transferKnuddel(
    receivingUserOrAccount: KnuddelAccount,
    knuddelAmount: KnuddelAmount,
    parameters: DisplayReasonText
  ): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/BotUser.html#method_transferKnuddel
  		 */
  def transferKnuddel(receivingUserOrAccount: User, knuddelAmount: KnuddelAmount): Unit = js.native
  def transferKnuddel(receivingUserOrAccount: User, knuddelAmount: KnuddelAmount, parameters: DisplayReasonText): Unit = js.native
}

