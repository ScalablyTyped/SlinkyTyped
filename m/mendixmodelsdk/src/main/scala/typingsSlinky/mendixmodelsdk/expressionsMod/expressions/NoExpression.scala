package typingsSlinky.mendixmodelsdk.expressionsMod.expressions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
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
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 7.9.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression")
@js.native
class NoExpression protected () extends Expression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object NoExpression {
  
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.create")
  @js.native
  def create(model: IModel): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInAppServiceCallParameterMappingUnderArgumentModel")
  @js.native
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInBasicCodeActionParameterValueUnderArgumentModel")
  @js.native
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInBasicJavaActionParameterValueUnderArgumentModel")
  @js.native
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInBinaryExpressionUnderLeft")
  @js.native
  def createInBinaryExpressionUnderLeft(container: BinaryExpression): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInBinaryExpressionUnderRight")
  @js.native
  def createInBinaryExpressionUnderRight(container: BinaryExpression): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInBinaryRequestHandlingUnderExpressionModel")
  @js.native
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInChangeListActionUnderValueModel")
  @js.native
  def createInChangeListActionUnderValueModel(container: ChangeListAction): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInChangeVariableActionUnderValueModel")
  @js.native
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInConditionalSettingsUnderExpressionModel")
  @js.native
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInConsumedODataServiceUnderTimeoutModel")
  @js.native
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInCreateVariableActionUnderInitialValueModel")
  @js.native
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInCustomRangeUnderLimitExpressionModel")
  @js.native
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInCustomRangeUnderOffsetExpressionModel")
  @js.native
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInDocumentTemplateParameterMappingUnderArgumentModel")
  @js.native
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInEndEventUnderReturnValueModel")
  @js.native
  def createInEndEventUnderReturnValueModel(container: EndEvent): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInExpressionSplitConditionUnderExpressionModel")
  @js.native
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInFormDataPartUnderValueModel")
  @js.native
  def createInFormDataPartUnderValueModel(container: FormDataPart): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInFunctionCallExpressionUnderArguments")
  @js.native
  def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInGenerateDocumentActionUnderMarginBottomInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInGenerateDocumentActionUnderMarginLeftInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInGenerateDocumentActionUnderMarginRightInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInGenerateDocumentActionUnderMarginTopInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInHttpConfigurationUnderCustomLocationModel")
  @js.native
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInHttpConfigurationUnderPassword")
  @js.native
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInHttpConfigurationUnderUsername")
  @js.native
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInHttpHeaderEntryUnderValueModel")
  @js.native
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInIfExpressionUnderCondition")
  @js.native
  def createInIfExpressionUnderCondition(container: IfExpression): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInIfExpressionUnderIfFalse")
  @js.native
  def createInIfExpressionUnderIfFalse(container: IfExpression): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInIfExpressionUnderIfTrue")
  @js.native
  def createInIfExpressionUnderIfTrue(container: IfExpression): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInInspectAttributeUnderExpressionModel")
  @js.native
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInLogMessageActionUnderNodeModel")
  @js.native
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInMemberChangeUnderValueModel")
  @js.native
  def createInMemberChangeUnderValueModel(container: MemberChange): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInMicroflowCallParameterMappingUnderArgumentModel")
  @js.native
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInNanoflowCallParameterMappingUnderArgumentModel")
  @js.native
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInParenthesisExpressionUnderExpression")
  @js.native
  def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInProxyConfigurationUnderHostExpressionModel")
  @js.native
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInProxyConfigurationUnderPasswordExpressionModel")
  @js.native
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInProxyConfigurationUnderPortExpressionModel")
  @js.native
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInProxyConfigurationUnderUseConfigurationExpressionModel")
  @js.native
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInProxyConfigurationUnderUsernameExpressionModel")
  @js.native
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInRestCallActionUnderTimeOutModel")
  @js.native
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInRuleCallParameterMappingUnderArgumentModel")
  @js.native
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInTemplateArgumentUnderExpressionModel")
  @js.native
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInUnaryExpressionUnderExpression")
  @js.native
  def createInUnaryExpressionUnderExpression(container: UnaryExpression): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInWebServiceCallActionUnderTimeOutModel")
  @js.native
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInWebServiceOperationParameterMappingUnderArgumentModel")
  @js.native
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): NoExpression = js.native
  
  /**
    * Creates and returns a new NoExpression instance in the SDK and on the server.
    * The new NoExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.createInWidgetValidationUnderExpressionModel")
  @js.native
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): NoExpression = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.NoExpression.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
