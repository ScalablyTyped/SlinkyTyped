package typingsSlinky.mendixmodelsdk.microflowsMod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.expressionsMod.expressions.Expression
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.microflowsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.BasicCodeActionParameterValue")
@js.native
class BasicCodeActionParameterValue protected () extends ExpressionBasedCodeActionParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    */
  def argument: String = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def argumentModel: Expression = js.native
  def argumentModel_=(newValue: Expression): Unit = js.native
  
  def argument_=(newValue: String): Unit = js.native
}
object BasicCodeActionParameterValue {
  
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.BasicCodeActionParameterValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new BasicCodeActionParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.BasicCodeActionParameterValue.create")
  @js.native
  def create(model: IModel): BasicCodeActionParameterValue = js.native
  
  /**
    * Creates and returns a new BasicCodeActionParameterValue instance in the SDK and on the server.
    * The new BasicCodeActionParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.BasicCodeActionParameterValue.createInJavaActionParameterMappingUnderParameterValue")
  @js.native
  def createInJavaActionParameterMappingUnderParameterValue(container: JavaActionParameterMapping): BasicCodeActionParameterValue = js.native
  
  /**
    * Creates and returns a new BasicCodeActionParameterValue instance in the SDK and on the server.
    * The new BasicCodeActionParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.BasicCodeActionParameterValue.createInJavaScriptActionParameterMappingUnderParameterValue")
  @js.native
  def createInJavaScriptActionParameterMappingUnderParameterValue(container: JavaScriptActionParameterMapping): BasicCodeActionParameterValue = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.BasicCodeActionParameterValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/microflows", "microflows.BasicCodeActionParameterValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
