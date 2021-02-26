package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * iOS related attributes to the Dynamic Link..
  */
@js.native
trait SchemaIosInfo extends StObject {
  
  /**
    * iOS App Store ID.
    */
  var iosAppStoreId: js.UndefOr[String] = js.native
  
  /**
    * iOS bundle ID of the app.
    */
  var iosBundleId: js.UndefOr[String] = js.native
  
  /**
    * Custom (destination) scheme to use for iOS. By default, we’ll use the
    * bundle ID as the custom scheme. Developer can override this behavior
    * using this param.
    */
  var iosCustomScheme: js.UndefOr[String] = js.native
  
  /**
    * Link to open on iOS if the app is not installed.
    */
  var iosFallbackLink: js.UndefOr[String] = js.native
  
  /**
    * iPad bundle ID of the app.
    */
  var iosIpadBundleId: js.UndefOr[String] = js.native
  
  /**
    * If specified, this overrides the ios_fallback_link value on iPads.
    */
  var iosIpadFallbackLink: js.UndefOr[String] = js.native
  
  /**
    * iOS minimum version.
    */
  var iosMinimumVersion: js.UndefOr[String] = js.native
}
object SchemaIosInfo {
  
  @scala.inline
  def apply(): SchemaIosInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosInfo]
  }
  
  @scala.inline
  implicit class SchemaIosInfoMutableBuilder[Self <: SchemaIosInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIosAppStoreId(value: String): Self = StObject.set(x, "iosAppStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosAppStoreIdUndefined: Self = StObject.set(x, "iosAppStoreId", js.undefined)
    
    @scala.inline
    def setIosBundleId(value: String): Self = StObject.set(x, "iosBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosBundleIdUndefined: Self = StObject.set(x, "iosBundleId", js.undefined)
    
    @scala.inline
    def setIosCustomScheme(value: String): Self = StObject.set(x, "iosCustomScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosCustomSchemeUndefined: Self = StObject.set(x, "iosCustomScheme", js.undefined)
    
    @scala.inline
    def setIosFallbackLink(value: String): Self = StObject.set(x, "iosFallbackLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosFallbackLinkUndefined: Self = StObject.set(x, "iosFallbackLink", js.undefined)
    
    @scala.inline
    def setIosIpadBundleId(value: String): Self = StObject.set(x, "iosIpadBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosIpadBundleIdUndefined: Self = StObject.set(x, "iosIpadBundleId", js.undefined)
    
    @scala.inline
    def setIosIpadFallbackLink(value: String): Self = StObject.set(x, "iosIpadFallbackLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosIpadFallbackLinkUndefined: Self = StObject.set(x, "iosIpadFallbackLink", js.undefined)
    
    @scala.inline
    def setIosMinimumVersion(value: String): Self = StObject.set(x, "iosMinimumVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosMinimumVersionUndefined: Self = StObject.set(x, "iosMinimumVersion", js.undefined)
  }
}
