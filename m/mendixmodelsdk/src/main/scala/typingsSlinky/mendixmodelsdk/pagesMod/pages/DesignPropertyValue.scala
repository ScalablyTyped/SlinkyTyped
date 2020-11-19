package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.Element
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DesignPropertyValue")
@js.native
class DesignPropertyValue protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def booleanValue: Boolean = js.native
  def booleanValue_=(newValue: Boolean): Unit = js.native
  
  def containerAsAppearance: Appearance = js.native
  
  def key: String = js.native
  def key_=(newValue: String): Unit = js.native
  
  @JSName("model")
  var model_FDesignPropertyValue: IModel = js.native
  
  def stringValue: String = js.native
  def stringValue_=(newValue: String): Unit = js.native
  
  def `type`: DesignPropertyValueType = js.native
  def type_=(newValue: DesignPropertyValueType): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DesignPropertyValue")
@js.native
object DesignPropertyValue extends js.Object {
  
  /**
    * Creates and returns a new DesignPropertyValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DesignPropertyValue = js.native
  
  /**
    * Creates and returns a new DesignPropertyValue instance in the SDK and on the server.
    * The new DesignPropertyValue will be automatically stored in the 'designProperties' property
    * of the parent Appearance element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createIn(container: Appearance): DesignPropertyValue = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
