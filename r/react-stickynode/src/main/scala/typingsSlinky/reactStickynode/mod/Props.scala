package typingsSlinky.reactStickynode.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Class name to be applied to the element when the sticky state is
    * active (active by default).
    */
  var activeClass: js.UndefOr[String] = js.native
  /**
    * The offset from the top of document which release state will be
    * triggered when the bottom of the element reaches at.If it is a
    * selector to a target(via `querySelector()`), the offset will be the
    * bottom of the target.
    */
  var bottomBoundary: js.UndefOr[Double | String] = js.native
  var children: TagMod[Any] | (js.Function1[/* status */ Status, TagMod[Any]]) = js.native
  /** Enable the use of CSS3 transforms (true by default). */
  var enableTransforms: js.UndefOr[Boolean] = js.native
  /** The switch to enable or disable Sticky (true by default ). */
  var enabled: js.UndefOr[Boolean] = js.native
  /** z-index of the sticky */
  var innerZ: js.UndefOr[Double | String] = js.native
  /** Callback for when the sticky state changes. */
  var onStateChange: js.UndefOr[js.Function1[/* status */ Status, Unit]] = js.native
  /**
    * Class name to be applied to the element when the sticky state is
    * released (released by default).
    */
  var releasedClass: js.UndefOr[String] = js.native
  /**
    * Callback to indicate when the sticky plugin should freeze position
    * and ignore scroll/resize events.
    */
  var shouldFreeze: js.UndefOr[js.Function0[Boolean]] = js.native
  /**
    * The offset from the top of window where the top of the element will
    * be when sticky state is triggered(0 by default ).If it is a selector
    * to a target(via `querySelector()`), the offset will be the height of
    * the target.
    */
  var top: js.UndefOr[Double | String] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomBoundary(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* status */ Status => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any] | (js.Function1[/* status */ Status, TagMod[Any]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTransforms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTransforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTransforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTransforms")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerZ(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerZ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerZ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerZ")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStateChange(value: /* status */ Status => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withReleasedClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasedClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleasedClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releasedClass")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldFreeze(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFreeze")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutShouldFreeze: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldFreeze")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
  }
  
}

