package typingsSlinky.reactCalendarTimeline.components

import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.moment.mod.Moment
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactCalendarTimeline.mod.DateHeaderProps
import typingsSlinky.reactCalendarTimeline.mod.IntervalRenderer
import typingsSlinky.reactCalendarTimeline.mod.Unit
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.primaryHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateHeader {
  @JSImport("react-calendar-timeline", "DateHeader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[Data] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.DateHeader[js.Any]] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def headerData(value: Data): this.type = set("headerData", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def intervalRenderer(value: /* props */ js.UndefOr[IntervalRenderer[Data]] => TagMod[Any]): this.type = set("intervalRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def labelFormatFunction3(
      value: (/* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], /* unit */ Unit, /* labelWidth */ Double) => String
    ): this.type = set("labelFormat", js.Any.fromFunction3(value))
    @scala.inline
    def labelFormat(
      value: String | (js.Function3[
          /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
          /* unit */ Unit, 
          /* labelWidth */ Double, 
          String
        ])
    ): this.type = set("labelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def unit(value: Unit | primaryHeader): this.type = set("unit", value.asInstanceOf[js.Any])
  }
  
  def withProps[Data](p: DateHeaderProps[Data]): Builder[Data] = new Builder[Data](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[Data](companion: DateHeader.type): Builder[Data] = new Builder[Data](js.Array(this.component, js.Dictionary.empty))()
}

