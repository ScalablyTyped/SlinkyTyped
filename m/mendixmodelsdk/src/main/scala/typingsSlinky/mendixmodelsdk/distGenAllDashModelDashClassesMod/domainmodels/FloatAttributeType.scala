package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 6.0.0: deprecated
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.FloatAttributeType")
@js.native
class FloatAttributeType protected ()
  extends typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.FloatAttributeType {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.FloatAttributeType")
@js.native
object FloatAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.FloatAttributeType = js.native
  /**
    * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
    * The new FloatAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.Attribute): typingsSlinky.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.FloatAttributeType = js.native
}

