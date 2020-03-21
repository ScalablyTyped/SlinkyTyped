package typingsSlinky.mendixmodelsdk.unitsMod

import typingsSlinky.mendixmodelsdk.abstractModelMod.AbstractModel
import typingsSlinky.mendixmodelsdk.structuresMod.Structure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.unitsMod.IAbstractUnit because var conflicts: container, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/sdk/internal/units", "AbstractUnit")
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
  /**
    * Checks whether all attributes are available at this instant;
    * if false, a load is required to access these properties.
    */
  @JSName("isLoaded")
  def isLoaded_MAbstractUnit(): Boolean = js.native
}

