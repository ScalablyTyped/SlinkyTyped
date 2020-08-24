package typingsSlinky.antDesignPro.exceptionMod

import slinky.core.ReactComponentClass
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
  var actions: js.UndefOr[ReactElement] = js.native
  var backText: js.UndefOr[ReactElement] = js.native
  var className: js.UndefOr[String] = js.native
  var desc: js.UndefOr[ReactElement] = js.native
  var img: js.UndefOr[String] = js.native
  var linkElement: js.UndefOr[String | ReactComponentClass[L]] = js.native
  var redirect: js.UndefOr[String] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var title: js.UndefOr[ReactElement] = js.native
  var `type`: js.UndefOr[`403` | `404` | `500`] = js.native
}

object ExceptionProps {
  @scala.inline
  def apply[L](): ExceptionProps[L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExceptionProps[L]]
  }
  @scala.inline
  implicit class ExceptionPropsOps[Self <: ExceptionProps[_], L] (val x: Self with ExceptionProps[L]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionsReactElement(value: ReactElement): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setActions(value: ReactElement): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setBackTextReactElement(value: ReactElement): Self = this.set("backText", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackText(value: ReactElement): Self = this.set("backText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackText: Self = this.set("backText", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDescReactElement(value: ReactElement): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesc(value: ReactElement): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    @scala.inline
    def setImg(value: String): Self = this.set("img", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImg: Self = this.set("img", js.undefined)
    @scala.inline
    def setLinkElementFunctionComponent(value: ReactComponentClass[L]): Self = this.set("linkElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkElementComponentClass(value: ReactComponentClass[L]): Self = this.set("linkElement", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkElement(value: String | ReactComponentClass[L]): Self = this.set("linkElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkElement: Self = this.set("linkElement", js.undefined)
    @scala.inline
    def setRedirect(value: String): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: `403` | `404` | `500`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

