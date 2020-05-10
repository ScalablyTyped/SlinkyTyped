package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.`tab alwaysComma enter when suggestion explicitly selected`
import typingsSlinky.atom.atomStrings.`tab and enter`
import typingsSlinky.atom.atomStrings.enter
import typingsSlinky.atom.atomStrings.tab
import typingsSlinky.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon20 extends js.Object {
  var scopeDescriptor: ScopeDescriptor = js.native
  var value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`) = js.native
}

object Anon20 {
  @scala.inline
  def apply(
    scopeDescriptor: ScopeDescriptor,
    value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  ): Anon20 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon20]
  }
  @scala.inline
  implicit class Anon20Ops[Self <: Anon20] (val x: Self) extends AnyVal {
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
    def withValue(
      value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

