package typingsSlinky.octokitTypes

import typingsSlinky.octokitTypes.responseHeadersMod.ResponseHeaders
import typingsSlinky.octokitTypes.urlMod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object octokitResponseMod {
  
  @js.native
  trait OctokitResponse[T] extends StObject {
    
    /**
      *  This is the data you would see in https://developer.Octokit.com/v3/
      */
    var data: T = js.native
    
    var headers: ResponseHeaders = js.native
    
    /**
      * http response code
      */
    var status: Double = js.native
    
    /**
      * URL of response after all redirects
      */
    var url: Url = js.native
  }
  object OctokitResponse {
    
    @scala.inline
    def apply[T](data: T, headers: ResponseHeaders, status: Double, url: Url): OctokitResponse[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OctokitResponse[T]]
    }
    
    @scala.inline
    implicit class OctokitResponseMutableBuilder[Self <: OctokitResponse[_], T] (val x: Self with OctokitResponse[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: ResponseHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
