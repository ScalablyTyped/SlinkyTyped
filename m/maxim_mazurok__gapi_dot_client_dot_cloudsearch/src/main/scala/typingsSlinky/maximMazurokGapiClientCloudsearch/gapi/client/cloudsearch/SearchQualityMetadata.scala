package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchQualityMetadata extends StObject {
  
  /** An indication of the quality of the item, used to influence search quality. Value should be between 0.0 (lowest quality) and 1.0 (highest quality). The default value is 0.0. */
  var quality: js.UndefOr[Double] = js.native
}
object SearchQualityMetadata {
  
  @scala.inline
  def apply(): SearchQualityMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchQualityMetadata]
  }
  
  @scala.inline
  implicit class SearchQualityMetadataMutableBuilder[Self <: SearchQualityMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
  }
}
