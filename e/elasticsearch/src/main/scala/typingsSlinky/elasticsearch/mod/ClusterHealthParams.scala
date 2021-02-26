package typingsSlinky.elasticsearch.mod

import typingsSlinky.elasticsearch.elasticsearchStrings.cluster
import typingsSlinky.elasticsearch.elasticsearchStrings.green
import typingsSlinky.elasticsearch.elasticsearchStrings.high
import typingsSlinky.elasticsearch.elasticsearchStrings.immediate
import typingsSlinky.elasticsearch.elasticsearchStrings.indices
import typingsSlinky.elasticsearch.elasticsearchStrings.languid
import typingsSlinky.elasticsearch.elasticsearchStrings.low
import typingsSlinky.elasticsearch.elasticsearchStrings.normal
import typingsSlinky.elasticsearch.elasticsearchStrings.red
import typingsSlinky.elasticsearch.elasticsearchStrings.shards
import typingsSlinky.elasticsearch.elasticsearchStrings.urgent
import typingsSlinky.elasticsearch.elasticsearchStrings.yellow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterHealthParams extends GenericParams {
  
  var index: js.UndefOr[NameList] = js.native
  
  var level: js.UndefOr[cluster | indices | shards] = js.native
  
  var local: js.UndefOr[Boolean] = js.native
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  
  var waitForActiveShards: js.UndefOr[String] = js.native
  
  var waitForEvents: js.UndefOr[immediate | urgent | high | normal | low | languid] = js.native
  
  var waitForNodes: js.UndefOr[String] = js.native
  
  var waitForRelocatingShards: js.UndefOr[Boolean] = js.native
  
  var waitForStatus: js.UndefOr[green | yellow | red] = js.native
}
object ClusterHealthParams {
  
  @scala.inline
  def apply(): ClusterHealthParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterHealthParams]
  }
  
  @scala.inline
  implicit class ClusterHealthParamsMutableBuilder[Self <: ClusterHealthParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: cluster | indices | shards): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    @scala.inline
    def setWaitForActiveShards(value: String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
    
    @scala.inline
    def setWaitForEvents(value: immediate | urgent | high | normal | low | languid): Self = StObject.set(x, "waitForEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForEventsUndefined: Self = StObject.set(x, "waitForEvents", js.undefined)
    
    @scala.inline
    def setWaitForNodes(value: String): Self = StObject.set(x, "waitForNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForNodesUndefined: Self = StObject.set(x, "waitForNodes", js.undefined)
    
    @scala.inline
    def setWaitForRelocatingShards(value: Boolean): Self = StObject.set(x, "waitForRelocatingShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForRelocatingShardsUndefined: Self = StObject.set(x, "waitForRelocatingShards", js.undefined)
    
    @scala.inline
    def setWaitForStatus(value: green | yellow | red): Self = StObject.set(x, "waitForStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForStatusUndefined: Self = StObject.set(x, "waitForStatus", js.undefined)
  }
}
