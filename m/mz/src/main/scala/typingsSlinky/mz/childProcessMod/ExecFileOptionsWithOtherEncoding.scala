package typingsSlinky.mz.childProcessMod

import typingsSlinky.node.childProcessMod.ExecFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecFileOptionsWithOtherEncoding extends ExecFileOptions {
  var encoding: js.UndefOr[String | Null] = js.native
}

object ExecFileOptionsWithOtherEncoding {
  @scala.inline
  def apply(): ExecFileOptionsWithOtherEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecFileOptionsWithOtherEncoding]
  }
  @scala.inline
  implicit class ExecFileOptionsWithOtherEncodingOps[Self <: ExecFileOptionsWithOtherEncoding] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodingNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(null)
        ret
    }
  }
  
}

