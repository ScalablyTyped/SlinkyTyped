package typingsSlinky.mendixmodelsdk.mod.microflows

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

@JSImport("mendixmodelsdk", "microflows.ConstantRange")
@js.native
class ConstantRange protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.ConstantRange {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ConstantRange {
  
  @JSImport("mendixmodelsdk", "microflows.ConstantRange")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ConstantRange.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ConstantRange = js.native
  
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * The new ConstantRange will be automatically stored in the 'range' property
    * of the parent DatabaseRetrieveSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ConstantRange.createInDatabaseRetrieveSourceUnderRange")
  @js.native
  def createInDatabaseRetrieveSourceUnderRange(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.DatabaseRetrieveSource): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ConstantRange = js.native
  
  /**
    * Creates and returns a new ConstantRange instance in the SDK and on the server.
    * The new ConstantRange will be automatically stored in the 'range' property
    * of the parent ImportMappingCall element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ConstantRange.createInImportMappingCallUnderRange")
  @js.native
  def createInImportMappingCallUnderRange(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ImportMappingCall): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ConstantRange = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ConstantRange.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ConstantRange.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
