package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about a resource which is being promoted.
  */
@js.native
trait SchemaActivityContentDetailsPromotedItem extends StObject {
  
  /**
    * The URL the client should fetch to request a promoted item.
    */
  var adTag: js.UndefOr[String] = js.native
  
  /**
    * The URL the client should ping to indicate that the user clicked through
    * on this promoted item.
    */
  var clickTrackingUrl: js.UndefOr[String] = js.native
  
  /**
    * The URL the client should ping to indicate that the user was shown this
    * promoted item.
    */
  var creativeViewUrl: js.UndefOr[String] = js.native
  
  /**
    * The type of call-to-action, a message to the user indicating action that
    * can be taken.
    */
  var ctaType: js.UndefOr[String] = js.native
  
  /**
    * The custom call-to-action button text. If specified, it will override the
    * default button text for the cta_type.
    */
  var customCtaButtonText: js.UndefOr[String] = js.native
  
  /**
    * The text description to accompany the promoted item.
    */
  var descriptionText: js.UndefOr[String] = js.native
  
  /**
    * The URL the client should direct the user to, if the user chooses to
    * visit the advertiser&#39;s website.
    */
  var destinationUrl: js.UndefOr[String] = js.native
  
  /**
    * The list of forecasting URLs. The client should ping all of these URLs
    * when a promoted item is not available, to indicate that a promoted item
    * could have been shown.
    */
  var forecastingUrl: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of impression URLs. The client should ping all of these URLs to
    * indicate that the user was shown this promoted item.
    */
  var impressionUrl: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the promoted video.
    */
  var videoId: js.UndefOr[String] = js.native
}
object SchemaActivityContentDetailsPromotedItem {
  
  @scala.inline
  def apply(): SchemaActivityContentDetailsPromotedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivityContentDetailsPromotedItem]
  }
  
  @scala.inline
  implicit class SchemaActivityContentDetailsPromotedItemMutableBuilder[Self <: SchemaActivityContentDetailsPromotedItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdTag(value: String): Self = StObject.set(x, "adTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdTagUndefined: Self = StObject.set(x, "adTag", js.undefined)
    
    @scala.inline
    def setClickTrackingUrl(value: String): Self = StObject.set(x, "clickTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTrackingUrlUndefined: Self = StObject.set(x, "clickTrackingUrl", js.undefined)
    
    @scala.inline
    def setCreativeViewUrl(value: String): Self = StObject.set(x, "creativeViewUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeViewUrlUndefined: Self = StObject.set(x, "creativeViewUrl", js.undefined)
    
    @scala.inline
    def setCtaType(value: String): Self = StObject.set(x, "ctaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtaTypeUndefined: Self = StObject.set(x, "ctaType", js.undefined)
    
    @scala.inline
    def setCustomCtaButtonText(value: String): Self = StObject.set(x, "customCtaButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomCtaButtonTextUndefined: Self = StObject.set(x, "customCtaButtonText", js.undefined)
    
    @scala.inline
    def setDescriptionText(value: String): Self = StObject.set(x, "descriptionText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionTextUndefined: Self = StObject.set(x, "descriptionText", js.undefined)
    
    @scala.inline
    def setDestinationUrl(value: String): Self = StObject.set(x, "destinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUrlUndefined: Self = StObject.set(x, "destinationUrl", js.undefined)
    
    @scala.inline
    def setForecastingUrl(value: js.Array[String]): Self = StObject.set(x, "forecastingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForecastingUrlUndefined: Self = StObject.set(x, "forecastingUrl", js.undefined)
    
    @scala.inline
    def setForecastingUrlVarargs(value: String*): Self = StObject.set(x, "forecastingUrl", js.Array(value :_*))
    
    @scala.inline
    def setImpressionUrl(value: js.Array[String]): Self = StObject.set(x, "impressionUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionUrlUndefined: Self = StObject.set(x, "impressionUrl", js.undefined)
    
    @scala.inline
    def setImpressionUrlVarargs(value: String*): Self = StObject.set(x, "impressionUrl", js.Array(value :_*))
    
    @scala.inline
    def setVideoId(value: String): Self = StObject.set(x, "videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoIdUndefined: Self = StObject.set(x, "videoId", js.undefined)
  }
}
