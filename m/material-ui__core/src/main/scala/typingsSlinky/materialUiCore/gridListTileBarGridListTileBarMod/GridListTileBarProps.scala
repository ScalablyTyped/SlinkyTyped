package typingsSlinky.materialUiCore.gridListTileBarGridListTileBarMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiCore.anon.PartialClassNameMapGridLiActionIcon
import typingsSlinky.materialUiCore.materialUiCoreStrings.bottom
import typingsSlinky.materialUiCore.materialUiCoreStrings.left
import typingsSlinky.materialUiCore.materialUiCoreStrings.right
import typingsSlinky.materialUiCore.materialUiCoreStrings.top
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/GridListTileBar/GridListTileBar.GridListTileBarClassKey, never> */
@js.native
trait GridListTileBarProps extends js.Object {
  var actionIcon: js.UndefOr[TagMod[Any]] = js.native
  var actionPosition: js.UndefOr[left | right] = js.native
  var className: js.UndefOr[String] = js.native
  var classes: js.UndefOr[PartialClassNameMapGridLiActionIcon] = js.native
  var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var subtitle: js.UndefOr[TagMod[Any]] = js.native
  var title: js.UndefOr[TagMod[Any]] = js.native
  var titlePosition: js.UndefOr[top | bottom] = js.native
}

object GridListTileBarProps {
  @scala.inline
  def apply(): GridListTileBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridListTileBarProps]
  }
  @scala.inline
  implicit class GridListTileBarPropsOps[Self <: GridListTileBarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionIconReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionIcon(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withActionPosition(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionPosition")(js.undefined)
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
    def withClasses(value: PartialClassNameMapGridLiActionIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerRef(value: Ref[_] | ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(null)
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
    def withSubtitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
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
    def withTitlePosition(value: top | bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitlePosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titlePosition")(js.undefined)
        ret
    }
  }
  
}

