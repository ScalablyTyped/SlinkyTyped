package typingsSlinky.reactFrameComponent.mod

import org.scalajs.dom.raw.HTMLIFrameElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.IframeHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameComponentProps extends IframeHTMLAttributes[HTMLIFrameElement] {
  @JSName("children")
  var children_FrameComponentProps: TagMod[Any] = js.native
  var contentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  var contentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  var head: js.UndefOr[TagMod[Any]] = js.native
  var initialContent: js.UndefOr[String] = js.native
  var mountTarget: js.UndefOr[String] = js.native
}

object FrameComponentProps {
  @scala.inline
  def apply(): FrameComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameComponentProps]
  }
  @scala.inline
  implicit class FrameComponentPropsOps[Self <: FrameComponentProps] (val x: Self) extends AnyVal {
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
    def withContentDidMount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDidMount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutContentDidMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDidMount")(js.undefined)
        ret
    }
    @scala.inline
    def withContentDidUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDidUpdate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutContentDidUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentDidUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialContent")(js.undefined)
        ret
    }
    @scala.inline
    def withMountTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mountTarget")(js.undefined)
        ret
    }
  }
  
}

