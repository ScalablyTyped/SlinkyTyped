package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.ScrollContainerRegion")
@js.native
class ScrollContainerRegion protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.ScrollContainerRegion {
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
@JSImport("mendixmodelsdk", "pages.ScrollContainerRegion")
@js.native
object ScrollContainerRegion extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'bottom' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderBottom(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'center' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderCenter(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'left' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderLeft(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'right' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderRight(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion = js.native
  /**
    * Creates and returns a new ScrollContainerRegion instance in the SDK and on the server.
    * The new ScrollContainerRegion will be automatically stored in the 'top' property
    * of the parent ScrollContainer element passed as argument.
    */
  def createInScrollContainerUnderTop(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainer): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ScrollContainerRegion = js.native
}

