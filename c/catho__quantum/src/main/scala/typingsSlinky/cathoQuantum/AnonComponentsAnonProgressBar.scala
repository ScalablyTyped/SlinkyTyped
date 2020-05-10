package typingsSlinky.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonComponentsAnonProgressBar extends js.Object {
  var components: js.UndefOr[AnonProgressBar] = js.native
}

object AnonComponentsAnonProgressBar {
  @scala.inline
  def apply(): AnonComponentsAnonProgressBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonComponentsAnonProgressBar]
  }
  @scala.inline
  implicit class AnonComponentsAnonProgressBarOps[Self <: AnonComponentsAnonProgressBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponents(value: AnonProgressBar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
  }
  
}

