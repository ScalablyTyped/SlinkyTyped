package typingsSlinky.reactVega.mod

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactVega.anon.Bottom
import typingsSlinky.std.Record
import typingsSlinky.vegaTypings.mod.View
import typingsSlinky.vegaTypings.runtimeMod.Item
import typingsSlinky.vegaTypings.runtimeMod.TooltipHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VegaPropsWithoutSpec extends js.Object {
  var background: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var data: js.UndefOr[Record[String, js.Array[_]]] = js.native
  var enableHover: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var logLevel: js.UndefOr[Double] = js.native
  var onNewView: js.UndefOr[js.Function1[/* view */ View, Unit]] = js.native
  var onParseError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  var padding: js.UndefOr[Double | Bottom] = js.native
  var renderer: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var tooltip: js.UndefOr[TooltipHandler] = js.native
  var width: js.UndefOr[Double] = js.native
}

object VegaPropsWithoutSpec {
  @scala.inline
  def apply(): VegaPropsWithoutSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VegaPropsWithoutSpec]
  }
  @scala.inline
  implicit class VegaPropsWithoutSpecOps[Self <: VegaPropsWithoutSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
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
    def withData(value: Record[String, js.Array[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableHover")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNewView(value: /* view */ View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnNewView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNewView")(js.undefined)
        ret
    }
    @scala.inline
    def withOnParseError(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onParseError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnParseError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onParseError")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double | Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
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
    def withTooltip(
      value: (/* handler */ js.Any, /* event */ MouseEvent, /* item */ Item[js.Any], /* value */ js.Any) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

