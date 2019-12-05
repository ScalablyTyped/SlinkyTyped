package typingsSlinky.inversify

import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Binding
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Context
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/request", JSImport.Namespace)
@js.native
object dtsPlanningRequestMod extends js.Object {
  @js.native
  class Request protected ()
    extends typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Request {
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: Null,
      bindings: js.Array[Binding[_]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: Null,
      bindings: Binding[_],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Request,
      bindings: js.Array[Binding[_]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: typingsSlinky.inversify.dtsInterfacesInterfacesMod.interfaces.Request,
      bindings: Binding[_],
      target: Target
    ) = this()
  }
  
}

