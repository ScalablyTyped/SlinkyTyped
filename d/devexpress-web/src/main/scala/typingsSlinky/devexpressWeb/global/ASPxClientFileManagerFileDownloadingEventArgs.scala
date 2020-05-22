package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.FileDownloading event.
  */
@JSGlobal("ASPxClientFileManagerFileDownloadingEventArgs")
@js.native
class ASPxClientFileManagerFileDownloadingEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientFileManagerFileDownloadingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerFileDownloadingEventArgs object.
    * @param file An ASPxClientFileManagerFile object that is the file currently being processed.
    */
  def this(file: typingsSlinky.devexpressWeb.ASPxClientFileManagerFile) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
  /**
    * Gets a file related to the event.
    */
  /* CompleteClass */
  override var file: typingsSlinky.devexpressWeb.ASPxClientFileManagerFile = js.native
}

