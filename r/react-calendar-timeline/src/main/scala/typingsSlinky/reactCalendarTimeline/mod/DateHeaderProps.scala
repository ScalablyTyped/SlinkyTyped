package typingsSlinky.reactCalendarTimeline.mod

import slinky.core.TagMod
import typingsSlinky.moment.mod.Moment
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.primaryHeader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateHeaderProps[Data] extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ SidebarHeaderChildrenFnProps[Data], TagMod[Any]]] = js.native
  var className: js.UndefOr[String] = js.native
  var headerData: js.UndefOr[Data] = js.native
  var height: js.UndefOr[Double] = js.native
  var intervalRenderer: js.UndefOr[js.Function1[/* props */ js.UndefOr[IntervalRenderer[Data]], TagMod[Any]]] = js.native
  var labelFormat: js.UndefOr[
    String | (js.Function3[
      /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
      /* unit */ Unit, 
      /* labelWidth */ Double, 
      String
    ])
  ] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var unit: js.UndefOr[Unit | primaryHeader] = js.native
}

object DateHeaderProps {
  @scala.inline
  def apply[Data](): DateHeaderProps[Data] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateHeaderProps[Data]]
  }
  @scala.inline
  implicit class DateHeaderPropsOps[Self[data] <: DateHeaderProps[data], Data] (val x: Self[Data]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Data] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Data]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Data] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Data] with Other]
    @scala.inline
    def withChildren(value: /* props */ SidebarHeaderChildrenFnProps[Data] => TagMod[Any]): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderData(value: Data): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderData: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerData")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIntervalRenderer(value: /* props */ js.UndefOr[IntervalRenderer[Data]] => TagMod[Any]): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIntervalRenderer: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intervalRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelFormatFunction3(
      value: (/* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], /* unit */ Unit, /* labelWidth */ Double) => String
    ): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withLabelFormat(
      value: String | (js.Function3[
          /* hasStartTimeEndTime */ js.Tuple2[Moment, Moment], 
          /* unit */ Unit, 
          /* labelWidth */ Double, 
          String
        ])
    ): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFormat: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: Unit | primaryHeader): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

