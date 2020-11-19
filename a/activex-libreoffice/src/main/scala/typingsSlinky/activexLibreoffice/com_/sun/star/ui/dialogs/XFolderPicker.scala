package typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs

import typingsSlinky.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a {@link FolderPicker} interface. */
@js.native
trait XFolderPicker extends XExecutableDialog {
  
  /**
    * Returns the selected directory as url conforming to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    * @returns The selected directory as url if the user did close the dialog with Ok else the returned value is undefined.
    */
  val Directory: String = js.native
  
  /**
    * Returns the root directory that the {@link FolderPicker} is showing. The return value is undefined if the client did not choose a root directory or
    * the previously specified root directory doesn't exist.
    * @returns The directory in url format.
    */
  var DisplayDirectory: String = js.native
  
  /**
    * Returns the selected directory as url conforming to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    * @returns The selected directory as url if the user did close the dialog with Ok else the returned value is undefined.
    */
  def getDirectory(): String = js.native
  
  /**
    * Returns the root directory that the {@link FolderPicker} is showing. The return value is undefined if the client did not choose a root directory or
    * the previously specified root directory doesn't exist.
    * @returns The directory in url format.
    */
  def getDisplayDirectory(): String = js.native
  
  /**
    * The implementation may optionally show the given text as a description for the user within the dialog, e.g. "Please select a directory". If the client
    * doesn't set a description the dialog may show a default description.
    */
  def setDescription(aDescription: String): Unit = js.native
  
  /**
    * Sets the root directory that the {@link FolderPicker} should display. It is not specified which root directory the {@link FolderPicker} chooses if the
    * specified root directory doesn't exist.
    * @param aDirectory Specifies the root directory in url format, conforming to [Rfc1738]{@link url="http://www.w3.org/Addressing/rfc1738.txt"} .
    * @throws com::sun::star::lang::IllegalArgumentException if the given url is invalid.
    */
  def setDisplayDirectory(aDirectory: String): Unit = js.native
}
object XFolderPicker {
  
  @scala.inline
  def apply(
    Directory: String,
    DisplayDirectory: String,
    acquire: () => Unit,
    execute: () => Double,
    getDirectory: () => String,
    getDisplayDirectory: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDescription: String => Unit,
    setDisplayDirectory: String => Unit,
    setTitle: String => Unit
  ): XFolderPicker = {
    val __obj = js.Dynamic.literal(Directory = Directory.asInstanceOf[js.Any], DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction0(execute), getDirectory = js.Any.fromFunction0(getDirectory), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDescription = js.Any.fromFunction1(setDescription), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[XFolderPicker]
  }
  
  @scala.inline
  implicit class XFolderPickerOps[Self <: XFolderPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDirectory(value: String): Self = this.set("Directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayDirectory(value: String): Self = this.set("DisplayDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDirectory(value: () => String): Self = this.set("getDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDisplayDirectory(value: () => String): Self = this.set("getDisplayDirectory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDescription(value: String => Unit): Self = this.set("setDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDisplayDirectory(value: String => Unit): Self = this.set("setDisplayDirectory", js.Any.fromFunction1(value))
  }
}
