package typingsSlinky.mendixmodelsdk.settingsMod.settings

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typingsSlinky.mendixmodelsdk.settingsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/settings", "settings.RuntimeSettings")
@js.native
class RuntimeSettings protected () extends ProjectSettingsPart {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def afterStartupMicroflow: IMicroflow | Null = js.native
  
  def afterStartupMicroflowQualifiedName: String | Null = js.native
  
  def afterStartupMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  def allowUserMultipleSessions: Boolean = js.native
  def allowUserMultipleSessions_=(newValue: Boolean): Unit = js.native
  
  def beforeShutdownMicroflow: IMicroflow | Null = js.native
  
  def beforeShutdownMicroflowQualifiedName: String | Null = js.native
  
  def beforeShutdownMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  def defaultTimeZoneCode: String = js.native
  def defaultTimeZoneCode_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    * In version 7.10.0: introduced
    */
  def enableDataStorageNewQueryHandling: Boolean = js.native
  def enableDataStorageNewQueryHandling_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.5.0: introduced
    */
  def enableDataStorageOptimisticLocking: Boolean = js.native
  def enableDataStorageOptimisticLocking_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 7.1.0: introduced
    */
  def enforceDataStorageUniqueness: Boolean = js.native
  def enforceDataStorageUniqueness_=(newValue: Boolean): Unit = js.native
  
  def firstDayOfWeek: FirstDayOfWeekEnum = js.native
  def firstDayOfWeek_=(newValue: FirstDayOfWeekEnum): Unit = js.native
  
  def hashAlgorithm: HashAlgorithmType = js.native
  def hashAlgorithm_=(newValue: HashAlgorithmType): Unit = js.native
  
  def healthCheckMicroflow: IMicroflow | Null = js.native
  
  def healthCheckMicroflowQualifiedName: String | Null = js.native
  
  def healthCheckMicroflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  def roundingMode: RoundingMode = js.native
  def roundingMode_=(newValue: RoundingMode): Unit = js.native
  
  def scheduledEventTimeZoneCode: String = js.native
  def scheduledEventTimeZoneCode_=(newValue: String): Unit = js.native
  
  /**
    * In version 8.0.0: deleted
    * In version 7.15.0: introduced
    */
  def useDeprecatedClientForWebServiceCalls: Boolean = js.native
  def useDeprecatedClientForWebServiceCalls_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/settings", "settings.RuntimeSettings")
@js.native
object RuntimeSettings extends js.Object {
  
  /**
    * Creates and returns a new RuntimeSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): RuntimeSettings = js.native
  
  /**
    * Creates and returns a new RuntimeSettings instance in the SDK and on the server.
    * The new RuntimeSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: ProjectSettings): RuntimeSettings = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
