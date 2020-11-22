package typingsSlinky.mendixmodelsdk.mod

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.structuresMod.IStructureClass
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import typingsSlinky.mendixmodelsdk.versionChecksMod.ILifeCycle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "EnumListProperty")
@js.native
class EnumListProperty[T /* <: typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum */] protected ()
  extends typingsSlinky.mendixmodelsdk.propertiesMod.EnumListProperty[T] {
  def this(
    declaredOn: IStructureClass,
    parent: typingsSlinky.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null],
    name: String,
    initialValue: js.Array[T],
    enumType: Instantiable2[
        /* key */ String, 
        /* lifeCycle */ ILifeCycle, 
        typingsSlinky.mendixmodelsdk.instancesMod.AbstractEnum
      ]
  ) = this()
}
