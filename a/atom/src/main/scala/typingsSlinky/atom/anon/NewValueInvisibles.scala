package typingsSlinky.atom.anon

import typingsSlinky.atom.mod.Invisibles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewValueInvisibles extends js.Object {
  var newValue: Invisibles = js.native
  var oldValue: js.UndefOr[Invisibles] = js.native
}

object NewValueInvisibles {
  @scala.inline
  def apply(newValue: Invisibles): NewValueInvisibles = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValueInvisibles]
  }
  @scala.inline
  implicit class NewValueInvisiblesOps[Self <: NewValueInvisibles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewValue(value: Invisibles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: Invisibles): Self = {
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

