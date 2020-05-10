package typingsSlinky.node.childProcessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpawnSyncOptionsWithBufferEncoding extends SpawnSyncOptions {
  @JSName("encoding")
  var encoding_SpawnSyncOptionsWithBufferEncoding: String = js.native
}

object SpawnSyncOptionsWithBufferEncoding {
  @scala.inline
  def apply(encoding: String): SpawnSyncOptionsWithBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnSyncOptionsWithBufferEncoding]
  }
  @scala.inline
  implicit class SpawnSyncOptionsWithBufferEncodingOps[Self <: SpawnSyncOptionsWithBufferEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

