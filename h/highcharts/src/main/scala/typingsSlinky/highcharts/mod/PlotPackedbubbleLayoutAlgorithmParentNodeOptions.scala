package typingsSlinky.highcharts.mod

import typingsSlinky.highcharts.highchartsStrings.`reingold-fruchterman`
import typingsSlinky.highcharts.highchartsStrings.circle
import typingsSlinky.highcharts.highchartsStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotPackedbubbleLayoutAlgorithmParentNodeOptions extends js.Object {
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
    * (Highcharts) Styling options for parentNodes markers. Similar to
    * line.marker options.
    */
  var marker: js.UndefOr[PlotPackedbubbleLayoutAlgorithmParentNodeMarkerOptions] = js.native
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
  var seriesInteraction: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts) Type of the algorithm used when positioning nodes.
    */
  var `type`: js.UndefOr[`reingold-fruchterman`] = js.native
}

object PlotPackedbubbleLayoutAlgorithmParentNodeOptions {
  @scala.inline
  def apply(): PlotPackedbubbleLayoutAlgorithmParentNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotPackedbubbleLayoutAlgorithmParentNodeOptions]
  }
  @scala.inline
  implicit class PlotPackedbubbleLayoutAlgorithmParentNodeOptionsOps[Self <: PlotPackedbubbleLayoutAlgorithmParentNodeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withMarker(value: PlotPackedbubbleLayoutAlgorithmParentNodeMarkerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
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

