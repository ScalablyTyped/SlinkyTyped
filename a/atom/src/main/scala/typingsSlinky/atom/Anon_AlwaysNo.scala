package typingsSlinky.atom

import typingsSlinky.atom.atomMod.ScopeDescriptor
import typingsSlinky.atom.atomStrings.always
import typingsSlinky.atom.atomStrings.no
import typingsSlinky.atom.atomStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlwaysNo extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: no | yes | always
}

object Anon_AlwaysNo {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: no | yes | always): Anon_AlwaysNo = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlwaysNo]
  }
}

