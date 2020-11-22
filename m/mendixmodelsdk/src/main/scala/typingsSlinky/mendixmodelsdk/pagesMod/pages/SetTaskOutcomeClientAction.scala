package typingsSlinky.mendixmodelsdk.pagesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.menusMod.menus.MenuItem
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import typingsSlinky.mendixmodelsdk.workflowsMod.workflows.IWorkflowTaskOutcome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * @ignore
  *
  * In version 8.15.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction")
@js.native
class SetTaskOutcomeClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def closePage: Boolean = js.native
  def closePage_=(newValue: Boolean): Unit = js.native
  
  def commit: Boolean = js.native
  def commit_=(newValue: Boolean): Unit = js.native
  
  /**
    * NOTE: This property is experimental and is subject to change in newer Model SDK versions.
    *
    * @ignore
    */
  def outcome: IWorkflowTaskOutcome | Null = js.native
  
  def outcomeQualifiedName: String | Null = js.native
  
  def outcome_=(newValue: IWorkflowTaskOutcome | Null): Unit = js.native
}
/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.SetTaskOutcomeClientAction")
@js.native
object SetTaskOutcomeClientAction extends js.Object {
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInActionButtonUnderAction(container: ActionButton): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInActionItemUnderAction(container: ActionItem): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInListViewUnderClickAction(container: ListView): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInMenuItemUnderAction(container: MenuItem): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): SetTaskOutcomeClientAction = js.native
  
  /**
    * Creates and returns a new SetTaskOutcomeClientAction instance in the SDK and on the server.
    * The new SetTaskOutcomeClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.15.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): SetTaskOutcomeClientAction = js.native
  
  var structureTypeName: String = js.native
  
  var versionInfo: StructureVersionInfo = js.native
}
