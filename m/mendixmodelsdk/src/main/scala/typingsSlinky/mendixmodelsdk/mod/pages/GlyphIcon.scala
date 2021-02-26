package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "pages.GlyphIcon")
@js.native
class GlyphIcon protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.GlyphIcon {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object GlyphIcon {
  
  @JSImport("mendixmodelsdk", "pages.GlyphIcon")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GlyphIcon.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GlyphIcon.createInBottomBarItemUnderIcon")
  @js.native
  def createInBottomBarItemUnderIcon(container: BottomBarItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent Button element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GlyphIcon.createInButtonUnderIcon")
  @js.native
  def createInButtonUnderIcon(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Button): typingsSlinky.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GlyphIcon.createInControlBarButtonUnderIcon")
  @js.native
  def createInControlBarButtonUnderIcon(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ControlBarButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent menus.MenuItem element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GlyphIcon.createInMenuItemUnderIcon")
  @js.native
  def createInMenuItemUnderIcon(container: MenuItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  
  /**
    * Creates and returns a new GlyphIcon instance in the SDK and on the server.
    * The new GlyphIcon will be automatically stored in the 'icon' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GlyphIcon.createInWidgetValueUnderIcon")
  @js.native
  def createInWidgetValueUnderIcon(container: WidgetValue): typingsSlinky.mendixmodelsdk.pagesMod.pages.GlyphIcon = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GlyphIcon.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.GlyphIcon.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
