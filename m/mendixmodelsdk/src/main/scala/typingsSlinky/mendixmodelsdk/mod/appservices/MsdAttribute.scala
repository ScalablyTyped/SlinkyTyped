package typingsSlinky.mendixmodelsdk.mod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.webservicesMod.webservices.DataAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "appservices.MsdAttribute")
@js.native
class MsdAttribute protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.appservices.MsdAttribute {
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
@JSImport("mendixmodelsdk", "appservices.MsdAttribute")
@js.native
object MsdAttribute extends js.Object {
  
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdAttribute = js.native
  
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * The new MsdAttribute will be automatically stored in the 'attributeByContract' property
    * of the parent webservices.DataAttribute element passed as argument.
    */
  def createInDataAttributeUnderAttributeByContract(container: DataAttribute): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdAttribute = js.native
  
  /**
    * Creates and returns a new MsdAttribute instance in the SDK and on the server.
    * The new MsdAttribute will be automatically stored in the 'attributes' property
    * of the parent MsdEntity element passed as argument.
    */
  def createInMsdEntityUnderAttributes(container: typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdEntity): typingsSlinky.mendixmodelsdk.appservicesMod.appservices.MsdAttribute = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
