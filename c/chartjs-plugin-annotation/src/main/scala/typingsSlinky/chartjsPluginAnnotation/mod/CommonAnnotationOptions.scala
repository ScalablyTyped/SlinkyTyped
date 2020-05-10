package typingsSlinky.chartjsPluginAnnotation.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.box
import typingsSlinky.chartjsPluginAnnotation.chartjsPluginAnnotationStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonAnnotationOptions extends js.Object {
  var drawTime: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
  ] = js.native
  var id: js.UndefOr[String] = js.native
  var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onContextmenu: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onDblclick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMousedown: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseenter: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseleave: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMousemove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseout: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseover: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onMouseup: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var onWheel: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  var `type`: line | box = js.native
}

object CommonAnnotationOptions {
  @scala.inline
  def apply(`type`: line | box): CommonAnnotationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonAnnotationOptions]
  }
  @scala.inline
  implicit class CommonAnnotationOptionsOps[Self <: CommonAnnotationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: line | box): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawTime(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawTimeOptions * / any */ String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrawTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTime")(js.undefined)
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
    def withOnClick(value: /* event */ MouseEvent => Unit): Self = {
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
    def withOnContextmenu(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextmenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextmenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextmenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDblclick(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMousedown(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousedown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseenter(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseleave(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseleave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMousemove(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseout(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseover(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseup(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheel(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.undefined)
        ret
    }
  }
  
}

