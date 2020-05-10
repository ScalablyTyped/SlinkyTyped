package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSearchSearchOptions extends js.Object {
  var customData: js.Any = js.native
  var forceLocal: Boolean = js.native
}

object LocalSearchSearchOptions {
  @scala.inline
  def apply(customData: js.Any, forceLocal: Boolean): LocalSearchSearchOptions = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], forceLocal = forceLocal.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalSearchSearchOptions]
  }
  @scala.inline
  implicit class LocalSearchSearchOptionsOps[Self <: LocalSearchSearchOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withForceLocal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceLocal")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

