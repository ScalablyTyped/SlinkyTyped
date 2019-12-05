package typingsSlinky.cytoscape.cytoscapeMod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The line style; may be solid, dotted, dashed, or double
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.solid
  - typings.cytoscape.cytoscapeStrings.dotted
  - typings.cytoscape.cytoscapeStrings.dashed
  - typings.cytoscape.cytoscapeStrings.double
*/
trait LineStyle extends js.Object

object LineStyle {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dashed: typingsSlinky.cytoscape.cytoscapeStrings.dashed = this.cast("dashed")
  @scala.inline
  def dotted: typingsSlinky.cytoscape.cytoscapeStrings.dotted = this.cast("dotted")
  @scala.inline
  def double: typingsSlinky.cytoscape.cytoscapeStrings.double = this.cast("double")
  @scala.inline
  def solid: typingsSlinky.cytoscape.cytoscapeStrings.solid = this.cast("solid")
}

