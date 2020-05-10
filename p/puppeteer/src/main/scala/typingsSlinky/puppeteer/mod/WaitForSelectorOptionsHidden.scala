package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.puppeteerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitForSelectorOptionsHidden extends WaitForSelectorOptions {
  @JSName("hidden")
  var hidden_WaitForSelectorOptionsHidden: `true` = js.native
}

object WaitForSelectorOptionsHidden {
  @scala.inline
  def apply(hidden: `true`): WaitForSelectorOptionsHidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitForSelectorOptionsHidden]
  }
  @scala.inline
  implicit class WaitForSelectorOptionsHiddenOps[Self <: WaitForSelectorOptionsHidden] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHidden(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

