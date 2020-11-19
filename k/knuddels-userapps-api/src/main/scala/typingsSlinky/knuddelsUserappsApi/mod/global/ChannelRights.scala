package typingsSlinky.knuddelsUserappsApi.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/ChannelRights.html
	 */
@JSGlobal("ChannelRights")
@js.native
class ChannelRights () extends js.Object {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ChannelRights.html#method_getChannelModerators
  		 */
  def getChannelModerators(): js.Array[User] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ChannelRights.html#method_getChannelOwners
  		 */
  def getChannelOwners(): js.Array[User] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ChannelRights.html#method_getEventModerators
  		 */
  def getEventModerators(): js.Array[User] = js.native
}
