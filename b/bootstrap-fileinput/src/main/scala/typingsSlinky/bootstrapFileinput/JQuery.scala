package typingsSlinky.bootstrapFileinput

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.FileList
import typingsSlinky.bootstrapFileinput.BootstrapFileInput.FileInputOptions
import typingsSlinky.bootstrapFileinput.BootstrapFileInput.FileStack
import typingsSlinky.bootstrapFileinput.BootstrapFileInput.PreviewInfo
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.addToStack
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.cancel
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.clear
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.clearFileStack
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.destroy
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.disable
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.enable
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.getExif
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.getFileList
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.getFileStack
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.getFilesCount
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.getFrames
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.getPreview
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.lock
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.pause
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.readFiles
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.refresh
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.reset
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.resume
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.unlock
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.upload
import typingsSlinky.bootstrapFileinput.bootstrapFileinputStrings.zoom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable:unified-signatures self-documenting code and JSDoc require non-unified signatures
@js.native
trait JQuery[TElement] extends js.Object {
  def fileinput(): this.type = js.native
  def fileinput(options: FileInputOptions): this.type = js.native
  /**
    * This method pushes (appends) a file object to the cached file stack array for upload (note that this only adds files to the internal stack and does not update the preview)
    */
  @JSName("fileinput")
  def fileinput_addToStack(method: addToStack, fileObj: File): this.type = js.native
  @JSName("fileinput")
  def fileinput_addToStack(method: addToStack, fileObj: File, id: String): this.type = js.native
  /**
    * Cancel an ongoing ajax upload of the files
    */
  @JSName("fileinput")
  def fileinput_cancel(method: cancel): this.type = js.native
  /**
    * Clear the file input.
    * This method clears the preview of all non-uploaded files, clears the ajax filestack, and also clears the native file input.
    */
  @JSName("fileinput")
  def fileinput_clear(method: clear): this.type = js.native
  /**
    * This method clears the entire file upload array stack (note that this only clears files from the internal stack and does not update the preview).
    */
  @JSName("fileinput")
  def fileinput_clearFileStack(method: clearFileStack): this.type = js.native
  /**
    * Destroys the file input plugin and reverts to a normal native file input
    */
  @JSName("fileinput")
  def fileinput_destroy(method: destroy): this.type = js.native
  /**
    * Disable the file input
    */
  @JSName("fileinput")
  def fileinput_disable(method: disable): this.type = js.native
  /**
    * Enable the file input
    */
  @JSName("fileinput")
  def fileinput_enable(method: enable): this.type = js.native
  /**
    * Gets the exif data for the specified file thumbnail frame (applicable only for JPEG image file types).
    * The exif data is returned as an object using the `piexif.js` library.
    * @param frameId - the HTML identifier for the file preview thumbnail frame for which the exif data will be returned.
    */
  @JSName("fileinput")
  def fileinput_getExif(method: getExif, frameId: String): js.Object | Null = js.native
  /**
    * This method returns an array of file objects (in case you do not wish to read an object/ associative array as returned by `getFileStack`)
    */
  @JSName("fileinput")
  def fileinput_getFileList(method: getFileList): FileList = js.native
  /**
    * This method returns an object (associative array) containing the file objects selected indexed by file identifer (see `generateFileId` option).
    */
  @JSName("fileinput")
  def fileinput_getFileStack(method: getFileStack): FileStack = js.native
  /**
    * This method returns the count of all files pending upload and files already uploaded (based on initial preview)
    */
  @JSName("fileinput")
  def fileinput_getFilesCount(method: getFilesCount): Double = js.native
  @JSName("fileinput")
  def fileinput_getFilesCount(method: getFilesCount, includeInitial: Boolean): Double = js.native
  /**
    * Returns the list of file preview thumbnail frames as jQuery objects.
    * @param cssFilter - additional CSS filter to be applied to restrict and return the relevant thumbnail preview frames
    */
  @JSName("fileinput")
  def fileinput_getFrames(method: getFrames): this.type = js.native
  @JSName("fileinput")
  def fileinput_getFrames(method: getFrames, cssFilter: String): this.type = js.native
  /**
    * Returns the initial preview content, the initial preview configuration, and initial preview thumb tags
    */
  @JSName("fileinput")
  def fileinput_getPreview(method: getPreview): PreviewInfo = js.native
  /**
    * Locks the file input by disabling all actions/buttons except a cancel button to abort ongoing AJAX requests (for ajax uploads only).
    */
  @JSName("fileinput")
  def fileinput_lock(method: lock): this.type = js.native
  /**
    * Pause an ongoing resumable ajax upload of the files (applicable only when `enableResumableUpload` property to `true`).
    */
  @JSName("fileinput")
  def fileinput_pause(method: pause): this.type = js.native
  /**
    * This method reads a FileList object, appends/pushes it to the file object stack, and also updates the preview to display the files based on the plugin settings.
    */
  @JSName("fileinput")
  def fileinput_readFiles(method: readFiles, files: FileList): this.type = js.native
  /**
    * Refreshes the file input plugin based on options provided
    */
  @JSName("fileinput")
  def fileinput_refresh(method: refresh): this.type = js.native
  @JSName("fileinput")
  def fileinput_refresh(method: refresh, options: FileInputOptions): this.type = js.native
  /**
    * Softer reset of the file input than the clear method.
    * It cleans up the preview thumbnails (except successful uploads and initialPreview) and cleans up the ajax upload file stack.
    */
  @JSName("fileinput")
  def fileinput_reset(method: reset): this.type = js.native
  /**
    * Resume a paused resumable ajax upload of the files (applicable only when enableResumableUpload property to true)
    */
  @JSName("fileinput")
  def fileinput_resume(method: resume): this.type = js.native
  /**
    * Unlocks and enables the file input back again by reversing the outcome of the `lock` action
    */
  @JSName("fileinput")
  def fileinput_unlock(method: unlock): this.type = js.native
  /**
    * Trigger ajax upload of the files that are selected. Applicable only if `uploadUrl` is set.
    */
  @JSName("fileinput")
  def fileinput_upload(method: upload): this.type = js.native
  /**
    * Zooms the content in detailed preview for the passed thumbnail frame id parameter.
    * @param frameId - the HTML identifier for the file preview thumbnail frame for which the exif data will be returned
    */
  @JSName("fileinput")
  def fileinput_zoom(method: zoom, frameId: String): this.type = js.native
}

