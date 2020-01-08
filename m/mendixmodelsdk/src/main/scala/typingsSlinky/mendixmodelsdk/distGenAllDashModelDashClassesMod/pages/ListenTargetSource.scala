package typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ListenTargetSource")
@js.native
class ListenTargetSource protected ()
  extends typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListenTargetSource {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ListenTargetSource")
@js.native
object ListenTargetSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ListenTargetSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListenTargetSource = js.native
  /**
    * Creates and returns a new ListenTargetSource instance in the SDK and on the server.
    * The new ListenTargetSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 8.2.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.EntityWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListenTargetSource = js.native
  /**
    * Creates and returns a new ListenTargetSource instance in the SDK and on the server.
    * The new ListenTargetSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    */
  def createInEntityWidgetUnderDataSource(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.EntityWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListenTargetSource = js.native
  /**
    * Creates and returns a new ListenTargetSource instance in the SDK and on the server.
    * The new ListenTargetSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: WidgetValue): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ListenTargetSource = js.native
}

