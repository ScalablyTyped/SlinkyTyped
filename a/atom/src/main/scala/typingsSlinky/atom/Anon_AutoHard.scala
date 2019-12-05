package typingsSlinky.atom

import typingsSlinky.atom.atomMod.ScopeDescriptor
import typingsSlinky.atom.atomStrings.auto
import typingsSlinky.atom.atomStrings.hard
import typingsSlinky.atom.atomStrings.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHard extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: auto | soft | hard
}

object Anon_AutoHard {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: auto | soft | hard): Anon_AutoHard = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AutoHard]
  }
}

