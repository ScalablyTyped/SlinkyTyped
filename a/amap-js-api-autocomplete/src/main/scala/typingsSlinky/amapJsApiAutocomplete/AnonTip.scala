package typingsSlinky.amapJsApiAutocomplete

import typingsSlinky.amapJsApiAutocomplete.AMap.Autocomplete.Tip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTip extends js.Object {
  var tip: Tip = js.native
}

object AnonTip {
  @scala.inline
  def apply(tip: Tip): AnonTip = {
    val __obj = js.Dynamic.literal(tip = tip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTip]
  }
  @scala.inline
  implicit class AnonTipOps[Self <: AnonTip] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTip(value: Tip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

