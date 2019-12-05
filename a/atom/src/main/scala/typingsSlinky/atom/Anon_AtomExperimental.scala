package typingsSlinky.atom

import typingsSlinky.atom.atomMod.ScopeDescriptor
import typingsSlinky.atom.atomStrings.experimental
import typingsSlinky.atom.atomStrings.native
import typingsSlinky.atom.atomStrings.poll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AtomExperimental extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: native | experimental | poll | typingsSlinky.atom.atomStrings.atom
}

object Anon_AtomExperimental {
  @scala.inline
  def apply(
    scopeDescriptor: ScopeDescriptor,
    value: native | experimental | poll | typingsSlinky.atom.atomStrings.atom
  ): Anon_AtomExperimental = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AtomExperimental]
  }
}

