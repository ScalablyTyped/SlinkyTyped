package typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.rest.ODataKeyPart
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.StringAttributeType")
@js.native
class StringAttributeType protected ()
  extends typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.StringAttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object StringAttributeType {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.StringAttributeType")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.StringAttributeType.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.StringAttributeType = js.native
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * The new StringAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.8.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.StringAttributeType.createIn")
  @js.native
  def createIn(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.StringAttributeType = js.native
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * The new StringAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.StringAttributeType.createInAttributeUnderType")
  @js.native
  def createInAttributeUnderType(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.StringAttributeType = js.native
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * The new StringAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.StringAttributeType.createInEntityKeyPartUnderType")
  @js.native
  def createInEntityKeyPartUnderType(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EntityKeyPart): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.StringAttributeType = js.native
  
  /**
    * Creates and returns a new StringAttributeType instance in the SDK and on the server.
    * The new StringAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.StringAttributeType.createInODataKeyPartUnderType")
  @js.native
  def createInODataKeyPartUnderType(container: ODataKeyPart): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.StringAttributeType = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.StringAttributeType.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.StringAttributeType.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
