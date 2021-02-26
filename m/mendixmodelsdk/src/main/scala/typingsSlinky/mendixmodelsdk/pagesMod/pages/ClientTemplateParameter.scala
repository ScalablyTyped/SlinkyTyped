package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplateParameter")
@js.native
class ClientTemplateParameter protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath: String = js.native
  def attributePath_=(newValue: String): Unit = js.native
  
  /**
    * In version 7.11.0: introduced
    */
  def attributeRef: AttributeRef | Null = js.native
  def attributeRef_=(newValue: AttributeRef | Null): Unit = js.native
  
  def containerAsClientTemplate: ClientTemplate = js.native
  
  /**
    * In version 7.15.0: introduced
    */
  def formattingInfo: FormattingInfo = js.native
  def formattingInfo_=(newValue: FormattingInfo): Unit = js.native
}
object ClientTemplateParameter {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplateParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ClientTemplateParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplateParameter.create")
  @js.native
  def create(model: IModel): ClientTemplateParameter = js.native
  
  /**
    * Creates and returns a new ClientTemplateParameter instance in the SDK and on the server.
    * The new ClientTemplateParameter will be automatically stored in the 'parameters' property
    * of the parent ClientTemplate element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplateParameter.createIn")
  @js.native
  def createIn(container: ClientTemplate): ClientTemplateParameter = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplateParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplateParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
