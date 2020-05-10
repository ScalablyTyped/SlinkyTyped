package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTransferError extends js.Object {
  var code: Double = js.native
  var http_status: Double = js.native
  var source: String = js.native
  var target: String = js.native
}

@JSGlobal("FileTransferError")
@js.native
object FileTransferError extends js.Object {
  var ABORT_ERR: Double = js.native
  var CONNECTION_ERR: Double = js.native
  var FILE_NOT_FOUND_ERR: Double = js.native
  var INVALID_URL_ERR: Double = js.native
}

