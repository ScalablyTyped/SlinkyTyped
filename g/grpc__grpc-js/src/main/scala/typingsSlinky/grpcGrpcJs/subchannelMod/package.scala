package typingsSlinky.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object subchannelMod {
  
  type ConnectivityStateListener = js.Function3[
    /* subchannel */ typingsSlinky.grpcGrpcJs.subchannelMod.Subchannel, 
    /* previousState */ typingsSlinky.grpcGrpcJs.channelMod.ConnectivityState, 
    /* newState */ typingsSlinky.grpcGrpcJs.channelMod.ConnectivityState, 
    scala.Unit
  ]
}
