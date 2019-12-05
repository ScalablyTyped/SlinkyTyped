package typingsSlinky.inversify

import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.BindingScope
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/bindings/binding", JSImport.Namespace)
@js.native
object dtsBindingsBindingMod extends js.Object {
  @js.native
  class Binding[T] protected ()
    extends typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Binding[T] {
    def this(serviceIdentifier: ServiceIdentifier[T], scope: BindingScope) = this()
  }
  
}

