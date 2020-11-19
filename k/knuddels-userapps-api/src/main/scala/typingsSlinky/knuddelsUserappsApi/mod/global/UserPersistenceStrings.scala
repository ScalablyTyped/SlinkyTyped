package typingsSlinky.knuddelsUserappsApi.mod.global

import typingsSlinky.knuddelsUserappsApi.anon.Online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html
	 */
@JSGlobal("UserPersistenceStrings")
@js.native
class UserPersistenceStrings () extends js.Object
/* static members */
@JSGlobal("UserPersistenceStrings")
@js.native
object UserPersistenceStrings extends js.Object {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_deleteAll
  		 * @since AppServer 82478
  		 */
  def deleteAll(key: java.lang.String): Double = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_each
  		 */
  def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ User, 
      /* value */ java.lang.String, 
      /* index */ Double, 
      /* totalCount */ Double, 
      /* key */ java.lang.String, 
      Boolean
    ]
  ): Unit = js.native
  def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ User, 
      /* value */ java.lang.String, 
      /* index */ Double, 
      /* totalCount */ Double, 
      /* key */ java.lang.String, 
      Boolean
    ],
    parameters: Online
  ): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_exists
  		 * @since AppServer 88571
  		 */
  def exists(key: java.lang.String, value: java.lang.String): Boolean = js.native
  def exists(key: java.lang.String, value: java.lang.String, ignoreCase: Boolean): Boolean = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceStrings.html#method_getAllKeys
  		 * @since AppServer 82483
  		 */
  def getAllKeys(): js.Array[java.lang.String] = js.native
  def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = js.native
}
