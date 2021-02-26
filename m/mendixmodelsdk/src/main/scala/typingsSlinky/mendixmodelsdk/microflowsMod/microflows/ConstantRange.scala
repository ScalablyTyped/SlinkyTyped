package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ConstantRange")
@js.native
class ConstantRange protected () extends Range {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def singleObject: Boolean = js.native
  def singleObject_=(newValue: Boolean): Unit = js.native
}
object ConstantRange {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ConstantRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ConstantRange.create")
  @js.native
  def create(model: IModel): ConstantRange = js.native
  
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * The new ConstantRange will be automatically stored in the 'range' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ConstantRange.createInDatabaseRetrieveSourceUnderRange")
  @js.native
  def createInDatabaseRetrieveSourceUnderRange(container: DatabaseRetrieveSource): ConstantRange = js.native
  
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * The new ConstantRange will be automatically stored in the 'range' property
    * of the parent ImportMappingCall element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ConstantRange.createInImportMappingCallUnderRange")
  @js.native
  def createInImportMappingCallUnderRange(container: ImportMappingCall): ConstantRange = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ConstantRange.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.ConstantRange.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
