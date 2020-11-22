package typingsSlinky.libp2pGossipsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfacesMod {
  
  type MessageIdFunction = js.Function1[
    /* msg */ typingsSlinky.libp2pInterfaces.pubsubMod.InMessage, 
    js.typedarray.Uint8Array
  ]
}
