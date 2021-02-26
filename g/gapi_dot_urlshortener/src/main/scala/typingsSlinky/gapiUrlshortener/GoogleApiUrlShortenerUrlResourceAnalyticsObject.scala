package typingsSlinky.gapiUrlshortener

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiUrlShortenerUrlResourceAnalyticsObject extends StObject {
  
  /**
    * Top browsers, e.g. "Chrome"; sorted by (descending) click counts. Only present if this data is available.
    */
  var browsers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject] = js.native
  
  /**
    * Top countries (expressed as country codes), e.g. "US" or "DE"; sorted by (descending) click counts. Only present if this data is available.
    */
  var countries: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject] = js.native
  
  /**
    * Number of clicks on all goo.gl short URLs pointing to this long URL.
    */
  var longUrlClicks: String = js.native
  
  /**
    * Top platforms or OSes, e.g. "Windows"; sorted by (descending) click counts. Only present if this data is available.
    */
  var platforms: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject] = js.native
  
  /**
    * Top referring hosts, e.g. "www.google.com"; sorted by (descending) click counts. Only present if this data is available.
    */
  var referrers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject] = js.native
  
  /**
    * Number of clicks on this short URL.
    */
  var shortUrlClicks: String = js.native
}
object GoogleApiUrlShortenerUrlResourceAnalyticsObject {
  
  @scala.inline
  def apply(
    browsers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    countries: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    longUrlClicks: String,
    platforms: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    referrers: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject],
    shortUrlClicks: String
  ): GoogleApiUrlShortenerUrlResourceAnalyticsObject = {
    val __obj = js.Dynamic.literal(browsers = browsers.asInstanceOf[js.Any], countries = countries.asInstanceOf[js.Any], longUrlClicks = longUrlClicks.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], referrers = referrers.asInstanceOf[js.Any], shortUrlClicks = shortUrlClicks.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiUrlShortenerUrlResourceAnalyticsObject]
  }
  
  @scala.inline
  implicit class GoogleApiUrlShortenerUrlResourceAnalyticsObjectMutableBuilder[Self <: GoogleApiUrlShortenerUrlResourceAnalyticsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrowsers(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowsersVarargs(value: GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject*): Self = StObject.set(x, "browsers", js.Array(value :_*))
    
    @scala.inline
    def setCountries(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountriesVarargs(value: GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject*): Self = StObject.set(x, "countries", js.Array(value :_*))
    
    @scala.inline
    def setLongUrlClicks(value: String): Self = StObject.set(x, "longUrlClicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatforms(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformsVarargs(value: GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject*): Self = StObject.set(x, "platforms", js.Array(value :_*))
    
    @scala.inline
    def setReferrers(value: js.Array[GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject]): Self = StObject.set(x, "referrers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrersVarargs(value: GoogleApiUrlShortenerUrlResourceAnalyticsArrayObject*): Self = StObject.set(x, "referrers", js.Array(value :_*))
    
    @scala.inline
    def setShortUrlClicks(value: String): Self = StObject.set(x, "shortUrlClicks", value.asInstanceOf[js.Any])
  }
}
