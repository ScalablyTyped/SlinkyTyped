package typingsSlinky.heremaps.H.service.venues.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait State extends js.Object
/**
  * The state types of the H.service.venues.Service. Possible states are:
  */
@JSGlobal("H.service.venues.Service.State")
@js.native
object State extends js.Object {
  
  @js.native
  sealed trait ERROR extends State
  
  @js.native
  sealed trait INIT extends State
  
  @js.native
  sealed trait READY extends State
}
