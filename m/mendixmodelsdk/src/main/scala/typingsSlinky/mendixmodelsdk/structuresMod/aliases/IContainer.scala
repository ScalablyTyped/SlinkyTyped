package typingsSlinky.mendixmodelsdk.structuresMod.aliases

import typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
  - typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
*/
trait IContainer extends js.Object

object IContainer {
  @scala.inline
  implicit def apply(value: IAbstractElement): IContainer = value.asInstanceOf[IContainer]
  @scala.inline
  implicit def apply(value: IStructuralUnit): IContainer = value.asInstanceOf[IContainer]
}

