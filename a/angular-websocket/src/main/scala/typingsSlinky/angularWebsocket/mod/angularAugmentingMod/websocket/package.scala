package typingsSlinky.angularWebsocket.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object websocket {
  
  /**
    * Creates and opens an IWebSocket instance.
    *
    * @param url url to connect to
    * @return websocket instance
    */
  type IWebSocketProvider = js.Function3[
    /* url */ java.lang.String, 
    /* protocols */ js.UndefOr[
      java.lang.String | js.Array[java.lang.String] | typingsSlinky.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
    ], 
    /* options */ js.UndefOr[
      typingsSlinky.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
    ], 
    typingsSlinky.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket
  ]
}
