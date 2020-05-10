package typingsSlinky.materialUi.MaterialUI

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.DOMAttributes
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.react.mod.Props because var conflicts: children. Inlined key, ref */ @js.native
trait DialogProps
  extends DOMAttributes[js.Object] {
  /** @deprecated use a custom `actions` property instead */
  var actionFocus: js.UndefOr[String] = js.native
  var actions: js.UndefOr[js.Array[DialogAction | ReactElement]] = js.native
  var actionsContainerClassName: js.UndefOr[String] = js.native
  var actionsContainerStyle: js.UndefOr[CSSProperties] = js.native
  var autoDetectWindowHeight: js.UndefOr[Boolean] = js.native
  var autoScrollBodyContent: js.UndefOr[Boolean] = js.native
  var bodyClassName: js.UndefOr[String] = js.native
  var bodyStyle: js.UndefOr[CSSProperties] = js.native
  var className: js.UndefOr[String] = js.native
  var contentClassName: js.UndefOr[String] = js.native
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  var key: js.UndefOr[Key] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var onRequestClose: js.UndefOr[js.Function1[/* buttonClicked */ Boolean, Unit]] = js.native
  var open: Boolean = js.native
  var overlayClassName: js.UndefOr[String] = js.native
  var overlayStyle: js.UndefOr[CSSProperties] = js.native
  var paperClassName: js.UndefOr[String] = js.native
  var paperProps: js.UndefOr[js.Any] = js.native
  var ref: js.UndefOr[LegacyRef[Dialog]] = js.native
  var repositionOnUpdate: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[TagMod[Any]] = js.native
  var titleClassName: js.UndefOr[String] = js.native
  var titleStyle: js.UndefOr[CSSProperties] = js.native
}

object DialogProps {
  @scala.inline
  def apply(open: Boolean): DialogProps = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
  @scala.inline
  implicit class DialogPropsOps[Self <: DialogProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionFocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withActions(value: js.Array[DialogAction | ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withActionsContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsContainerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsContainerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withActionsContainerStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsContainerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsContainerStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsContainerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDetectWindowHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDetectWindowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDetectWindowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDetectWindowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoScrollBodyContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollBodyContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoScrollBodyContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoScrollBodyContent")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyStyle")(js.undefined)
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
    def withContentClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withContentStyle(value: CSSProperties): Self = {
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
    def withKey(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRequestClose(value: /* buttonClicked */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRequestClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlayStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlayStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlayStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPaperProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaperProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paperProps")(js.undefined)
        ret
    }
    @scala.inline
    def withRefRefObject(value: ReactRef[Dialog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefFunction1(value: /* instance */ Dialog | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRef(value: LegacyRef[Dialog]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.undefined)
        ret
    }
    @scala.inline
    def withRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(null)
        ret
    }
    @scala.inline
    def withRepositionOnUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositionOnUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositionOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositionOnUpdate")(js.undefined)
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
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleStyle")(js.undefined)
        ret
    }
  }
  
}

