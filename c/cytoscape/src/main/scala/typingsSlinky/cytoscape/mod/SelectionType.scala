package typingsSlinky.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A string indicating the selection behaviour from user input.
  * http://js.cytoscape.org/#core/initialisation
  *
  * 'additive' : a new selection made by the user adds to the set of currently selected elements.
  * 'single' : a new selection made by the user becomes the entire set of currently
  *            selected elements (i.e. the previous elements are unselected)
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.cytoscapeStrings.additive
  - typingsSlinky.cytoscape.cytoscapeStrings.single
*/
trait SelectionType extends StObject
object SelectionType {
  
  @scala.inline
  def additive: typingsSlinky.cytoscape.cytoscapeStrings.additive = "additive".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.additive]
  
  @scala.inline
  def single: typingsSlinky.cytoscape.cytoscapeStrings.single = "single".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.single]
}
