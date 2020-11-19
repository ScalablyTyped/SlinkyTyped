package typingsSlinky.mendixmodelsdk.unitsMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.elementsMod.AbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly
- typingsSlinky.mendixmodelsdk.unitsMod.IModelUnit because var conflicts: id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "ModelUnit")
@js.native
abstract class ModelUnit protected () extends AbstractElement {
  def this(model: AbstractModel, structureTypeName: String, id: String, isPartial: Boolean) = this()
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  
  @JSName("container")
  val container_FModelUnit: StructuralUnit = js.native
  
  def isLoadable: Boolean = js.native
  /**
    * Whether this unit and all of its children (recursively) can be loaded.
    */
  @JSName("isLoadable")
  val isLoadable_FModelUnit: Boolean = js.native
  
  @JSName("isLoaded")
  def isLoaded_MModelUnit: Boolean = js.native
  
  def isReadOnly: Boolean = js.native
  /**
    * Whether this unit and all of its children (recursively) are editable.
    */
  @JSName("isReadOnly")
  val isReadOnly_FModelUnit: Boolean = js.native
  
  @JSName("unit")
  def unit_MModelUnit: this.type = js.native
}
