package typingsSlinky.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus

import typingsSlinky.jupyterlabApputils.vdomMod.VDomModel
import typingsSlinky.jupyterlabFilebrowser.mod.FileBrowserModel
import typingsSlinky.jupyterlabFilebrowser.uploadstatusMod.IFileUploadItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The VDomModel for the FileUpload renderer.
  */
@JSImport("@jupyterlab/filebrowser/lib/uploadstatus", "FileUploadStatus.Model")
@js.native
/**
  * Construct a new model.
  */
class Model () extends VDomModel {
  def this(browserModel: FileBrowserModel) = this()
  
  var _browserModel: js.Any = js.native
  
  var _items: js.Any = js.native
  
  /**
    * Handle an uploadChanged event in the filebrowser model.
    */
  var _uploadChanged: js.Any = js.native
  
  /**
    * The current file browser model.
    */
  def browserModel: FileBrowserModel | Null = js.native
  def browserModel_=(browserModel: FileBrowserModel | Null): Unit = js.native
  
  /**
    * The currently uploading items.
    */
  def items: js.Array[IFileUploadItem] = js.native
}
