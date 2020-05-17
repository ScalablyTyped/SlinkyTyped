package typingsSlinky.easyXapiSupertest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlagString extends js.Object {
  var flag: js.UndefOr[String] = js.native
}

object FlagString {
  @scala.inline
  def apply(): FlagString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlagString]
  }
  @scala.inline
  implicit class FlagStringOps[Self <: FlagString] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flag")(js.undefined)
        ret
    }
  }
  
}

