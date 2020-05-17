package typingsSlinky.fundamentalReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CounterLabel extends js.Object {
  var counterLabel: js.UndefOr[String] = js.native
}

object CounterLabel {
  @scala.inline
  def apply(): CounterLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CounterLabel]
  }
  @scala.inline
  implicit class CounterLabelOps[Self <: CounterLabel] (val x: Self) extends AnyVal {
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

