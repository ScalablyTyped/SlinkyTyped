package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Binding
import typingsSlinky.inversify.interfacesMod.interfaces.Context
import typingsSlinky.inversify.interfacesMod.interfaces.ServiceIdentifier
import typingsSlinky.inversify.interfacesMod.interfaces.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestMod {
  
  @JSImport("inversify/dts/planning/request", "Request")
  @js.native
  class Request protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.Request {
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
      parentRequest: typingsSlinky.inversify.interfacesMod.interfaces.Request,
      bindings: js.Array[Binding[_]],
      target: Target
    ) = this()
    def this(
      serviceIdentifier: ServiceIdentifier[_],
      parentContext: Context,
      parentRequest: typingsSlinky.inversify.interfacesMod.interfaces.Request,
      bindings: Binding[_],
      target: Target
    ) = this()
  }
}
