package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationDeleteBehavior")
@js.native
class AssociationDeleteBehavior protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FAssociationDeleteBehavior: IModel = js.native
  def childDeleteBehavior: DeletingBehavior = js.native
  def childDeleteBehavior(newValue: DeletingBehavior): js.Any = js.native
  def childErrorMessage(): js.Any = js.native
  def childErrorMessage(newValue: Text): js.Any = js.native
  @JSName("childErrorMessage")
  def childErrorMessage_Union: Text | Null = js.native
  def containerAsAssociationBase: AssociationBase = js.native
  def parentDeleteBehavior: DeletingBehavior = js.native
  def parentDeleteBehavior(newValue: DeletingBehavior): js.Any = js.native
  def parentErrorMessage(): js.Any = js.native
  def parentErrorMessage(newValue: Text): js.Any = js.native
  @JSName("parentErrorMessage")
  def parentErrorMessage_Union: Text | Null = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.AssociationDeleteBehavior")
@js.native
object AssociationDeleteBehavior extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): AssociationDeleteBehavior = js.native
  /**
    * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
    * The new AssociationDeleteBehavior will be automatically stored in the 'deleteBehavior' property
    * of the parent AssociationBase element passed as argument.
    */
  def createIn(container: AssociationBase): AssociationDeleteBehavior = js.native
}

