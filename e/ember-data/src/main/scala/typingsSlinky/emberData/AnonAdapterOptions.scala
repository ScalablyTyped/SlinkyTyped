package typingsSlinky.emberData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdapterOptions extends js.Object {
  var adapterOptions: js.UndefOr[js.Object] = js.native
}

object AnonAdapterOptions {
  @scala.inline
  def apply(): AnonAdapterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAdapterOptions]
  }
  @scala.inline
  implicit class AnonAdapterOptionsOps[Self <: AnonAdapterOptions] (val x: Self) extends AnyVal {
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

