package typingsSlinky.reactCalendarTimeline.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactCalendarTimeline.mod.TimelineHeadersProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimelineHeaders {
  @JSImport("react-calendar-timeline", "TimelineHeaders")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.TimelineHeaders] {
    @scala.inline
    def calendarHeaderClassName(value: String): this.type = set("calendarHeaderClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def calendarHeaderStyle(value: CSSProperties): this.type = set("calendarHeaderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRefRefObject(value: ReactRef[_]): this.type = set("headerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("headerRef", js.Any.fromFunction1(value))
    @scala.inline
    def headerRef(value: Ref[_]): this.type = set("headerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def headerRefNull: this.type = set("headerRef", null)
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TimelineHeadersProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TimelineHeaders.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

