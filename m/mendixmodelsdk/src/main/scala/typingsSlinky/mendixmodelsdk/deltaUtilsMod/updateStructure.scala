package typingsSlinky.mendixmodelsdk.deltaUtilsMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "updateStructure")
@js.native
object updateStructure extends js.Object {
  
  def apply(
    structure: Structure[IAbstractModel, IContainer | Null],
    isReverting: Boolean,
    updateAction: js.Function0[Unit]
  ): Unit = js.native
}
