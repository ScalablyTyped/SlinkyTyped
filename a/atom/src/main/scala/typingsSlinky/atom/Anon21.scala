package typingsSlinky.atom

import typingsSlinky.atom.atomStrings.none
import typingsSlinky.atom.atomStrings.textOrSnippet
import typingsSlinky.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon21 extends js.Object {
  var scopeDescriptor: ScopeDescriptor
  var value: none | textOrSnippet
}

object Anon21 {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: none | textOrSnippet): Anon21 = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon21]
  }
}

