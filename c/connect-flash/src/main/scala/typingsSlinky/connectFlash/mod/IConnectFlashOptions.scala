package typingsSlinky.connectFlash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectFlashOptions extends js.Object {
  var unsafe: js.UndefOr[Boolean] = js.native
}

object IConnectFlashOptions {
  @scala.inline
  def apply(): IConnectFlashOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnectFlashOptions]
  }
  @scala.inline
  implicit class IConnectFlashOptionsOps[Self <: IConnectFlashOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUnsafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unsafe")(js.undefined)
        ret
    }
  }
  
}

