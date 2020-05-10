package typingsSlinky.mendixmodelsdk.expressionsMod.expressions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.expressionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.AppServiceCallParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.BasicCodeActionParameterValue
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.BasicJavaActionParameterValue
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.BinaryRequestHandling
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ChangeListAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ChangeVariableAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CreateVariableAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.CustomRange
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.DocumentTemplateParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EndEvent
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ExpressionSplitCondition
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.FormDataPart
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.GenerateDocumentAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpConfiguration
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.HttpHeaderEntry
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.InspectAttribute
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.LogMessageAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MemberChange
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.MicroflowCallParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.NanoflowCallParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.ProxyConfiguration
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RestCallAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.RuleCallParameterMapping
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.TemplateArgument
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceCallAction
import typingsSlinky.mendixmodelsdk.microflowsMod.microflows.WebServiceOperationParameterMapping
import typingsSlinky.mendixmodelsdk.pagesMod.pages.ConditionalSettings
import typingsSlinky.mendixmodelsdk.pagesMod.pages.WidgetValidation
import typingsSlinky.mendixmodelsdk.restMod.rest.ConsumedODataService
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
  def containerAsAppServiceCallParameterMapping: AppServiceCallParameterMapping = js.native
  def containerAsBasicCodeActionParameterValue: BasicCodeActionParameterValue = js.native
  def containerAsBasicJavaActionParameterValue: BasicJavaActionParameterValue = js.native
  def containerAsBinaryExpression: BinaryExpression = js.native
  def containerAsBinaryRequestHandling: BinaryRequestHandling = js.native
  def containerAsChangeListAction: ChangeListAction = js.native
  def containerAsChangeVariableAction: ChangeVariableAction = js.native
  def containerAsConditionalSettings: ConditionalSettings = js.native
  def containerAsConsumedODataService: ConsumedODataService = js.native
  def containerAsCreateVariableAction: CreateVariableAction = js.native
  def containerAsCustomRange: CustomRange = js.native
  def containerAsDocumentTemplateParameterMapping: DocumentTemplateParameterMapping = js.native
  def containerAsEndEvent: EndEvent = js.native
  def containerAsExpressionSplitCondition: ExpressionSplitCondition = js.native
  def containerAsFormDataPart: FormDataPart = js.native
  def containerAsFunctionCallExpression: FunctionCallExpression = js.native
  def containerAsGenerateDocumentAction: GenerateDocumentAction = js.native
  def containerAsHttpConfiguration: HttpConfiguration = js.native
  def containerAsHttpHeaderEntry: HttpHeaderEntry = js.native
  def containerAsIfExpression: IfExpression = js.native
  def containerAsInspectAttribute: InspectAttribute = js.native
  def containerAsLogMessageAction: LogMessageAction = js.native
  def containerAsMemberChange: MemberChange = js.native
  def containerAsMicroflowCallParameterMapping: MicroflowCallParameterMapping = js.native
  def containerAsNanoflowCallParameterMapping: NanoflowCallParameterMapping = js.native
  def containerAsParenthesisExpression: ParenthesisExpression = js.native
  def containerAsProxyConfiguration: ProxyConfiguration = js.native
  def containerAsRestCallAction: RestCallAction = js.native
  def containerAsRuleCallParameterMapping: RuleCallParameterMapping = js.native
  def containerAsTemplateArgument: TemplateArgument = js.native
  def containerAsUnaryExpression: UnaryExpression = js.native
  def containerAsWebServiceCallAction: WebServiceCallAction = js.native
  def containerAsWebServiceOperationParameterMapping: WebServiceOperationParameterMapping = js.native
  def containerAsWidgetValidation: WidgetValidation = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.Expression")
@js.native
object Expression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

