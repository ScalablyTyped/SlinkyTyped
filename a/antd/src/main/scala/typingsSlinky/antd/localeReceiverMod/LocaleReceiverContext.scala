package typingsSlinky.antd.localeReceiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleReceiverContext extends js.Object {
  var antLocale: js.UndefOr[LocaleInterface] = js.native
}

object LocaleReceiverContext {
  @scala.inline
  def apply(): LocaleReceiverContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleReceiverContext]
  }
  @scala.inline
  implicit class LocaleReceiverContextOps[Self <: LocaleReceiverContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAntLocale(value: LocaleInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAntLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(js.undefined)
        ret
    }
  }
  
}

