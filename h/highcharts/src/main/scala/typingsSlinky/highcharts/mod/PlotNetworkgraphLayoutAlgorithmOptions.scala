package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.`reingold-fruchterman`
import typingsSlinky.highcharts.highchartsStrings.circle
import typingsSlinky.highcharts.highchartsStrings.random
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotNetworkgraphLayoutAlgorithmOptions extends StObject {
  
  /**
    * (Highcharts) Approximation used to calculate repulsive forces affecting
    * nodes. By default, when calculateing net force, nodes are compared
    * against each other, which gives O(N^2) complexity. Using Barnes-Hut
    * approximation, we decrease this to O(N log N), but the resulting graph
    * will have different layout. Barnes-Hut approximation divides space into
    * rectangles via quad tree, where forces exerted on nodes are calculated
    * directly for nearby cells, and for all others, cells are treated as a
    * separate node with center of mass.
    */
  var approximation: js.UndefOr[OptionsApproximationValue] = js.native
  
  /**
    * (Highcharts) Attraction force applied on a node which is conected to
    * another node by a link. Passed are two arguments:
    *
    * - `d` - which is current distance between two nodes
    *
    * - `k` - which is desired distance between two nodes
    *
    * In `verlet` integration, defaults to: `function (d, k) { return (k - d) /
    * d; }`
    */
  var attractiveForce: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts) Experimental. Enables live simulation of the algorithm
    * implementation. All nodes are animated as the forces applies on them.
    */
  var enableSimulation: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts) Friction applied on forces to prevent nodes rushing to fast
    * to the desired positions.
    */
  var friction: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Gravitational const used in the barycenter force of the
    * algorithm.
    */
  var gravitationalConstant: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) When `initialPositions` are set to 'circle',
    * `initialPositionRadius` is a distance from the center of circle, in which
    * nodes are created.
    */
  var initialPositionRadius: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Initial layout algorithm for positioning nodes. Can be one
    * of built-in options ("circle", "random") or a function where positions
    * should be set on each node (`this.nodes`) as `node.plotX` and
    * `node.plotY`
    */
  var initialPositions: js.UndefOr[circle | random | js.Function] = js.native
  
  /**
    * (Highcharts) Integration type. Available options are `'euler'` and
    * `'verlet'`. Integration determines how forces are applied on particles.
    * In Euler integration, force is applied direct as `newPosition +=
    * velocity;`. In Verlet integration, new position is based on a previous
    * posittion without velocity: `newPosition += previousPosition -
    * newPosition`.
    *
    * Note that different integrations give different results as forces are
    * different.
    *
    * In Highcharts v7.0.x only `'euler'` integration was supported.
    */
  var integration: js.UndefOr[OptionsIntegrationValue] = js.native
  
  /**
    * (Highcharts) Ideal length (px) of the link between two nodes. When not
    * defined, length is calculated as: `Math.pow(availableWidth *
    * availableHeight / nodesLength, 0.4);`
    *
    * Note: Because of the algorithm specification, length of each link might
    * be not exactly as specified.
    */
  var linkLength: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Max number of iterations before algorithm will stop. In
    * general, algorithm should find positions sooner, but when rendering huge
    * number of nodes, it is recommended to increase this value as finding
    * perfect graph positions can require more time.
    */
  var maxIterations: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Verlet integration only. Max speed that node can get in one
    * iteration. In terms of simulation, it's a maximum translation (in pixels)
    * that node can move (in both, x and y, dimensions). While `friction` is
    * applied on all nodes, max speed is applied only for nodes that move very
    * fast, for example small or disconnected ones.
    */
  var maxSpeed: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Repulsive force applied on a node. Passed are two arguments:
    *
    * - `d` - which is current distance between two nodes
    *
    * - `k` - which is desired distance between two nodes
    *
    * In `verlet` integration, defaults to: `function (d, k) { return (k - d) /
    * d * (k > d ? 1 : 0) }`
    */
  var repulsiveForce: js.UndefOr[js.Function] = js.native
  
  /**
    * (Highcharts) Barnes-Hut approximation only. Deteremines when distance
    * between cell and node is small enough to caculate forces. Value of
    * `theta` is compared directly with quotient `s / d`, where `s` is the size
    * of the cell, and `d` is distance between center of cell's mass and
    * currently compared node.
    */
  var theta: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) Type of the algorithm used when positioning nodes.
    */
  var `type`: js.UndefOr[`reingold-fruchterman`] = js.native
}
object PlotNetworkgraphLayoutAlgorithmOptions {
  
  @scala.inline
  def apply(): PlotNetworkgraphLayoutAlgorithmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotNetworkgraphLayoutAlgorithmOptions]
  }
  
  @scala.inline
  implicit class PlotNetworkgraphLayoutAlgorithmOptionsMutableBuilder[Self <: PlotNetworkgraphLayoutAlgorithmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproximation(value: OptionsApproximationValue): Self = StObject.set(x, "approximation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximationUndefined: Self = StObject.set(x, "approximation", js.undefined)
    
    @scala.inline
    def setAttractiveForce(value: js.Function): Self = StObject.set(x, "attractiveForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttractiveForceUndefined: Self = StObject.set(x, "attractiveForce", js.undefined)
    
    @scala.inline
    def setEnableSimulation(value: Boolean): Self = StObject.set(x, "enableSimulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSimulationUndefined: Self = StObject.set(x, "enableSimulation", js.undefined)
    
    @scala.inline
    def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
    
    @scala.inline
    def setGravitationalConstant(value: Double): Self = StObject.set(x, "gravitationalConstant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravitationalConstantUndefined: Self = StObject.set(x, "gravitationalConstant", js.undefined)
    
    @scala.inline
    def setInitialPositionRadius(value: Double): Self = StObject.set(x, "initialPositionRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPositionRadiusUndefined: Self = StObject.set(x, "initialPositionRadius", js.undefined)
    
    @scala.inline
    def setInitialPositions(value: circle | random | js.Function): Self = StObject.set(x, "initialPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialPositionsUndefined: Self = StObject.set(x, "initialPositions", js.undefined)
    
    @scala.inline
    def setIntegration(value: OptionsIntegrationValue): Self = StObject.set(x, "integration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationUndefined: Self = StObject.set(x, "integration", js.undefined)
    
    @scala.inline
    def setLinkLength(value: Double): Self = StObject.set(x, "linkLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkLengthUndefined: Self = StObject.set(x, "linkLength", js.undefined)
    
    @scala.inline
    def setMaxIterations(value: Double): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
    
    @scala.inline
    def setMaxSpeed(value: Double): Self = StObject.set(x, "maxSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSpeedUndefined: Self = StObject.set(x, "maxSpeed", js.undefined)
    
    @scala.inline
    def setRepulsiveForce(value: js.Function): Self = StObject.set(x, "repulsiveForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepulsiveForceUndefined: Self = StObject.set(x, "repulsiveForce", js.undefined)
    
    @scala.inline
    def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    
    @scala.inline
    def setType(value: `reingold-fruchterman`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
