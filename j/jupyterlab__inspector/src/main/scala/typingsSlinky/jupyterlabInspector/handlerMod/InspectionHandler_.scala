package typingsSlinky.jupyterlabInspector.handlerMod

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabInspector.handlerMod.InspectionHandler.IOptions
import typingsSlinky.jupyterlabInspector.tokensMod.IInspector.IInspectorUpdate
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.jupyterlabInspector.tokensMod.IInspector.IInspectable because var conflicts: isDisposed. Inlined cleared, disposed, inspected, standby */ @JSImport("@jupyterlab/inspector/lib/handler", "InspectionHandler")
@js.native
class InspectionHandler_ protected () extends IDisposable {
  /**
    * Construct a new inspection handler for a widget.
    */
  def this(options: IOptions) = this()
  var _cleared: js.Any = js.native
  var _connector: js.Any = js.native
  var _debouncer: js.Any = js.native
  var _disposed: js.Any = js.native
  var _editor: js.Any = js.native
  var _inspected: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Handle changes to the editor state, debouncing.
    */
  var _onChange: js.Any = js.native
  var _pending: js.Any = js.native
  var _rendermime: js.Any = js.native
  var _standby: js.Any = js.native
  /**
    * A signal emitted when the inspector should clear all items.
    */
  val cleared: ISignal[_ | InspectionHandler, Unit] = js.native
  /**
    * A signal emitted when the handler is disposed.
    */
  val disposed: ISignal[_ | InspectionHandler, Unit] = js.native
  /**
    * The editor widget used by the inspection handler.
    */
  var editor: IEditor | Null = js.native
  /**
    * A signal emitted when an inspector value is generated.
    */
  val inspected: ISignal[_ | InspectionHandler, IInspectorUpdate] = js.native
  /**
    * Indicates whether the handler makes API inspection requests or stands by.
    *
    * #### Notes
    * The use case for this attribute is to limit the API traffic when no
    * inspector is visible.
    */
  var standby: Boolean = js.native
  /**
    * Handle a text changed signal from an editor.
    *
    * #### Notes
    * Update the hints inspector based on a text change.
    */
  /* protected */ def onEditorChange(): Unit = js.native
}

