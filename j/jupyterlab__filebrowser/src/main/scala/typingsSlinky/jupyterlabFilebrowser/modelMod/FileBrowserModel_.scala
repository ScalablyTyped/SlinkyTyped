package typingsSlinky.jupyterlabFilebrowser.modelMod

import org.scalajs.dom.raw.File
import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import typingsSlinky.jupyterlabFilebrowser.modelMod.FileBrowserModel.IOptions
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IChangedArgs
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import typingsSlinky.jupyterlabServices.restapiMod.ISpecModels
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/filebrowser/lib/model", "FileBrowserModel")
@js.native
class FileBrowserModel_ protected () extends IDisposable {
  /**
    * Construct a new file browser model.
    */
  def this(options: IOptions) = this()
  
  var _connectionFailure: js.Any = js.native
  
  var _driveName: js.Any = js.native
  
  var _fileChanged: js.Any = js.native
  
  /**
    * Handle an updated contents model.
    */
  var _handleContents: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  var _items: js.Any = js.native
  
  var _key: js.Any = js.native
  
  var _model: js.Any = js.native
  
  /**
    * Handle a change on the contents manager.
    */
  var _onFileChanged: js.Any = js.native
  
  /**
    * Handle a change to the running sessions.
    */
  var _onRunningChanged: js.Any = js.native
  
  var _pathChanged: js.Any = js.native
  
  var _paths: js.Any = js.native
  
  var _pending: js.Any = js.native
  
  var _pendingPath: js.Any = js.native
  
  var _poll: js.Any = js.native
  
  /**
    * Populate the model's sessions collection.
    */
  var _populateSessions: js.Any = js.native
  
  var _refreshed: js.Any = js.native
  
  var _restored: js.Any = js.native
  
  var _sessions: js.Any = js.native
  
  var _shouldUploadLarge: js.Any = js.native
  
  var _state: js.Any = js.native
  
  var _unloadEventListener: js.Any = js.native
  
  /**
    * Perform the actual upload.
    */
  var _upload: js.Any = js.native
  
  var _uploadChanged: js.Any = js.native
  
  var _uploadCheckDisposed: js.Any = js.native
  
  var _uploads: js.Any = js.native
  
  /**
    * Change directory.
    *
    * @param path - The path to the file or directory.
    *
    * @returns A promise with the contents of the directory.
    */
  def cd(): js.Promise[Unit] = js.native
  def cd(newValue: String): js.Promise[Unit] = js.native
  
  /**
    * A signal emitted when the file browser model loses connection.
    */
  def connectionFailure: ISignal[this.type, js.Error] = js.native
  
  /**
    * Download a file.
    *
    * @param path - The path of the file to be downloaded.
    *
    * @returns A promise which resolves when the file has begun
    *   downloading.
    */
  def download(path: String): js.Promise[Unit] = js.native
  
  /**
    * The drive name that gets prepended to the path.
    */
  def driveName: String = js.native
  
  /**
    * Get the file path changed signal.
    */
  def fileChanged: ISignal[this.type, IChangedArgs] = js.native
  
  /**
    * Get whether the model is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MFileBrowserModel_ : Boolean = js.native
  
  /**
    * Create an iterator over the model's items.
    *
    * @returns A new iterator over the model's items.
    */
  def items(): IIterator[IModel] = js.native
  
  /**
    * The document manager instance used by the file browser model.
    */
  val manager: IDocumentManager = js.native
  
  /**
    * Get the current path.
    */
  def path: String = js.native
  
  /**
    * A signal emitted when the path changes.
    */
  def pathChanged: ISignal[
    this.type, 
    typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
  ] = js.native
  
  /**
    * Force a refresh of the directory contents.
    */
  def refresh(): js.Promise[Unit] = js.native
  
  /**
    * A signal emitted when the directory listing is refreshed.
    */
  def refreshed: ISignal[this.type, Unit] = js.native
  
  /**
    * Restore the state of the file browser.
    *
    * @param id - The unique ID that is used to construct a state database key.
    *
    * @param populate - If `false`, the restoration ID will be set but the file
    * browser state will not be fetched from the state database.
    *
    * @returns A promise when restoration is complete.
    *
    * #### Notes
    * This function will only restore the model *once*. If it is called multiple
    * times, all subsequent invocations are no-ops.
    */
  def restore(id: String): js.Promise[Unit] = js.native
  def restore(id: String, populate: Boolean): js.Promise[Unit] = js.native
  
  /**
    * A promise that resolves when the model is first restored.
    */
  def restored: js.Promise[Unit] = js.native
  
  /**
    * Create an iterator over the active sessions in the directory.
    *
    * @returns A new iterator over the model's active sessions.
    */
  def sessions(): IIterator[typingsSlinky.jupyterlabServices.sessionSessionMod.IModel] = js.native
  
  /**
    * Get the kernel spec models.
    */
  def specs: ISpecModels | Null = js.native
  
  /**
    * Upload a `File` object.
    *
    * @param file - The `File` object to upload.
    *
    * @returns A promise containing the new file contents model.
    *
    * #### Notes
    * On Notebook version < 5.1.0, this will fail to upload files that are too
    * big to be sent in one request to the server. On newer versions, it will
    * ask for confirmation then upload the file in 1 MB chunks.
    */
  def upload(file: File): js.Promise[IModel] = js.native
  
  /**
    * A signal emitted when an upload progresses.
    */
  def uploadChanged: ISignal[
    this.type, 
    typingsSlinky.jupyterlabCoreutils.interfacesMod.IChangedArgs[IUploadModel | Null, IUploadModel | Null, String]
  ] = js.native
  
  /**
    * Create an iterator over the status of all in progress uploads.
    */
  def uploads(): IIterator[IUploadModel] = js.native
}
