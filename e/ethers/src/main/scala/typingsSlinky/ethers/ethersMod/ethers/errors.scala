package typingsSlinky.ethers.ethersMod.ethers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers", "ethers.errors")
@js.native
object errors extends js.Object {
  val CALL_EXCEPTION: typingsSlinky.ethers.ethersStrings.CALL_EXCEPTION = js.native
  val INVALID_ARGUMENT: typingsSlinky.ethers.ethersStrings.INVALID_ARGUMENT = js.native
  val MISSING_ARGUMENT: typingsSlinky.ethers.ethersStrings.MISSING_ARGUMENT = js.native
  val MISSING_NEW: typingsSlinky.ethers.ethersStrings.MISSING_NEW = js.native
  val NOT_IMPLEMENTED: typingsSlinky.ethers.ethersStrings.NOT_IMPLEMENTED = js.native
  val NUMERIC_FAULT: typingsSlinky.ethers.ethersStrings.NUMERIC_FAULT = js.native
  val UNEXPECTED_ARGUMENT: typingsSlinky.ethers.ethersStrings.UNEXPECTED_ARGUMENT = js.native
  val UNKNOWN_ERROR: typingsSlinky.ethers.ethersStrings.UNKNOWN_ERROR = js.native
  val UNSUPPORTED_OPERATION: typingsSlinky.ethers.ethersStrings.UNSUPPORTED_OPERATION = js.native
  def checkArgumentCount(count: Double, expectedCount: Double): Unit = js.native
  def checkArgumentCount(count: Double, expectedCount: Double, suffix: String): Unit = js.native
  def checkNew(self: js.Any, kind: js.Any): Unit = js.native
  def setCensorship(censorship: Boolean): Unit = js.native
  def setCensorship(censorship: Boolean, permanent: Boolean): Unit = js.native
  def throwError(message: String, code: String, params: js.Any): scala.Nothing = js.native
}

