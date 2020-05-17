package typingsSlinky.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomData extends js.Object {
  var customData: js.Any = js.native
}

object CustomData {
  @scala.inline
  def apply(customData: js.Any): CustomData = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomData]
  }
  @scala.inline
  implicit class CustomDataOps[Self <: CustomData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

