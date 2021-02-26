package typingsSlinky.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// parameters type
@js.native
trait ListBucketsQueryType extends StObject {
  
  // search buckets using prefix key
  var marker: js.UndefOr[String] = js.native
  
  // search start from marker, including marker key
  var `max-keys`: js.UndefOr[String | Double] = js.native
  
  var prefix: js.UndefOr[String] = js.native
}
object ListBucketsQueryType {
  
  @scala.inline
  def apply(): ListBucketsQueryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketsQueryType]
  }
  
  @scala.inline
  implicit class ListBucketsQueryTypeMutableBuilder[Self <: ListBucketsQueryType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def `setMax-keys`(value: String | Double): Self = StObject.set(x, "max-keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-keysUndefined`: Self = StObject.set(x, "max-keys", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
