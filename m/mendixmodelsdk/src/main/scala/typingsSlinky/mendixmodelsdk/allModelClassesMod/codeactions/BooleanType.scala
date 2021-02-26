package typingsSlinky.mendixmodelsdk.allModelClassesMod.codeactions

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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.BooleanType")
@js.native
class BooleanType protected ()
  extends typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.BooleanType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object BooleanType {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.BooleanType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.BooleanType.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.BooleanType = js.native
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * The new BooleanType will be automatically stored in the 'type' property
    * of the parent BasicParameterType element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.BooleanType.createInBasicParameterTypeUnderType")
  @js.native
  def createInBasicParameterTypeUnderType(container: typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.BasicParameterType): typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.BooleanType = js.native
  
  /**
    * Creates and returns a new BooleanType instance in the SDK and on the server.
    * The new BooleanType will be automatically stored in the 'actionReturnType' property
    * of the parent CodeAction element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.BooleanType.createInCodeActionUnderActionReturnType")
  @js.native
  def createInCodeActionUnderActionReturnType(container: typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.CodeAction): typingsSlinky.mendixmodelsdk.codeactionsMod.codeactions.BooleanType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.BooleanType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "codeactions.BooleanType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
