package typingsSlinky.highcharts.highmapsMod

import typingsSlinky.highcharts.mod.Dictionary
import typingsSlinky.highcharts.mod.EventCallbackFunction
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highmaps", "fireEvent")
@js.native
object fireEvent extends js.Object {
  def apply[T](el: T, `type`: String): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_]): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: js.Function): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event_): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event_, defaultFunction: js.Function): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event_, defaultFunction: EventCallbackFunction[T]): Unit = js.native
}

