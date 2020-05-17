package typingsSlinky.cytoscape.mod.Css

import typingsSlinky.cytoscape.mod.EdgeSingular
import typingsSlinky.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - Type
  - typingsSlinky.cytoscape.mod.Css.MapperFunction[SingularType, Type]
*/
trait PropertyValue[SingularType /* <: NodeSingular | EdgeSingular | Core */, Type] extends js.Object

object PropertyValue {
  @scala.inline
  implicit def apply[SingularType, Type](value: MapperFunction[SingularType, Type]): PropertyValue[SingularType, Type] = value.asInstanceOf[PropertyValue[SingularType, Type]]
  @scala.inline
  implicit def apply[SingularType, Type](value: Type): PropertyValue[SingularType, Type] = value.asInstanceOf[PropertyValue[SingularType, Type]]
}

