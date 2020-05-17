package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.anon.CityName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 开放接口-----收货地址
@js.native
trait ChooseAddressOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_ChooseAddressOptions: js.UndefOr[js.Function1[/* res */ CityName, Unit]] = js.native
}

object ChooseAddressOptions {
  @scala.inline
  def apply(): ChooseAddressOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseAddressOptions]
  }
  @scala.inline
  implicit class ChooseAddressOptionsOps[Self <: ChooseAddressOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ CityName => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

