package typingsSlinky.plupload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plupload {
  
  @js.native
  trait Uploader extends StObject {
    
    /**
      * Adds file to the queue programmatically. Can be native file, instance of Plupload.File,
      * instance of mOxie.File, input[type="file"] element, or array of these. Fires FilesAdded,
      * if any files were added to the queue. Otherwise nothing happens.
      *
      * @method addFile
      * @since 2.0
      * @param {plupload.File|mOxie.File|File|Node|Array} file File or files to add to the queue.
      * @param {String} [fileName] If specified, will be used as a name for the file
      */
    def addFile(file: js.Any): Unit = js.native
    def addFile(file: js.Any, fileName: String): Unit = js.native
    
    def bind(name: String, func: js.Any): js.Any = js.native
    def bind(name: String, func: js.Any, scope: js.Any): js.Any = js.native
    
    def destroy(): js.Any = js.native
    
    /**
      * Disables/enables browse button on request.
      *
      * @method disableBrowse
      * @param {Boolean} disable Whether to disable or enable (default: true)
      */
    def disableBrowse(disable: Boolean): Unit = js.native
    
    /**
      * Map of features that are available for the uploader runtime. Features will be filled
      * before the init event is called, these features can then be used to alter the UI for the end user.
      * Some of the current features that might be in this map is: dragdrop, chunks, jpgresize, pngresize.
      *
      * @property features
      * @type Object
      */
    var features: js.Any = js.native
    
    /**
      * Current upload queue, an array of File instances.
      *
      * @property files
      * @type Array
      * @see plupload.File
      */
    var files: js.Array[_] = js.native
    
    // TODO: Make plupload.File typing
    /**
      * Returns the specified file object by id.
      *
      * @method getFile
      * @param {String} id File id to look for.
      * @return {plupload.File} File object or undefined if it wasn't found;
      */
    def getFile(id: String): js.Any = js.native
    
    /**
      * Get the value for the specified option or the whole configuration, if not specified.
      *
      * @method getOption
      * @since 2.1
      * @param {String} [option] Name of the option to get
      * @return {Mixed} Value for the option or the whole set
      */
    def getOption(): js.Any = js.native
    def getOption(option: String): js.Any = js.native
    
    def hasEventListener(name: String): js.Any = js.native
    
    /**
      * Unique id for the Uploader instance.
      *
      * @property id
      * @type String
      */
    var id: String = js.native
    
    /**
      * Initializes the Uploader instance and adds internal event listeners.
      *
      * @method init
      */
    def init(): Unit = js.native
    
    /**
      * Refreshes the upload instance by dispatching out a refresh event to all runtimes.
      * This would for example reposition flash/silverlight shims on the page.
      *
      * @method refresh
      */
    def refresh(): Unit = js.native
    
    /**
      * Removes a specific file.
      *
      * @method removeFile
      * @param {plupload.File|String} file File to remove from queue.
      */
    def removeFile(file: js.Any): js.Any = js.native
    
    /**
      * Current runtime name.
      *
      * @property runtime
      * @type String
      */
    var runtime: String = js.native
    
    /**
      * Set the value for the specified option(s).
      *
      * @method setOption
      * @since 2.1
      * @param {String|Object} option Name of the option to change or the set of key/value pairs
      * @param {Mixed} [value] Value for the option (is ignored, if first argument is object)
      */
    def setOption(option: String): Unit = js.native
    def setOption(option: String, value: js.Any): Unit = js.native
    def setOption(option: js.Any): Unit = js.native
    def setOption(option: js.Any, value: js.Any): Unit = js.native
    
    /**
      * Object with name/value settings.
      *
      * @property settings
      * @type Object
      */
    var settings: js.Any = js.native
    
    /**
      * Removes part of the queue and returns the files removed. This will also trigger the
      * FilesRemoved and QueueChanged events.
      *
      * @method splice
      * @param {Number} [start=0] Start index to remove from.
      * @param {Number} [length] Number of files to remove (defaults to number of files in the queue).
      * @return {Array} Array of files that was removed.
      */
    def splice(): js.Any = js.native
    def splice(start: js.UndefOr[scala.Nothing], length: Double): js.Any = js.native
    def splice(start: Double): js.Any = js.native
    def splice(start: Double, length: Double): js.Any = js.native
    
    /**
      * Starts uploading the queued files.
      *
      * @method start
      */
    def start(): Unit = js.native
    
    /**
      * Current state of the total uploading progress. This one can either be plupload.STARTED or plupload.STOPPED.
      * These states are controlled by the stop/start methods. The default value is STOPPED.
      *
      * @property state
      * @type Number
      */
    var state: Double = js.native
    
    /**
      * Stops the upload of the queued files.
      *
      * @method stop
      */
    def stop(): Unit = js.native
    
    /**
      * Total progess information. How many files has been uploaded, total percent etc.
      *
      * @property total
      * @type plupload.QueueProgress
      */
    var total: pluploadQueueProgress = js.native
    
    /**
      * Dispatches the specified event name and its arguments to all listeners.
      * @method trigger
      * @param {String} name Event name to fire.
      * @param {Object..} Multiple arguments to pass along to the listener functions.
      */
    def trigger(name: String, Multiple: js.Any): js.Any = js.native
    
    def unbind(name: String, func: js.Any): js.Any = js.native
    
    def unbindAll(): js.Any = js.native
  }
}
