package typingsSlinky.reactTether.mod.ReactTether

import org.scalajs.dom.raw.Element
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Props
import typingsSlinky.reactTether.mod.TetherComponent
import typingsSlinky.tether.mod.ITetherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TetherComponentProps
  extends Props[TetherComponent]
     with ITetherOptions {
  var className: js.UndefOr[String] = js.native
  @JSName("constraints")
  var constraints_TetherComponentProps: js.UndefOr[js.Array[Constraints]] = js.native
  var id: js.UndefOr[String] = js.native
  var onRepositioned: js.UndefOr[js.Function0[Unit]] = js.native
  var onUpdate: js.UndefOr[js.Function1[/* data */ UpdateEventData, Unit]] = js.native
  var renderElement: js.UndefOr[RenderProp] = js.native
  var renderElementTag: js.UndefOr[String] = js.native
  var renderElementTo: js.UndefOr[Element | String] = js.native
  var renderTarget: js.UndefOr[RenderProp] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TetherComponentProps {
  @scala.inline
  def apply(attachment: String): TetherComponentProps = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetherComponentProps]
  }
  @scala.inline
  implicit class TetherComponentPropsOps[Self <: TetherComponentProps] (val x: Self) extends AnyVal {
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
    def withConstraints(value: js.Array[Constraints]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraints")(js.undefined)
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
    def withOnRepositioned(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRepositioned")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRepositioned: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRepositioned")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* data */ UpdateEventData => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderElement(value: /* ref */ ReactRef[Element] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderElement")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderElementTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderElementTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderElementTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderElementTag")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderElementToElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderElementTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderElementTo(value: Element | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderElementTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderElementTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderElementTo")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderTarget(value: /* ref */ ReactRef[Element] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTarget")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTarget")(js.undefined)
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

