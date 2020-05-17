package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.atom
import typingsSlinky.atom.atomStrings.experimental
import typingsSlinky.atom.atomStrings.native
import typingsSlinky.atom.atomStrings.poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `3` extends js.Object {
  var newValue: native | experimental | poll | atom = js.native
  var oldValue: js.UndefOr[native | experimental | poll | atom] = js.native
}

object `3` {
  @scala.inline
  def apply(newValue: native | experimental | poll | atom): `3` = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  @scala.inline
  implicit class `3Ops`[Self <: `3`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewValue(value: native | experimental | poll | atom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: native | experimental | poll | atom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(js.undefined)
        ret
    }
  }
  
}

