package typingsSlinky.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Force[NodeDatum /* <: SimulationNodeDatum */, LinkDatum /* <: js.UndefOr[SimulationLinkDatum[NodeDatum]] */] extends js.Object {
  
  /**
    * Apply this force, optionally observing the specified alpha.
    * Typically, the force is applied to the array of nodes previously passed to force.initialize,
    * however, some forces may apply to a subset of nodes, or behave differently.
    * For example, d3.forceLink applies to the source and target of each link.
    */
  def apply(alpha: Double): Unit = js.native
  
  /**
    * Supplies the array of nodes and random source to this force. This method is called when a force is bound to a simulation via simulation.force
    * and when the simulation’s nodes change via simulation.nodes.
    *
    * A force may perform necessary work during initialization, such as evaluating per-node parameters, to avoid repeatedly performing work during each application of the force.
    */
  var initialize: js.UndefOr[
    js.Function2[/* nodes */ js.Array[NodeDatum], /* random */ js.Function0[Double], Unit]
  ] = js.native
}
