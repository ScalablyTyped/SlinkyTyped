package typingsSlinky.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight */
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.cytoscape.cytoscapeStrings.normal
  - typingsSlinky.cytoscape.cytoscapeStrings.bold
  - typingsSlinky.cytoscape.cytoscapeStrings.lighter
  - typingsSlinky.cytoscape.cytoscapeStrings.bolder
*/
trait FontWeight extends js.Object

object FontWeight {
  @scala.inline
  def normal: typingsSlinky.cytoscape.cytoscapeStrings.normal = "normal".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.normal]
  @scala.inline
  def bold: typingsSlinky.cytoscape.cytoscapeStrings.bold = "bold".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.bold]
  @scala.inline
  def lighter: typingsSlinky.cytoscape.cytoscapeStrings.lighter = "lighter".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.lighter]
  @scala.inline
  def bolder: typingsSlinky.cytoscape.cytoscapeStrings.bolder = "bolder".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.bolder]
  @scala.inline
  implicit def apply(value: Double): FontWeight = value.asInstanceOf[FontWeight]
}

