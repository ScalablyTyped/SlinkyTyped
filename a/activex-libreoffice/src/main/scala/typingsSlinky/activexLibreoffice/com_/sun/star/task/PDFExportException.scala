package typingsSlinky.activexLibreoffice.com_.sun.star.task

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is an exception that provides information on an error during PDF export. */
trait PDFExportException extends Exception {
  /** contains a number of errors that occurred during PDFExport */
  var ErrorCodes: SafeArray[Double]
}

object PDFExportException {
  @scala.inline
  def apply(Context: XInterface, ErrorCodes: SafeArray[Double], Message: String): PDFExportException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCodes = ErrorCodes.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFExportException]
  }
}

