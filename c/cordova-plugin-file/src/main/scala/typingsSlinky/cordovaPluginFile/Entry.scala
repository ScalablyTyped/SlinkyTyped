package typingsSlinky.cordovaPluginFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An abstract interface representing entries in a file system,
  * each of which may be a File or DirectoryEntry.
  */
@js.native
trait Entry extends StObject {
  
  /**
    * Copy an entry to a different location on the file system. It is an error to try to:
    *     copy a directory inside itself or to any child at any depth;
    *     copy an entry into its parent if a name different from its current one isn't provided;
    *     copy a file to a path occupied by a directory;
    *     copy a directory to a path occupied by a file;
    *     copy any element to a path occupied by a directory which is not empty.
    *     A copy of a file on top of an existing file must attempt to delete and replace that file.
    *     A copy of a directory on top of an existing empty directory must attempt to delete and replace that directory.
    * Directory copies are always recursive--that is, they copy all contents of the directory.
    * @param parent The directory to which to move the entry.
    * @param newName The new name of the entry. Defaults to the Entry's current name if unspecified.
    * @param successCallback A callback that is called with the Entry for the new object.
    * @param errorCallback A callback that is called when errors happen.
    */
  def copyTo(parent: DirectoryEntry): Unit = js.native
  def copyTo(
    parent: DirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  def copyTo(
    parent: DirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* entry */ this.type, Unit]
  ): Unit = js.native
  def copyTo(
    parent: DirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* entry */ this.type, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  def copyTo(parent: DirectoryEntry, newName: String): Unit = js.native
  def copyTo(
    parent: DirectoryEntry,
    newName: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  def copyTo(
    parent: DirectoryEntry,
    newName: String,
    successCallback: js.Function1[/* entry */ this.type, Unit]
  ): Unit = js.native
  def copyTo(
    parent: DirectoryEntry,
    newName: String,
    successCallback: js.Function1[/* entry */ this.type, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  
  /** The file system on which the entry resides. */
  var filesystem: FileSystem = js.native
  
  /** The full absolute path from the root to the entry. */
  var fullPath: String = js.native
  
  /**
    * Look up metadata about this entry.
    * @param successCallback A callback that is called with the time of the last modification.
    * @param errorCallback   A callback that is called when errors happen.
    */
  def getMetadata(successCallback: js.Function1[/* metadata */ Metadata, Unit]): Unit = js.native
  def getMetadata(
    successCallback: js.Function1[/* metadata */ Metadata, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  
  /**
    * Look up the parent DirectoryEntry containing this Entry. If this Entry is the root of its filesystem, its parent is itself.
    * @param successCallback A callback that is called with the time of the last modification.
    * @param errorCallback   A callback that is called when errors happen.
    */
  def getParent(successCallback: js.Function1[/* entry */ this.type, Unit]): Unit = js.native
  def getParent(
    successCallback: js.Function1[/* entry */ this.type, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  
  /** Entry is a directory. */
  var isDirectory: Boolean = js.native
  
  /** Entry is a file. */
  var isFile: Boolean = js.native
  
  /**
    * Move an entry to a different location on the file system. It is an error to try to:
    *     move a directory inside itself or to any child at any depth;move an entry into its parent if a name different from its current one isn't provided;
    *     move a file to a path occupied by a directory;
    *     move a directory to a path occupied by a file;
    *     move any element to a path occupied by a directory which is not empty.
    * A move of a file on top of an existing file must attempt to delete and replace that file.
    * A move of a directory on top of an existing empty directory must attempt to delete and replace that directory.
    * @param parent  The directory to which to move the entry.
    * @param newName The new name of the entry. Defaults to the Entry's current name if unspecified.
    * @param successCallback A callback that is called with the Entry for the new location.
    * @param errorCallback   A callback that is called when errors happen.
    */
  def moveTo(parent: DirectoryEntry): Unit = js.native
  def moveTo(
    parent: DirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  def moveTo(
    parent: DirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* entry */ this.type, Unit]
  ): Unit = js.native
  def moveTo(
    parent: DirectoryEntry,
    newName: js.UndefOr[scala.Nothing],
    successCallback: js.Function1[/* entry */ this.type, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  def moveTo(parent: DirectoryEntry, newName: String): Unit = js.native
  def moveTo(
    parent: DirectoryEntry,
    newName: String,
    successCallback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  def moveTo(
    parent: DirectoryEntry,
    newName: String,
    successCallback: js.Function1[/* entry */ this.type, Unit]
  ): Unit = js.native
  def moveTo(
    parent: DirectoryEntry,
    newName: String,
    successCallback: js.Function1[/* entry */ this.type, Unit],
    errorCallback: js.Function1[/* error */ FileError, Unit]
  ): Unit = js.native
  
  /** The name of the entry, excluding the path leading to it. */
  var name: String = js.native
  
  var nativeURL: String = js.native
  
  /**
    * Deletes a file or directory. It is an error to attempt to delete a directory that is not empty. It is an error to attempt to delete the root directory of a filesystem.
    * @param successCallback A callback that is called on success.
    * @param errorCallback   A callback that is called when errors happen.
    */
  def remove(successCallback: js.Function0[Unit]): Unit = js.native
  def remove(successCallback: js.Function0[Unit], errorCallback: js.Function1[/* error */ FileError, Unit]): Unit = js.native
  
  /**
    * Return a URL that can be passed across the bridge to identify this entry.
    * @return string URL that can be passed across the bridge to identify this entry
    */
  def toInternalURL(): String = js.native
  
  /**
    * Returns a URL that can be used as the src attribute of a <video> or <audio> tag.
    * If that is not possible, construct a cdvfile:// URL.
    * @return string URL
    */
  def toURL(): String = js.native
}
