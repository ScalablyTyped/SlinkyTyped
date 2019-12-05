package typingsSlinky.cytoscape.cytoscapeMod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** http://js.cytoscape.org/#style/labels */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.none
  - typings.cytoscape.cytoscapeStrings.uppercase
  - typings.cytoscape.cytoscapeStrings.lowercase
*/
trait TextTranformation extends js.Object

object TextTranformation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lowercase: typingsSlinky.cytoscape.cytoscapeStrings.lowercase = this.cast("lowercase")
  @scala.inline
  def none: typingsSlinky.cytoscape.cytoscapeStrings.none = this.cast("none")
  @scala.inline
  def uppercase: typingsSlinky.cytoscape.cytoscapeStrings.uppercase = this.cast("uppercase")
}

