package typingsSlinky.mendixmodelsdk.mod.microflows

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
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
@JSImport("mendixmodelsdk", "microflows.EntityTypeCodeActionParameterValue")
@js.native
class EntityTypeCodeActionParameterValue protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.microflows.EntityTypeCodeActionParameterValue {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object EntityTypeCodeActionParameterValue {
  
  @JSImport("mendixmodelsdk", "microflows.EntityTypeCodeActionParameterValue")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.EntityTypeCodeActionParameterValue.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EntityTypeCodeActionParameterValue = js.native
  
  /**
    * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
    * The new EntityTypeCodeActionParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.EntityTypeCodeActionParameterValue.createInJavaActionParameterMappingUnderParameterValue")
  @js.native
  def createInJavaActionParameterMappingUnderParameterValue(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaActionParameterMapping): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EntityTypeCodeActionParameterValue = js.native
  
  /**
    * Creates and returns a new EntityTypeCodeActionParameterValue instance in the SDK and on the server.
    * The new EntityTypeCodeActionParameterValue will be automatically stored in the 'parameterValue' property
    * of the parent JavaScriptActionParameterMapping element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.21.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.EntityTypeCodeActionParameterValue.createInJavaScriptActionParameterMappingUnderParameterValue")
  @js.native
  def createInJavaScriptActionParameterMappingUnderParameterValue(container: typingsSlinky.mendixmodelsdk.microflowsMod.microflows.JavaScriptActionParameterMapping): typingsSlinky.mendixmodelsdk.microflowsMod.microflows.EntityTypeCodeActionParameterValue = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.EntityTypeCodeActionParameterValue.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.EntityTypeCodeActionParameterValue.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
