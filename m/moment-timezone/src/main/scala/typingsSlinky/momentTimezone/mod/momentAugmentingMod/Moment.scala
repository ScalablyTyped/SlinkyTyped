package typingsSlinky.momentTimezone.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Moment extends js.Object {
  
  def tz(): js.UndefOr[String] = js.native
  def tz(timezone: String): typingsSlinky.moment.momentMod.Moment = js.native
  def tz(timezone: String, keepLocalTime: Boolean): typingsSlinky.moment.momentMod.Moment = js.native
  
  def zoneAbbr(): String = js.native
  
  def zoneName(): String = js.native
}
