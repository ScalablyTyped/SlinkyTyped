package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.11.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRefStep")
@js.native
class EntityRefStep protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def association: IAssociationBase = js.native
  
  def associationQualifiedName: String = js.native
  
  def association_=(newValue: IAssociationBase): Unit = js.native
  
  def containerAsIndirectEntityRef: IndirectEntityRef = js.native
  
  def destinationEntity: IEntity = js.native
  
  def destinationEntityQualifiedName: String = js.native
  
  def destinationEntity_=(newValue: IEntity): Unit = js.native
  
  @JSName("model")
  var model_FEntityRefStep: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EntityRefStep")
@js.native
object EntityRefStep extends js.Object {
  
  /**
    * Creates and returns a new EntityRefStep instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EntityRefStep = js.native
  
  /**
    * Creates and returns a new EntityRefStep instance in the SDK and on the server.
    * The new EntityRefStep will be automatically stored in the 'steps' property
    * of the parent IndirectEntityRef element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.11.0 and higher
    */
  def createIn(container: IndirectEntityRef): EntityRefStep = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
