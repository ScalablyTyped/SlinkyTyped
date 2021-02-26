package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIndexResponse extends StObject {
  
  /**
    * The index name.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  
  /**
    * The index status.
    */
  var indexStatus: js.UndefOr[IndexStatus] = js.native
  
  /**
    * Contains a value that specifies the type of indexing performed. Valid values are:   REGISTRY – Your thing index contains only registry data.   REGISTRY_AND_SHADOW - Your thing index contains registry data and shadow data.   REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index contains registry data and thing connectivity status data.   REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index contains registry data, shadow data, and thing connectivity status data.  
    */
  var schema: js.UndefOr[IndexSchema] = js.native
}
object DescribeIndexResponse {
  
  @scala.inline
  def apply(): DescribeIndexResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIndexResponse]
  }
  
  @scala.inline
  implicit class DescribeIndexResponseMutableBuilder[Self <: DescribeIndexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexName(value: IndexName): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexNameUndefined: Self = StObject.set(x, "indexName", js.undefined)
    
    @scala.inline
    def setIndexStatus(value: IndexStatus): Self = StObject.set(x, "indexStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexStatusUndefined: Self = StObject.set(x, "indexStatus", js.undefined)
    
    @scala.inline
    def setSchema(value: IndexSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
