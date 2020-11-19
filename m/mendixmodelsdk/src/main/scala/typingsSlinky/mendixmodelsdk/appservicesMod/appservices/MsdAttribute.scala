package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute")
@js.native
class MsdAttribute protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def attributeType: String = js.native
  def attributeType_=(newValue: String): Unit = js.native
  
  def containerAsDataAttribute: DataAttribute = js.native
  
  def containerAsMsdEntity: MsdEntity = js.native
  
  def defaultValue: String = js.native
  def defaultValue_=(newValue: String): Unit = js.native
  
  def enumerationName: String = js.native
  def enumerationName_=(newValue: String): Unit = js.native
  
  def guid: String = js.native
  def guid_=(newValue: String): Unit = js.native
  
  def length: Double = js.native
  def length_=(newValue: Double): Unit = js.native
  
  @JSName("model")
  var model_FMsdAttribute: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdAttribute")
@js.native
object MsdAttribute extends js.Object {
  
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdAttribute = js.native
  
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * The new MsdAttribute will be automatically stored in the 'attributeByContract' property
    * of the parent webservices.DataAttribute element passed as argument.
    */
  def createInDataAttributeUnderAttributeByContract(container: DataAttribute): MsdAttribute = js.native
  
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * The new MsdAttribute will be automatically stored in the 'attributes' property
    * of the parent MsdEntity element passed as argument.
    */
  def createInMsdEntityUnderAttributes(container: MsdEntity): MsdAttribute = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
