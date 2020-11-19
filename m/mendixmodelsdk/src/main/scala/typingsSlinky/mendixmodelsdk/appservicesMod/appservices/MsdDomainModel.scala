package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdDomainModel")
@js.native
class MsdDomainModel protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def associations: IList[MsdAssociation] = js.native
  
  def containerAsMsd: Msd = js.native
  
  def entities: IList[MsdEntity] = js.native
  
  @JSName("model")
  var model_FMsdDomainModel: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdDomainModel")
@js.native
object MsdDomainModel extends js.Object {
  
  /**
    * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdDomainModel = js.native
  
  /**
    * Creates and returns a new MsdDomainModel instance in the SDK and on the server.
    * The new MsdDomainModel will be automatically stored in the 'domainModel' property
    * of the parent Msd element passed as argument.
    */
  def createIn(container: Msd): MsdDomainModel = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
