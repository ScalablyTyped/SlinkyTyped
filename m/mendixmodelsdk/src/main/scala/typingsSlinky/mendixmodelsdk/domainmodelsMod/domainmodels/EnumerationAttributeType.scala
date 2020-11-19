package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.rest.ODataKeyPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAttributeType because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IEnumerationAttributeType because var conflicts: containerAsAttribute, containerAsEntityKeyPart, containerAsODataKeyPart, id, isLoaded, model, structureTypeName, unit. Inlined enumeration, enumerationQualifiedName */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EnumerationAttributeType")
@js.native
class EnumerationAttributeType protected () extends AttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  @JSName("containerAsAttribute")
  def containerAsAttribute_MEnumerationAttributeType: Attribute = js.native
  
  @JSName("containerAsEntityKeyPart")
  def containerAsEntityKeyPart_MEnumerationAttributeType: EntityKeyPart = js.native
  
  @JSName("containerAsODataKeyPart")
  def containerAsODataKeyPart_MEnumerationAttributeType: ODataKeyPart = js.native
  
  def enumeration: IEnumeration = js.native
  
  def enumerationQualifiedName: String = js.native
  @JSName("enumerationQualifiedName")
  val enumerationQualifiedName_FEnumerationAttributeType: String = js.native
  
  def enumeration_=(newValue: IEnumeration): Unit = js.native
  /**
    * This property is required and cannot be set to null.
    */
  @JSName("enumeration")
  val enumeration_FEnumerationAttributeType: IEnumeration = js.native
  
  @JSName("model")
  var model_FEnumerationAttributeType: IModel = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.EnumerationAttributeType")
@js.native
object EnumerationAttributeType extends js.Object {
  
  /**
    * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): EnumerationAttributeType = js.native
  
  /**
    * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
    * The new EnumerationAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.8.0
    */
  def createIn(container: Attribute): EnumerationAttributeType = js.native
  
  /**
    * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
    * The new EnumerationAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createInAttributeUnderType(container: Attribute): EnumerationAttributeType = js.native
  
  /**
    * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
    * The new EnumerationAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createInEntityKeyPartUnderType(container: EntityKeyPart): EnumerationAttributeType = js.native
  
  /**
    * Creates and returns a new EnumerationAttributeType instance in the SDK and on the server.
    * The new EnumerationAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createInODataKeyPartUnderType(container: ODataKeyPart): EnumerationAttributeType = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
