package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.noticeIconTabMod.NoticeIconData
import typingsSlinky.antDesignPro.noticeIconTabMod.NoticeIconTabProps
import typingsSlinky.antDesignPro.noticeIconTabMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoticeIconTab {
  @JSImport("ant-design-pro/lib/NoticeIcon/NoticeIconTab", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def dataVarargs(value: js.Any*): this.type = set("data", js.Array(value :_*))
    @scala.inline
    def data(value: js.Array[_]): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyImage(value: String): this.type = set("emptyImage", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyTextReactElement(value: ReactElement): this.type = set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def emptyText(value: ReactElement): this.type = set("emptyText", value.asInstanceOf[js.Any])
    @scala.inline
    def listVarargs(value: NoticeIconData*): this.type = set("list", js.Array(value :_*))
    @scala.inline
    def list(value: js.Array[NoticeIconData]): this.type = set("list", value.asInstanceOf[js.Any])
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def showClear(value: Boolean): this.type = set("showClear", value.asInstanceOf[js.Any])
    @scala.inline
    def showViewMore(value: Boolean): this.type = set("showViewMore", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NoticeIconTabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(locale: js.Any, onClear: js.Any => Unit, onClick: js.Any => Unit, onViewMore: js.Any => Unit): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onClear = js.Any.fromFunction1(onClear), onClick = js.Any.fromFunction1(onClick), onViewMore = js.Any.fromFunction1(onViewMore))
    new Builder(js.Array(this.component, __props.asInstanceOf[NoticeIconTabProps]))
  }
}

