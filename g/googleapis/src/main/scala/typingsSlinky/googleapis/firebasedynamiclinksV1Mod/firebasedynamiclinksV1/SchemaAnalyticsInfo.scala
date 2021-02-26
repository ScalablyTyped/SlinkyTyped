package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tracking parameters supported by Dynamic Link.
  */
@js.native
trait SchemaAnalyticsInfo extends StObject {
  
  /**
    * Google Play Campaign Measurements.
    */
  var googlePlayAnalytics: js.UndefOr[SchemaGooglePlayAnalytics] = js.native
  
  /**
    * iTunes Connect App Analytics.
    */
  var itunesConnectAnalytics: js.UndefOr[SchemaITunesConnectAnalytics] = js.native
}
object SchemaAnalyticsInfo {
  
  @scala.inline
  def apply(): SchemaAnalyticsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnalyticsInfo]
  }
  
  @scala.inline
  implicit class SchemaAnalyticsInfoMutableBuilder[Self <: SchemaAnalyticsInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGooglePlayAnalytics(value: SchemaGooglePlayAnalytics): Self = StObject.set(x, "googlePlayAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGooglePlayAnalyticsUndefined: Self = StObject.set(x, "googlePlayAnalytics", js.undefined)
    
    @scala.inline
    def setItunesConnectAnalytics(value: SchemaITunesConnectAnalytics): Self = StObject.set(x, "itunesConnectAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItunesConnectAnalyticsUndefined: Self = StObject.set(x, "itunesConnectAnalytics", js.undefined)
  }
}
