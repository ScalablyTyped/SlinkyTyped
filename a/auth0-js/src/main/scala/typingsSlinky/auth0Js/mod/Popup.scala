package typingsSlinky.auth0Js.mod

import typingsSlinky.auth0Js.anon.Audience
import typingsSlinky.auth0Js.anon.Connection
import typingsSlinky.auth0Js.anon.Email
import typingsSlinky.auth0Js.anon.Hash
import typingsSlinky.auth0Js.anon.ResponseMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0-js", "Popup")
@js.native
class Popup protected () extends js.Object {
  def this(client: js.Any, options: js.Any) = this()
  
  /**
    * Shows inside a new window the hosted login page (`/authorize`) in order to start a new authN/authZ transaction and post its result using `postMessage`.
    * @see {@link https://auth0.com/docs/api/authentication#authorize-client}
    */
  def authorize(options: Audience, callback: Auth0Callback[Auth0Result, Auth0Error]): Unit = js.native
  
  /**
    * Returns a new instance of the popup handler
    */
  /* private */ def buildPopupHandler(): js.Any = js.native
  
  /**
    * Handles the popup logic for the callback page.
    * @see {@link parseHash}
    */
  def callback(options: Hash): Unit = js.native
  
  /**
    * Performs authentication with username/email and password with a database connection inside a new window
    *
    * This method is not compatible with API Auth so if you need to fetch API tokens with audience
    * you should use {@link authorize} or {@link login}.
    */
  def loginWithCredentials(options: ResponseMode, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
  
  /**
    * Verifies the passwordless TOTP and returns the requested token
    */
  def passwordlessVerify(options: Email, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
  
  /**
    * Initializes the popup window and returns the instance to be used later in order to avoid being blocked by the browser.
    *
    * @param options: receives the window height and width and any other window feature to be sent to window.open
    */
  def preload(options: js.Any): js.Any = js.native
  
  /**
    * Signs up a new user and automatically logs the user in after the signup.
    *
    * This method is not compatible with API Auth so if you need to fetch API tokens with audience
    * you should use {@link authorize} or {@link signupAndAuthorize}.
    */
  def signupAndLogin(options: Connection, callback: Auth0Callback[_, Auth0Error]): Unit = js.native
}
