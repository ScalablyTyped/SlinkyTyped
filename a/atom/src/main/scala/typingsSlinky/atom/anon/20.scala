package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.`tab alwaysComma enter when suggestion explicitly selected`
import typingsSlinky.atom.atomStrings.`tab and enter`
import typingsSlinky.atom.atomStrings.enter
import typingsSlinky.atom.atomStrings.tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `20` extends StObject {
  
  var scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor = js.native
  
  var value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`) = js.native
}
object `20` {
  
  @scala.inline
  def apply(
    scopeDescriptor: typingsSlinky.atom.mod.ScopeDescriptor,
    value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
  ): `20` = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit class `20MutableBuilder`[Self <: `20`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeDescriptor(value: typingsSlinky.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scopeDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(
      value: tab | enter | (`tab and enter`) | (`tab alwaysComma enter when suggestion explicitly selected`)
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
