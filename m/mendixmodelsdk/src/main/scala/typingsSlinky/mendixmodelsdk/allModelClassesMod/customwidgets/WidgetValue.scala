package typingsSlinky.mendixmodelsdk.allModelClassesMod.customwidgets

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValue")
@js.native
class WidgetValue protected ()
  extends typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "customwidgets.WidgetValue")
@js.native
object WidgetValue extends js.Object {
  
  /**
    * Creates and returns a new WidgetValue instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue = js.native
  
  /**
    * Creates and returns a new WidgetValue instance in the SDK and on the server.
    * The new WidgetValue will be automatically stored in the 'value' property
    * of the parent WidgetProperty element passed as argument.
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetProperty): typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
