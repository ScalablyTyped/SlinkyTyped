package typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.mendixmodelsdk.structuresMod.aliases.IContainer because Already inherited
- typingsSlinky.mendixmodelsdk.structuresMod.IStructure because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IAbstractElement because Already inherited
- typingsSlinky.mendixmodelsdk.elementsMod.IElement because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IAttributeType because Already inherited
- typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.IDateTimeAttributeType because var conflicts: containerAsAttribute, id, isLoaded, model, structureTypeName, unit. Inlined  */ @JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DateTimeAttributeType")
@js.native
class DateTimeAttributeType protected () extends AttributeType {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDateTimeAttributeType: IModel = js.native
  @JSName("containerAsAttribute")
  def containerAsAttribute_MDateTimeAttributeType: Attribute = js.native
  def localizeDate: Boolean = js.native
  def localizeDate(newValue: Boolean): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/domainmodels", "domainmodels.DateTimeAttributeType")
@js.native
object DateTimeAttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DateTimeAttributeType = js.native
  /**
    * Creates and returns a new DateTimeAttributeType instance in the SDK and on the server.
    * The new DateTimeAttributeType will be automatically stored in the 'type' property
    * of the parent Attribute element passed as argument.
    */
  def createIn(container: Attribute): DateTimeAttributeType = js.native
}

