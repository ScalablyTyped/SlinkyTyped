package typingsSlinky.maximMazurokGapiClientDlp.gapi.client.dlp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePrivacyDlpV2Key extends StObject {
  
  /** Entities are partitioned into subsets, currently identified by a project ID and namespace ID. Queries are scoped to a single partition. */
  var partitionId: js.UndefOr[GooglePrivacyDlpV2PartitionId] = js.native
  
  /**
    * The entity path. An entity path consists of one or more elements composed of a kind and a string or numerical identifier, which identify entities. The first element identifies a
    * _root entity_, the second element identifies a _child_ of the root entity, the third element identifies a child of the second entity, and so forth. The entities identified by all
    * prefixes of the path are called the element's _ancestors_. A path can never be empty, and a path can have at most 100 elements.
    */
  var path: js.UndefOr[js.Array[GooglePrivacyDlpV2PathElement]] = js.native
}
object GooglePrivacyDlpV2Key {
  
  @scala.inline
  def apply(): GooglePrivacyDlpV2Key = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2Key]
  }
  
  @scala.inline
  implicit class GooglePrivacyDlpV2KeyMutableBuilder[Self <: GooglePrivacyDlpV2Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitionId(value: GooglePrivacyDlpV2PartitionId): Self = StObject.set(x, "partitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionIdUndefined: Self = StObject.set(x, "partitionId", js.undefined)
    
    @scala.inline
    def setPath(value: js.Array[GooglePrivacyDlpV2PathElement]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: GooglePrivacyDlpV2PathElement*): Self = StObject.set(x, "path", js.Array(value :_*))
  }
}
