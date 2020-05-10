package typingsSlinky.contractProxyKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoferrors extends js.Object {
  val CALL_EXCEPTION: /* "CALL_EXCEPTION" */ String = js.native
  val INVALID_ARGUMENT: /* "INVALID_ARGUMENT" */ String = js.native
  val MISSING_ARGUMENT: /* "MISSING_ARGUMENT" */ String = js.native
  val MISSING_NEW: /* "MISSING_NEW" */ String = js.native
  val NOT_IMPLEMENTED: /* "NOT_IMPLEMENTED" */ String = js.native
  val NUMERIC_FAULT: /* "NUMERIC_FAULT" */ String = js.native
  val UNEXPECTED_ARGUMENT: /* "UNEXPECTED_ARGUMENT" */ String = js.native
  val UNKNOWN_ERROR: /* "UNKNOWN_ERROR" */ String = js.native
  val UNSUPPORTED_OPERATION: /* "UNSUPPORTED_OPERATION" */ String = js.native
  def checkArgumentCount(count: Double, expectedCount: Double): Unit = js.native
  def checkArgumentCount(count: Double, expectedCount: Double, suffix: String): Unit = js.native
  def checkNew(self: js.Any, kind: js.Any): Unit = js.native
  def setCensorship(censorship: Boolean): Unit = js.native
  def setCensorship(censorship: Boolean, permanent: Boolean): Unit = js.native
  def throwError(message: String, code: String, params: js.Any): scala.Nothing = js.native
}

