package typingsSlinky.knuddelsUserappsApi.mod.global

import typingsSlinky.knuddelsUserappsApi.anon.Ascending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html
	 */
@JSGlobal("ToplistAccess")
@js.native
class ToplistAccess () extends js.Object {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_createOrUpdateToplist
  		 */
  def createOrUpdateToplist(userPersistenceNumberKey: java.lang.String, displayName: java.lang.String): Toplist = js.native
  def createOrUpdateToplist(userPersistenceNumberKey: java.lang.String, displayName: java.lang.String, parameters: Ascending): Toplist = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_getAllToplists
  		 */
  def getAllToplists(): js.Array[Toplist] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_getToplist
  		 */
  def getToplist(userPersistenceNumberKey: java.lang.String): Toplist = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ToplistAccess.html#method_removeToplist
  		 */
  def removeToplist(toplist: Toplist): Unit = js.native
}
