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

@JSImport("mendixmodelsdk", "microflows.AppServiceCallParameterMapping")
@js.native
class AppServiceCallParameterMapping protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.AppServiceCallParameterMapping {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object AppServiceCallParameterMapping {
  
  @JSImport("mendixmodelsdk", "microflows.AppServiceCallParameterMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AppServiceCallParameterMapping.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping = js.native
  
  /**
    * Creates and returns a new AppServiceCallParameterMapping instance in the SDK and on the server.
    * The new AppServiceCallParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent AppServiceCallAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AppServiceCallParameterMapping.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AppServiceCallAction): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AppServiceCallParameterMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.AppServiceCallParameterMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
