package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Binding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/binding_when_syntax", JSImport.Namespace)
@js.native
object bindingWhenSyntaxMod extends js.Object {
  @js.native
  class BindingWhenSyntax[T] protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.BindingWhenSyntax[T] {
    def this(binding: Binding[T]) = this()
    var _binding: js.Any = js.native
  }
  
}

