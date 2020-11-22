package typingsSlinky.jupyterlabFilebrowser.uploadMod

import typingsSlinky.jupyterlabApputils.mod.ToolbarButton
import typingsSlinky.jupyterlabFilebrowser.modelMod.FileBrowserModel
import typingsSlinky.jupyterlabFilebrowser.uploadMod.Uploader.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/filebrowser/lib/upload", "Uploader")
@js.native
class Uploader_ protected () extends ToolbarButton {
  /**
    * Construct a new file browser buttons widget.
    */
  def this(options: IOptions) = this()
  
  var _input: js.Any = js.native
  
  /**
    * The 'change' handler for the input field.
    */
  var _onInputChanged: js.Any = js.native
  
  /**
    * The 'click' handler for the input field.
    */
  var _onInputClicked: js.Any = js.native
  
  /**
    * The underlying file browser fileBrowserModel for the widget.
    *
    * This cannot be named model as that conflicts with the model property of VDomRenderer.
    */
  val fileBrowserModel: FileBrowserModel = js.native
}
