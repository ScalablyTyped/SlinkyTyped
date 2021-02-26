package typingsSlinky.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `ResultsCachePolicy` is used for fine-grained control over how action
  * outputs are stored in the CAS and Action Cache.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy extends StObject {
  
  /**
    * The priority (relative importance) of this content in the overall cache.
    * Generally, a lower value means a longer retention time or other
    * advantage, but the interpretation of a given value is server-dependent. A
    * priority of 0 means a *default* value, decided by the server.  The
    * particular semantics of this field is up to the server. In particular,
    * every server will have their own supported range of priorities, and will
    * decide how these map into retention/eviction policy.
    */
  var priority: js.UndefOr[Double] = js.native
}
object SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ResultsCachePolicyMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2ResultsCachePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
