package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.fileSystemProvider.DirectoryPathRecursiveRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.DirectoryPathRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.EntryPathRecursiveRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.FilePathLengthRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.FilePathRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.FileSystemInfo
import typingsSlinky.chrome.chrome.fileSystemProvider.MetadataRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.MountOptions
import typingsSlinky.chrome.chrome.fileSystemProvider.NotificationOptions
import typingsSlinky.chrome.chrome.fileSystemProvider.OpenFileRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.OpenedFileIoRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.OpenedFileOffsetRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.OpenedFileRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.OperationRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.OptionlessRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.RequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.SourceTargetPathRequestedEvent
import typingsSlinky.chrome.chrome.fileSystemProvider.UnmountOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// File System Provider
////////////////////
/**
  * Use the chrome.fileSystemProvider API to create file systems, that can be accessible from the file manager on Chrome OS.
  * Availability: Since Chrome 40.
  * Permissions:  "fileSystemProvider"
  * Important: This API works only on Chrome OS.
  */
@JSGlobal("chrome.fileSystemProvider")
@js.native
object fileSystemProvider extends js.Object {
  
  def get(fileSystemId: String, callback: js.Function1[/* fileSystem */ FileSystemInfo, Unit]): Unit = js.native
  
  def getAll(callback: js.Function1[/* fileSystems */ js.Array[FileSystemInfo], Unit]): Unit = js.native
  
  def mount(options: MountOptions): Unit = js.native
  def mount(options: MountOptions, callback: js.Function0[Unit]): Unit = js.native
  
  def notify(options: NotificationOptions, callback: js.Function0[Unit]): Unit = js.native
  
  var onAbortRequested: OperationRequestedEvent = js.native
  
  var onAddWatcherRequested: EntryPathRecursiveRequestedEvent = js.native
  
  var onCloseFileRequested: OpenedFileRequestedEvent = js.native
  
  var onConfigureRequested: RequestedEvent = js.native
  
  var onCopyEntryRequested: SourceTargetPathRequestedEvent = js.native
  
  var onCreateDirectoryRequested: DirectoryPathRecursiveRequestedEvent = js.native
  
  var onCreateFileRequested: FilePathRequestedEvent = js.native
  
  var onDeleteEntryRequested: EntryPathRecursiveRequestedEvent = js.native
  
  var onGetMetadataRequested: MetadataRequestedEvent = js.native
  
  var onMountRequested: OptionlessRequestedEvent = js.native
  
  var onMoveEntryRequested: SourceTargetPathRequestedEvent = js.native
  
  var onOpenFileRequested: OpenFileRequestedEvent = js.native
  
  var onReadDirectoryRequested: DirectoryPathRequestedEvent = js.native
  
  var onReadFileRequested: OpenedFileOffsetRequestedEvent = js.native
  
  var onRemoveWatcherRequested: EntryPathRecursiveRequestedEvent = js.native
  
  var onTruncateRequested: FilePathLengthRequestedEvent = js.native
  
  var onUnmountRequested: RequestedEvent = js.native
  
  var onWriteFileRequested: OpenedFileIoRequestedEvent = js.native
  
  def unmount(options: UnmountOptions): Unit = js.native
  def unmount(options: UnmountOptions, callback: js.Function0[Unit]): Unit = js.native
}
