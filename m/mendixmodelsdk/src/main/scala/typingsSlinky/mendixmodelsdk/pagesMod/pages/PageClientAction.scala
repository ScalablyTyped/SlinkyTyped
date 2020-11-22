package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageClientAction")
@js.native
class PageClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  /**
    * In version 8.14.0: deleted
    * In version 8.11.0: introduced
    */
  def numberOfPagesToClose: Double = js.native
  
  /**
    * The value of this property is conceptually of type microflowExpressions.MicroflowExpression.
    *
    * In version 8.14.0: introduced
    */
  def numberOfPagesToClose2: String = js.native
  def numberOfPagesToClose2_=(newValue: String): Unit = js.native
  
  def numberOfPagesToClose_=(newValue: Double): Unit = js.native
  
  def pageSettings: PageSettings = js.native
  def pageSettings_=(newValue: PageSettings): Unit = js.native
  
  /**
    * In version 7.17.0: introduced
    */
  def pagesForSpecializations: IList[PageForSpecialization] = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.PageClientAction")
@js.native
object PageClientAction extends js.Object {
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    */
  def createInActionButtonUnderAction(container: ActionButton): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    */
  def createInActionItemUnderAction(container: ActionItem): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 to 8.14.0
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent DataViewActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 6.6.0
    */
  def createInDataViewActionButtonUnderAction(container: DataViewActionButton): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    */
  def createInListViewUnderClickAction(container: ListView): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    */
  def createInMenuItemUnderAction(container: MenuItem): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.7.0 and higher
    */
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): PageClientAction = js.native
  
  /**
    * Creates and returns a new PageClientAction instance in the SDK and on the server.
    * The new PageClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): PageClientAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
