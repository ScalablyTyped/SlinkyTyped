package typingsSlinky.mendixmodelsdk.appservicesMod.appservices

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationValue")
@js.native
class MsdEnumerationValue protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsMsdEnumeration: MsdEnumeration = js.native
  
  def guid: String = js.native
  def guid_=(newValue: String): Unit = js.native
  
  def image: String = js.native
  def image_=(newValue: String): Unit = js.native
  
  def name: String = js.native
  def name_=(newValue: String): Unit = js.native
  
  def translations: IList[MsdText] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/appservices", "appservices.MsdEnumerationValue")
@js.native
object MsdEnumerationValue extends js.Object {
  
  /**
    * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MsdEnumerationValue = js.native
  
  /**
    * Creates and returns a new MsdEnumerationValue instance in the SDK and on the server.
    * The new MsdEnumerationValue will be automatically stored in the 'values' property
    * of the parent MsdEnumeration element passed as argument.
    */
  def createIn(container: MsdEnumeration): MsdEnumerationValue = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
