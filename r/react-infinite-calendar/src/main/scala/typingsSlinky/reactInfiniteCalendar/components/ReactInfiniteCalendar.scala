package typingsSlinky.reactInfiniteCalendar.components

import typingsSlinky.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps
import typingsSlinky.reactInfiniteCalendar.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactInfiniteCalendar {
  @JSImport("react-infinite-calendar", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ReactInfiniteCalendarProps): SharedBuilder_ReactInfiniteCalendarProps1567389525[default] = new SharedBuilder_ReactInfiniteCalendarProps1567389525[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactInfiniteCalendar.type): SharedBuilder_ReactInfiniteCalendarProps1567389525[default] = new SharedBuilder_ReactInfiniteCalendarProps1567389525[default](js.Array(this.component, js.Dictionary.empty))()
}

