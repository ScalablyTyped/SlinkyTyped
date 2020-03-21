package typingsSlinky.knuddelsUserappsApi.mod._Global_

import typingsSlinky.knuddelsUserappsApi.AnonMethod
import typingsSlinky.knuddelsUserappsApi.AnonOnFailure
import typingsSlinky.knuddelsUserappsApi.AnonOnSuccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html
	 */
@JSGlobal("ExternalServerAccess")
@js.native
class ExternalServerAccess () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_callURL
  		 */
  def callURL(urlString: java.lang.String): Unit = js.native
  def callURL(urlString: java.lang.String, parameters: AnonMethod): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_canAccessURL
  		 */
  def canAccessURL(urlString: java.lang.String): Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_getAllAccessibleDomains
  		 */
  def getAllAccessibleDomains(): js.Array[Domain] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_getURL
  		 */
  def getURL(urlString: java.lang.String): Unit = js.native
  def getURL(urlString: java.lang.String, parameters: AnonOnFailure): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_postURL
  		 */
  def postURL(urlString: java.lang.String): Unit = js.native
  def postURL(urlString: java.lang.String, parameters: AnonOnSuccess): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_touchURL
  		 */
  def touchURL(urlString: java.lang.String): Unit = js.native
  def touchURL(urlString: java.lang.String, parameters: AnonOnFailure): Unit = js.native
}

