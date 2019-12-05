package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.12.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.NanoflowSource")
@js.native
class NanoflowSource protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.NanoflowSource {
  def this(
    model: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typingsSlinky.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typingsSlinky.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "pages.NanoflowSource")
@js.native
object NanoflowSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.NanoflowSource = js.native
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * The new NanoflowSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.12.0 to 8.2.0
    */
  def createIn(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.EntityWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.NanoflowSource = js.native
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * The new NanoflowSource will be automatically stored in the 'dataSource' property
    * of the parent EntityWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.12.0 and higher
    */
  def createInEntityWidgetUnderDataSource(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.EntityWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.NanoflowSource = js.native
  /**
    * Creates and returns a new NanoflowSource instance in the SDK and on the server.
    * The new NanoflowSource will be automatically stored in the 'dataSource' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInWidgetValueUnderDataSource(container: WidgetValue): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.NanoflowSource = js.native
}

