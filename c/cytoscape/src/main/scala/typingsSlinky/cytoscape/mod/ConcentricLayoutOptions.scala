package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.anon.Degree
import typingsSlinky.cytoscape.anon.MaxDegree
import typingsSlinky.cytoscape.cytoscapeBooleans.`false`
import typingsSlinky.cytoscape.cytoscapeNumbers.`10`
import typingsSlinky.cytoscape.cytoscapeStrings.concentric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/concentric
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.cytoscape.mod.LayoutOptions because Already inherited */ @js.native
trait ConcentricLayoutOptions extends ShapedLayoutOptions {
  // whether the layout should go clockwise (true) or counterclockwise/anticlockwise (false)
  var clockwise: js.UndefOr[Boolean] = js.native
  // whether levels have an equal radial distance betwen them, may cause bounding box overflow
  var equidistant: `false` = js.native
   // min spacing between outside of nodes (used for radius adjustment)
  // height of layout area (overrides container height)
  var height: js.UndefOr[scala.Nothing] = js.native
  var minNodeSpacing: `10` = js.native
  @JSName("name")
  var name_ConcentricLayoutOptions: concentric = js.native
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  @JSName("spacingFactor")
  var spacingFactor_ConcentricLayoutOptions: js.UndefOr[scala.Nothing] = js.native
  // where nodes start in radians, e.g. 3 / 2 * Math.PI,
  var startAngle: Double = js.native
  // how many radians should be between the first and last node (defaults to full circle)
  var sweep: js.UndefOr[Double] = js.native
  // width of layout area (overrides container width)
  var width: js.UndefOr[scala.Nothing] = js.native
  // returns numeric value for each node, placing higher nodes in levels towards the centre
  def concentric(node: Degree): Double = js.native
  // the variation of concentric values in each level
  def levelWidth(node: MaxDegree): Double = js.native
}

object ConcentricLayoutOptions {
  @scala.inline
  def apply(
    concentric: Degree => Double,
    equidistant: `false`,
    fit: Boolean,
    levelWidth: MaxDegree => Double,
    minNodeSpacing: `10`,
    name: concentric,
    nodeDimensionsIncludeLabels: Boolean,
    startAngle: Double
  ): ConcentricLayoutOptions = {
    val __obj = js.Dynamic.literal(concentric = js.Any.fromFunction1(concentric), equidistant = equidistant.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], levelWidth = js.Any.fromFunction1(levelWidth), minNodeSpacing = minNodeSpacing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcentricLayoutOptions]
  }
  @scala.inline
  implicit class ConcentricLayoutOptionsOps[Self <: ConcentricLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConcentric(value: Degree => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concentric")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquidistant(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equidistant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevelWidth(value: MaxDegree => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMinNodeSpacing(value: `10`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minNodeSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: concentric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClockwise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockwise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClockwise: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clockwise")(js.undefined)
        ret
    }
    @scala.inline
    def withSweep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sweep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSweep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sweep")(js.undefined)
        ret
    }
  }
  
}

