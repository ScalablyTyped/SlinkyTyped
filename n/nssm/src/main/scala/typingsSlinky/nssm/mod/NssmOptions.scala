package typingsSlinky.nssm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NssmOptions extends js.Object {
  var nssmExe: js.UndefOr[String] = js.native
}

object NssmOptions {
  @scala.inline
  def apply(): NssmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NssmOptions]
  }
  @scala.inline
  implicit class NssmOptionsOps[Self <: NssmOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNssmExe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nssmExe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNssmExe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nssmExe")(js.undefined)
        ret
    }
  }
  
}

