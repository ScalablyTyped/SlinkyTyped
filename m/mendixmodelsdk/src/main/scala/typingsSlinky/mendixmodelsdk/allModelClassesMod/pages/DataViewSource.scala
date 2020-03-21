package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.DataViewSource")
@js.native
class DataViewSource protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.DataViewSource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.DataViewSource")
@js.native
object DataViewSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DataViewSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.DataViewSource = js.native
  /**
    * Creates and returns a new DataViewSource instance in the SDK and on the server.
    * The new DataViewSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.EntityWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.DataViewSource = js.native
  /**
    * Creates and returns a new DataViewSource instance in the SDK and on the server.
    * The new DataViewSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  def createInEntityWidgetUnderDataSource(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.EntityWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.DataViewSource = js.native
  /**
    * Creates and returns a new DataViewSource instance in the SDK and on the server.
    * The new DataViewSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: WidgetValue): typingsSlinky.mendixmodelsdk.pagesMod.pages.DataViewSource = js.native
}

