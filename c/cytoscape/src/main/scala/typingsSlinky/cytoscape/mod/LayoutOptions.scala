package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.anon.Col
import typingsSlinky.cytoscape.anon.Degree
import typingsSlinky.cytoscape.anon.MaxDegree
import typingsSlinky.cytoscape.cytoscapeBooleans.`false`
import typingsSlinky.cytoscape.cytoscapeNumbers.`10`
import typingsSlinky.cytoscape.cytoscapeStrings.`null`
import typingsSlinky.cytoscape.cytoscapeStrings.breadthfirst
import typingsSlinky.cytoscape.cytoscapeStrings.circle
import typingsSlinky.cytoscape.cytoscapeStrings.concentric
import typingsSlinky.cytoscape.cytoscapeStrings.cose
import typingsSlinky.cytoscape.cytoscapeStrings.grid
import typingsSlinky.cytoscape.cytoscapeStrings.preset
import typingsSlinky.cytoscape.cytoscapeStrings.random
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.mod.NullLayoutOptions
  - typingsSlinky.cytoscape.mod.RandomLayoutOptions
  - typingsSlinky.cytoscape.mod.PresetLayoutOptions
  - typingsSlinky.cytoscape.mod.GridLayoutOptions
  - typingsSlinky.cytoscape.mod.CircleLayoutOptions
  - typingsSlinky.cytoscape.mod.ConcentricLayoutOptions
  - typingsSlinky.cytoscape.mod.BreadthFirstLayoutOptions
  - typingsSlinky.cytoscape.mod.CoseLayoutOptions
  - typingsSlinky.cytoscape.mod.BaseLayoutOptions
*/
trait LayoutOptions extends js.Object

object LayoutOptions {
  @scala.inline
  def CircleLayoutOptions(fit: Boolean, name: circle, nodeDimensionsIncludeLabels: Boolean, startAngle: Double): LayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def NullLayoutOptions(name: `null`): LayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def BreadthFirstLayoutOptions(
    circle: Boolean,
    directed: Boolean,
    fit: Boolean,
    maximalAdjustments: Double,
    name: breadthfirst,
    nodeDimensionsIncludeLabels: Boolean
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], directed = directed.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], maximalAdjustments = maximalAdjustments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def BaseLayoutOptions(name: String): LayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def ConcentricLayoutOptions(
    concentric: Degree => Double,
    equidistant: `false`,
    fit: Boolean,
    levelWidth: MaxDegree => Double,
    minNodeSpacing: `10`,
    name: concentric,
    nodeDimensionsIncludeLabels: Boolean,
    startAngle: Double
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(concentric = js.Any.fromFunction1(concentric), equidistant = equidistant.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], levelWidth = js.Any.fromFunction1(levelWidth), minNodeSpacing = minNodeSpacing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def CoseLayoutOptions(
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
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(componentSpacing = componentSpacing.asInstanceOf[js.Any], coolingFactor = coolingFactor.asInstanceOf[js.Any], edgeElasticity = js.Any.fromFunction1(edgeElasticity), fit = fit.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], idealEdgeLength = js.Any.fromFunction1(idealEdgeLength), initialTemp = initialTemp.asInstanceOf[js.Any], minTemp = minTemp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nestingFactor = nestingFactor.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], nodeOverlap = nodeOverlap.asInstanceOf[js.Any], nodeRepulsion = js.Any.fromFunction1(nodeRepulsion), numIter = numIter.asInstanceOf[js.Any], randomize = randomize.asInstanceOf[js.Any], refresh = refresh.asInstanceOf[js.Any], weaver = weaver.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def PresetLayoutOptions(name: preset): LayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def RandomLayoutOptions(fit: Boolean, name: random): LayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  def GridLayoutOptions(
    condense: Boolean,
    fit: Boolean,
    name: grid,
    nodeDimensionsIncludeLabels: Boolean,
    position: NodeSingular => Col
  ): LayoutOptions = {
    val __obj = js.Dynamic.literal(condense = condense.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], position = js.Any.fromFunction1(position))
    __obj.asInstanceOf[LayoutOptions]
  }
}

