package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAssociationBase
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.AssociationRetrieveSource")
@js.native
class AssociationRetrieveSource protected () extends RetrieveSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def association: IAssociationBase | Null = js.native
  
  def associationQualifiedName: String | Null = js.native
  
  def association_=(newValue: IAssociationBase | Null): Unit = js.native
  
  @JSName("model")
  var model_FAssociationRetrieveSource: IModel = js.native
  
  def startVariableName: String = js.native
  def startVariableName_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.AssociationRetrieveSource")
@js.native
object AssociationRetrieveSource extends js.Object {
  
  /**
    * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AssociationRetrieveSource = js.native
  
  /**
    * Creates and returns a new AssociationRetrieveSource instance in the SDK and on the server.
    * The new AssociationRetrieveSource will be automatically stored in the 'retrieveSource' property
    * of the parent RetrieveAction element passed as argument.
    */
  def createIn(container: RetrieveAction): AssociationRetrieveSource = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
