package typingsSlinky.ably.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Types {
  type channelEventCallback = js.Function1[
    /* changeStateChange */ typingsSlinky.ably.mod.Types.ChannelStateChange, 
    scala.Unit
  ]
  type connectionEventCallback = js.Function1[
    /* connectionStateChange */ typingsSlinky.ably.mod.Types.ConnectionStateChange, 
    scala.Unit
  ]
  type errorCallback = js.Function1[/* error */ typingsSlinky.ably.mod.Types.ErrorInfo, scala.Unit]
  type fromEncoded[T] = js.Function2[
    /* JsonObject */ js.Any, 
    /* channelOptions */ js.UndefOr[typingsSlinky.ably.mod.Types.ChannelOptions], 
    T
  ]
  type fromEncodedArray[T] = js.Function2[
    /* JsonArray */ js.Array[js.Any], 
    /* channelOptions */ js.UndefOr[typingsSlinky.ably.mod.Types.ChannelOptions], 
    js.Array[T]
  ]
  type messageCallback[T] = js.Function1[/* message */ T, scala.Unit]
  // Common Listeners
  type paginatedResultCallback[T] = js.Function2[
    /* error */ typingsSlinky.ably.mod.Types.ErrorInfo, 
    /* results */ typingsSlinky.ably.mod.Types.PaginatedResult[T], 
    scala.Unit
  ]
  type realtimePresenceGetCallback = js.Function2[
    /* error */ typingsSlinky.ably.mod.Types.ErrorInfo, 
    /* messages */ js.Array[typingsSlinky.ably.mod.Types.PresenceMessage], 
    scala.Unit
  ]
  type standardCallback = js.Function2[/* error */ typingsSlinky.ably.mod.Types.ErrorInfo, /* results */ js.Any, scala.Unit]
  type timeCallback = js.Function2[
    /* error */ typingsSlinky.ably.mod.Types.ErrorInfo, 
    /* time */ scala.Double, 
    scala.Unit
  ]
  type tokenDetailsCallback = js.Function2[
    /* error */ typingsSlinky.ably.mod.Types.ErrorInfo, 
    /* Results */ typingsSlinky.ably.mod.Types.TokenDetails, 
    scala.Unit
  ]
  type tokenRequestCallback = js.Function2[
    /* error */ typingsSlinky.ably.mod.Types.ErrorInfo, 
    /* Results */ typingsSlinky.ably.mod.Types.TokenRequest, 
    scala.Unit
  ]
}
