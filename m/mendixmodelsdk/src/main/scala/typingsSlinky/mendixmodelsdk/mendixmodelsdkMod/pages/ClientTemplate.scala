package typingsSlinky.mendixmodelsdk.mendixmodelsdkMod.pages

import typingsSlinky.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.CustomWidget
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetObject
import typingsSlinky.mendixmodelsdk.distGenCustomwidgetsMod.customwidgets.WidgetValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "pages.ClientTemplate")
@js.native
class ClientTemplate protected ()
  extends typingsSlinky.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages.ClientTemplate {
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
@JSImport("mendixmodelsdk", "pages.ClientTemplate")
@js.native
object ClientTemplate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typingsSlinky.mendixmodelsdk.distGenPagesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent Button element passed as argument.
    */
  def createInButtonUnderCaption(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.Button): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent ControlBarButton element passed as argument.
    */
  def createInControlBarButtonUnderCaption(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ControlBarButton): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  def createInCustomWidgetUnderLabelTemplate(container: CustomWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent DataGrid element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInDataGridUnderCaption(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DataGrid): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'content' property
    * of the parent DynamicText element passed as argument.
    */
  def createInDynamicTextUnderContent(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.DynamicText): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent GroupBox element passed as argument.
    */
  def createInGroupBoxUnderCaption(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.GroupBox): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInInputWidgetUnderLabelTemplate(container: typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.InputWidget): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.WidgetObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 8.0.0
    */
  def createInWidgetObjectUnderLabelTemplate(container: WidgetObject): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate = js.native
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'textTemplate' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 and higher
    */
  def createInWidgetValueUnderTextTemplate(container: WidgetValue): typingsSlinky.mendixmodelsdk.distGenPagesMod.pages.ClientTemplate = js.native
}

