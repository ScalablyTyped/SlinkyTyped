package typingsSlinky.mendixmodelsdk.allModelClassesMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.restMod.rest.ODataKeyPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DateTimeAttributeType")
@js.native
class DateTimeAttributeType protected ()
  extends typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DateTimeAttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "domainmodels.DateTimeAttributeType")
@js.native
object DateTimeAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DateTimeAttributeType = js.native
  /**
    * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
    * The new DateTimeAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.8.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DateTimeAttributeType = js.native
  /**
    * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
    * The new DateTimeAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createInAttributeUnderType(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.Attribute): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DateTimeAttributeType = js.native
  /**
    * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
    * The new DateTimeAttributeType will be automatically stored in the 'type' property
    * of the parent EntityKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createInEntityKeyPartUnderType(container: typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EntityKeyPart): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DateTimeAttributeType = js.native
  /**
    * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
    * The new DateTimeAttributeType will be automatically stored in the 'type' property
    * of the parent rest.ODataKeyPart element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.9.0 and higher
    */
  def createInODataKeyPartUnderType(container: ODataKeyPart): typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.DateTimeAttributeType = js.native
}

