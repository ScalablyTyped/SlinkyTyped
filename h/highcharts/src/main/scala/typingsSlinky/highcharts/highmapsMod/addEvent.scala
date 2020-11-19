package typingsSlinky.highcharts.highmapsMod

import typingsSlinky.highcharts.mod.Class
import typingsSlinky.highcharts.mod.EventCallbackFunction
import typingsSlinky.highcharts.mod.EventOptionsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts/highmaps", "addEvent")
@js.native
object addEvent extends js.Object {
  
  def apply[T](el: T, `type`: String, fn: js.Function): js.Function = js.native
  def apply[T](el: T, `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def apply[T](el: T, `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def apply[T](el: T, `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
  def apply[T](el: Class[T], `type`: String, fn: js.Function): js.Function = js.native
  def apply[T](el: Class[T], `type`: String, fn: js.Function, options: EventOptionsObject): js.Function = js.native
  def apply[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T]): js.Function = js.native
  def apply[T](el: Class[T], `type`: String, fn: EventCallbackFunction[T], options: EventOptionsObject): js.Function = js.native
}
