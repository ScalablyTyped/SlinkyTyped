package typingsSlinky.mendixmodelsdk.mod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 8.0.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.Appearance")
@js.native
class Appearance protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.Appearance {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object Appearance {
  
  @JSImport("mendixmodelsdk", "pages.Appearance")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ControlBarButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInControlBarButtonUnderAppearance")
  @js.native
  def createInControlBarButtonUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ControlBarButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent GridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInGridColumnUnderAppearance")
  @js.native
  def createInGridColumnUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GridColumn): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridColumn element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInLayoutGridColumnUnderAppearance")
  @js.native
  def createInLayoutGridColumnUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridColumn): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent LayoutGridRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInLayoutGridRowUnderAppearance")
  @js.native
  def createInLayoutGridRowUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.LayoutGridRow): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Layout element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInLayoutUnderAppearance")
  @js.native
  def createInLayoutUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Layout): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent NavigationListItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInNavigationListItemUnderAppearance")
  @js.native
  def createInNavigationListItemUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.NavigationListItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent PageTemplate element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInPageTemplateUnderAppearance")
  @js.native
  def createInPageTemplateUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.PageTemplate): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Page element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInPageUnderAppearance")
  @js.native
  def createInPageUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Page): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent ScrollContainerRegion element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInScrollContainerRegionUnderAppearance")
  @js.native
  def createInScrollContainerRegionUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ScrollContainerRegion): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableCell element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInTableCellUnderAppearance")
  @js.native
  def createInTableCellUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TableCell): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent TableRow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInTableRowUnderAppearance")
  @js.native
  def createInTableRowUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TableRow): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /**
    * Creates and returns a new Appearance instance in the SDK and on the server.
    * The new Appearance will be automatically stored in the 'appearance' property
    * of the parent Widget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.createInWidgetUnderAppearance")
  @js.native
  def createInWidgetUnderAppearance(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Widget): typingsSlinky.mendixmodelsdk.pagesMod.pages.Appearance = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.Appearance.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
