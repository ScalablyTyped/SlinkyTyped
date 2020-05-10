package typingsSlinky.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodeIntoResult extends js.Object {
  /**
    * The read Unicode code units of input.
    */
  var read: Double = js.native
  /**
    * The written UTF-8 bytes of output.
    */
  var written: Double = js.native
}

object EncodeIntoResult {
  @scala.inline
  def apply(read: Double, written: Double): EncodeIntoResult = {
    val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeIntoResult]
  }
  @scala.inline
  implicit class EncodeIntoResultOps[Self <: EncodeIntoResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRead(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritten(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("written")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

