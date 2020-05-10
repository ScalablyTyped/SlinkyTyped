package typingsSlinky.ansiEscapes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnnotationOptions extends js.Object {
  /**
  		Create a "hidden" annotation.
  		Annotations created this way can be shown using the "Show Annotations" iTerm command.
  		*/
  val isHidden: js.UndefOr[Boolean] = js.native
  /**
  		Nonzero number of columns to annotate.
  		Default: The remainder of the line.
  		*/
  val length: js.UndefOr[Double] = js.native
  /**
  		Starting X coordinate.
  		Must be used with `y` and `length`.
  		Default: The cursor position
  		*/
  val x: js.UndefOr[Double] = js.native
  /**
  		Starting Y coordinate.
  		Must be used with `x` and `length`.
  		Default: Cursor position.
  		*/
  val y: js.UndefOr[Double] = js.native
}

object AnnotationOptions {
  @scala.inline
  def apply(): AnnotationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationOptions]
  }
  @scala.inline
  implicit class AnnotationOptionsOps[Self <: AnnotationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

