package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.dropZoneEnter
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.dropZoneLeave
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.fileInputCountChanged
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.fileUploadComplete
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.filesUploadComplete
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.filesUploadStart
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.textChanged
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.uploadingProgressChanged
import typingsSlinky.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.validationErrorOccurred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapUploadControl extends Control {
  
  def addFileInput(): Unit = js.native
  
  def cancel(): Unit = js.native
  
  def clearText(): Unit = js.native
  
  def getAddButtonText(): String = js.native
  
  def getEnabled(): Boolean = js.native
  
  def getFileInputCount(): Double = js.native
  
  def getSelectedFiles(inputIndex: Double): js.Array[BootstrapUploadControlFile] = js.native
  
  def getText(index: Double): String = js.native
  
  def getUploadButtonText(): String = js.native
  
  def off(
    eventName: js.UndefOr[scala.Nothing],
    callback: js.ThisFunction1[
      /* this */ this.type, 
      js.UndefOr[
        EventArgs | UploadControlDropZoneEnterEventArgs | UploadControlDropZoneLeaveEventArgs | UploadControlFileUploadCompleteEventArgs | UploadControlFilesUploadCompleteEventArgs | UploadControlFilesUploadStartEventArgs | UploadControlTextChangedEventArgs | UploadControlUploadingProgressChangedEventArgs | UploadControlValidationErrorOccurredEventArgs
      ], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_dropZoneEnter(eventName: dropZoneEnter): this.type = js.native
  @JSName("off")
  def off_dropZoneEnter(
    eventName: dropZoneEnter,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlDropZoneEnterEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_dropZoneLeave(eventName: dropZoneLeave): this.type = js.native
  @JSName("off")
  def off_dropZoneLeave(
    eventName: dropZoneLeave,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlDropZoneLeaveEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_fileInputCountChanged(eventName: fileInputCountChanged): this.type = js.native
  @JSName("off")
  def off_fileInputCountChanged(
    eventName: fileInputCountChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_fileUploadComplete(eventName: fileUploadComplete): this.type = js.native
  @JSName("off")
  def off_fileUploadComplete(
    eventName: fileUploadComplete,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlFileUploadCompleteEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_filesUploadComplete(eventName: filesUploadComplete): this.type = js.native
  @JSName("off")
  def off_filesUploadComplete(
    eventName: filesUploadComplete,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlFilesUploadCompleteEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_filesUploadStart(eventName: filesUploadStart): this.type = js.native
  @JSName("off")
  def off_filesUploadStart(
    eventName: filesUploadStart,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlFilesUploadStartEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_textChanged(eventName: textChanged): this.type = js.native
  @JSName("off")
  def off_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[UploadControlTextChangedEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_uploadingProgressChanged(eventName: uploadingProgressChanged): this.type = js.native
  @JSName("off")
  def off_uploadingProgressChanged(
    eventName: uploadingProgressChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlUploadingProgressChangedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_validationErrorOccurred(eventName: validationErrorOccurred): this.type = js.native
  @JSName("off")
  def off_validationErrorOccurred(
    eventName: validationErrorOccurred,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlValidationErrorOccurredEventArgs], 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("on")
  def on_dropZoneEnter(
    eventName: dropZoneEnter,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlDropZoneEnterEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_dropZoneLeave(
    eventName: dropZoneLeave,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlDropZoneLeaveEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_fileInputCountChanged(
    eventName: fileInputCountChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_fileUploadComplete(
    eventName: fileUploadComplete,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlFileUploadCompleteEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_filesUploadComplete(
    eventName: filesUploadComplete,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlFilesUploadCompleteEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_filesUploadStart(
    eventName: filesUploadStart,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlFilesUploadStartEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[UploadControlTextChangedEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_uploadingProgressChanged(
    eventName: uploadingProgressChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlUploadingProgressChangedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_validationErrorOccurred(
    eventName: validationErrorOccurred,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlValidationErrorOccurredEventArgs], 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("once")
  def once_dropZoneEnter(
    eventName: dropZoneEnter,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlDropZoneEnterEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_dropZoneLeave(
    eventName: dropZoneLeave,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlDropZoneLeaveEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_fileInputCountChanged(
    eventName: fileInputCountChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_fileUploadComplete(
    eventName: fileUploadComplete,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlFileUploadCompleteEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_filesUploadComplete(
    eventName: filesUploadComplete,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlFilesUploadCompleteEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_filesUploadStart(
    eventName: filesUploadStart,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlFilesUploadStartEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[UploadControlTextChangedEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_uploadingProgressChanged(
    eventName: uploadingProgressChanged,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlUploadingProgressChangedEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_validationErrorOccurred(
    eventName: validationErrorOccurred,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      /* args */ js.UndefOr[UploadControlValidationErrorOccurredEventArgs], 
      Unit
    ]
  ): this.type = js.native
  
  def removeFileFromSelection(fileIndex: Double): Unit = js.native
  def removeFileFromSelection(file: BootstrapUploadControlFile): Unit = js.native
  
  // tslint:disable-line:unified-signatures
  def removeFileInput(index: Double): Unit = js.native
  
  def setAddButtonText(text: String): Unit = js.native
  
  def setDialogTriggerID(ids: String): Unit = js.native
  
  def setEnabled(enabled: Boolean): Unit = js.native
  
  def setFileInputCount(count: Double): Unit = js.native
  
  def setUploadButtonText(text: String): Unit = js.native
  
  def upload(): Unit = js.native
}
