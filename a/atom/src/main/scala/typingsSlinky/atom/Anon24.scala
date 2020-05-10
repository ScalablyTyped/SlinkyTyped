package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.`12px`
import typingsSlinky.atom.atomStrings.`14px`
import typingsSlinky.atom.atomStrings.`16px`
import typingsSlinky.atom.atomStrings.`18px`
import typingsSlinky.atom.atomStrings.`21px`
import typingsSlinky.atom.atomStrings.`24px`
import typingsSlinky.atom.atomStrings.`28px`
import typingsSlinky.atom.atomStrings.`32px`
import typingsSlinky.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon24 extends js.Object {
  var scopeDescriptor: ScopeDescriptor = js.native
  var value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px` = js.native
}

object Anon24 {
  @scala.inline
  def apply(
    scopeDescriptor: ScopeDescriptor,
    value: `12px` | `14px` | `16px` | `18px` | `21px` | `24px` | `28px` | `32px`
  ): Anon24 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon24]
  }
  @scala.inline
  implicit class Anon24Ops[Self <: Anon24] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopeDescriptor(value: ScopeDescriptor): Self = {
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

