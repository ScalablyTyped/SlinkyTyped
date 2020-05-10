package typingsSlinky.apicalypse.mod

import typingsSlinky.axios.mod.AxiosRequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApicalypseConfig extends AxiosRequestConfig {
  var queryMethod: js.UndefOr[QueryMethod] = js.native
}

object ApicalypseConfig {
  @scala.inline
  def apply(): ApicalypseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApicalypseConfig]
  }
  @scala.inline
  implicit class ApicalypseConfigOps[Self <: ApicalypseConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQueryMethod(value: QueryMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryMethod")(js.undefined)
        ret
    }
  }
  
}

