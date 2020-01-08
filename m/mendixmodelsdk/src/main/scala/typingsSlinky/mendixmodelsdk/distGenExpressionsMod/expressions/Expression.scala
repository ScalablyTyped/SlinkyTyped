package typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenExpressionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.AppServiceCallParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.BasicCodeActionParameterValue
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.BasicJavaActionParameterValue
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.BinaryRequestHandling
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ChangeListAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ChangeVariableAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.CreateVariableAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.CustomRange
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.DocumentTemplateParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.EndEvent
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ExpressionSplitCondition
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.FormDataPart
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.GenerateDocumentAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpConfiguration
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.HttpHeaderEntry
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.InspectAttribute
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.LogMessageAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MemberChange
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.MicroflowCallParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.NanoflowCallParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.ProxyConfiguration
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.RestCallAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.RuleCallParameterMapping
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.TemplateArgument
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceCallAction
import typingsSlinky.mendixmodelsdk.distGenMicroflowsMod.microflows.WebServiceOperationParameterMapping
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ConditionalSettings
import typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.WidgetValidation
import typingsSlinky.mendixmodelsdk.distGenRestMod.rest.ConsumedODataService
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.Element
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces and instance classes for types from the Mendix sub meta model `Expressions`.
  */
/**
  * See: {@link https://docs.mendix.com/refguide7/microflow-expressions relevant section in reference guide}
  *
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.Expression")
@js.native
abstract class Expression protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FExpression: IModel = js.native
  def containerAsAppServiceCallParameterMapping(): AppServiceCallParameterMapping = js.native
  def containerAsBasicCodeActionParameterValue(): BasicCodeActionParameterValue = js.native
  def containerAsBasicJavaActionParameterValue(): BasicJavaActionParameterValue = js.native
  def containerAsBinaryExpression(): BinaryExpression = js.native
  def containerAsBinaryRequestHandling(): BinaryRequestHandling = js.native
  def containerAsChangeListAction(): ChangeListAction = js.native
  def containerAsChangeVariableAction(): ChangeVariableAction = js.native
  def containerAsConditionalSettings(): ConditionalSettings = js.native
  def containerAsConsumedODataService(): ConsumedODataService = js.native
  def containerAsCreateVariableAction(): CreateVariableAction = js.native
  def containerAsCustomRange(): CustomRange = js.native
  def containerAsDocumentTemplateParameterMapping(): DocumentTemplateParameterMapping = js.native
  def containerAsEndEvent(): EndEvent = js.native
  def containerAsExpressionSplitCondition(): ExpressionSplitCondition = js.native
  def containerAsFormDataPart(): FormDataPart = js.native
  def containerAsFunctionCallExpression(): FunctionCallExpression = js.native
  def containerAsGenerateDocumentAction(): GenerateDocumentAction = js.native
  def containerAsHttpConfiguration(): HttpConfiguration = js.native
  def containerAsHttpHeaderEntry(): HttpHeaderEntry = js.native
  def containerAsIfExpression(): IfExpression = js.native
  def containerAsInspectAttribute(): InspectAttribute = js.native
  def containerAsLogMessageAction(): LogMessageAction = js.native
  def containerAsMemberChange(): MemberChange = js.native
  def containerAsMicroflowCallParameterMapping(): MicroflowCallParameterMapping = js.native
  def containerAsNanoflowCallParameterMapping(): NanoflowCallParameterMapping = js.native
  def containerAsParenthesisExpression(): ParenthesisExpression = js.native
  def containerAsProxyConfiguration(): ProxyConfiguration = js.native
  def containerAsRestCallAction(): RestCallAction = js.native
  def containerAsRuleCallParameterMapping(): RuleCallParameterMapping = js.native
  def containerAsTemplateArgument(): TemplateArgument = js.native
  def containerAsUnaryExpression(): UnaryExpression = js.native
  def containerAsWebServiceCallAction(): WebServiceCallAction = js.native
  def containerAsWebServiceOperationParameterMapping(): WebServiceOperationParameterMapping = js.native
  def containerAsWidgetValidation(): WidgetValidation = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.Expression")
@js.native
object Expression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

