package typingsSlinky.saucelabs.mod

import typingsSlinky.saucelabs.saucelabsStrings.`eu-central-1`
import typingsSlinky.saucelabs.saucelabsStrings.`us-east-1`
import typingsSlinky.saucelabs.saucelabsStrings.`us-west-1`
import typingsSlinky.saucelabs.saucelabsStrings.eu
import typingsSlinky.saucelabs.saucelabsStrings.staging
import typingsSlinky.saucelabs.saucelabsStrings.us
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SauceLabsOptions extends StObject {
  
  /**
    * If you want to set request headers, as example {'User-Agent': 'node-saucelabs'}
    */
  var headers: js.UndefOr[js.Object] = js.native
  
  /**
    * If set to true you are accessing the headless Sauce instances (this discards the region option).
    */
  var headless: js.UndefOr[Boolean] = js.native
  
  /**
    * Your Sauce Labs access key.
    */
  var key: String = js.native
  
  /**
    * If you want to tunnel your API request through a proxy please provide your proxy URL.
    */
  var proxy: js.UndefOr[String] = js.native
  
  /**
    * Your Sauce Labs datacenter region. The following regions are available:
    *
    * - us-west-1 (short 'us')
    * - eu-central-1 (short 'eu')
    * - us-east-1 (headless)
    */
  var region: js.UndefOr[us | eu | `us-west-1` | `us-east-1` | `eu-central-1` | staging] = js.native
  
  /**
    * Your Sauce Labs username.
    */
  var user: String = js.native
}
object SauceLabsOptions {
  
  @scala.inline
  def apply(key: String, user: String): SauceLabsOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SauceLabsOptions]
  }
  
  @scala.inline
  implicit class SauceLabsOptionsMutableBuilder[Self <: SauceLabsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setRegion(value: us | eu | `us-west-1` | `us-east-1` | `eu-central-1` | staging): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
