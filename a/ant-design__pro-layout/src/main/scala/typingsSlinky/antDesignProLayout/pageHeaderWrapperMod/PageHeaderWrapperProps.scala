package typingsSlinky.antDesignProLayout.pageHeaderWrapperMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageHeaderProps * / any, 'title'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PageHeaderProps * / any[P]} */ @js.native
trait PageHeaderWrapperProps extends PageHeaderTabConfig {
  var content: js.UndefOr[TagMod[Any]] = js.native
  var extraContent: js.UndefOr[TagMod[Any]] = js.native
  var pageHeaderRender: js.UndefOr[js.Function1[/* props */ PageHeaderWrapperProps, TagMod[Any]]] = js.native
  var title: js.UndefOr[TagMod[Any] | `false`] = js.native
}

object PageHeaderWrapperProps {
  @scala.inline
  def apply(): PageHeaderWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHeaderWrapperProps]
  }
  @scala.inline
  implicit class PageHeaderWrapperPropsOps[Self <: PageHeaderWrapperProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraContentReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraContent(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraContent")(js.undefined)
        ret
    }
    @scala.inline
    def withPageHeaderRender(value: /* props */ PageHeaderWrapperProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeaderRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPageHeaderRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageHeaderRender")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: TagMod[Any] | `false`): Self = {
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
  }
  
}

