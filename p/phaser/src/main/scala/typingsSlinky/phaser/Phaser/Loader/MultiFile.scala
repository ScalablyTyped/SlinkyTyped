package typingsSlinky.phaser.Phaser.Loader

import typingsSlinky.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A MultiFile is a special kind of parent that contains two, or more, Files as children and looks after
  * the loading and processing of them all. It is commonly extended and used as a base class for file types such as AtlasJSON or BitmapFont.
  * 
  * You shouldn't create an instance of a MultiFile directly, but should extend it with your own class, setting a custom type and processing methods.
  */
@js.native
trait MultiFile extends StObject {
  
  /**
    * Adds another child to this MultiFile, increases the pending count and resets the completion status.
    * @param files The File to add to this MultiFile.
    */
  def addToMultiFile(files: File): MultiFile = js.native
  
  /**
    * A reference to the Loaders baseURL at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var baseURL: String = js.native
  
  /**
    * The completion status of this MultiFile.
    */
  var complete: Boolean = js.native
  
  /**
    * A storage container for transient data that the loading files need.
    */
  var config: js.Any = js.native
  
  /**
    * The number of files that failed to load.
    */
  var failed: integer = js.native
  
  /**
    * Array of files that make up this MultiFile.
    */
  var files: js.Array[File] = js.native
  
  /**
    * Checks if this MultiFile is ready to process its children or not.
    */
  def isReadyToProcess(): Boolean = js.native
  
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String = js.native
  
  /**
    * A reference to the Loader that is going to load this file.
    */
  var loader: LoaderPlugin = js.native
  
  /**
    * Called by each File when it finishes loading.
    * @param file The File that has completed processing.
    */
  def onFileComplete(file: File): Unit = js.native
  
  /**
    * Called by each File that fails to load.
    * @param file The File that has failed to load.
    */
  def onFileFailed(file: File): Unit = js.native
  
  /**
    * A reference to the Loaders path at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var path: String = js.native
  
  /**
    * The number of files to load.
    */
  var pending: integer = js.native
  
  /**
    * A reference to the Loaders prefix at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var prefix: String = js.native
  
  /**
    * The file type string for sorting within the Loader.
    */
  var `type`: String = js.native
}
object MultiFile {
  
  @scala.inline
  def apply(
    addToMultiFile: File => MultiFile,
    baseURL: String,
    complete: Boolean,
    config: js.Any,
    failed: integer,
    files: js.Array[File],
    isReadyToProcess: () => Boolean,
    key: String,
    loader: LoaderPlugin,
    onFileComplete: File => Unit,
    onFileFailed: File => Unit,
    path: String,
    pending: integer,
    prefix: String,
    `type`: String
  ): MultiFile = {
    val __obj = js.Dynamic.literal(addToMultiFile = js.Any.fromFunction1(addToMultiFile), baseURL = baseURL.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], isReadyToProcess = js.Any.fromFunction0(isReadyToProcess), key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], onFileComplete = js.Any.fromFunction1(onFileComplete), onFileFailed = js.Any.fromFunction1(onFileFailed), path = path.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFile]
  }
  
  @scala.inline
  implicit class MultiFileMutableBuilder[Self <: MultiFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddToMultiFile(value: File => MultiFile): Self = StObject.set(x, "addToMultiFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailed(value: integer): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setIsReadyToProcess(value: () => Boolean): Self = StObject.set(x, "isReadyToProcess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoader(value: LoaderPlugin): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFileComplete(value: File => Unit): Self = StObject.set(x, "onFileComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFileFailed(value: File => Unit): Self = StObject.set(x, "onFileFailed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: integer): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
