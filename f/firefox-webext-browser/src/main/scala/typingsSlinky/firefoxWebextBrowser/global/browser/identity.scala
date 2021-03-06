package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.identity.AccountInfo
import typingsSlinky.firefoxWebextBrowser.browser.identity.GetAuthTokenDetails
import typingsSlinky.firefoxWebextBrowser.browser.identity.GetProfileUserInfoReturnUserinfo
import typingsSlinky.firefoxWebextBrowser.browser.identity.LaunchWebAuthFlowDetails
import typingsSlinky.firefoxWebextBrowser.browser.identity.RemoveCachedAuthTokenDetails
import typingsSlinky.firefoxWebextBrowser.browser.identity.RemoveCachedAuthTokenReturnUserinfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the browser.identity API to get OAuth2 access tokens.
  *
  * Permissions: `identity`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object identity {
  
  /* identity functions */
  /**
    * Retrieves a list of AccountInfo objects describing the accounts present on the profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.identity.getAccounts")
  @js.native
  def getAccounts(): js.Promise[js.Array[AccountInfo]] = js.native
  
  /**
    * Gets an OAuth2 access token using the client ID and scopes specified in the oauth2 section of manifest.json.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.identity.getAuthToken")
  @js.native
  def getAuthToken(): js.Promise[js.Array[AccountInfo]] = js.native
  @JSGlobal("browser.identity.getAuthToken")
  @js.native
  def getAuthToken(details: GetAuthTokenDetails): js.Promise[js.Array[AccountInfo]] = js.native
  
  /**
    * Retrieves email address and obfuscated gaia id of the user signed into a profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.identity.getProfileUserInfo")
  @js.native
  def getProfileUserInfo(): js.Promise[GetProfileUserInfoReturnUserinfo] = js.native
  
  /**
    * Generates a redirect URL to be used in |launchWebAuthFlow|.
    * @param [path] The path appended to the end of the generated URL.
    */
  @JSGlobal("browser.identity.getRedirectURL")
  @js.native
  def getRedirectURL(): String = js.native
  @JSGlobal("browser.identity.getRedirectURL")
  @js.native
  def getRedirectURL(path: String): String = js.native
  
  /** Starts an auth flow at the specified URL. */
  @JSGlobal("browser.identity.launchWebAuthFlow")
  @js.native
  def launchWebAuthFlow(details: LaunchWebAuthFlowDetails): js.Promise[String] = js.native
  
  /* identity events */
  /**
    * Fired when signin state changes for an account on the user's profile.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.identity.onSignInChanged")
  @js.native
  val onSignInChanged: js.UndefOr[
    WebExtEvent[js.Function2[/* account */ AccountInfo, /* signedIn */ Boolean, Unit]]
  ] = js.native
  
  /**
    * Removes an OAuth2 access token from the Identity API's token cache.
    * @deprecated Unsupported on Firefox at this time.
    */
  @JSGlobal("browser.identity.removeCachedAuthToken")
  @js.native
  def removeCachedAuthToken(details: RemoveCachedAuthTokenDetails): js.Promise[RemoveCachedAuthTokenReturnUserinfo] = js.native
}
