package typingsSlinky.dayjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayjsTimezone extends js.Object {
  
  def apply(date: ConfigType): typingsSlinky.dayjs.pluginTimezoneMod.dayjsAugmentingMod.Dayjs = js.native
  def apply(date: ConfigType, format: String, timezone: String): typingsSlinky.dayjs.pluginTimezoneMod.dayjsAugmentingMod.Dayjs = js.native
  def apply(date: ConfigType, timezone: String): typingsSlinky.dayjs.pluginTimezoneMod.dayjsAugmentingMod.Dayjs = js.native
  
  def guess(): String = js.native
  
  def setDefault(): Unit = js.native
  def setDefault(timezone: String): Unit = js.native
}
