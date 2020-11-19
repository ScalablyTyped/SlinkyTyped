package typingsSlinky.chromeApps.anon

import org.scalajs.dom.raw.Blob
import typingsSlinky.chromeApps.chrome.events.Event
import typingsSlinky.chromeApps.chrome.mediaGalleries.GalleryChangedEventArgs
import typingsSlinky.chromeApps.chrome.mediaGalleries.GalleryWatchResult
import typingsSlinky.chromeApps.chrome.mediaGalleries.MediaFileSystemMetadata
import typingsSlinky.chromeApps.chrome.mediaGalleries.MediaFileSystemsOptions
import typingsSlinky.chromeApps.chrome.mediaGalleries.Metadata
import typingsSlinky.chromeApps.chrome.mediaGalleries.MetadataOptions
import typingsSlinky.chromeApps.chrome.mediaGalleries.ScanProgressEventArgs
import typingsSlinky.filesystem.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofmediaGalleries extends js.Object {
  
  /**
    * Adds a gallery watch for the gallery with the specified gallery ID.
    * The given callback is then fired with a success or failure result.
    * @since Chrome 39.
    */
  def addGalleryWatch(galleryId: String, callback: js.Function1[/* result */ GalleryWatchResult, Unit]): Unit = js.native
  
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * @description
    * Show the user the scan results and let them add any or all of them as galleries.
    * This should be used after the 'finish' onScanProgress() event has happened.
    * All galleries the app has access to are returned, not just the newly added galleries.
    */
  def addScanResults(callback: js.Function1[/* mediaFileSystems */ js.Array[FileSystem], Unit]): Unit = js.native
  
  /**
    * Present a directory picker to the user and add the selected directory as a gallery.
    * If the user cancels the picker, selectedFileSystemName will be empty.
    * A user gesture is required for the dialog to display.
    * Without a user gesture, the callback will run as though the user canceled.
    * @since Chrome 34.
    */
  def addUserSelectedFolder(
    callback: js.Function2[
      /* mediaFileSystems */ js.Array[FileSystem], 
      /* selectedFileSystemName */ String, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * @description
    * Cancel any pending media scan.
    * Well behaved apps should provide a way for the user to cancel scans they start.
    */
  def cancelMediaScan(): Unit = js.native
  
  /**
    * @deprecated Deprecated since Chrome 51. The user can manually drop access to galleries via the permissions dialog.
    * @description Give up access to a given media gallery.
    */
  def dropPermissionForMediaFileSystem(galleryId: String): Unit = js.native
  def dropPermissionForMediaFileSystem(galleryId: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * @deprecated Deprecated since Chrome 51. Applications should store their own gallery watches as they are added.
    * Notifies which galleries are being watched via the given callback.
    */
  def getAllGalleryWatch(callback: js.Function1[/* galleryIds */ js.Array[String], Unit]): Unit = js.native
  
  /**
    * @deprecated Deprecated since Chrome 51. Use getMediaFileSystemMetadata instead
    * Get metadata for all available media galleries.
    */
  def getAllMediaFileSystemMetadata(callback: js.Function1[/* metadatas */ js.Array[MediaFileSystemMetadata], Unit]): Unit = js.native
  
  /**
    * Get metadata about a specific media file system
    * @since Chrome 26.
    */
  def getMediaFileSystemMetadata(mediaFileSystem: FileSystem): MediaFileSystemMetadata = js.native
  
  /**
    * Get the media galleries configured in this user agent.
    * If none are configured or available, the callback will receive an empty array.
    */
  def getMediaFileSystems(callback: js.Function1[/* mediaFileSystems */ js.Array[FileSystem], Unit]): Unit = js.native
  /**
    * Get the media galleries configured in this user agent.
    * If none are configured or available, the callback will receive an empty array.
    */
  def getMediaFileSystems(
    options: MediaFileSystemsOptions,
    callback: js.Function1[/* mediaFileSystems */ js.Array[FileSystem], Unit]
  ): Unit = js.native
  
  /**
    * Gets the media-specific metadata for a media file.
    * This should work for files in media galleries as well as other DOM filesystems.
    * @since Chrome 38.
    */
  def getMetadata(mediaFile: Blob, callback: js.Function1[/* metadata */ Metadata, Unit]): Unit = js.native
  /**
    * Gets the media-specific metadata for a media file.
    * This should work for files in media galleries as well as other DOM filesystems.
    * @since Chrome 38.
    */
  def getMetadata(mediaFile: Blob, options: MetadataOptions, callback: js.Function1[/* metadata */ Metadata, Unit]): Unit = js.native
  
  /**
    * Fired when a media gallery is changed or a gallery watch is dropped
    * @since Chrome 38.
    */
  val onGalleryChanged: Event[js.Function1[/* args */ GalleryChangedEventArgs, Unit]] = js.native
  
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * The pending media scan has changed state. See details for more information.
    */
  val onScanProgress: Event[js.Function1[/* args */ ScanProgressEventArgs, Unit]] = js.native
  
  /**
    * @deprecated Deprecated since Chrome 51. Use removeGalleryWatch instead.
    * Removes all gallery watches.
    */
  def removeAllGalleryWatch(): Unit = js.native
  
  /**
    * Removes a gallery watch for the gallery with the specified gallery ID.
    * @since Chrome 39.
    */
  def removeGalleryWatch(galleryId: String): Unit = js.native
  
  /**
    * @deprecated Deprecated since Chrome 51. The mediaGalleries API no longer supports scanning.
    * @description
    * Start a scan of the user's hard disks for directories containing media.
    * The scan may take a long time so progress and completion is communicated by events.
    * No permission is granted as a result of the scan, see addScanResults.
    */
  def startMediaScan(): Unit = js.native
}
