package typingsSlinky.mendixmodelsdk.structuresMod

import typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement
import typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/structures", "aliases")
@js.native
object aliases extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.mendixmodelsdk.unitsMod.StructuralUnit
    - typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
  */
  trait Container extends js.Object
  
  type IContainer = IStructuralUnit | IAbstractElement
}

