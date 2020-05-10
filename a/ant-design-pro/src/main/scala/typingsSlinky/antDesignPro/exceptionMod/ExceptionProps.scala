package typingsSlinky.antDesignPro.exceptionMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.antDesignPro.antDesignProStrings.`403`
import typingsSlinky.antDesignPro.antDesignProStrings.`404`
import typingsSlinky.antDesignPro.antDesignProStrings.`500`
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExceptionProps[L] extends js.Object {
  var actions: js.UndefOr[TagMod[Any]] = js.native
  var backText: js.UndefOr[TagMod[Any]] = js.native
  var className: js.UndefOr[String] = js.native
  var desc: js.UndefOr[TagMod[Any]] = js.native
  var img: js.UndefOr[String] = js.native
  var linkElement: js.UndefOr[String | ReactComponentClass[L]] = js.native
  var redirect: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[TagMod[Any]] = js.native
  var `type`: js.UndefOr[`403` | `404` | `500`] = js.native
}

object ExceptionProps {
  @scala.inline
  def apply[L](): ExceptionProps[L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExceptionProps[L]]
  }
  @scala.inline
  implicit class ExceptionPropsOps[Self[l] <: ExceptionProps[l], L] (val x: Self[L]) extends AnyVal {
    @scala.inline
    def duplicate: Self[L] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[L]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[L] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[L] with Other]
    @scala.inline
    def withActionsReactElement(value: ReactElement): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: TagMod[Any]): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withBackTextReactElement(value: ReactElement): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackText(value: TagMod[Any]): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackText: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backText")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDescReactElement(value: ReactElement): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesc(value: TagMod[Any]): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
    @scala.inline
    def withImg(value: String): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImg: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkElementFunctionComponent(value: ReactComponentClass[L]): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkElementComponentClass(value: ReactComponentClass[L]): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkElement(value: String | ReactComponentClass[L]): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkElement: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkElement")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirect(value: String): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirect: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirect")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: TagMod[Any]): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: `403` | `404` | `500`): Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self[L] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

