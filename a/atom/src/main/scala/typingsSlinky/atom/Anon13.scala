package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.Bottom
import typingsSlinky.atom.atomStrings.Left
import typingsSlinky.atom.atomStrings.Right
import typingsSlinky.atom.atomStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon13 extends js.Object {
  var newValue: Top | Right | Bottom | Left = js.native
  var oldValue: js.UndefOr[Top | Right | Bottom | Left] = js.native
}

object Anon13 {
  @scala.inline
  def apply(newValue: Top | Right | Bottom | Left): Anon13 = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon13]
  }
  @scala.inline
  implicit class Anon13Ops[Self <: Anon13] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewValue(value: Top | Right | Bottom | Left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldValue(value: Top | Right | Bottom | Left): Self = {
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

