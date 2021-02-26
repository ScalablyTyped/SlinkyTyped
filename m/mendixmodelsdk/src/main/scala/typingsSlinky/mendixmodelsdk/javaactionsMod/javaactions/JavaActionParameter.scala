package typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.CodeAction
import typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.CodeActionParameter
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.javaactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IByNameReferrable because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.ICodeActionParameter because Already inherited
- typingsSlinky.mendixmodelsdk.javaactionsMod.javaactions.IJavaActionParameter because var conflicts: actionParameterType, containerAsCodeAction, containerAsJavaAction, description, id, isLoaded, model, name, qualifiedName, structureTypeName, unit. Inlined `type`, javaType, parameterType */ @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaActionParameter")
@js.native
class JavaActionParameter protected () extends CodeActionParameter {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MJavaActionParameter: CodeAction = js.native
  
  @JSName("containerAsJavaAction")
  def containerAsJavaAction_MJavaActionParameter: JavaAction = js.native
  
  /**
    * In version 6.7.0: deleted
    * In version 6.6.0: introduced
    */
  def javaType: Type = js.native
  def javaType_=(newValue: Type): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 6.7.0: deleted
    * In version 6.6.0: introduced
    */
  @JSName("javaType")
  val javaType_FJavaActionParameter: IType = js.native
  
  /**
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  def parameterType: ParameterType = js.native
  def parameterType_=(newValue: ParameterType): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    *
    * In version 7.21.0: deleted
    * In version 6.7.0: introduced
    */
  @JSName("parameterType")
  val parameterType_FJavaActionParameter: IParameterType = js.native
  
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  def `type`: String = js.native
  def type_=(newValue: String): Unit = js.native
  /**
    * The value of this property is conceptually of type dataTypes.LegacyDataType.
    *
    * In version 6.6.0: deleted
    */
  @JSName("type")
  val type_FJavaActionParameter: String | Null = js.native
}
object JavaActionParameter {
  
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaActionParameter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaActionParameter.create")
  @js.native
  def create(model: IModel): JavaActionParameter = js.native
  
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * The new JavaActionParameter will be automatically stored in the 'actionParameters' property
    * of the parent codeactions.CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaActionParameter.createInCodeActionUnderActionParameters")
  @js.native
  def createInCodeActionUnderActionParameters(container: CodeAction): JavaActionParameter = js.native
  
  /**
    * Creates and returns a new JavaActionParameter instance in the SDK and on the server.
    * The new JavaActionParameter will be automatically stored in the 'parameters' property
    * of the parent JavaAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.20.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaActionParameter.createInJavaActionUnderParameters")
  @js.native
  def createInJavaActionUnderParameters(container: JavaAction): JavaActionParameter = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaActionParameter.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/javaactions", "javaactions.JavaActionParameter.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
