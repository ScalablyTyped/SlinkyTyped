package typingsSlinky.pulumiCloud.mod

import typingsSlinky.pulumiCloud.timerMod.Action
import typingsSlinky.pulumiCloud.timerMod.DailySchedule
import typingsSlinky.pulumiCloud.timerMod.HourlySchedule
import typingsSlinky.pulumiCloud.timerMod.IntervalRate
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/cloud", "timer")
@js.native
object timer extends js.Object {
  
  def cron(name: String, cronTab: String, handler: Action): Unit = js.native
  def cron(name: String, cronTab: String, handler: Action, opts: ResourceOptions): Unit = js.native
  
  def daily(name: String, handler: Action): Unit = js.native
  def daily(name: String, handler: Action, opts: ResourceOptions): Unit = js.native
  def daily(name: String, schedule: DailySchedule, handler: Action): Unit = js.native
  def daily(name: String, schedule: DailySchedule, handler: Action, opts: ResourceOptions): Unit = js.native
  
  def hourly(name: String, handler: Action): Unit = js.native
  def hourly(name: String, handler: Action, opts: ResourceOptions): Unit = js.native
  def hourly(name: String, schedule: HourlySchedule, handler: Action): Unit = js.native
  def hourly(name: String, schedule: HourlySchedule, handler: Action, opts: ResourceOptions): Unit = js.native
  
  def interval(name: String, options: IntervalRate, handler: Action): Unit = js.native
  def interval(name: String, options: IntervalRate, handler: Action, opts: ResourceOptions): Unit = js.native
}
