package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.WidgetValidation")
@js.native
class WidgetValidation protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def containerAsAttributeWidget: AttributeWidget = js.native
  
  def containerAsReferenceSelector: ReferenceSelector = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def expression: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * In version 7.9.0: introduced
    */
  def expressionModel: Expression = js.native
  def expressionModel_=(newValue: Expression): Unit = js.native
  
  def expression_=(newValue: String): Unit = js.native
  
  def message: Text = js.native
  def message_=(newValue: Text): Unit = js.native
  
  @JSName("model")
  var model_FWidgetValidation: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.WidgetValidation")
@js.native
object WidgetValidation extends js.Object {
  
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): WidgetValidation = js.native
  
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * The new WidgetValidation will be automatically stored in the 'validation' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInAttributeWidgetUnderValidation(container: AttributeWidget): WidgetValidation = js.native
  
  /**
    * Creates and returns a new WidgetValidation instance in the SDK and on the server.
    * The new WidgetValidation will be automatically stored in the 'validation' property
    * of the parent ReferenceSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.6.0 and higher
    */
  def createInReferenceSelectorUnderValidation(container: ReferenceSelector): WidgetValidation = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
