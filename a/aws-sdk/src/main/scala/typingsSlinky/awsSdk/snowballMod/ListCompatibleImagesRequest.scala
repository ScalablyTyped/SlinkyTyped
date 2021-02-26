package typingsSlinky.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCompatibleImagesRequest extends StObject {
  
  /**
    * The maximum number of results for the list of compatible images. Currently, a Snowball Edge device can store 10 AMIs.
    */
  var MaxResults: js.UndefOr[ListLimit] = js.native
  
  /**
    * HTTP requests are stateless. To identify what object comes "next" in the list of compatible images, you can specify a value for NextToken as the starting point for your list of returned images.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListCompatibleImagesRequest {
  
  @scala.inline
  def apply(): ListCompatibleImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCompatibleImagesRequest]
  }
  
  @scala.inline
  implicit class ListCompatibleImagesRequestMutableBuilder[Self <: ListCompatibleImagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ListLimit): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
