package typingsSlinky.reactTypingAnimation.mod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypingProps extends js.Object {
  var children: TagMod[Any] = js.native
  var className: js.UndefOr[String] = js.native
  var cursor: js.UndefOr[TagMod[Any]] = js.native
  var cursorClassName: js.UndefOr[String] = js.native
  var hideCursor: js.UndefOr[Boolean] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var onAfterType: js.UndefOr[js.Function0[Unit]] = js.native
  var onBeforeType: js.UndefOr[js.Function0[Unit]] = js.native
  var onFinishedTyping: js.UndefOr[js.Function0[Unit]] = js.native
  var onStartedTyping: js.UndefOr[js.Function0[Unit]] = js.native
  var speed: js.UndefOr[Double] = js.native
  var startDelay: js.UndefOr[Double] = js.native
}

object TypingProps {
  @scala.inline
  def apply(): TypingProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypingProps]
  }
  @scala.inline
  implicit class TypingPropsOps[Self <: TypingProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
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
    def withCursorReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCursor(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
        ret
    }
    @scala.inline
    def withCursorClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursorClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursorClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCursor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCursor")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterType(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAfterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeType(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeType")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFinishedTyping(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishedTyping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnFinishedTyping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFinishedTyping")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStartedTyping(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartedTyping")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnStartedTyping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStartedTyping")(js.undefined)
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("speed")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDelay")(js.undefined)
        ret
    }
  }
  
}

