package typingsSlinky.sawtoothSdk.exceptionsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sawtooth-sdk/processor/exceptions", "_TransactionProcessorError")
@js.native
class TransactionProcessorError protected () extends js.Object {
  protected def this(message: String) = this()
  protected def this(message: js.UndefOr[scala.Nothing], extendedData: Buffer) = this()
  protected def this(message: js.UndefOr[scala.Nothing], extendedData: js.typedarray.Uint8Array) = this()
  protected def this(message: String, extendedData: Buffer) = this()
  protected def this(message: String, extendedData: js.typedarray.Uint8Array) = this()
}

