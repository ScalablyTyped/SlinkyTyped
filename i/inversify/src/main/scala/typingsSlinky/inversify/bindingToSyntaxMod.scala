package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Abstract
import typingsSlinky.inversify.interfacesMod.interfaces.Binding
import typingsSlinky.inversify.interfacesMod.interfaces.Newable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingToSyntaxMod {
  
  @JSImport("inversify/dts/syntax/binding_to_syntax", "BindingToSyntax")
  @js.native
  class BindingToSyntax[T] protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.BindingToSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    var _binding: js.Any = js.native
    
    def toService(service: String): Unit = js.native
    def toService(service: js.Symbol): Unit = js.native
    def toService(service: Abstract[T]): Unit = js.native
    def toService(service: Newable[T]): Unit = js.native
  }
}
