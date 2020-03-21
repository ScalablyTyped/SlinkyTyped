package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ImageIcon")
@js.native
class ImageIcon protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.ImageIcon {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ImageIcon")
@js.native
object ImageIcon extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderIcon(container: BottomBarItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent Button element passed as argument.
    */
  def createInButtonUnderIcon(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Button): typingsSlinky.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent ControlBarButton element passed as argument.
    */
  def createInControlBarButtonUnderIcon(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ControlBarButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent menus.MenuItem element passed as argument.
    */
  def createInMenuItemUnderIcon(container: MenuItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
  /**
    * Creates and returns a new ImageIcon instance in the SDK and on the server.
    * The new ImageIcon will be automatically stored in the 'icon' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInWidgetValueUnderIcon(container: WidgetValue): typingsSlinky.mendixmodelsdk.pagesMod.pages.ImageIcon = js.native
}

