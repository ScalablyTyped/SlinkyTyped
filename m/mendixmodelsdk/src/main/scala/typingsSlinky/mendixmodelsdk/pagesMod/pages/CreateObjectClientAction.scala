package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.domainmodelsMod.domainmodels.EntityRef
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.17.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.CreateObjectClientAction")
@js.native
class CreateObjectClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  
  def entityRef: EntityRef | Null = js.native
  def entityRef_=(newValue: EntityRef | Null): Unit = js.native
  
  @JSName("model")
  var model_FCreateObjectClientAction: IModel = js.native
  
  /**
    * In version 8.11.0: introduced
    */
  def numberOfPagesToClose: Double = js.native
  def numberOfPagesToClose_=(newValue: Double): Unit = js.native
  
  def pageSettings: PageSettings = js.native
  def pageSettings_=(newValue: PageSettings): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.CreateObjectClientAction")
@js.native
object CreateObjectClientAction extends js.Object {
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInActionButtonUnderAction(container: ActionButton): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInActionItemUnderAction(container: ActionItem): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInListViewUnderClickAction(container: ListView): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInMenuItemUnderAction(container: MenuItem): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.17.0 and higher
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.7.0 and higher
    */
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): CreateObjectClientAction = js.native
  
  /**
    * Creates and returns a new CreateObjectClientAction instance in the SDK and on the server.
    * The new CreateObjectClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): CreateObjectClientAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
