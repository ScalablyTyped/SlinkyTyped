package typingsSlinky.reactToolbox.libProgressBarProgressBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarTheme extends js.Object {
  /**
    * Used to style the buffer element in the linear progress.
    */
  var buffer: js.UndefOr[String] = js.native
  /**
    * Used for the circle element in the circular progress.
    */
  var circle: js.UndefOr[String] = js.native
  /**
    * Used for the root element when the type is circular.
    */
  var circular: js.UndefOr[String] = js.native
  /**
    * Added to the root element if mode is indeterminate.
    */
  var indeterminate: js.UndefOr[String] = js.native
  /**
    * Used for the root element when the type is linear.
    */
  var linear: js.UndefOr[String] = js.native
  /**
    * Added to the root if the component is multicolor (circular).
    */
  var multicolor: js.UndefOr[String] = js.native
  /**
    * Used for the inner path in the circular progress.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Used to style the value element in the linear progress.
    */
  var value: js.UndefOr[String] = js.native
}

object ProgressBarTheme {
  @scala.inline
  def apply(): ProgressBarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarTheme]
  }
  @scala.inline
  implicit class ProgressBarThemeOps[Self <: ProgressBarTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffer")(js.undefined)
        ret
    }
    @scala.inline
    def withCircle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(js.undefined)
        ret
    }
    @scala.inline
    def withCircular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCircular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circular")(js.undefined)
        ret
    }
    @scala.inline
    def withIndeterminate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndeterminate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indeterminate")(js.undefined)
        ret
    }
    @scala.inline
    def withLinear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(js.undefined)
        ret
    }
    @scala.inline
    def withMulticolor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicolor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulticolor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multicolor")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

