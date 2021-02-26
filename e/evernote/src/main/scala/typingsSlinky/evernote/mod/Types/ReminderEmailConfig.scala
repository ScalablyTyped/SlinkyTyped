package typingsSlinky.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReminderEmailConfig extends StObject
@JSImport("evernote", "Types.ReminderEmailConfig")
@js.native
object ReminderEmailConfig extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReminderEmailConfig with Double] = js.native
  
  @js.native
  sealed trait DO_NOT_SEND extends ReminderEmailConfig
  /* 1 */ val DO_NOT_SEND: typingsSlinky.evernote.mod.Types.ReminderEmailConfig.DO_NOT_SEND with Double = js.native
  
  @js.native
  sealed trait SEND_DAILY_EMAIL extends ReminderEmailConfig
  /* 2 */ val SEND_DAILY_EMAIL: typingsSlinky.evernote.mod.Types.ReminderEmailConfig.SEND_DAILY_EMAIL with Double = js.native
}
