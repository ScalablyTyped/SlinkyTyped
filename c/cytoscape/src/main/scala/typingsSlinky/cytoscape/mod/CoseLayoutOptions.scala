package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.cytoscapeStrings.cose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/cose
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.cytoscape.mod.LayoutOptions because Already inherited */ @js.native
trait CoseLayoutOptions extends ShapedLayoutOptions {
  // Extra spacing between components in non-compound graphs
  var componentSpacing: Double = js.native
  // Cooling factor (how the temperature is reduced between consecutive iterations
  var coolingFactor: Double = js.native
  // Gravity force (constant)
  var gravity: Double = js.native
  // Initial temperature (maximum node displacement)
  var initialTemp: Double = js.native
  // Lower temperature threshold (below this point the layout will end)
  var minTemp: Double = js.native
  @JSName("name")
  var name_CoseLayoutOptions: cose = js.native
  // Nesting factor (multiplier) to compute ideal edge length for nested edges
  var nestingFactor: Double = js.native
  // Node repulsion (overlapping) multiplier
  var nodeOverlap: Double = js.native
  // Maximum number of iterations to perform
  var numIter: Double = js.native
  // Randomize the initial positions of the nodes (true) or use existing positions (false)
  var randomize: Boolean = js.native
  // Number of iterations between consecutive screen positions update
  // (0 -> only updated on the end)
  var refresh: Double = js.native
  // Pass a reference to weaver to use threads for calculations
  var weaver: Boolean = js.native
  // Divisor to compute edge forces
  def edgeElasticity(edge: js.Any): Double = js.native
  // Ideal edge (non nested) length
  def idealEdgeLength(edge: js.Any): Double = js.native
  // Node repulsion (non overlapping) multiplier
  def nodeRepulsion(node: js.Any): Double = js.native
}

object CoseLayoutOptions {
  @scala.inline
  def apply(
    componentSpacing: Double,
    coolingFactor: Double,
    edgeElasticity: js.Any => Double,
    fit: Boolean,
    gravity: Double,
    idealEdgeLength: js.Any => Double,
    initialTemp: Double,
    minTemp: Double,
    name: cose,
    nestingFactor: Double,
    nodeDimensionsIncludeLabels: Boolean,
    nodeOverlap: Double,
    nodeRepulsion: js.Any => Double,
    numIter: Double,
    randomize: Boolean,
    refresh: Double,
    weaver: Boolean
  ): CoseLayoutOptions = {
    val __obj = js.Dynamic.literal(componentSpacing = componentSpacing.asInstanceOf[js.Any], coolingFactor = coolingFactor.asInstanceOf[js.Any], edgeElasticity = js.Any.fromFunction1(edgeElasticity), fit = fit.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], idealEdgeLength = js.Any.fromFunction1(idealEdgeLength), initialTemp = initialTemp.asInstanceOf[js.Any], minTemp = minTemp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nestingFactor = nestingFactor.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], nodeOverlap = nodeOverlap.asInstanceOf[js.Any], nodeRepulsion = js.Any.fromFunction1(nodeRepulsion), numIter = numIter.asInstanceOf[js.Any], randomize = randomize.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], weaver = weaver.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoseLayoutOptions]
  }
  @scala.inline
  implicit class CoseLayoutOptionsOps[Self <: CoseLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoolingFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coolingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdgeElasticity(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeElasticity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGravity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdealEdgeLength(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idealEdgeLength")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInitialTemp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialTemp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinTemp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTemp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: cose): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNestingFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeOverlap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeOverlap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeRepulsion(value: js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeRepulsion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNumIter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numIter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRandomize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("randomize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeaver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weaver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

