package typingsSlinky.node.childProcessMod

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecSyncOptionsWithStringEncoding extends ExecSyncOptions {
  @JSName("encoding")
  var encoding_ExecSyncOptionsWithStringEncoding: BufferEncoding = js.native
}

object ExecSyncOptionsWithStringEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding): ExecSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecSyncOptionsWithStringEncoding]
  }
  @scala.inline
  implicit class ExecSyncOptionsWithStringEncodingOps[Self <: ExecSyncOptionsWithStringEncoding] (val x: Self) extends AnyVal {
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

