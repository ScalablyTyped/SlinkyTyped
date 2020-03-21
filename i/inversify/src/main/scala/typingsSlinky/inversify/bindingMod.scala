package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.BindingScope
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/bindings/binding", JSImport.Namespace)
@js.native
object bindingMod extends js.Object {
  @js.native
  class Binding[T] protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.Binding[T] {
    def this(serviceIdentifier: ServiceIdentifier[T], scope: BindingScope) = this()
  }
  
}

