package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplateParameter")
@js.native
class ClientTemplateParameter protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
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
  
  @JSName("model")
  var model_FClientTemplateParameter: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ClientTemplateParameter")
@js.native
object ClientTemplateParameter extends js.Object {
  
  /**
    * Creates and returns a new ClientTemplateParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ClientTemplateParameter = js.native
  
  /**
    * Creates and returns a new ClientTemplateParameter instance in the SDK and on the server.
    * The new ClientTemplateParameter will be automatically stored in the 'parameters' property
    * of the parent ClientTemplate element passed as argument.
    */
  def createIn(container: ClientTemplate): ClientTemplateParameter = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
