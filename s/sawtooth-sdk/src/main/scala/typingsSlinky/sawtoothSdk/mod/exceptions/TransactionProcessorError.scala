package typingsSlinky.sawtoothSdk.mod.exceptions

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk", "exceptions._TransactionProcessorError")
@js.native
class TransactionProcessorError protected ()
  extends typingsSlinky.sawtoothSdk.exceptionsMod.TransactionProcessorError {
  protected def this(message: String) = this()
  protected def this(message: String, extendedData: Buffer) = this()
  protected def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
}

