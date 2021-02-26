package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdBlockingConfiguration extends StObject {
  
  /** Click-through URL used by brand-neutral ads. This is a required field when overrideClickThroughUrl is set to true. */
  var clickThroughUrl: js.UndefOr[String] = js.native
  
  /** ID of a creative bundle to use for this campaign. If set, brand-neutral ads will select creatives from this bundle. Otherwise, a default transparent pixel will be used. */
  var creativeBundleId: js.UndefOr[String] = js.native
  
  /**
    * Whether this campaign has enabled ad blocking. When true, ad blocking is enabled for placements in the campaign, but this may be overridden by site and placement settings. When
    * false, ad blocking is disabled for all placements under the campaign, regardless of site and placement settings.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the brand-neutral ad's click-through URL comes from the campaign's creative bundle or the override URL. Must be set to true if ad blocking is enabled and no creative bundle
    * is configured.
    */
  var overrideClickThroughUrl: js.UndefOr[Boolean] = js.native
}
object AdBlockingConfiguration {
  
  @scala.inline
  def apply(): AdBlockingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdBlockingConfiguration]
  }
  
  @scala.inline
  implicit class AdBlockingConfigurationMutableBuilder[Self <: AdBlockingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClickThroughUrl(value: String): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    @scala.inline
    def setCreativeBundleId(value: String): Self = StObject.set(x, "creativeBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeBundleIdUndefined: Self = StObject.set(x, "creativeBundleId", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOverrideClickThroughUrl(value: Boolean): Self = StObject.set(x, "overrideClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideClickThroughUrlUndefined: Self = StObject.set(x, "overrideClickThroughUrl", js.undefined)
  }
}
