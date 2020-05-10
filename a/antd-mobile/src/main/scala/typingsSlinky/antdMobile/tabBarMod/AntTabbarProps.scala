package typingsSlinky.antdMobile.tabBarMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.tabBarPropsTypeMod.TabBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AntTabbarProps extends TabBarProps {
  var className: js.UndefOr[String] = js.native
  var hidden: js.UndefOr[Boolean] = js.native
  var noRenderContent: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[TagMod[Any]] = js.native
  var prefixCls: js.UndefOr[String] = js.native
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.native
}

object AntTabbarProps {
  @scala.inline
  def apply(): AntTabbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AntTabbarProps]
  }
  @scala.inline
  implicit class AntTabbarPropsOps[Self <: AntTabbarProps] (val x: Self) extends AnyVal {
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
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withNoRenderContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRenderContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoRenderContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noRenderContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholderReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaceholder(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
    @scala.inline
    def withPrerenderingSiblingsNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerenderingSiblingsNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrerenderingSiblingsNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prerenderingSiblingsNumber")(js.undefined)
        ret
    }
  }
  
}

