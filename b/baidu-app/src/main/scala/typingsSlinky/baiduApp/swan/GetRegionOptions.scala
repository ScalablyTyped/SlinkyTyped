package typingsSlinky.baiduApp.swan

import typingsSlinky.baiduApp.AnonNortheast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRegionOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  def success_MGetRegionOptions(res: AnonNortheast): Unit = js.native
}

object GetRegionOptions {
  @scala.inline
  def apply(success: AnonNortheast => Unit): GetRegionOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetRegionOptions]
  }
  @scala.inline
  implicit class GetRegionOptionsOps[Self <: GetRegionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: AnonNortheast => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

