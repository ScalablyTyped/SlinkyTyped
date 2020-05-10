package typingsSlinky.reactMotion.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transition properties
  */
@js.native
trait TransitionProps extends js.Object {
  var children: js.UndefOr[
    js.Function1[/* interpolatedStyles */ js.Array[TransitionPlainStyle], ReactElement]
  ] = js.native
  /**
    * Default styles on first render
    */
  var defaultStyles: js.UndefOr[js.Array[TransitionPlainStyle]] = js.native
  /**
    * Triggers when an element has disappeared
    * @param styleThatLeft
    */
  var didLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, Unit]] = js.native
  /**
    * Styles to interpolate. Accepts array of TransitionStyle objects or interpolated function similar as for
    * <StaggeredMotion/>
    */
  var styles: js.Array[TransitionStyle] | InterpolateFunction = js.native
  /**
    * Triggers when a new element will appear
    * @param styleThatEntered
    */
  var willEnter: js.UndefOr[js.Function1[/* styleThatEntered */ TransitionStyle, PlainStyle]] = js.native
  /**
    * Triggers when an element will disappear
    * @param styleThatLeft
    */
  var willLeave: js.UndefOr[js.Function1[/* styleThatLeft */ TransitionStyle, Style | Unit]] = js.native
}

object TransitionProps {
  @scala.inline
  def apply(styles: js.Array[TransitionStyle] | InterpolateFunction): TransitionProps = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionProps]
  }
  @scala.inline
  implicit class TransitionPropsOps[Self <: TransitionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStylesFunction1(
      value: /* previousInterpolatedStyles */ js.UndefOr[js.Array[TransitionPlainStyle]] => js.Array[TransitionStyle]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[TransitionStyle] | InterpolateFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: /* interpolatedStyles */ js.Array[TransitionPlainStyle] => ReactElement): Self = {
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
    def withDefaultStyles(value: js.Array[TransitionPlainStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDidLeave(value: /* styleThatLeft */ TransitionStyle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDidLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("didLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withWillEnter(value: /* styleThatEntered */ TransitionStyle => PlainStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWillEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withWillLeave(value: /* styleThatLeft */ TransitionStyle => Style | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutWillLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willLeave")(js.undefined)
        ret
    }
  }
  
}

