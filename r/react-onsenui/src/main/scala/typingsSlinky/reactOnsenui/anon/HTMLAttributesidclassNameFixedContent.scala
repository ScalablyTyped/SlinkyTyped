package typingsSlinky.reactOnsenui.anon

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactOnsenui.mod.PullHookChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-onsenui.react-onsenui.HTMLAttributes<'id' | 'className' | 'style'> & {  onChange ? :(e : react-onsenui.react-onsenui.PullHookChangeEvent): void,   onLoad ? :(done : (): void): void,   onPull ? :(): void,   disabled ? :boolean,   height ? :number,   thresholdHeight ? :number,   fixedContent ? :boolean} */
@js.native
trait HTMLAttributesidclassNameFixedContent extends js.Object {
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fixedContent: js.UndefOr[Boolean] = js.native
  var height: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[/* e */ PullHookChangeEvent, Unit]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* done */ js.Function0[Unit], Unit]] = js.native
  var onPull: js.UndefOr[js.Function0[Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var thresholdHeight: js.UndefOr[Double] = js.native
}

object HTMLAttributesidclassNameFixedContent {
  @scala.inline
  def apply(): HTMLAttributesidclassNameFixedContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributesidclassNameFixedContent]
  }
  @scala.inline
  implicit class HTMLAttributesidclassNameFixedContentOps[Self <: HTMLAttributesidclassNameFixedContent] (val x: Self) extends AnyVal {
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
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedContent")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
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
    def withOnChange(value: /* e */ PullHookChangeEvent => Unit): Self = {
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
    def withOnLoad(value: /* done */ js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPull(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPull")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPull")(js.undefined)
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
    @scala.inline
    def withThresholdHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdHeight")(js.undefined)
        ret
    }
  }
  
}

