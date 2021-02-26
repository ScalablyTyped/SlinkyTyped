package typingsSlinky.chromeApps.chrome.networking.onc

import typingsSlinky.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes which networks to return. */
@js.native
trait Filter extends StObject {
  
  /**
    * If true, only include configured (saved) networks.
    * @default false
    */
  var configured: js.UndefOr[Boolean] = js.native
  
  /**
    * Maximum number of networks to return.
    * Use 0 for no limit
    * @default 1000 if unspecified.
    * */
  var limit: js.UndefOr[integer] = js.native
  
  /** The type of networks to return. */
  var networkType: NetworkType = js.native
  
  /**
    * If true, only include visible (physically connected or in-range) networks.
    * @default false
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object Filter {
  
  @scala.inline
  def apply(networkType: NetworkType): Filter = {
    val __obj = js.Dynamic.literal(networkType = networkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigured(value: Boolean): Self = StObject.set(x, "configured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguredUndefined: Self = StObject.set(x, "configured", js.undefined)
    
    @scala.inline
    def setLimit(value: integer): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNetworkType(value: NetworkType): Self = StObject.set(x, "networkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
