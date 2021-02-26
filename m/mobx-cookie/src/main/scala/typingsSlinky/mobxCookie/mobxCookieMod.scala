package typingsSlinky.mobxCookie

import typingsSlinky.jsCookie.mod.CookieAttributes
import typingsSlinky.node.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobxCookieMod {
  
  @JSImport("mobx-cookie/dist-types/mobx-cookie", JSImport.Default)
  @js.native
  class default protected () extends MobxCookie {
    def this(name: String) = this()
  }
  
  @js.native
  trait MobxCookie extends StObject {
    
    /**
      * Clear Timeout
      * Internal function for destroying the cookie expiry timer
      */
    def _clearTimeout(): Unit = js.native
    
    def _expiresToDateTime(expires: js.Date): String | js.Date = js.native
    /**
      * Expires To Date Time
      * Internal function to convert a js-cookie expires value to string date-time.
      */
    def _expiresToDateTime(expires: Double): String | js.Date = js.native
    
    def _expiresToMs(expires: js.Date): Double = js.native
    /**
      * Expires To Milliseconds
      * Internal function to convert a js-cookie expires value to milliseconds.
      */
    def _expiresToMs(expires: Double): Double = js.native
    
    var _name: String = js.native
    
    def _startTimeout(expires: js.Date): Unit = js.native
    /**
      * Start Timeout
      * Internal function for creating the cookie expiry timer
      */
    def _startTimeout(expires: Double): Unit = js.native
    
    /**
      * Sync Timeout
      * Internal function to start timer if an _expires_ cookie exists.
      */
    def _syncTimeout(): Unit = js.native
    
    var _timeout: js.UndefOr[Timeout] = js.native
    
    /**
      * [DEPRECATED] - Observe the value directly, e.g. store.cookie.value
      * Get
      * Use this to observe the value of the cookie
      */
    def get(): js.UndefOr[String] = js.native
    
    /**
      * Remove
      * Remove the cookie and reset the observable and timer
      */
    def remove(): Unit = js.native
    
    /**
      * Set
      * Set the value (and optional options) of the cookie. Also starts the
      * removal timer if options.expires is set
      */
    def set(value: String): Unit = js.native
    def set(value: String, options: CookieAttributes): Unit = js.native
    
    var value: js.UndefOr[String] = js.native
  }
}
