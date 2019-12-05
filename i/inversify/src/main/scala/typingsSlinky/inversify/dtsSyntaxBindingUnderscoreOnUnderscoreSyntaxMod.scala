package typingsSlinky.inversify

import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Binding
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.BindingWhenSyntax
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/binding_on_syntax", JSImport.Namespace)
@js.native
object dtsSyntaxBindingUnderscoreOnUnderscoreSyntaxMod extends js.Object {
  @js.native
  class BindingOnSyntax[T] protected ()
    extends typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    var _binding: js.Any = js.native
    /* CompleteClass */
    override def onActivation(fn: js.Function2[/* context */ Context, T, T]): BindingWhenSyntax[T] = js.native
  }
  
}

