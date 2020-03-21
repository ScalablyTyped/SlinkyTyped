package typingsSlinky.chunkedDc.chunkedDc

import typingsSlinky.std.IterableIterator
import typingsSlinky.std.IteratorResult
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** chunker.ts **/
@js.native
trait Chunker extends IterableIterator[Uint8Array] {
  var hasNext: Boolean = js.native
  def next(): IteratorResult[scala.scalajs.js.typedarray.Uint8Array, _] = js.native
}

