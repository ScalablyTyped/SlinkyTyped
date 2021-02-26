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
@JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression")
@js.native
class IfExpression protected () extends Expression {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def condition: Expression = js.native
  def condition_=(newValue: Expression): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def ifFalse: Expression = js.native
  def ifFalse_=(newValue: Expression): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def ifTrue: Expression = js.native
  def ifTrue_=(newValue: Expression): Unit = js.native
}
object IfExpression {
  
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.create")
  @js.native
  def create(model: IModel): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.AppServiceCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInAppServiceCallParameterMappingUnderArgumentModel")
  @js.native
  def createInAppServiceCallParameterMappingUnderArgumentModel(container: AppServiceCallParameterMapping): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicCodeActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInBasicCodeActionParameterValueUnderArgumentModel")
  @js.native
  def createInBasicCodeActionParameterValueUnderArgumentModel(container: BasicCodeActionParameterValue): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.BasicJavaActionParameterValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInBasicJavaActionParameterValueUnderArgumentModel")
  @js.native
  def createInBasicJavaActionParameterValueUnderArgumentModel(container: BasicJavaActionParameterValue): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'left' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInBinaryExpressionUnderLeft")
  @js.native
  def createInBinaryExpressionUnderLeft(container: BinaryExpression): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'right' property
    * of the parent BinaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInBinaryExpressionUnderRight")
  @js.native
  def createInBinaryExpressionUnderRight(container: BinaryExpression): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.BinaryRequestHandling element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInBinaryRequestHandlingUnderExpressionModel")
  @js.native
  def createInBinaryRequestHandlingUnderExpressionModel(container: BinaryRequestHandling): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeListAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInChangeListActionUnderValueModel")
  @js.native
  def createInChangeListActionUnderValueModel(container: ChangeListAction): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.ChangeVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInChangeVariableActionUnderValueModel")
  @js.native
  def createInChangeVariableActionUnderValueModel(container: ChangeVariableAction): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.ConditionalSettings element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInConditionalSettingsUnderExpressionModel")
  @js.native
  def createInConditionalSettingsUnderExpressionModel(container: ConditionalSettings): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'timeoutModel' property
    * of the parent rest.ConsumedODataService element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.5.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInConsumedODataServiceUnderTimeoutModel")
  @js.native
  def createInConsumedODataServiceUnderTimeoutModel(container: ConsumedODataService): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'initialValueModel' property
    * of the parent microflows.CreateVariableAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInCreateVariableActionUnderInitialValueModel")
  @js.native
  def createInCreateVariableActionUnderInitialValueModel(container: CreateVariableAction): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'limitExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInCustomRangeUnderLimitExpressionModel")
  @js.native
  def createInCustomRangeUnderLimitExpressionModel(container: CustomRange): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'offsetExpressionModel' property
    * of the parent microflows.CustomRange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInCustomRangeUnderOffsetExpressionModel")
  @js.native
  def createInCustomRangeUnderOffsetExpressionModel(container: CustomRange): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.DocumentTemplateParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInDocumentTemplateParameterMappingUnderArgumentModel")
  @js.native
  def createInDocumentTemplateParameterMappingUnderArgumentModel(container: DocumentTemplateParameterMapping): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'returnValueModel' property
    * of the parent microflows.EndEvent element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInEndEventUnderReturnValueModel")
  @js.native
  def createInEndEventUnderReturnValueModel(container: EndEvent): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.ExpressionSplitCondition element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInExpressionSplitConditionUnderExpressionModel")
  @js.native
  def createInExpressionSplitConditionUnderExpressionModel(container: ExpressionSplitCondition): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.FormDataPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInFormDataPartUnderValueModel")
  @js.native
  def createInFormDataPartUnderValueModel(container: FormDataPart): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'arguments' property
    * of the parent FunctionCallExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInFunctionCallExpressionUnderArguments")
  @js.native
  def createInFunctionCallExpressionUnderArguments(container: FunctionCallExpression): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'marginBottomInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInGenerateDocumentActionUnderMarginBottomInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginBottomInInchModel(container: GenerateDocumentAction): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'marginLeftInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInGenerateDocumentActionUnderMarginLeftInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginLeftInInchModel(container: GenerateDocumentAction): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'marginRightInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInGenerateDocumentActionUnderMarginRightInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginRightInInchModel(container: GenerateDocumentAction): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'marginTopInInchModel' property
    * of the parent microflows.GenerateDocumentAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInGenerateDocumentActionUnderMarginTopInInchModel")
  @js.native
  def createInGenerateDocumentActionUnderMarginTopInInchModel(container: GenerateDocumentAction): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'customLocationModel' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInHttpConfigurationUnderCustomLocationModel")
  @js.native
  def createInHttpConfigurationUnderCustomLocationModel(container: HttpConfiguration): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'password' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInHttpConfigurationUnderPassword")
  @js.native
  def createInHttpConfigurationUnderPassword(container: HttpConfiguration): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'username' property
    * of the parent microflows.HttpConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInHttpConfigurationUnderUsername")
  @js.native
  def createInHttpConfigurationUnderUsername(container: HttpConfiguration): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.HttpHeaderEntry element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInHttpHeaderEntryUnderValueModel")
  @js.native
  def createInHttpHeaderEntryUnderValueModel(container: HttpHeaderEntry): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'condition' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInIfExpressionUnderCondition")
  @js.native
  def createInIfExpressionUnderCondition(container: IfExpression): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'ifFalse' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInIfExpressionUnderIfFalse")
  @js.native
  def createInIfExpressionUnderIfFalse(container: IfExpression): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'ifTrue' property
    * of the parent IfExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInIfExpressionUnderIfTrue")
  @js.native
  def createInIfExpressionUnderIfTrue(container: IfExpression): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.InspectAttribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInInspectAttributeUnderExpressionModel")
  @js.native
  def createInInspectAttributeUnderExpressionModel(container: InspectAttribute): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'nodeModel' property
    * of the parent microflows.LogMessageAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInLogMessageActionUnderNodeModel")
  @js.native
  def createInLogMessageActionUnderNodeModel(container: LogMessageAction): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'valueModel' property
    * of the parent microflows.MemberChange element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInMemberChangeUnderValueModel")
  @js.native
  def createInMemberChangeUnderValueModel(container: MemberChange): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.MicroflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInMicroflowCallParameterMappingUnderArgumentModel")
  @js.native
  def createInMicroflowCallParameterMappingUnderArgumentModel(container: MicroflowCallParameterMapping): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.NanoflowCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInNanoflowCallParameterMappingUnderArgumentModel")
  @js.native
  def createInNanoflowCallParameterMappingUnderArgumentModel(container: NanoflowCallParameterMapping): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expression' property
    * of the parent ParenthesisExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInParenthesisExpressionUnderExpression")
  @js.native
  def createInParenthesisExpressionUnderExpression(container: ParenthesisExpression): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'hostExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInProxyConfigurationUnderHostExpressionModel")
  @js.native
  def createInProxyConfigurationUnderHostExpressionModel(container: ProxyConfiguration): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'passwordExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInProxyConfigurationUnderPasswordExpressionModel")
  @js.native
  def createInProxyConfigurationUnderPasswordExpressionModel(container: ProxyConfiguration): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'portExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInProxyConfigurationUnderPortExpressionModel")
  @js.native
  def createInProxyConfigurationUnderPortExpressionModel(container: ProxyConfiguration): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'useConfigurationExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInProxyConfigurationUnderUseConfigurationExpressionModel")
  @js.native
  def createInProxyConfigurationUnderUseConfigurationExpressionModel(container: ProxyConfiguration): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'usernameExpressionModel' property
    * of the parent microflows.ProxyConfiguration element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInProxyConfigurationUnderUsernameExpressionModel")
  @js.native
  def createInProxyConfigurationUnderUsernameExpressionModel(container: ProxyConfiguration): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.RestCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInRestCallActionUnderTimeOutModel")
  @js.native
  def createInRestCallActionUnderTimeOutModel(container: RestCallAction): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.RuleCallParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInRuleCallParameterMappingUnderArgumentModel")
  @js.native
  def createInRuleCallParameterMappingUnderArgumentModel(container: RuleCallParameterMapping): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent microflows.TemplateArgument element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInTemplateArgumentUnderExpressionModel")
  @js.native
  def createInTemplateArgumentUnderExpressionModel(container: TemplateArgument): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expression' property
    * of the parent UnaryExpression element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInUnaryExpressionUnderExpression")
  @js.native
  def createInUnaryExpressionUnderExpression(container: UnaryExpression): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'timeOutModel' property
    * of the parent microflows.WebServiceCallAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInWebServiceCallActionUnderTimeOutModel")
  @js.native
  def createInWebServiceCallActionUnderTimeOutModel(container: WebServiceCallAction): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'argumentModel' property
    * of the parent microflows.WebServiceOperationParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInWebServiceOperationParameterMappingUnderArgumentModel")
  @js.native
  def createInWebServiceOperationParameterMappingUnderArgumentModel(container: WebServiceOperationParameterMapping): IfExpression = js.native
  
  /**
    * Creates and returns a new IfExpression instance in the SDK and on the server.
    * The new IfExpression will be automatically stored in the 'expressionModel' property
    * of the parent pages.WidgetValidation element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.createInWidgetValidationUnderExpressionModel")
  @js.native
  def createInWidgetValidationUnderExpressionModel(container: WidgetValidation): IfExpression = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/expressions", "expressions.IfExpression.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
