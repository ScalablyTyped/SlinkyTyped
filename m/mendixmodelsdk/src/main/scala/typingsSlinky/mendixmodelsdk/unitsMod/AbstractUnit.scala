package typingsSlinky.mendixmodelsdk.unitsMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because var conflicts: container, id, isLoaded, model, structureTypeName, unit. Inlined isLoadable, isReadOnly */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "AbstractUnit")
@js.native
abstract class AbstractUnit protected () extends Structure {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    container: IStructuralUnit
  ) = this()
  
  @JSName("container")
  val container_FAbstractUnit: StructuralUnit = js.native
  
  def deepCopyInto(newParent: IStructuralUnit): AbstractUnit = js.native
  
  def isLoadable: Boolean = js.native
  /**
    * Whether this unit and all of its children (recursively) can be loaded.
    */
  @JSName("isLoadable")
  val isLoadable_FAbstractUnit: Boolean = js.native
  
  /**
    * Checks whether all attributes are available at this instant;
    * if false, a load is required to access these properties.
    */
  @JSName("isLoaded")
  def isLoaded_MAbstractUnit: Boolean = js.native
  
  def isReadOnly: Boolean = js.native
  /**
    * Whether this unit and all of its children (recursively) are editable.
    */
  @JSName("isReadOnly")
  val isReadOnly_FAbstractUnit: Boolean = js.native
}
