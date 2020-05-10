package typingsSlinky.nivoCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorProps[T] extends js.Object {
  var colorBy: js.UndefOr[String | GetColor[T]] = js.native
  var colors: js.UndefOr[Colors] = js.native
}

object ColorProps {
  @scala.inline
  def apply[T](): ColorProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProps[T]]
  }
  @scala.inline
  implicit class ColorPropsOps[Self[t] <: ColorProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withColorByFunction1(value: T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColorBy(value: String | GetColor[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorBy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorBy")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: Colors): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
  }
  
}

