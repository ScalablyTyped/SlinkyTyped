package typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor

import typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default implementation of the editor model.
  */
@JSImport("@jupyterlab/codeeditor/lib/editor", "CodeEditor.Model")
@js.native
/**
  * Construct a new Model.
  */
class Model_ () extends IModel {
  def this(options: typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Model.IOptions) = this()
  var _isDisposed: js.Any = js.native
  var _mimeTypeChanged: js.Any = js.native
  var _onMimeTypeChanged: js.Any = js.native
  /**
    * A signal emitted when a mimetype changes.
    */
  @JSName("mimeTypeChanged")
  val mimeTypeChanged_Model_ : ISignal[this.type, IChangedArgs[String, String]] = js.native
}

