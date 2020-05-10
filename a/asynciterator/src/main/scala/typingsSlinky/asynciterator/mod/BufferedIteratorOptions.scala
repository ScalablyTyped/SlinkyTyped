package typingsSlinky.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferedIteratorOptions extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.native
  var maxBufferSize: js.UndefOr[Double] = js.native
}

object BufferedIteratorOptions {
  @scala.inline
  def apply(): BufferedIteratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferedIteratorOptions]
  }
  @scala.inline
  implicit class BufferedIteratorOptionsOps[Self <: BufferedIteratorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBufferSize")(js.undefined)
        ret
    }
  }
  
}

