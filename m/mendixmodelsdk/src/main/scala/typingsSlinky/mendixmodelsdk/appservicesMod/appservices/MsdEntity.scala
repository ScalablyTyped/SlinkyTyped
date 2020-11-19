package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEntity")
@js.native
class MsdEntity protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def attributes: IList[MsdAttribute] = js.native
  
  def containerAsMsdDomainModel: MsdDomainModel = js.native
  
  def generalizationName: String = js.native
  def generalizationName_=(newValue: String): Unit = js.native
  
  def guid: String = js.native
  def guid_=(newValue: String): Unit = js.native
  
  def locationX: Double = js.native
  def locationX_=(newValue: Double): Unit = js.native
  
  def locationY: Double = js.native
  def locationY_=(newValue: Double): Unit = js.native
  
  @JSName("model")
  var model_FMsdEntity: IModel = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def persistable: Boolean = js.native
  def persistable_=(newValue: Boolean): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEntity")
@js.native
object MsdEntity extends js.Object {
  
  /**
    * Creates and returns a new MsdEntity instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdEntity = js.native
  
  /**
    * Creates and returns a new MsdEntity instance in the SDK and on the server.
    * The new MsdEntity will be automatically stored in the 'entities' property
    * of the parent MsdDomainModel element passed as argument.
    */
  def createIn(container: MsdDomainModel): MsdEntity = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
