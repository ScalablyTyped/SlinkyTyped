package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.BindingScope
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingMod {
  
  @JSImport("inversify/dts/bindings/binding", "Binding")
  @js.native
  class Binding[T] protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.Binding[T] {
    def this(serviceIdentifier: ServiceIdentifier[T], scope: BindingScope) = this()
  }
}
