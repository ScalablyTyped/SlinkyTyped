package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.BooleanAttributeType")
@js.native
class BooleanAttributeType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels.BooleanAttributeType {
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
@JSImport("mendixmodelsdk", "domainmodels.BooleanAttributeType")
@js.native
object BooleanAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new BooleanAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.BooleanAttributeType = js.native
  /**
    * Creates and returns a new BooleanAttributeType instance in the SDK and on the server.
    * The new BooleanAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.Attribute): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.BooleanAttributeType = js.native
}

