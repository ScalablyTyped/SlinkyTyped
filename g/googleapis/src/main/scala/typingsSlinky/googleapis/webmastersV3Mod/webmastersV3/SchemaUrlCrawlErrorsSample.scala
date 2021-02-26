package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about specific crawl errors.
  */
@js.native
trait SchemaUrlCrawlErrorsSample extends StObject {
  
  /**
    * The time the error was first detected, in RFC 3339 format.
    */
  var first_detected: js.UndefOr[String] = js.native
  
  /**
    * The time when the URL was last crawled, in RFC 3339 format.
    */
  var last_crawled: js.UndefOr[String] = js.native
  
  /**
    * The URL of an error, relative to the site.
    */
  var pageUrl: js.UndefOr[String] = js.native
  
  /**
    * The HTTP response code, if any.
    */
  var responseCode: js.UndefOr[Double] = js.native
  
  /**
    * Additional details about the URL, set only when calling get().
    */
  var urlDetails: js.UndefOr[SchemaUrlSampleDetails] = js.native
}
object SchemaUrlCrawlErrorsSample {
  
  @scala.inline
  def apply(): SchemaUrlCrawlErrorsSample = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorsSample]
  }
  
  @scala.inline
  implicit class SchemaUrlCrawlErrorsSampleMutableBuilder[Self <: SchemaUrlCrawlErrorsSample] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst_detected(value: String): Self = StObject.set(x, "first_detected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_detectedUndefined: Self = StObject.set(x, "first_detected", js.undefined)
    
    @scala.inline
    def setLast_crawled(value: String): Self = StObject.set(x, "last_crawled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_crawledUndefined: Self = StObject.set(x, "last_crawled", js.undefined)
    
    @scala.inline
    def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    @scala.inline
    def setResponseCode(value: Double): Self = StObject.set(x, "responseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseCodeUndefined: Self = StObject.set(x, "responseCode", js.undefined)
    
    @scala.inline
    def setUrlDetails(value: SchemaUrlSampleDetails): Self = StObject.set(x, "urlDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlDetailsUndefined: Self = StObject.set(x, "urlDetails", js.undefined)
  }
}
