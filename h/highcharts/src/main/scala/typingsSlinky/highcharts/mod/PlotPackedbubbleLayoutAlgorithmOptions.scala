package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.`reingold-fruchterman`
import typingsSlinky.highcharts.highchartsStrings.circle
import typingsSlinky.highcharts.highchartsStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPackedbubbleLayoutAlgorithmOptions extends js.Object {
  /**
    * (Highcharts) The distance between two bubbles, when the algorithm starts
    * to treat two bubbles as overlapping. The `bubblePadding` is also the
    * expected distance between all the bubbles on simulation end.
    */
  var bubblePadding: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) In case of split series, this option allows user to drag and
    * drop points between series, for changing point related series.
    */
  var dragBetweenSeries: js.UndefOr[Boolean] = js.native
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
    * of the built-in options ("circle", "random") or a function where
    * positions should be set on each node (`this.nodes`) as `node.plotX` and
    * `node.plotY`.
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
    * (Highcharts) Max speed that node can get in one iteration. In terms of
    * simulation, it's a maximum translation (in pixels) that a node can move
    * (in both, x and y, dimensions). While `friction` is applied on all nodes,
    * max speed is applied only for nodes that move very fast, for example
    * small or disconnected ones.
    */
  var maxSpeed: js.UndefOr[Double] = js.native
  /**
    * (Highcharts) Whether bubbles should interact with their parentNode to
    * keep them inside.
    */
  var parentNodeLimit: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Layout algorithm options for parent nodes.
    */
  var parentNodeOptions: js.UndefOr[PlotPackedbubbleLayoutAlgorithmParentNodeOptions] = js.native
  /**
    * (Highcharts) Whether series should interact with each other or not. When
    * `parentNodeLimit` is set to true, thi option should be set to false to
    * avoid sticking points in wrong series parentNode.
    */
  var seriesInteraction: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Whether to split series into individual groups or to mix all
    * series together.
    */
  var splitSeries: js.UndefOr[String] = js.native
  /**
    * (Highcharts) Type of the algorithm used when positioning nodes.
    */
  var `type`: js.UndefOr[`reingold-fruchterman`] = js.native
}

object PlotPackedbubbleLayoutAlgorithmOptions {
  @scala.inline
  def apply(): PlotPackedbubbleLayoutAlgorithmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleLayoutAlgorithmOptions]
  }
  @scala.inline
  implicit class PlotPackedbubbleLayoutAlgorithmOptionsOps[Self <: PlotPackedbubbleLayoutAlgorithmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBubblePadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubblePadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubblePadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubblePadding")(js.undefined)
        ret
    }
    @scala.inline
    def withDragBetweenSeries(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBetweenSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDragBetweenSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragBetweenSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSimulation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSimulation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSimulation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSimulation")(js.undefined)
        ret
    }
    @scala.inline
    def withFriction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friction")(js.undefined)
        ret
    }
    @scala.inline
    def withGravitationalConstant(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravitationalConstant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravitationalConstant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravitationalConstant")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPositionRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPositionRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPositionRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPositionRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialPositions(value: circle | random | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPositions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialPositions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialPositions")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegration(value: OptionsIntegrationValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integration")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIterations")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSpeed")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNodeLimit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNodeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNodeOptions(value: PlotPackedbubbleLayoutAlgorithmParentNodeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNodeOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNodeOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesInteraction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesInteraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesInteraction")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitSeries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitSeries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitSeries")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: `reingold-fruchterman`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

