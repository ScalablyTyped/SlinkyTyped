package typingsSlinky.node.childProcessMod

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpawnSyncOptionsWithStringEncoding extends SpawnSyncOptions {
  @JSName("encoding")
  var encoding_SpawnSyncOptionsWithStringEncoding: BufferEncoding = js.native
}

object SpawnSyncOptionsWithStringEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding): SpawnSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnSyncOptionsWithStringEncoding]
  }
  @scala.inline
  implicit class SpawnSyncOptionsWithStringEncodingOps[Self <: SpawnSyncOptionsWithStringEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncoding(value: BufferEncoding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

