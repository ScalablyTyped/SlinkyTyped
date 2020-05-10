package typingsSlinky.cordovaPluginFileTransfer

import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A FileTransferError object is passed to an error callback when an error occurs. */
@js.native
trait FileTransferError extends js.Object {
  /* Response body. This attribute is only available when a response is received from the HTTP connection. */
  var body: String = js.native
  /**
    * One of the predefined error codes listed below.
    *     FileTransferError.FILE_NOT_FOUND_ERR
    *     FileTransferError.INVALID_URL_ERR
    *     FileTransferError.CONNECTION_ERR
    *     FileTransferError.ABORT_ERR
    *     FileTransferError.NOT_MODIFIED_ERR
    */
  var code: Double = js.native
  /* Exception that is thrown by native code */
  var exception: js.Any = js.native
  /** HTTP status code. This attribute is only available when a response code is received from the HTTP connection. */
  var http_status: Double = js.native
  /** URL to the source. */
  var source: String = js.native
  /** URL to the target. */
  var target: String = js.native
}

@JSGlobal("FileTransferError")
@js.native
object FileTransferError
  extends /** Constructor for FileTransferError object */
Instantiable6[
      js.UndefOr[/* code */ Double], 
      js.UndefOr[/* source */ String], 
      js.UndefOr[/* target */ String], 
      js.UndefOr[/* status */ Double], 
      js.UndefOr[/* body */ js.Any], 
      js.UndefOr[/* exception */ js.Any], 
      FileTransferError
    ] {
  var ABORT_ERR: Double = js.native
  var CONNECTION_ERR: Double = js.native
  var FILE_NOT_FOUND_ERR: Double = js.native
  var INVALID_URL_ERR: Double = js.native
  var NOT_MODIFIED_ERR: Double = js.native
}

