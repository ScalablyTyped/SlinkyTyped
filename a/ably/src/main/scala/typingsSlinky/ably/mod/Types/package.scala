package typingsSlinky.ably.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Types {
  
  type CapabilityOp_ = typingsSlinky.ably.mod.Types.capabilityOp
  
  type ChannelEvent = typingsSlinky.ably.mod.Types.ChannelEvent.FAILED | typingsSlinky.ably.mod.Types.ChannelEvent.INITIALIZED | typingsSlinky.ably.mod.Types.ChannelEvent.SUSPENDED | typingsSlinky.ably.mod.Types.ChannelEvent.ATTACHED | typingsSlinky.ably.mod.Types.ChannelEvent.ATTACHING | typingsSlinky.ably.mod.Types.ChannelEvent.DETACHED | typingsSlinky.ably.mod.Types.ChannelEvent.DETACHING | typingsSlinky.ably.mod.Types.ChannelEvent.UPDATE
  
  type ChannelModes = js.Array[typingsSlinky.ably.mod.Types.ChannelMode]
  
  type ChannelParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type ChannelState = typingsSlinky.ably.mod.Types.ChannelState.FAILED | typingsSlinky.ably.mod.Types.ChannelState.INITIALIZED | typingsSlinky.ably.mod.Types.ChannelState.SUSPENDED | typingsSlinky.ably.mod.Types.ChannelState.ATTACHED | typingsSlinky.ably.mod.Types.ChannelState.ATTACHING | typingsSlinky.ably.mod.Types.ChannelState.DETACHED | typingsSlinky.ably.mod.Types.ChannelState.DETACHING
  
  type CipherKey = js.Any
  
  type CipherKeyParam = js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | java.lang.String
  
  type ConnectionEvent = typingsSlinky.ably.mod.Types.ConnectionEvent.INITIALIZED | typingsSlinky.ably.mod.Types.ConnectionEvent.CONNECTED | typingsSlinky.ably.mod.Types.ConnectionEvent.CONNECTING | typingsSlinky.ably.mod.Types.ConnectionEvent.DISCONNECTED | typingsSlinky.ably.mod.Types.ConnectionEvent.SUSPENDED | typingsSlinky.ably.mod.Types.ConnectionEvent.CLOSED | typingsSlinky.ably.mod.Types.ConnectionEvent.CLOSING | typingsSlinky.ably.mod.Types.ConnectionEvent.FAILED | typingsSlinky.ably.mod.Types.ConnectionEvent.UPDATE
  
  type ConnectionState = typingsSlinky.ably.mod.Types.ConnectionState.INITIALIZED | typingsSlinky.ably.mod.Types.ConnectionState.CONNECTED | typingsSlinky.ably.mod.Types.ConnectionState.CONNECTING | typingsSlinky.ably.mod.Types.ConnectionState.DISCONNECTED | typingsSlinky.ably.mod.Types.ConnectionState.SUSPENDED | typingsSlinky.ably.mod.Types.ConnectionState.CLOSED | typingsSlinky.ably.mod.Types.ConnectionState.CLOSING | typingsSlinky.ably.mod.Types.ConnectionState.FAILED
  
  type HTTPMethods = typingsSlinky.ably.mod.Types.HTTPMethods.GET | typingsSlinky.ably.mod.Types.HTTPMethods.POST
  
  type PresenceAction = typingsSlinky.ably.mod.Types.PresenceAction.ABSENT | typingsSlinky.ably.mod.Types.PresenceAction.PRESENT | typingsSlinky.ably.mod.Types.PresenceAction.ENTER | typingsSlinky.ably.mod.Types.PresenceAction.LEAVE | typingsSlinky.ably.mod.Types.PresenceAction.UPDATE
  
  // Common Listeners
  type StandardCallback[T] = js.Function2[
    /* err */ typingsSlinky.ably.mod.Types.ErrorInfo | scala.Null, 
    /* result */ js.UndefOr[T], 
    scala.Unit
  ]
  
  type StatsIntervalGranularity = typingsSlinky.ably.mod.Types.StatsIntervalGranularity.MINUTE | typingsSlinky.ably.mod.Types.StatsIntervalGranularity.HOUR | typingsSlinky.ably.mod.Types.StatsIntervalGranularity.DAY | typingsSlinky.ably.mod.Types.StatsIntervalGranularity.MONTH
  
  type channelEventCallback = js.Function1[
    /* changeStateChange */ typingsSlinky.ably.mod.Types.ChannelStateChange, 
    scala.Unit
  ]
  
  type connectionEventCallback = js.Function1[
    /* connectionStateChange */ typingsSlinky.ably.mod.Types.ConnectionStateChange, 
    scala.Unit
  ]
  
  type errorCallback = js.Function1[/* error */ js.UndefOr[typingsSlinky.ably.mod.Types.ErrorInfo], scala.Unit]
  
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
  
  type paginatedResultCallback[T] = typingsSlinky.ably.mod.Types.StandardCallback[typingsSlinky.ably.mod.Types.PaginatedResult[T]]
  
  type realtimePresenceGetCallback = typingsSlinky.ably.mod.Types.StandardCallback[js.Array[typingsSlinky.ably.mod.Types.PresenceMessage]]
  
  type timeCallback = typingsSlinky.ably.mod.Types.StandardCallback[scala.Double]
  
  type tokenDetailsCallback = typingsSlinky.ably.mod.Types.StandardCallback[typingsSlinky.ably.mod.Types.TokenDetails]
  
  type tokenRequestCallback = typingsSlinky.ably.mod.Types.StandardCallback[typingsSlinky.ably.mod.Types.TokenRequest]
}
