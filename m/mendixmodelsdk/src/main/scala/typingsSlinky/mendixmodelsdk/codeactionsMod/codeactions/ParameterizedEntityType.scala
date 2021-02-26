package typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: introduced
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.IType because Already inherited
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.IEntityType because Already inherited
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.IParameterizedEntityType because var conflicts: containerAsBasicParameterType, containerAsCodeAction, containerAsListType, id, isLoaded, model, structureTypeName, unit. Inlined typeParameter */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ParameterizedEntityType")
@js.native
class ParameterizedEntityType protected () extends EntityType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MParameterizedEntityType: BasicParameterType = js.native
  
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MParameterizedEntityType: CodeAction = js.native
  
  @JSName("containerAsListType")
  def containerAsListType_MParameterizedEntityType: ListType = js.native
  
  def typeParameter: TypeParameter = js.native
  def typeParameter_=(newValue: TypeParameter): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("typeParameter")
  val typeParameter_FParameterizedEntityType: ITypeParameter = js.native
}
object ParameterizedEntityType {
  
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ParameterizedEntityType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ParameterizedEntityType.create")
  @js.native
  def create(model: IModel): ParameterizedEntityType = js.native
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ParameterizedEntityType.createInBasicParameterTypeUnderType")
  @js.native
  def createInBasicParameterTypeUnderType(container: BasicParameterType): ParameterizedEntityType = js.native
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ParameterizedEntityType.createInCodeActionUnderActionReturnType")
  @js.native
  def createInCodeActionUnderActionReturnType(container: CodeAction): ParameterizedEntityType = js.native
  
  /**
    * Creates and returns a new ParameterizedEntityType instance in the SDK and on the server.
    * The new ParameterizedEntityType will be automatically stored in the 'parameter' property
    * of the parent ListType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ParameterizedEntityType.createInListTypeUnderParameter")
  @js.native
  def createInListTypeUnderParameter(container: ListType): ParameterizedEntityType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ParameterizedEntityType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.ParameterizedEntityType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
