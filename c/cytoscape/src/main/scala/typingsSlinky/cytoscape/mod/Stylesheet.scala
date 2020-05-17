package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#cy.style
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.mod.StylesheetStyle
  - typingsSlinky.cytoscape.mod.StylesheetCSS
*/
trait Stylesheet extends js.Object

object Stylesheet {
  @scala.inline
  implicit def apply(value: StylesheetCSS): Stylesheet = value.asInstanceOf[Stylesheet]
  @scala.inline
  implicit def apply(value: StylesheetStyle): Stylesheet = value.asInstanceOf[Stylesheet]
}

