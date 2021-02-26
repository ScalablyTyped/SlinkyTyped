package typingsSlinky.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A CrawledUrl resource represents a URL that was crawled during a ScanRun.
  * Web Security Scanner Service crawls the web applications, following all
  * links within the scope of sites, to find the URLs to test against.
  */
@js.native
trait SchemaCrawledUrl extends StObject {
  
  /**
    * Output only. The body of the request that was used to visit the URL.
    */
  var body: js.UndefOr[String] = js.native
  
  /**
    * Output only. The http method of the request that was used to visit the
    * URL, in uppercase.
    */
  var httpMethod: js.UndefOr[String] = js.native
  
  /**
    * Output only. The URL that was crawled.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaCrawledUrl {
  
  @scala.inline
  def apply(): SchemaCrawledUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCrawledUrl]
  }
  
  @scala.inline
  implicit class SchemaCrawledUrlMutableBuilder[Self <: SchemaCrawledUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
