package typingsSlinky.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteResult extends js.Object {
  var count: Double = js.native
  var info: String = js.native
  var tips: js.Array[Tip] = js.native
}

object AutocompleteResult {
  @scala.inline
  def apply(count: Double, info: String, tips: js.Array[Tip]): AutocompleteResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteResult]
  }
  @scala.inline
  implicit class AutocompleteResultOps[Self <: AutocompleteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTips(value: js.Array[Tip]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tips")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

