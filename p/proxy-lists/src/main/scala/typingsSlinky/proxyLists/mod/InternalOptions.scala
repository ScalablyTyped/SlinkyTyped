package typingsSlinky.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalOptions extends Options {
  var sample: js.UndefOr[Boolean] = js.native
}

object InternalOptions {
  @scala.inline
  def apply(): InternalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalOptions]
  }
  @scala.inline
  implicit class InternalOptionsOps[Self <: InternalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSample(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSample: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(js.undefined)
        ret
    }
  }
  
}

