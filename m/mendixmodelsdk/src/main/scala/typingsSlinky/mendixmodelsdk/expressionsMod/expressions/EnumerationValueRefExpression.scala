package typingsSlinky.mendixmodelsdk.expressionsMod.expressions

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.IEnumerationValue
import typingsSlinky.mendixmodelsdk.expressionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.EnumerationValueRefExpression")
@js.native
class EnumerationValueRefExpression protected () extends Expression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("model")
  var model_FEnumerationValueRefExpression: IModel = js.native
  
  def value: IEnumerationValue = js.native
  
  def valueQualifiedName: String = js.native
  
  def value_=(newValue: IEnumerationValue): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.EnumerationValueRefExpression")
@js.native
object EnumerationValueRefExpression extends js.Object {
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderLeft(container: BinaryExpression): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderRight(container: BinaryExpression): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeListActionUnderValueModel(container: ChangeListAction): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInEndEventUnderReturnValueModel(container: EndEvent): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInFormDataPartUnderValueModel(container: FormDataPart): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderCondition(container: IfExpression): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfFalse(container: IfExpression): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfTrue(container: IfExpression): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMemberChangeUnderValueModel(container: MemberChange): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInUnaryExpressionUnderExpression(container: UnaryExpression): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): EnumerationValueRefExpression = js.native
  
  /**
    * Creates and returns a new EnumerationValueRefExpression instance in the SDK and on the server.
    * The new EnumerationValueRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): EnumerationValueRefExpression = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
