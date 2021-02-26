package typingsSlinky.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListSigningPlatformsResponse extends StObject {
  
  /**
    * Value for specifying the next set of paginated results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * A list of all platforms that match the request parameters.
    */
  var platforms: js.UndefOr[SigningPlatforms] = js.native
}
object ListSigningPlatformsResponse {
  
  @scala.inline
  def apply(): ListSigningPlatformsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSigningPlatformsResponse]
  }
  
  @scala.inline
  implicit class ListSigningPlatformsResponseMutableBuilder[Self <: ListSigningPlatformsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setPlatforms(value: SigningPlatforms): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: SigningPlatform*): Self = StObject.set(x, "platforms", js.Array(value :_*))
  }
}
