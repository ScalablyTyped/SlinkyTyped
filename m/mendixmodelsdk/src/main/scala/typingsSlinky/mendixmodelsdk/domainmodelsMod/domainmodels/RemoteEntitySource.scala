package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.10.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEntitySource because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IRemoteEntitySource because var conflicts: containerAsEntity, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RemoteEntitySource")
@js.native
abstract class RemoteEntitySource protected () extends EntitySource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("containerAsEntity")
  def containerAsEntity_MRemoteEntitySource: Entity = js.native
  
  @JSName("model")
  var model_FRemoteEntitySource: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.RemoteEntitySource")
@js.native
object RemoteEntitySource extends js.Object {
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
