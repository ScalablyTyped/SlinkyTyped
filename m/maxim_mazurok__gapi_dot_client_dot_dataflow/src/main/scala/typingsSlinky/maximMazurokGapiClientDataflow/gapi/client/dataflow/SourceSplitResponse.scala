package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceSplitResponse extends StObject {
  
  /**
    * If outcome is SPLITTING_HAPPENED, then this is a list of bundles into which the source was split. Otherwise this field is ignored. This list can be empty, which means the source
    * represents an empty input.
    */
  var bundles: js.UndefOr[js.Array[DerivedSource]] = js.native
  
  /**
    * Indicates whether splitting happened and produced a list of bundles. If this is USE_CURRENT_SOURCE_AS_IS, the current source should be processed "as is" without splitting. "bundles"
    * is ignored in this case. If this is SPLITTING_HAPPENED, then "bundles" contains a list of bundles into which the source was split.
    */
  var outcome: js.UndefOr[String] = js.native
  
  /** DEPRECATED in favor of bundles. */
  var shards: js.UndefOr[js.Array[SourceSplitShard]] = js.native
}
object SourceSplitResponse {
  
  @scala.inline
  def apply(): SourceSplitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceSplitResponse]
  }
  
  @scala.inline
  implicit class SourceSplitResponseMutableBuilder[Self <: SourceSplitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundles(value: js.Array[DerivedSource]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    @scala.inline
    def setBundlesVarargs(value: DerivedSource*): Self = StObject.set(x, "bundles", js.Array(value :_*))
    
    @scala.inline
    def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    @scala.inline
    def setShards(value: js.Array[SourceSplitShard]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
    
    @scala.inline
    def setShardsVarargs(value: SourceSplitShard*): Self = StObject.set(x, "shards", js.Array(value :_*))
  }
}
