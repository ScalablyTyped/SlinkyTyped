package typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventTypes extends js.Object

@JSImport("alexa-voice-service", "EventTypes")
@js.native
object EventTypes extends js.Object {
  @js.native
  sealed trait ERROR extends EventTypes
  
  @js.native
  sealed trait LOG extends EventTypes
  
  @js.native
  sealed trait LOGIN extends EventTypes
  
  @js.native
  sealed trait LOGOUT extends EventTypes
  
  @js.native
  sealed trait RECORD_START extends EventTypes
  
  @js.native
  sealed trait RECORD_STOP extends EventTypes
  
  @js.native
  sealed trait REFRESH_TOKEN_SET extends EventTypes
  
  @js.native
  sealed trait TOKEN_INVALID extends EventTypes
  
  @js.native
  sealed trait TOKEN_SET extends EventTypes
  
  /* 2 */ val ERROR: typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.EventTypes.ERROR with Double = js.native
  /* 4 */ val LOG: typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.EventTypes.LOG with Double = js.native
  /* 5 */ val LOGIN: typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.EventTypes.LOGIN with Double = js.native
  /* 6 */ val LOGOUT: typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.EventTypes.LOGOUT with Double = js.native
  /* 1 */ val RECORD_START: typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.EventTypes.RECORD_START with Double = js.native
  /* 0 */ val RECORD_STOP: typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.EventTypes.RECORD_STOP with Double = js.native
  /* 8 */ val REFRESH_TOKEN_SET: typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.EventTypes.REFRESH_TOKEN_SET with Double = js.native
  /* 3 */ val TOKEN_INVALID: typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.EventTypes.TOKEN_INVALID with Double = js.native
  /* 7 */ val TOKEN_SET: typingsSlinky.alexaDashVoiceDashService.alexaDashVoiceDashServiceMod.EventTypes.TOKEN_SET with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypes with Double] = js.native
}

