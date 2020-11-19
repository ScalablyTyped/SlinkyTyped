package typingsSlinky.reactInfiniteCalendar.components

import typingsSlinky.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("react-infinite-calendar", "Calendar")
  @js.native
  object component extends js.Object
  
  def withProps(p: ReactInfiniteCalendarProps): SharedBuilder_ReactInfiniteCalendarProps1567389525[typingsSlinky.reactInfiniteCalendar.mod.Calendar] = new SharedBuilder_ReactInfiniteCalendarProps1567389525[typingsSlinky.reactInfiniteCalendar.mod.Calendar](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Calendar.type): SharedBuilder_ReactInfiniteCalendarProps1567389525[typingsSlinky.reactInfiniteCalendar.mod.Calendar] = new SharedBuilder_ReactInfiniteCalendarProps1567389525[typingsSlinky.reactInfiniteCalendar.mod.Calendar](js.Array(this.component, js.Dictionary.empty))()
}
