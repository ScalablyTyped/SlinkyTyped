package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XStream
import typingsSlinky.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is the basic interface to read data from a stream. */
@js.native
trait XSimpleFileAccess extends XInterface {
  /**
    * Copies a file
    * @param SourceURL URL of the file to be copied
    * @param DestURL URL of the location the file should be copied to
    * @see move
    */
  def copy(SourceURL: String, DestURL: String): Unit = js.native
  /**
    * Creates a new Folder
    * @param NewFolderURL URL describing the location of the new folder
    */
  def createFolder(NewFolderURL: String): Unit = js.native
  /**
    * Checks if a file exists
    * @param FileURL URL to be checked
    * @returns true, if the File exists, false otherwise
    */
  def exists(FileURL: String): Boolean = js.native
  /**
    * Returns the content type of a file.
    * @param FileURL URL of the file
    * @returns {@link Content} type of the file
    * @see XContent.getContentType
    */
  def getContentType(FileURL: String): String = js.native
  /**
    * Returns the last modified date for the file
    * @param FileURL URL of the file
    * @returns Last modified date for the file
    */
  def getDateTimeModified(FileURL: String): DateTime = js.native
  /**
    * Returns the contents of a folder
    * @param FolderURL URL of the folder
    * @param bIncludeFolders true: Subfolders are included, false: No subfolders
    * @returns The content of a folder, each file as one string in a string sequence
    */
  def getFolderContents(FolderURL: String, bIncludeFolders: Boolean): SafeArray[String] = js.native
  /**
    * Returns the size of a file.
    * @param FileURL URL of the file
    * @returns Size of the file in bytes
    */
  def getSize(FileURL: String): Double = js.native
  /**
    * Checks if an URL represents a folder
    * @param FileURL URL to be checked
    * @returns true, if the given URL represents a folder, otherwise false
    */
  def isFolder(FileURL: String): Boolean = js.native
  /**
    * Checks if a file is "read only"
    * @param FileURL URL to be checked
    * @returns true, if the given File is "read only", false otherwise
    */
  def isReadOnly(FileURL: String): Boolean = js.native
  /**
    * Removes a file. If the URL represents a folder, the folder will be removed, even if it's not empty.
    * @param FileURL File/folder to be removed
    * @see move
    */
  def kill(FileURL: String): Unit = js.native
  /**
    * Moves a file
    * @param SourceURL URL of the file to be moved
    * @param DestURL URL of the location the file should be moved to
    * @see move
    */
  def move(SourceURL: String, DestURL: String): Unit = js.native
  /**
    * Opens file to read
    * @param FileURL File to open
    * @returns An XInputStream, if the file can be opened for reading
    */
  def openFileRead(FileURL: String): XInputStream = js.native
  /**
    * Opens file to read and write
    * @param FileURL File to open
    * @returns An XStream, if the file can be opened for reading and writing
    * @throws UnsupportedDataSinkException the file cannot be opened for random write access. Some resources do not allow random write access. To write data fo
    */
  def openFileReadWrite(FileURL: String): XStream = js.native
  /**
    * Opens file to write.
    * @param FileURL File to open
    * @returns An XOutputStream, if the file can be opened for writing
    * @throws UnsupportedDataSinkException the file cannot be opened for random write access. Some resources do not allow random write access. To write data fo
    */
  def openFileWrite(FileURL: String): XOutputStream = js.native
  /**
    * Sets an interaction handler to be used for further operations.
    *
    * A default interaction handler is available as service {@link com.sun.star.task.InteractionHandler} . The documentation of this service also contains
    * further information about the interaction handler concept.
    * @param Handler The interaction handler to be set
    * @see com.sun.star.task.InteractionHandler
    */
  def setInteractionHandler(Handler: XInteractionHandler): Unit = js.native
  /**
    * Sets the "read only" of a file according to the boolean parameter, if the actual process has the right to do so.
    * @param FileURL URL of the file
    * @param bReadOnly true; "read only" flag will be set, false; "read only" flag will be reset
    */
  def setReadOnly(FileURL: String, bReadOnly: Boolean): Unit = js.native
}

object XSimpleFileAccess {
  @scala.inline
  def apply(
    acquire: () => Unit,
    copy: (String, String) => Unit,
    createFolder: String => Unit,
    exists: String => Boolean,
    getContentType: String => String,
    getDateTimeModified: String => DateTime,
    getFolderContents: (String, Boolean) => SafeArray[String],
    getSize: String => Double,
    isFolder: String => Boolean,
    isReadOnly: String => Boolean,
    kill: String => Unit,
    move: (String, String) => Unit,
    openFileRead: String => XInputStream,
    openFileReadWrite: String => XStream,
    openFileWrite: String => XOutputStream,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setInteractionHandler: XInteractionHandler => Unit,
    setReadOnly: (String, Boolean) => Unit
  ): XSimpleFileAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), copy = js.Any.fromFunction2(copy), createFolder = js.Any.fromFunction1(createFolder), exists = js.Any.fromFunction1(exists), getContentType = js.Any.fromFunction1(getContentType), getDateTimeModified = js.Any.fromFunction1(getDateTimeModified), getFolderContents = js.Any.fromFunction2(getFolderContents), getSize = js.Any.fromFunction1(getSize), isFolder = js.Any.fromFunction1(isFolder), isReadOnly = js.Any.fromFunction1(isReadOnly), kill = js.Any.fromFunction1(kill), move = js.Any.fromFunction2(move), openFileRead = js.Any.fromFunction1(openFileRead), openFileReadWrite = js.Any.fromFunction1(openFileReadWrite), openFileWrite = js.Any.fromFunction1(openFileWrite), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setInteractionHandler = js.Any.fromFunction1(setInteractionHandler), setReadOnly = js.Any.fromFunction2(setReadOnly))
    __obj.asInstanceOf[XSimpleFileAccess]
  }
  @scala.inline
  implicit class XSimpleFileAccessOps[Self <: XSimpleFileAccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateFolder(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExists(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetContentType(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDateTimeModified(value: String => DateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDateTimeModified")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFolderContents(value: (String, Boolean) => SafeArray[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFolderContents")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetSize(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsFolder(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsReadOnly(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReadOnly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKill(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMove(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("move")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOpenFileRead(value: String => XInputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFileRead")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenFileReadWrite(value: String => XStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFileReadWrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpenFileWrite(value: String => XOutputStream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openFileWrite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetInteractionHandler(value: XInteractionHandler => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setInteractionHandler")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetReadOnly(value: (String, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReadOnly")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

