package typingsSlinky.mendixmodelsdk.unitsMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IStructuralUnit because var conflicts: id, isLoadable, isLoaded, isReadOnly, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "StructuralUnit")
@js.native
abstract class StructuralUnit protected ()
  extends AbstractUnit
     with Container
     with IContainer {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    _ignoredIsPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  
  @JSName("unit")
  def unit_MStructuralUnit: this.type = js.native
}
