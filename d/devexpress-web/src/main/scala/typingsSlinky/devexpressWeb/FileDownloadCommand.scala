package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A command to download the document file, specifying its extension.
  */
@js.native
trait FileDownloadCommand extends CommandWithSimpleStateBase {
  
  /**
    * Executes the FileDownloadCommand command with the specified parameter. true if the command has been successfully executed; false if the command execution has failed.
    * @param fileExtension A string value specifying the extension of the downloading file.
    */
  def execute(fileExtension: String): Boolean = js.native
  def execute(fileExtension: DocumentFormat): Boolean = js.native
}
