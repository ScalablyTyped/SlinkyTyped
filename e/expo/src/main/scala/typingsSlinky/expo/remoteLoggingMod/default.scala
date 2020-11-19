package typingsSlinky.expo.remoteLoggingMod

import typingsSlinky.fbemitter.mod.EventSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo/build/logs/RemoteLogging", JSImport.Default)
@js.native
object default extends js.Object {
  
  var addTransportErrorListener: js.Function1[/* listener */ TransportErrorListener, EventSubscription] = js.native
  
  var enqueueRemoteLogAsync: js.Function3[
    /* level */ LogLevel, 
    /* additionalFields */ LogEntryFields, 
    /* data */ js.Array[_], 
    js.Promise[Unit]
  ] = js.native
}
