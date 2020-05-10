package typingsSlinky.reactSelect.accessibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstructionsContext extends js.Object {
  var isMulti: js.UndefOr[Boolean] = js.native
  var isSearchable: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[String] = js.native
}

object InstructionsContext {
  @scala.inline
  def apply(): InstructionsContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstructionsContext]
  }
  @scala.inline
  implicit class InstructionsContextOps[Self <: InstructionsContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMulti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMulti")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSearchable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSearchable")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
  }
  
}

