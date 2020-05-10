package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalCityOptions extends js.Object {
  var renderOptions: js.UndefOr[RenderOptions] = js.native
}

object LocalCityOptions {
  @scala.inline
  def apply(): LocalCityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalCityOptions]
  }
  @scala.inline
  implicit class LocalCityOptionsOps[Self <: LocalCityOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderOptions(value: RenderOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOptions")(js.undefined)
        ret
    }
  }
  
}

