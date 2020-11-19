package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Binding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify/dts/syntax/binding_in_syntax", JSImport.Namespace)
@js.native
object bindingInSyntaxMod extends js.Object {
  
  @js.native
  class BindingInSyntax[T] protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.BindingInSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    var _binding: js.Any = js.native
  }
}
