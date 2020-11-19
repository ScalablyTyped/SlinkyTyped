package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Binding
import typingsSlinky.inversify.interfacesMod.interfaces.BindingInSyntax
import typingsSlinky.inversify.interfacesMod.interfaces.BindingOnSyntax
import typingsSlinky.inversify.interfacesMod.interfaces.BindingWhenSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify/dts/syntax/binding_in_when_on_syntax", JSImport.Namespace)
@js.native
object bindingInWhenOnSyntaxMod extends js.Object {
  
  @js.native
  class BindingInWhenOnSyntax[T] protected ()
    extends BindingInSyntax[T]
       with BindingWhenSyntax[T]
       with BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    var _binding: js.Any = js.native
    
    var _bindingInSyntax: js.Any = js.native
    
    var _bindingOnSyntax: js.Any = js.native
    
    var _bindingWhenSyntax: js.Any = js.native
  }
}
