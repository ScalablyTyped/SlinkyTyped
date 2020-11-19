package typingsSlinky.highcharts.mod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("highcharts", "fireEvent")
@js.native
object fireEvent extends js.Object {
  
  def apply[T](el: T, `type`: String): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: js.UndefOr[scala.Nothing], defaultFunction: js.Function): Unit = js.native
  def apply[T](
    el: T,
    `type`: String,
    eventArguments: js.UndefOr[scala.Nothing],
    defaultFunction: EventCallbackFunction[T]
  ): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_]): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: js.Function): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Dictionary[_], defaultFunction: EventCallbackFunction[T]): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event, defaultFunction: js.Function): Unit = js.native
  def apply[T](el: T, `type`: String, eventArguments: Event, defaultFunction: EventCallbackFunction[T]): Unit = js.native
}
