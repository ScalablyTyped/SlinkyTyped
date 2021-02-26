package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TopologySpreadConstraint specifies how to spread matching pods among the given topology.
  */
@js.native
trait TopologySpreadConstraint extends StObject {
  
  /**
    * LabelSelector is used to find matching pods. Pods that match this label selector are counted to determine the number of pods in their corresponding topology domain.
    */
  var labelSelector: js.UndefOr[Input[LabelSelector]] = js.native
  
  /**
    * MaxSkew describes the degree to which pods may be unevenly distributed. When `whenUnsatisfiable=DoNotSchedule`, it is the maximum permitted difference between the number of matching pods in the target topology and the global minimum. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 1/1/0: | zone1 | zone2 | zone3 | |   P   |   P   |       | - if MaxSkew is 1, incoming pod can only be scheduled to zone3 to become 1/1/1; scheduling it onto zone1(zone2) would make the ActualSkew(2-0) on zone1(zone2) violate MaxSkew(1). - if MaxSkew is 2, incoming pod can be scheduled onto any zone. When `whenUnsatisfiable=ScheduleAnyway`, it is used to give higher precedence to topologies that satisfy it. It's a required field. Default value is 1 and 0 is not allowed.
    */
  var maxSkew: Input[Double] = js.native
  
  /**
    * TopologyKey is the key of node labels. Nodes that have a label with this key and identical values are considered to be in the same topology. We consider each <key, value> as a "bucket", and try to put balanced number of pods into each bucket. It's a required field.
    */
  var topologyKey: Input[String] = js.native
  
  /**
    * WhenUnsatisfiable indicates how to deal with a pod if it doesn't satisfy the spread constraint. - DoNotSchedule (default) tells the scheduler not to schedule it. - ScheduleAnyway tells the scheduler to schedule the pod in any location,
    *   but giving higher precedence to topologies that would help reduce the
    *   skew.
    * A constraint is considered "Unsatisfiable" for an incoming pod if and only if every possible node assigment for that pod would violate "MaxSkew" on some topology. For example, in a 3-zone cluster, MaxSkew is set to 1, and pods with the same labelSelector spread as 3/1/1: | zone1 | zone2 | zone3 | | P P P |   P   |   P   | If WhenUnsatisfiable is set to DoNotSchedule, incoming pod can only be scheduled to zone2(zone3) to become 3/2/1(3/1/2) as ActualSkew(2-1) on zone2(zone3) satisfies MaxSkew(1). In other words, the cluster can still be imbalanced, but scheduler won't make it *more* imbalanced. It's a required field.
    */
  var whenUnsatisfiable: Input[String] = js.native
}
object TopologySpreadConstraint {
  
  @scala.inline
  def apply(maxSkew: Input[Double], topologyKey: Input[String], whenUnsatisfiable: Input[String]): TopologySpreadConstraint = {
    val __obj = js.Dynamic.literal(maxSkew = maxSkew.asInstanceOf[js.Any], topologyKey = topologyKey.asInstanceOf[js.Any], whenUnsatisfiable = whenUnsatisfiable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologySpreadConstraint]
  }
  
  @scala.inline
  implicit class TopologySpreadConstraintMutableBuilder[Self <: TopologySpreadConstraint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelSelector(value: Input[LabelSelector]): Self = StObject.set(x, "labelSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelSelectorUndefined: Self = StObject.set(x, "labelSelector", js.undefined)
    
    @scala.inline
    def setMaxSkew(value: Input[Double]): Self = StObject.set(x, "maxSkew", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopologyKey(value: Input[String]): Self = StObject.set(x, "topologyKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhenUnsatisfiable(value: Input[String]): Self = StObject.set(x, "whenUnsatisfiable", value.asInstanceOf[js.Any])
  }
}
