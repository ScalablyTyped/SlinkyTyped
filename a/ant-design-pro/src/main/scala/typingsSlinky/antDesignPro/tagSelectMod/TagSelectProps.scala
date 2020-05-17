package typingsSlinky.antDesignPro.tagSelectMod

import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.anon.CollapseText
import typingsSlinky.antDesignPro.tagSelectOptionMod.TagSelectOptionProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagSelectProps extends js.Object {
  var Option: TagSelectOptionProps = js.native
  var actionsText: js.UndefOr[CollapseText] = js.native
  var children: ReactElement | js.Array[ReactElement] = js.native
  var className: String = js.native
  var expandable: js.UndefOr[Boolean] = js.native
  var hideCheckAll: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[String], Unit]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var value: js.UndefOr[js.Array[Double | String]] = js.native
}

object TagSelectProps {
  @scala.inline
  def apply(Option: TagSelectOptionProps, children: ReactElement | js.Array[ReactElement], className: String): TagSelectProps = {
    val __obj = js.Dynamic.literal(Option = Option.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagSelectProps]
  }
  @scala.inline
  implicit class TagSelectPropsOps[Self <: TagSelectProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOption(value: TagSelectOptionProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: ReactElement | js.Array[ReactElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionsText(value: CollapseText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionsText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionsText")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandable")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCheckAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCheckAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCheckAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCheckAll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* value */ js.Array[String] => Unit): Self = {
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
    def withValue(value: js.Array[Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

