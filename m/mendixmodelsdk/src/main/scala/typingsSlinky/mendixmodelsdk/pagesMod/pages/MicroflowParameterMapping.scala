package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.IMicroflowParameter
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.19.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping")
@js.native
class MicroflowParameterMapping protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsMicroflowSettings: MicroflowSettings = js.native
  
  def parameter: IMicroflowParameter = js.native
  
  def parameterQualifiedName: String = js.native
  
  def parameter_=(newValue: IMicroflowParameter): Unit = js.native
  
  /**
    * In version 8.4.0: deleted
    */
  def useAllPages: Boolean = js.native
  def useAllPages_=(newValue: Boolean): Unit = js.native
  
  /**
    * In version 8.4.0: introduced
    */
  def variable: PageVariable = js.native
  def variable_=(newValue: PageVariable): Unit = js.native
  
  /**
    * In version 8.4.0: deleted
    */
  def widget: EntityWidget | Null = js.native
  
  def widgetLocalName: String | Null = js.native
  
  def widget_=(newValue: EntityWidget | Null): Unit = js.native
}
object MicroflowParameterMapping {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping.create")
  @js.native
  def create(model: IModel): MicroflowParameterMapping = js.native
  
  /**
    * Creates and returns a new MicroflowParameterMapping instance in the SDK and on the server.
    * The new MicroflowParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent MicroflowSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping.createIn")
  @js.native
  def createIn(container: MicroflowSettings): MicroflowParameterMapping = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowParameterMapping.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
