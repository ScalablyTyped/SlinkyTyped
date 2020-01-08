package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.settings

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenSettingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Settings`.
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.Certificate")
@js.native
class Certificate protected ()
  extends typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings.Certificate {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "settings.Certificate")
@js.native
object Certificate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Certificate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings.Certificate = js.native
  /**
    * Creates and returns a new Certificate instance in the SDK and on the server.
    * The new Certificate will be automatically stored in the 'certificates' property
    * of the parent CertificateSettings element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings.CertificateSettings): typingsSlinky.mendixmodelsdk.distGenSettingsMod.settings.Certificate = js.native
}

