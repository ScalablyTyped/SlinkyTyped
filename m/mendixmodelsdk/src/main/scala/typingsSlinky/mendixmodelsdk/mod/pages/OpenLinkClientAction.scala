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

/**
  * In version 7.3.0: introduced
  */
@JSImport("mendixmodelsdk", "pages.OpenLinkClientAction")
@js.native
class OpenLinkClientAction protected ()
  extends typingsSlinky.mendixmodelsdk.allModelClassesMod.pages.OpenLinkClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object OpenLinkClientAction {
  
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInActionButtonUnderAction")
  @js.native
  def createInActionButtonUnderAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ActionButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInActionItemUnderAction")
  @js.native
  def createInActionItemUnderAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ActionItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInAssociationWidgetUnderOnChangeAction")
  @js.native
  def createInAssociationWidgetUnderOnChangeAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.AssociationWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInAttributeWidgetUnderOnChangeAction")
  @js.native
  def createInAttributeWidgetUnderOnChangeAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.AttributeWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInAttributeWidgetUnderOnEnterAction")
  @js.native
  def createInAttributeWidgetUnderOnEnterAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.AttributeWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInAttributeWidgetUnderOnLeaveAction")
  @js.native
  def createInAttributeWidgetUnderOnLeaveAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.AttributeWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 8.14.0
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInBottomBarItemUnderAction")
  @js.native
  def createInBottomBarItemUnderAction(container: BottomBarItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInDivContainerUnderOnClickAction")
  @js.native
  def createInDivContainerUnderOnClickAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DivContainer): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInDynamicImageViewerUnderClickAction")
  @js.native
  def createInDynamicImageViewerUnderClickAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DynamicImageViewer): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInGridActionButtonUnderAction")
  @js.native
  def createInGridActionButtonUnderAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GridActionButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInListViewUnderClickAction")
  @js.native
  def createInListViewUnderClickAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListView): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInListViewUnderPullDownAction")
  @js.native
  def createInListViewUnderPullDownAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ListView): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInMenuItemUnderAction")
  @js.native
  def createInMenuItemUnderAction(container: MenuItem): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInReferenceSetSelectorUnderOnChangeAction")
  @js.native
  def createInReferenceSetSelectorUnderOnChangeAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ReferenceSetSelector): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.3.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInStaticImageViewerUnderClickAction")
  @js.native
  def createInStaticImageViewerUnderClickAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.StaticImageViewer): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.7.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInTextBoxUnderOnEnterKeyPressAction")
  @js.native
  def createInTextBoxUnderOnEnterKeyPressAction(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TextBox): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /**
    * Creates and returns a new OpenLinkClientAction instance in the SDK and on the server.
    * The new OpenLinkClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.createInWidgetValueUnderAction")
  @js.native
  def createInWidgetValueUnderAction(container: WidgetValue): typingsSlinky.mendixmodelsdk.pagesMod.pages.OpenLinkClientAction = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "pages.OpenLinkClientAction.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
