package typingsSlinky.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCounterLabel extends js.Object {
  var counterLabel: js.UndefOr[String] = js.native
}

object AnonCounterLabel {
  @scala.inline
  def apply(): AnonCounterLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonCounterLabel]
  }
  @scala.inline
  implicit class AnonCounterLabelOps[Self <: AnonCounterLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounterLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounterLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterLabel")(js.undefined)
        ret
    }
  }
  
}

