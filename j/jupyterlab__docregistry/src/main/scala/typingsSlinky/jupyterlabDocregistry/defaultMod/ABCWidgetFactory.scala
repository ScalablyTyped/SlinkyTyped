package typingsSlinky.jupyterlabDocregistry.defaultMod

import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IToolbarItem
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactory
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/default", "ABCWidgetFactory")
@js.native
abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected () extends IWidgetFactory[T, U] {
  /**
    * Construct a new `ABCWidgetFactory`.
    */
  def this(options: IWidgetFactoryOptions[T]) = this()
  var _canStartKernel: js.Any = js.native
  var _defaultFor: js.Any = js.native
  var _defaultRendered: js.Any = js.native
  var _fileTypes: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _modelName: js.Any = js.native
  var _name: js.Any = js.native
  var _preferKernel: js.Any = js.native
  var _readOnly: js.Any = js.native
  var _shutdownOnClose: js.Any = js.native
  var _toolbarFactory: js.Any = js.native
  var _widgetCreated: js.Any = js.native
  /**
    * Whether the widgets can start a kernel when opened.
    */
  @JSName("canStartKernel")
  val canStartKernel_ABCWidgetFactory: Boolean = js.native
  /**
    * The file types for which the factory should be the default.
    */
  @JSName("defaultFor")
  val defaultFor_ABCWidgetFactory: js.Array[String] = js.native
  /**
    * The file types for which the factory should be the default for
    * rendering a document model, if different from editing.
    */
  @JSName("defaultRendered")
  val defaultRendered_ABCWidgetFactory: js.Array[String] = js.native
  /**
    * The registered name of the model type used to create the widgets.
    */
  @JSName("modelName")
  val modelName_ABCWidgetFactory: String = js.native
  /**
    * Whether the widgets prefer having a kernel started.
    */
  @JSName("preferKernel")
  val preferKernel_ABCWidgetFactory: Boolean = js.native
  /**
    * Whether the widget factory is read only.
    */
  @JSName("readOnly")
  val readOnly_ABCWidgetFactory: Boolean = js.native
  /**
    * Whether the kernel should be shutdown when the widget is closed.
    */
  @JSName("shutdownOnClose")
  var shutdownOnClose_ABCWidgetFactory: Boolean = js.native
  /**
    * Create a widget for a context.
    */
  /* protected */ def createNewWidget(context: IContext[U]): T = js.native
  /* protected */ def createNewWidget(context: IContext[U], source: T): T = js.native
  /**
    * Default factory for toolbar items to be added after the widget is created.
    */
  /* protected */ def defaultToolbarFactory(widget: T): js.Array[IToolbarItem] = js.native
}

