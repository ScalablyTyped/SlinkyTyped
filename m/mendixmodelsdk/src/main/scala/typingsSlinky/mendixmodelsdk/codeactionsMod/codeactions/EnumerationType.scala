package typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.codeactionsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration
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
- typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.IEnumerationType because var conflicts: containerAsBasicParameterType, containerAsCodeAction, containerAsListType, id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EnumerationType")
@js.native
class EnumerationType protected () extends Type {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  @JSName("containerAsBasicParameterType")
  def containerAsBasicParameterType_MEnumerationType: BasicParameterType = js.native
  
  @JSName("containerAsCodeAction")
  def containerAsCodeAction_MEnumerationType: CodeAction = js.native
  
  def enumeration: IEnumeration = js.native
  
  def enumerationQualifiedName: String = js.native
  @JSName("enumerationQualifiedName")
  val enumerationQualifiedName_FEnumerationType: String = js.native
  
  def enumeration_=(newValue: IEnumeration): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("enumeration")
  val enumeration_FEnumerationType: IEnumeration = js.native
}
object EnumerationType {
  
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EnumerationType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EnumerationType.create")
  @js.native
  def create(model: IModel): EnumerationType = js.native
  
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EnumerationType.createInBasicParameterTypeUnderType")
  @js.native
  def createInBasicParameterTypeUnderType(container: BasicParameterType): EnumerationType = js.native
  
  /**
    * Creates and returns a new EnumerationType instance in the SDK and on the server.
    * The new EnumerationType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EnumerationType.createInCodeActionUnderActionReturnType")
  @js.native
  def createInCodeActionUnderActionReturnType(container: CodeAction): EnumerationType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EnumerationType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/codeactions", "codeactions.EnumerationType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
