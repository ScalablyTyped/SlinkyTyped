package typingsSlinky.realm.global.Realm

import typingsSlinky.realm.Realm.Credentials.AnonymousPayload
import typingsSlinky.realm.Realm.Credentials.ApiKeyPayload
import typingsSlinky.realm.Realm.Credentials.ApplePayload
import typingsSlinky.realm.Realm.Credentials.EmailPasswordPayload
import typingsSlinky.realm.Realm.Credentials.FacebookPayload
import typingsSlinky.realm.Realm.Credentials.FunctionPayload
import typingsSlinky.realm.Realm.Credentials.GooglePayload
import typingsSlinky.realm.Realm.Credentials.JWTPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: Add providerCapabilities?
/**
  * End-users enter credentials to authenticate toward your MongoDB Realm App.
  */
@JSGlobal("Realm.Credentials")
@js.native
class Credentials[PayloadType /* <: js.Object */] ()
  extends typingsSlinky.realm.Realm.Credentials[PayloadType]
/* static members */
@JSGlobal("Realm.Credentials")
@js.native
object Credentials extends js.Object {
  
  /**
    * Factory for `Credentials` which authenticate using the [Anonymous Provider](https://docs.mongodb.com/realm/authentication/anonymous/).
    *
    * @returns A `Credentials` object for logging in using `app.logIn`.
    */
  def anonymous(): typingsSlinky.realm.Realm.Credentials[AnonymousPayload] = js.native
  
  /**
    * Factory for `Credentials` which authenticate using the [Apple ID Provider](https://docs.mongodb.com/realm/authentication/apple/).
    *
    * @param idToken The id_token returned from Apple.
    * @returns A `Credentials` object for logging in using `app.logIn`.
    */
  def apple(idToken: String): typingsSlinky.realm.Realm.Credentials[ApplePayload] = js.native
  
  /**
    * Factory for `Credentials` which authenticate using the [Email/Password Provider](https://docs.mongodb.com/realm/authentication/email-password/).
    * Note: This was formerly known as the "Username/Password" provider.
    *
    * @param email The end-users email address.
    * @param password The end-users password.
    * @returns A `Credentials` object for logging in using `app.logIn`.
    */
  def emailPassword(email: String, password: String): typingsSlinky.realm.Realm.Credentials[EmailPasswordPayload] = js.native
  
  /**
    * Factory for `Credentials` which authenticate using the [Facebook Provider](https://docs.mongodb.com/realm/authentication/facebook/).
    *
    * @param accessToken The access token returned from Facebook.
    * @returns A `Credentials` object for logging in using `app.logIn`.
    */
  def facebook(accessToken: String): typingsSlinky.realm.Realm.Credentials[FacebookPayload] = js.native
  
  /**
    * Factory for `Credentials` which authenticate using the [Custom Function Provider](https://docs.mongodb.com/realm/authentication/custom-function/).
    *
    * @param payload The custom payload as expected by the server.
    * @returns A `Credentials` object for logging in using `app.logIn`.
    */
  def function[PayloadType /* <: FunctionPayload */](payload: PayloadType): typingsSlinky.realm.Realm.Credentials[PayloadType] = js.native
  
  /**
    * Factory for `Credentials` which authenticate using the [Google Provider](https://docs.mongodb.com/realm/authentication/google/).
    *
    * @param authCode The auth code returned from Google.
    * @returns A `Credentials` object for logging in using `app.logIn`.
    */
  def google(authCode: String): typingsSlinky.realm.Realm.Credentials[GooglePayload] = js.native
  
  /**
    * Factory for `Credentials` which authenticate using the [Custom JWT Provider](https://docs.mongodb.com/realm/authentication/custom-jwt/).
    *
    * @param token The JSON Web Token (JWT).
    * @returns A `Credentials` object for logging in using `app.logIn`.
    */
  def jwt(token: String): typingsSlinky.realm.Realm.Credentials[JWTPayload] = js.native
  
  /**
    * Factory for `Credentials` which authenticate using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
    *
    * @deprecated Use `Credentials.apiKey`.
    *
    * @param key The secret content of the API key.
    * @returns A `Credentials` object for logging in using `app.logIn`.
    */
  def serverApiKey(key: String): typingsSlinky.realm.Realm.Credentials[ApiKeyPayload] = js.native
  
  /**
    * Factory for `Credentials` which authenticate using the [API Key Provider](https://docs.mongodb.com/realm/authentication/api-key/).
    *
    * @deprecated Use `Credentials.apiKey`.
    *
    * @param key The secret content of the API key.
    * @returns A `Credentials` object for logging in using `app.logIn`.
    */
  def userApiKey(key: String): typingsSlinky.realm.Realm.Credentials[ApiKeyPayload] = js.native
}
