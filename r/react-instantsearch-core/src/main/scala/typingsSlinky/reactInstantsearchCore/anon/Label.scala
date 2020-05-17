package typingsSlinky.reactInstantsearchCore.anon

import typingsSlinky.reactInstantsearchCore.mod.RefinementValue
import typingsSlinky.reactInstantsearchCore.mod.SearchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  var label: String = js.native
  var value: RefinementValue = js.native
}

object Label {
  @scala.inline
  def apply(label: String, value: /* searchState */ SearchState => SearchState): Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: /* searchState */ SearchState => SearchState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

