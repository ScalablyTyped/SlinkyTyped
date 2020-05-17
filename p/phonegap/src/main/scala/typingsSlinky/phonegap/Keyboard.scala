package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Keyboard extends js.Object {
  var automaticScrollToTopOnHiding: Boolean = js.native
  var isVisible: Boolean = js.native
  var onhide: js.Function = js.native
  var onhiding: js.Function = js.native
  var onshow: js.Function = js.native
  var onshowing: js.Function = js.native
  def disableScrollingInShrinkView(disable: Boolean): Unit = js.native
  def hideFormAccessoryBar(hide: Boolean): Unit = js.native
  def shrinkView(shrink: Boolean): Unit = js.native
}

object Keyboard {
  @scala.inline
  def apply(
    automaticScrollToTopOnHiding: Boolean,
    disableScrollingInShrinkView: Boolean => Unit,
    hideFormAccessoryBar: Boolean => Unit,
    isVisible: Boolean,
    onhide: js.Function,
    onhiding: js.Function,
    onshow: js.Function,
    onshowing: js.Function,
    shrinkView: Boolean => Unit
  ): Keyboard = {
    val __obj = js.Dynamic.literal(automaticScrollToTopOnHiding = automaticScrollToTopOnHiding.asInstanceOf[js.Any], disableScrollingInShrinkView = js.Any.fromFunction1(disableScrollingInShrinkView), hideFormAccessoryBar = js.Any.fromFunction1(hideFormAccessoryBar), isVisible = isVisible.asInstanceOf[js.Any], onhide = onhide.asInstanceOf[js.Any], onhiding = onhiding.asInstanceOf[js.Any], onshow = onshow.asInstanceOf[js.Any], onshowing = onshowing.asInstanceOf[js.Any], shrinkView = js.Any.fromFunction1(shrinkView))
    __obj.asInstanceOf[Keyboard]
  }
  @scala.inline
  implicit class KeyboardOps[Self <: Keyboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutomaticScrollToTopOnHiding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automaticScrollToTopOnHiding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableScrollingInShrinkView(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableScrollingInShrinkView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHideFormAccessoryBar(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideFormAccessoryBar")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnhide(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnhiding(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onhiding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnshow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnshowing(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onshowing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShrinkView(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkView")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

