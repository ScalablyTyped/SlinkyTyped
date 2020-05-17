package typingsSlinky.fnandoSparkline.mod

import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineOptions
  extends SparklineNativeOptions[js.Any]
     with SparklineNonNativeOptions[js.Any] {
  /**
    * Set the cursor width. The default is 2.
    */
  var cursorwidth: js.UndefOr[Double] = js.native
  /**
    * When true, this enables the interactive mode. You don't have to set this option if you're providing a onmousemove callback.
    */
  var interactive: js.UndefOr[Boolean] = js.native
  /**
    * By setting this callback function, you'll enable the interactive mode (unless you set options.interactive to false).
    */
  var onmousemove: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * This callback function is called every time the mouse leaves the SVG area. You can use it to hide things like tooltips.
    */
  var onmouseout: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.native
  /**
    * Set the spot radius. The default is 2.
    */
  var spotRadius: js.UndefOr[Double] = js.native
}

object SparklineOptions {
  @scala.inline
  def apply(): SparklineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineOptions]
  }
  @scala.inline
  implicit class SparklineOptionsOps[Self <: SparklineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCursorwidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorwidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorwidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorwidth")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmousemove(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseout(value: /* event */ MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withSpotRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpotRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spotRadius")(js.undefined)
        ret
    }
  }
  
}

