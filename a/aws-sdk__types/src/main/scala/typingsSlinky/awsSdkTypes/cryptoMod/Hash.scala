package typingsSlinky.awsSdkTypes.cryptoMod

import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.ascii
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.latin1
import typingsSlinky.awsSdkTypes.awsSdkTypesStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  /**
    * Finalizes the hash and provides a promise that will be fulfilled with the
    * raw bytes of the calculated hash.
    */
  def digest(): js.Promise[js.typedarray.Uint8Array] = js.native
  /**
    * Adds a chunk of data to the hash. If a buffer is provided, the `encoding`
    * argument will be ignored. If a string is provided without a specified
    * encoding, implementations must assume UTF-8 encoding.
    *
    * Not all encodings are supported on all platforms, though all must support
    * UTF-8.
    */
  def update(toHash: SourceData): Unit = js.native
  @JSName("update")
  def update_ascii(toHash: SourceData, encoding: ascii): Unit = js.native
  @JSName("update")
  def update_latin1(toHash: SourceData, encoding: latin1): Unit = js.native
  @JSName("update")
  def update_utf8(toHash: SourceData, encoding: utf8): Unit = js.native
}

