package typingsSlinky.primereact.fieldsetMod

import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldsetProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var legend: js.UndefOr[js.Any] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onCollapse: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onExpand: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  var onToggle: js.UndefOr[js.Function1[/* e */ typingsSlinky.primereact.anon.Event, Unit]] = js.native
  var style: js.UndefOr[js.Object] = js.native
  var toggleable: js.UndefOr[Boolean] = js.native
}

object FieldsetProps {
  @scala.inline
  def apply(): FieldsetProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsetProps]
  }
  @scala.inline
  implicit class FieldsetPropsOps[Self <: FieldsetProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withLegend(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCollapse(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withOnExpand(value: /* event */ Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnToggle(value: /* e */ typingsSlinky.primereact.anon.Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleable")(js.undefined)
        ret
    }
  }
  
}

