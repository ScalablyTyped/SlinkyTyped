package typingsSlinky.reactOnsenui.anon

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  contentStyle ? :any,   modifier ? :string,   renderModal ? :(): void,   renderToolbar ? :(): void,   renderBottomToolbar ? :(): void,   renderFixed ? :(): void,   onInit ? :(): void,   onShow ? :(): void,   onHide ? :(): void} */
@js.native
trait HTMLAttributesidclassNameContentStyle extends js.Object {
  var className: js.UndefOr[String] = js.native
  var contentStyle: js.UndefOr[js.Any] = js.native
  var id: js.UndefOr[String] = js.native
  var modifier: js.UndefOr[String] = js.native
  var onHide: js.UndefOr[js.Function0[Unit]] = js.native
  var onInit: js.UndefOr[js.Function0[Unit]] = js.native
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  var renderBottomToolbar: js.UndefOr[js.Function0[Unit]] = js.native
  var renderFixed: js.UndefOr[js.Function0[Unit]] = js.native
  var renderModal: js.UndefOr[js.Function0[Unit]] = js.native
  var renderToolbar: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object HTMLAttributesidclassNameContentStyle {
  @scala.inline
  def apply(): HTMLAttributesidclassNameContentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameContentStyle]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameContentStyleOps[Self <: HTMLAttributesidclassNameContentStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withContentStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentStyle")(js.undefined)
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
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderBottomToolbar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomToolbar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderBottomToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderBottomToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderFixed(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFixed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderFixed")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderModal(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderModal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderModal")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderToolbar(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToolbar")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRenderToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderToolbar")(js.undefined)
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

