package typingsSlinky.blueprintjsCore.multiSliderMod

import typingsSlinky.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMultiSliderProps extends ISliderBaseProps {
  /** Default intent of a track segment, used only if no handle specifies `intentBefore/After`. */
  var defaultTrackIntent: js.UndefOr[Intent] = js.native
  /** Callback invoked when a handle value changes. Receives handle values in sorted order. */
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
  /** Callback invoked when a handle is released. Receives handle values in sorted order. */
  var onRelease: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.native
}

object IMultiSliderProps {
  @scala.inline
  def apply(): IMultiSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMultiSliderProps]
  }
  @scala.inline
  implicit class IMultiSliderPropsOps[Self <: IMultiSliderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultTrackIntent(value: Intent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTrackIntent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTrackIntent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTrackIntent")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* values */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRelease(value: /* values */ js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRelease: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRelease")(js.undefined)
        ret
    }
  }
  
}

