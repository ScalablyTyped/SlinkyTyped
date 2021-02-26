package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.WebExtEvent
import typingsSlinky.firefoxWebextBrowser.browser.userScripts.OnBeforeScriptUserScript
import typingsSlinky.firefoxWebextBrowser.browser.userScripts.RegisteredUserScript
import typingsSlinky.firefoxWebextBrowser.browser.userScripts.UserScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manifest keys: `user_scripts`, `user_scripts`
  *
  * Not allowed in: Devtools pages
  */
object userScripts {
  
  /* userScripts events */
  /**
    * Event called when a new userScript global has been created
    *
    * Allowed in: Content scripts only
    */
  @JSGlobal("browser.userScripts.onBeforeScript")
  @js.native
  val onBeforeScript: WebExtEvent[js.Function1[/* userScript */ OnBeforeScriptUserScript, Unit]] = js.native
  
  /* userScripts functions */
  /**
    * Register a user script programmatically given its `userScripts.UserScriptOptions`, and resolves to a `userScripts.RegisteredUserScript` instance
    */
  @JSGlobal("browser.userScripts.register")
  @js.native
  def register(userScriptOptions: UserScriptOptions): js.Promise[RegisteredUserScript] = js.native
}
