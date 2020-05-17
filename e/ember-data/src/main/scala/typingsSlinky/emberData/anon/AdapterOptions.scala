package typingsSlinky.emberData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdapterOptions extends js.Object {
  var adapterOptions: js.UndefOr[js.Object] = js.native
}

object AdapterOptions {
  @scala.inline
  def apply(): AdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdapterOptions]
  }
  @scala.inline
  implicit class AdapterOptionsOps[Self <: AdapterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapterOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapterOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapterOptions")(js.undefined)
        ret
    }
  }
  
}

