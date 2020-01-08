package typingsSlinky.atom

import typingsSlinky.atom.atomMod.ScopeDescriptor
import typingsSlinky.atom.atomStrings.`tab alwaysComma enter when suggestion explicitly selected`
import typingsSlinky.atom.atomStrings.`tab and enter`
import typingsSlinky.atom.atomStrings.enter
import typingsSlinky.atom.atomStrings.tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnterScopeDescriptor extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
}

object Anon_EnterScopeDescriptor {
  @scala.inline
  def apply(
    scopeDescriptor: ScopeDescriptor,
    value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  ): Anon_EnterScopeDescriptor = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EnterScopeDescriptor]
  }
}

