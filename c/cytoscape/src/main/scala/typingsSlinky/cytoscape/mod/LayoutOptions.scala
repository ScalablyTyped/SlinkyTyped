package typingsSlinky.cytoscape.mod

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
  implicit def apply(value: BaseLayoutOptions): LayoutOptions = value.asInstanceOf[LayoutOptions]
  @scala.inline
  implicit def apply(value: BreadthFirstLayoutOptions): LayoutOptions = value.asInstanceOf[LayoutOptions]
  @scala.inline
  implicit def apply(value: CircleLayoutOptions): LayoutOptions = value.asInstanceOf[LayoutOptions]
  @scala.inline
  implicit def apply(value: ConcentricLayoutOptions): LayoutOptions = value.asInstanceOf[LayoutOptions]
  @scala.inline
  implicit def apply(value: CoseLayoutOptions): LayoutOptions = value.asInstanceOf[LayoutOptions]
  @scala.inline
  implicit def apply(value: GridLayoutOptions): LayoutOptions = value.asInstanceOf[LayoutOptions]
  @scala.inline
  implicit def apply(value: NullLayoutOptions): LayoutOptions = value.asInstanceOf[LayoutOptions]
  @scala.inline
  implicit def apply(value: PresetLayoutOptions): LayoutOptions = value.asInstanceOf[LayoutOptions]
  @scala.inline
  implicit def apply(value: RandomLayoutOptions): LayoutOptions = value.asInstanceOf[LayoutOptions]
}

