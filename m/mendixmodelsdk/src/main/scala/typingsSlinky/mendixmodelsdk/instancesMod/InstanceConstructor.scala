package typingsSlinky.mendixmodelsdk.instancesMod

import typingsSlinky.mendixmodelsdk.elementsMod.IElementConstructor
import typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.elementsMod.IElementConstructor
  - typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnitConstructor
*/
trait InstanceConstructor extends js.Object

object InstanceConstructor {
  @scala.inline
  implicit def apply(value: IAbstractUnitConstructor): InstanceConstructor = value.asInstanceOf[InstanceConstructor]
  @scala.inline
  implicit def apply(value: IElementConstructor): InstanceConstructor = value.asInstanceOf[InstanceConstructor]
}

