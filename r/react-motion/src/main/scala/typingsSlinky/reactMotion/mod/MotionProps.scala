package typingsSlinky.reactMotion.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <Motion/> properties
  */
@js.native
trait MotionProps extends js.Object {
  /**
    * Callback with your interpolated styles. Must return one react element to render
    * @param interpolatedStyle
    */
  var children: js.UndefOr[js.Function1[/* interpolatedStyle */ PlainStyle, ReactElement]] = js.native
  /**
    * The default style. Being ignored on subsequent renders
    * @default Object with same keys as in style whose values are the initial numbers you're interpolating on
    */
  var defaultStyle: js.UndefOr[PlainStyle] = js.native
  /**
    * The callback that fires when the animation comes to a rest.
    */
  var onRest: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Object that maps to either number or opaque config returned by spring().
    * Must keep same keys throughout component's existence
    */
  var style: Style = js.native
}

object MotionProps {
  @scala.inline
  def apply(style: Style): MotionProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionProps]
  }
  @scala.inline
  implicit class MotionPropsOps[Self <: MotionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: /* interpolatedStyle */ PlainStyle => ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultStyle(value: PlainStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRest(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRest")(js.undefined)
        ret
    }
  }
  
}

