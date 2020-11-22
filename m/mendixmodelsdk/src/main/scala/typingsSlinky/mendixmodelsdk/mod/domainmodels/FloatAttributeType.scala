package typingsSlinky.mendixmodelsdk.mod.domainmodels

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.rest.ODataKeyPart
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 6.0.0: deprecated
  */
@JSImport("mendixmodelsdk", "domainmodels.FloatAttributeType")
@js.native
class FloatAttributeType protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels.FloatAttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
/* static members */
@JSImport("mendixmodelsdk", "domainmodels.FloatAttributeType")
@js.native
object FloatAttributeType extends js.Object {
  
  /**
    * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.FloatAttributeType = js.native
  
  /**
    * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
    * The new FloatAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.8.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.FloatAttributeType = js.native
  
  /**
    * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
    * The new FloatAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createInAttributeUnderType(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.FloatAttributeType = js.native
  
  /**
    * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
    * The new FloatAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createInEntityKeyPartUnderType(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EntityKeyPart): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.FloatAttributeType = js.native
  
  /**
    * Creates and returns a new FloatAttributeType instance in the SDK and on the server.
    * The new FloatAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createInODataKeyPartUnderType(container: ODataKeyPart): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.FloatAttributeType = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
