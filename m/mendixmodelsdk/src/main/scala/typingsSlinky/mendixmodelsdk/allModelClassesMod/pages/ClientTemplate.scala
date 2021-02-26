package typingsSlinky.mendixmodelsdk.allModelClassesMod.pages

import typingsSlinky.mendixmodelsdk.abstractModelMod.IAbstractModel
import typingsSlinky.mendixmodelsdk.baseModelMod.IModel
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.CustomWidget
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetObject
import typingsSlinky.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typingsSlinky.mendixmodelsdk.internalMod.AbstractElement
import typingsSlinky.mendixmodelsdk.internalMod.AbstractModel
import typingsSlinky.mendixmodelsdk.internalMod.ModelUnit
import typingsSlinky.mendixmodelsdk.pagesMod.StructureVersionInfo
import typingsSlinky.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate")
@js.native
class ClientTemplate protected ()
  extends typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object ClientTemplate {
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.create")
  @js.native
  def create(model: IModel): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent Button element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInButtonUnderCaption")
  @js.native
  def createInButtonUnderCaption(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.Button): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent ControlBarButton element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInControlBarButtonUnderCaption")
  @js.native
  def createInControlBarButtonUnderCaption(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.ControlBarButton): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.CustomWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.1.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInCustomWidgetUnderLabelTemplate")
  @js.native
  def createInCustomWidgetUnderLabelTemplate(container: CustomWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent DataGrid element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInDataGridUnderCaption")
  @js.native
  def createInDataGridUnderCaption(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DataGrid): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInDynamicImageViewerUnderAlternativeText")
  @js.native
  def createInDynamicImageViewerUnderAlternativeText(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DynamicImageViewer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'content' property
    * of the parent DynamicText element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInDynamicTextUnderContent")
  @js.native
  def createInDynamicTextUnderContent(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.DynamicText): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'caption' property
    * of the parent GroupBox element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInGroupBoxUnderCaption")
  @js.native
  def createInGroupBoxUnderCaption(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.GroupBox): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInInputWidgetUnderLabelTemplate")
  @js.native
  def createInInputWidgetUnderLabelTemplate(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.InputWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'screenReaderLabel' property
    * of the parent InputWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.12.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInInputWidgetUnderScreenReaderLabel")
  @js.native
  def createInInputWidgetUnderScreenReaderLabel(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.InputWidget): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'alternativeText' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInStaticImageViewerUnderAlternativeText")
  @js.native
  def createInStaticImageViewerUnderAlternativeText(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.StaticImageViewer): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'badge' property
    * of the parent TabPage element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.13.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInTabPageUnderBadge")
  @js.native
  def createInTabPageUnderBadge(container: typingsSlinky.mendixmodelsdk.pagesMod.pages.TabPage): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'labelTemplate' property
    * of the parent customwidgets.WidgetObject element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 to 8.0.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInWidgetObjectUnderLabelTemplate")
  @js.native
  def createInWidgetObjectUnderLabelTemplate(container: WidgetObject): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /**
    * Creates and returns a new ClientTemplate instance in the SDK and on the server.
    * The new ClientTemplate will be automatically stored in the 'textTemplate' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.23.0 and higher
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.createInWidgetValueUnderTextTemplate")
  @js.native
  def createInWidgetValueUnderTextTemplate(container: WidgetValue): typingsSlinky.mendixmodelsdk.pagesMod.pages.ClientTemplate = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.ClientTemplate.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
