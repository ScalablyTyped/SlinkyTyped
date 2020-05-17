package typingsSlinky.reactOnsenui.anon

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.mod.AnimationOptions
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.ascend
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.default
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.fade
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.fall
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.lift
import typingsSlinky.reactOnsenui.reactOnsenuiStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  isOpen  :boolean,   animation ? :'default' | 'ascend' | 'lift' | 'fall' | 'fade' | 'none',   modifier ? :string,   animationOptions ? :react-onsenui.react-onsenui.AnimationOptions,   onPreShow ? :(): void,   onPostShow ? :(): void,   onPreHide ? :(): void,   onPostHide ? :(): void,   onDeviceBackButton ? :(): void} */
@js.native
trait HTMLAttributesidclassNameOnDeviceBackButton extends js.Object {
  var animation: js.UndefOr[default | ascend | lift | fall | fade | none] = js.native
  var animationOptions: js.UndefOr[AnimationOptions] = js.native
  var className: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var isOpen: Boolean = js.native
  var modifier: js.UndefOr[String] = js.native
  var onDeviceBackButton: js.UndefOr[js.Function0[Unit]] = js.native
  var onPostHide: js.UndefOr[js.Function0[Unit]] = js.native
  var onPostShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onPreHide: js.UndefOr[js.Function0[Unit]] = js.native
  var onPreShow: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object HTMLAttributesidclassNameOnDeviceBackButton {
  @scala.inline
  def apply(isOpen: Boolean): HTMLAttributesidclassNameOnDeviceBackButton = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLAttributesidclassNameOnDeviceBackButton]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameOnDeviceBackButtonOps[Self <: HTMLAttributesidclassNameOnDeviceBackButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimation(value: default | ascend | lift | fall | fade | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationOptions(value: AnimationOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOptions")(js.undefined)
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withModifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeviceBackButton(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceBackButton")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDeviceBackButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceBackButton")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPostHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPostHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPostShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPostShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPostShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPreHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPreShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPreShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPreShow")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

