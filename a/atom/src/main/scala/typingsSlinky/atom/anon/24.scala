package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.`12px`
import typingsSlinky.atom.atomStrings.`14px`
import typingsSlinky.atom.atomStrings.`16px`
import typingsSlinky.atom.atomStrings.`18px`
import typingsSlinky.atom.atomStrings.`21px`
import typingsSlinky.atom.atomStrings.`24px`
import typingsSlinky.atom.atomStrings.`28px`
import typingsSlinky.atom.atomStrings.`32px`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `24` extends js.Object {
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  var value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px` = js.native
}

object `24` {
  @scala.inline
  def apply(
    scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor,
    value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`
  ): `24` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  @scala.inline
  implicit class `24Ops`[Self <: `24`] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopeDescriptor(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

