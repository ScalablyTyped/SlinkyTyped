package typingsSlinky.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("amazon-cognito-auth-js", "CognitoAccessToken")
@js.native
class CognitoAccessToken protected () extends js.Object {
  /**
    * Constructs a new CognitoAccessToken object
    * @param AccessToken The JWT access token.
    */
  def this(AccessToken: String) = this()
  
  /**
    * @returns the token's payload.
    */
  def decodePayload(): js.Object = js.native
  
  /**
    * @returns the token's expiration (exp member).
    */
  def getExpiration(): Double = js.native
  
  /**
    * @returns the record's token.
    */
  def getJwtToken(): String = js.native
  
  /**
    * @returns the username from payload.
    */
  def getUsername(): String = js.native
  
  /**
    * Sets new value for access token.
    * @param accessToken The JWT access token.
    */
  def setJwtToken(accessToken: String): Unit = js.native
}
