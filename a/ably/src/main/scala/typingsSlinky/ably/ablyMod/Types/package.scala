package typingsSlinky.ably.ablyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Types {
  import typingsSlinky.ably.ablyMod.Types.ChannelEvent.ATTACHED
  import typingsSlinky.ably.ablyMod.Types.ChannelEvent.ATTACHING
  import typingsSlinky.ably.ablyMod.Types.ChannelEvent.DETACHED
  import typingsSlinky.ably.ablyMod.Types.ChannelEvent.DETACHING
  import typingsSlinky.ably.ablyMod.Types.ChannelEvent.FAILED
  import typingsSlinky.ably.ablyMod.Types.ChannelEvent.INITIALIZED
  import typingsSlinky.ably.ablyMod.Types.ChannelEvent.SUSPENDED
  import typingsSlinky.ably.ablyMod.Types.ChannelEvent.UPDATE
  import typingsSlinky.ably.ablyMod.Types.ConnectionEvent.CLOSED
  import typingsSlinky.ably.ablyMod.Types.ConnectionEvent.CLOSING
  import typingsSlinky.ably.ablyMod.Types.ConnectionEvent.CONNECTED
  import typingsSlinky.ably.ablyMod.Types.ConnectionEvent.CONNECTING
  import typingsSlinky.ably.ablyMod.Types.ConnectionEvent.DISCONNECTED
  import typingsSlinky.ably.ablyMod.Types.HTTPMethods.GET
  import typingsSlinky.ably.ablyMod.Types.HTTPMethods.POST
  import typingsSlinky.ably.ablyMod.Types.PresenceAction.ABSENT
  import typingsSlinky.ably.ablyMod.Types.PresenceAction.ENTER
  import typingsSlinky.ably.ablyMod.Types.PresenceAction.LEAVE
  import typingsSlinky.ably.ablyMod.Types.PresenceAction.PRESENT
  import typingsSlinky.ably.ablyMod.Types.StatsIntervalGranularity.DAY
  import typingsSlinky.ably.ablyMod.Types.StatsIntervalGranularity.HOUR
  import typingsSlinky.ably.ablyMod.Types.StatsIntervalGranularity.MINUTE
  import typingsSlinky.ably.ablyMod.Types.StatsIntervalGranularity.MONTH

  type ChannelEvent = FAILED | INITIALIZED | SUSPENDED | ATTACHED | ATTACHING | DETACHED | DETACHING | UPDATE
  type ChannelState = typingsSlinky.ably.ablyMod.Types.ChannelState.FAILED | typingsSlinky.ably.ablyMod.Types.ChannelState.INITIALIZED | typingsSlinky.ably.ablyMod.Types.ChannelState.SUSPENDED | typingsSlinky.ably.ablyMod.Types.ChannelState.ATTACHED | typingsSlinky.ably.ablyMod.Types.ChannelState.ATTACHING | typingsSlinky.ably.ablyMod.Types.ChannelState.DETACHED | typingsSlinky.ably.ablyMod.Types.ChannelState.DETACHING
  type ConnectionEvent = typingsSlinky.ably.ablyMod.Types.ConnectionEvent.INITIALIZED | CONNECTED | CONNECTING | DISCONNECTED | typingsSlinky.ably.ablyMod.Types.ConnectionEvent.SUSPENDED | CLOSED | CLOSING | typingsSlinky.ably.ablyMod.Types.ConnectionEvent.FAILED | typingsSlinky.ably.ablyMod.Types.ConnectionEvent.UPDATE
  type ConnectionState = typingsSlinky.ably.ablyMod.Types.ConnectionState.INITIALIZED | typingsSlinky.ably.ablyMod.Types.ConnectionState.CONNECTED | typingsSlinky.ably.ablyMod.Types.ConnectionState.CONNECTING | typingsSlinky.ably.ablyMod.Types.ConnectionState.DISCONNECTED | typingsSlinky.ably.ablyMod.Types.ConnectionState.SUSPENDED | typingsSlinky.ably.ablyMod.Types.ConnectionState.CLOSED | typingsSlinky.ably.ablyMod.Types.ConnectionState.CLOSING | typingsSlinky.ably.ablyMod.Types.ConnectionState.FAILED
  type HTTPMethods = GET | POST
  type PresenceAction = ABSENT | PRESENT | ENTER | LEAVE | typingsSlinky.ably.ablyMod.Types.PresenceAction.UPDATE
  type StatsIntervalGranularity = MINUTE | HOUR | DAY | MONTH
  type channelEventCallback = js.Function1[/* changeStateChange */ ChannelStateChange, Unit]
  type connectionEventCallback = js.Function1[/* connectionStateChange */ ConnectionStateChange, Unit]
  type errorCallback = js.Function1[/* error */ ErrorInfo, Unit]
  type fromEncoded[T] = js.Function2[/* JsonObject */ js.Any, /* channelOptions */ js.UndefOr[ChannelOptions], T]
  type fromEncodedArray[T] = js.Function2[
    /* JsonArray */ js.Array[js.Any], 
    /* channelOptions */ js.UndefOr[ChannelOptions], 
    js.Array[T]
  ]
  type messageCallback[T] = js.Function1[/* message */ T, Unit]
  // Common Listeners
  type paginatedResultCallback[T] = js.Function2[/* error */ ErrorInfo, /* results */ PaginatedResult[T], Unit]
  type realtimePresenceGetCallback = js.Function2[/* error */ ErrorInfo, /* messages */ js.Array[PresenceMessage], Unit]
  type standardCallback = js.Function2[/* error */ ErrorInfo, /* results */ js.Any, Unit]
  type timeCallback = js.Function2[/* error */ ErrorInfo, /* time */ Double, Unit]
  type tokenDetailsCallback = js.Function2[/* error */ ErrorInfo, /* Results */ TokenDetails, Unit]
  type tokenRequestCallback = js.Function2[/* error */ ErrorInfo, /* Results */ TokenRequest, Unit]
}
