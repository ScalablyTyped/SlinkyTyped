package typingsSlinky.mendixmodelsdk.mod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "domainmodels.AssociationDeleteBehavior")
@js.native
class AssociationDeleteBehavior protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels.AssociationDeleteBehavior {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "domainmodels.AssociationDeleteBehavior")
@js.native
object AssociationDeleteBehavior extends js.Object {
  
  /**
    * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationDeleteBehavior = js.native
  
  /**
    * Creates and returns a new AssociationDeleteBehavior instance in the SDK and on the server.
    * The new AssociationDeleteBehavior will be automatically stored in the 'deleteBehavior' property
    * of the parent AssociationBase element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationBase): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AssociationDeleteBehavior = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
