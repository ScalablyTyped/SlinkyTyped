package typingsSlinky.knuddelsUserappsApi.mod.global

import typingsSlinky.knuddelsUserappsApi.mod.KnuddelsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html
	 */
@JSGlobal("AppContentSession")
@js.native
class AppContentSession () extends js.Object {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_getAppContent
  		 */
  def getAppContent(): AppContent = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_getAppViewMode
  		 */
  def getAppViewMode(): AppViewMode = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_getUser
  		 */
  def getUser(): User = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_remove
  		 */
  def remove(): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/AppContentSession.html#method_sendEvent
  		 */
  def sendEvent(`type`: java.lang.String): Unit = js.native
  def sendEvent(`type`: java.lang.String, data: KnuddelsEvent): Unit = js.native
}
