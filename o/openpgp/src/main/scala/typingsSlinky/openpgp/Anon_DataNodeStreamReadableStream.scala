package typingsSlinky.openpgp

import typingsSlinky.openpgp.openpgpMod.NodeStream
import typingsSlinky.openpgp.openpgpMod.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataNodeStreamReadableStream extends js.Object {
  var data: scala.scalajs.js.typedarray.Uint8Array | ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | NodeStream
}

object Anon_DataNodeStreamReadableStream {
  @scala.inline
  def apply(
    data: scala.scalajs.js.typedarray.Uint8Array | ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | NodeStream
  ): Anon_DataNodeStreamReadableStream = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataNodeStreamReadableStream]
  }
}

