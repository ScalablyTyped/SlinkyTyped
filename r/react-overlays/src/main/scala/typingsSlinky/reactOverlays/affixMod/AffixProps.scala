package typingsSlinky.reactOverlays.affixMod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// put AffixProps inside the exported namespace so it's importable in AutoAffix
@js.native
trait AffixProps extends js.Object {
  /**
    * CSS class or classes to apply when affixed
    */
  var affixClassName: js.UndefOr[String] = js.native
  /**
    * Style to apply when affixed
    */
  var affixStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * CSS class or classes to apply when at bottom
    */
  var bottomClassName: js.UndefOr[String] = js.native
  /**
    * Style to apply when at bottom
    */
  var bottomStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Pixels to offset from bottom of screen when calculating position
    */
  var offsetBottom: js.UndefOr[Double] = js.native
  /**
    * Pixels to offset from top of screen when calculating position
    */
  var offsetTop: js.UndefOr[Double] = js.native
  /**
    * Callback fired when the right before the `affixStyle` and `affixStyle` props are rendered
    */
  var onAffix: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback fired when the right before the `bottomStyle` and `bottomClassName` props are rendered
    */
  var onAffixBottom: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback fired when the right before the `topStyle` and `topClassName` props are rendered
    */
  var onAffixTop: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback fired after the component `affixStyle` and `affixClassName` props have been rendered.
    */
  var onAffixed: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback fired after the component `bottomStyle` and `bottomClassName` props have been rendered.
    */
  var onAffixedBottom: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Callback fired after the component `topStyle` and `topClassName` props have been rendered.
    */
  var onAffixedTop: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * CSS class or classes to apply when at top
    */
  var topClassName: js.UndefOr[String] = js.native
  /**
    * Style to apply when at top
    */
  var topStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * When affixed, pixels to offset from top of viewport
    */
  var viewportOffsetTop: js.UndefOr[Double] = js.native
}

object AffixProps {
  @scala.inline
  def apply(): AffixProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffixProps]
  }
  @scala.inline
  implicit class AffixPropsOps[Self <: AffixProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffixClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affixClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffixClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affixClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withAffixStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affixStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffixStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affixStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetBottom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAffix(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffix")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAffixBottom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffixBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAffixBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffixBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAffixTop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffixTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAffixTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffixTop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAffixed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAffixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffixed")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAffixedBottom(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffixedBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAffixedBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffixedBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAffixedTop(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffixedTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAffixedTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAffixedTop")(js.undefined)
        ret
    }
    @scala.inline
    def withTopClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTopStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withViewportOffsetTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportOffsetTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewportOffsetTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportOffsetTop")(js.undefined)
        ret
    }
  }
  
}

