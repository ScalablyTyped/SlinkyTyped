package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scheduling extends StObject {
  
  /**
    * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for
    * standard instances. Preemptible instances cannot be automatically restarted.
    *
    * By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
    */
  var automaticRestart: js.UndefOr[Boolean] = js.native
  
  /** The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node. */
  var minNodeCpus: js.UndefOr[Double] = js.native
  
  /** A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity. */
  var nodeAffinities: js.UndefOr[js.Array[SchedulingNodeAffinity]] = js.native
  
  /**
    * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is
    * TERMINATE. For more information, see Setting Instance Scheduling Options.
    */
  var onHostMaintenance: js.UndefOr[String] = js.native
  
  /**
    * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life
    * Cycle for more information on the possible instance states.
    */
  var preemptible: js.UndefOr[Boolean] = js.native
}
object Scheduling {
  
  @scala.inline
  def apply(): Scheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scheduling]
  }
  
  @scala.inline
  implicit class SchedulingMutableBuilder[Self <: Scheduling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticRestart(value: Boolean): Self = StObject.set(x, "automaticRestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticRestartUndefined: Self = StObject.set(x, "automaticRestart", js.undefined)
    
    @scala.inline
    def setMinNodeCpus(value: Double): Self = StObject.set(x, "minNodeCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinNodeCpusUndefined: Self = StObject.set(x, "minNodeCpus", js.undefined)
    
    @scala.inline
    def setNodeAffinities(value: js.Array[SchedulingNodeAffinity]): Self = StObject.set(x, "nodeAffinities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAffinitiesUndefined: Self = StObject.set(x, "nodeAffinities", js.undefined)
    
    @scala.inline
    def setNodeAffinitiesVarargs(value: SchedulingNodeAffinity*): Self = StObject.set(x, "nodeAffinities", js.Array(value :_*))
    
    @scala.inline
    def setOnHostMaintenance(value: String): Self = StObject.set(x, "onHostMaintenance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHostMaintenanceUndefined: Self = StObject.set(x, "onHostMaintenance", js.undefined)
    
    @scala.inline
    def setPreemptible(value: Boolean): Self = StObject.set(x, "preemptible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreemptibleUndefined: Self = StObject.set(x, "preemptible", js.undefined)
  }
}
