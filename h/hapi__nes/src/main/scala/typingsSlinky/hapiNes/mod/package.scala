package typingsSlinky.hapiNes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * TODO (if possible) use a drier, more robust way of doing this that
    * allows for:
    *      * the export to have be of type Hapi.PluginFunction whilst
    *      * also exposing the Client type
    *      * exporting the NesClient as the Client class without having to
    *          duplicate the constructor definition
    *      * and all the type exports from the NesClient namespace (Handler,
    *          ClientOptions, ClientConnectOptions, ClientRequestOptions,
    *          ClientSubscribeFlags)
    */
  type Client = typingsSlinky.hapiNes.clientMod.Client
  type ClientConnectOptions = typingsSlinky.hapiNes.clientMod.Client.ClientConnectOptions
  type ClientOptions = typingsSlinky.hapiNes.clientMod.Client.ClientOptions
  type ClientRequestOptions = typingsSlinky.hapiNes.clientMod.Client.ClientRequestOptions
  type ClientSubscribeFlags = typingsSlinky.hapiNes.clientMod.Client.ClientSubscribeFlags
  type Handler = typingsSlinky.hapiNes.clientMod.Client.Handler
  type ServerOnSubscribe = typingsSlinky.hapiNes.mod.ServerOnSubscribeWithParams | typingsSlinky.hapiNes.mod.ServerOnSubscribeWithoutParams
  type ServerOnSubscribeWithParams = js.Function3[
    /* socket */ typingsSlinky.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    js.Promise[js.Any]
  ]
  type ServerOnSubscribeWithoutParams = js.Function2[
    /* socket */ typingsSlinky.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    js.Promise[js.Any]
  ]
  type ServerOnUnSubscribe = typingsSlinky.hapiNes.mod.ServerOnUnSubscribeWithParams | typingsSlinky.hapiNes.mod.ServerOnUnSubscribeWithoutParams
  type ServerOnUnSubscribeWithParams = js.Function3[
    /* socket */ typingsSlinky.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    scala.Unit
  ]
  type ServerOnUnSubscribeWithoutParams = js.Function2[
    /* socket */ typingsSlinky.hapiNes.mod.Socket, 
    /* path */ java.lang.String, 
    scala.Unit
  ]
}
