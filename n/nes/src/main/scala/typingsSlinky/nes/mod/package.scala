package typingsSlinky.nes

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
  type Client = typingsSlinky.nes.clientMod.^
  type ClientConnectOptions = typingsSlinky.nes.clientMod.ClientConnectOptions
  type ClientOptions = typingsSlinky.nes.clientMod.ClientOptions
  type ClientRequestOptions = typingsSlinky.nes.clientMod.ClientRequestOptions
  type ClientSubscribeFlags = typingsSlinky.nes.clientMod.ClientSubscribeFlags
  type Handler = typingsSlinky.nes.clientMod.Handler
  type ServerOnSubscribeWithParams = js.Function3[
    /* socket */ typingsSlinky.nes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    js.Promise[js.Any]
  ]
  type ServerOnSubscribeWithoutParams = js.Function2[
    /* socket */ typingsSlinky.nes.mod.Socket, 
    /* path */ java.lang.String, 
    js.Promise[js.Any]
  ]
  type ServerOnUnSubscribeWithParams = js.Function3[
    /* socket */ typingsSlinky.nes.mod.Socket, 
    /* path */ java.lang.String, 
    /* params */ js.Any, 
    scala.Unit
  ]
  type ServerOnUnSubscribeWithoutParams = js.Function2[/* socket */ typingsSlinky.nes.mod.Socket, /* path */ java.lang.String, scala.Unit]
}
