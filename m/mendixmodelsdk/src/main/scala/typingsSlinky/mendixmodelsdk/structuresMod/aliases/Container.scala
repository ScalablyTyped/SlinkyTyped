package typingsSlinky.mendixmodelsdk.structuresMod.aliases

import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit
  - typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
*/
trait Container extends js.Object

object Container {
  @scala.inline
  implicit def apply(value: AbstractElement): Container = value.asInstanceOf[Container]
  @scala.inline
  implicit def apply(value: StructuralUnit): Container = value.asInstanceOf[Container]
}

