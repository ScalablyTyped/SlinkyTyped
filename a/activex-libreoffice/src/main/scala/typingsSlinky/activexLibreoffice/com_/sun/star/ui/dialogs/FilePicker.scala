package typingsSlinky.activexLibreoffice.com_.sun.star.ui.dialogs

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.StringPair
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link FilePicker} .
  *
  * It is **NOT** recommended to cache a reference to a file picker instance. Due to restrictions by the underlying system there can be specific
  * limitations possible. To overcome these problems it's recommended to create a new instance on demand.
  * @see XFilePicker
  */
@js.native
trait FilePicker extends XFilePicker3 {
  
  /**
    * Provides the ability to choose between different custom templates that do extend the subset of common controls a {@link FilePicker} usually supports.
    * Implementers may omit this interface if the FileOpen dialog doesn't support custom templates. In this case a createInstance will create an ordinary
    * FileOpen dialog with only the common {@link FilePicker} elements. The client has to provide one of the specified constants in {@link
    * TemplateDescription} . ; ;
    *
    * **Notes for the implementation of a FileSave dialog:** The implementation of a FileSave dialog should automatically check for existence of a file and
    * issue a warning if a file with the same name already exist.
    * @see com.sun.star.ui.dialogs.TemplateDescription
    */
  def createWithMode(Mode: Double): Unit = js.native
}
object FilePicker {
  
  @scala.inline
  def apply(
    AvailableHeight: Double,
    AvailableWidth: Double,
    CurrentFilter: String,
    DisplayDirectory: String,
    Files: SafeArray[String],
    SelectedFiles: SafeArray[String],
    ShowState: Boolean,
    SupportedImageFormats: SafeArray[Double],
    TargetColorDepth: Color,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addFilePickerListener: XFilePickerListener => Unit,
    appendFilter: (String, String) => Unit,
    appendFilterGroup: (String, SeqEquiv[StringPair]) => Unit,
    cancel: () => Unit,
    createWithMode: Double => Unit,
    dispose: () => Unit,
    execute: () => Double,
    getAvailableHeight: () => Double,
    getAvailableWidth: () => Double,
    getCurrentFilter: () => String,
    getDisplayDirectory: () => String,
    getFiles: () => SafeArray[String],
    getSelectedFiles: () => SafeArray[String],
    getShowState: () => Boolean,
    getSupportedImageFormats: () => SafeArray[Double],
    getTargetColorDepth: () => Color,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFilePickerListener: XFilePickerListener => Unit,
    setCurrentFilter: String => Unit,
    setDefaultName: String => Unit,
    setDisplayDirectory: String => Unit,
    setImage: (Double, js.Any) => Unit,
    setMultiSelectionMode: Boolean => Unit,
    setShowState: Boolean => Boolean,
    setTitle: String => Unit
  ): FilePicker = {
    val __obj = js.Dynamic.literal(AvailableHeight = AvailableHeight.asInstanceOf[js.Any], AvailableWidth = AvailableWidth.asInstanceOf[js.Any], CurrentFilter = CurrentFilter.asInstanceOf[js.Any], DisplayDirectory = DisplayDirectory.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], SelectedFiles = SelectedFiles.asInstanceOf[js.Any], ShowState = ShowState.asInstanceOf[js.Any], SupportedImageFormats = SupportedImageFormats.asInstanceOf[js.Any], TargetColorDepth = TargetColorDepth.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addFilePickerListener = js.Any.fromFunction1(addFilePickerListener), appendFilter = js.Any.fromFunction2(appendFilter), appendFilterGroup = js.Any.fromFunction2(appendFilterGroup), cancel = js.Any.fromFunction0(cancel), createWithMode = js.Any.fromFunction1(createWithMode), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction0(execute), getAvailableHeight = js.Any.fromFunction0(getAvailableHeight), getAvailableWidth = js.Any.fromFunction0(getAvailableWidth), getCurrentFilter = js.Any.fromFunction0(getCurrentFilter), getDisplayDirectory = js.Any.fromFunction0(getDisplayDirectory), getFiles = js.Any.fromFunction0(getFiles), getSelectedFiles = js.Any.fromFunction0(getSelectedFiles), getShowState = js.Any.fromFunction0(getShowState), getSupportedImageFormats = js.Any.fromFunction0(getSupportedImageFormats), getTargetColorDepth = js.Any.fromFunction0(getTargetColorDepth), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFilePickerListener = js.Any.fromFunction1(removeFilePickerListener), setCurrentFilter = js.Any.fromFunction1(setCurrentFilter), setDefaultName = js.Any.fromFunction1(setDefaultName), setDisplayDirectory = js.Any.fromFunction1(setDisplayDirectory), setImage = js.Any.fromFunction2(setImage), setMultiSelectionMode = js.Any.fromFunction1(setMultiSelectionMode), setShowState = js.Any.fromFunction1(setShowState), setTitle = js.Any.fromFunction1(setTitle))
    __obj.asInstanceOf[FilePicker]
  }
  
  @scala.inline
  implicit class FilePickerMutableBuilder[Self <: FilePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateWithMode(value: Double => Unit): Self = StObject.set(x, "createWithMode", js.Any.fromFunction1(value))
  }
}
