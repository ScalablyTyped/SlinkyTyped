package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.expressions

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
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk", "expressions.ConstantRefExpression")
@js.native
class ConstantRefExpression protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.expressions.ConstantRefExpression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "expressions.ConstantRefExpression")
@js.native
object ConstantRefExpression extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderLeft(container: typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.BinaryExpression): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryExpressionUnderRight(container: typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.BinaryExpression): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeListActionUnderValueModel(container: ChangeListAction): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInEndEventUnderReturnValueModel(container: EndEvent): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInFormDataPartUnderValueModel(container: FormDataPart): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInFunctionCallExpressionUnderArguments(container: typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.FunctionCallExpression): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderCondition(container: typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.IfExpression): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfFalse(container: typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.IfExpression): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInIfExpressionUnderIfTrue(container: typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.IfExpression): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMemberChangeUnderValueModel(container: MemberChange): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInParenthesisExpressionUnderExpression(container: typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ParenthesisExpression): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInUnaryExpressionUnderExpression(container: typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.UnaryExpression): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
  /**
    * Creates and returns a new ConstantRefExpression instance in the SDK and on the server.
    * The new ConstantRefExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): typingsSlinky.mendixmodelsdk.distGenExpressionsMod.expressions.ConstantRefExpression = js.native
}

