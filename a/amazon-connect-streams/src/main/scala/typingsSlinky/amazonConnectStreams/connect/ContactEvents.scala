package typingsSlinky.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactEvents extends js.Object
@JSGlobal("connect.ContactEvents")
@js.native
object ContactEvents extends js.Object {
  
  @js.native
  sealed trait ACCEPTED extends ContactEvents
  
  @js.native
  sealed trait ACW extends ContactEvents
  
  @js.native
  sealed trait CONNECTED extends ContactEvents
  
  @js.native
  sealed trait CONNECTING extends ContactEvents
  
  @js.native
  sealed trait DESTROYED extends ContactEvents
  
  @js.native
  sealed trait ENDED extends ContactEvents
  
  @js.native
  sealed trait ERROR extends ContactEvents
  
  @js.native
  sealed trait INCOMING extends ContactEvents
  
  @js.native
  sealed trait INIT extends ContactEvents
  
  @js.native
  sealed trait MISSED extends ContactEvents
  
  @js.native
  sealed trait PENDING extends ContactEvents
  
  @js.native
  sealed trait REFRESH extends ContactEvents
  
  @js.native
  sealed trait VIEW extends ContactEvents
}
