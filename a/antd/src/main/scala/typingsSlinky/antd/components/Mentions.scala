package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.textarea.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.mentionsMod.MentionProps
import typingsSlinky.rcMentions.mentionsMod.Direction
import typingsSlinky.rcMentions.mentionsMod.Placement
import typingsSlinky.rcMentions.optionMod.OptionProps
import typingsSlinky.rcMentions.rcMentionsBooleans.`false`
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mentions {
  @JSImport("antd/lib/mentions", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def direction(value: Direction): this.type = set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def filterOptionFunction2(value: (/* input */ String, /* hasValue */ OptionProps) => Boolean): this.type = set("filterOption", js.Any.fromFunction2(value))
    @scala.inline
    def filterOption(value: `false` | (js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean])): this.type = set("filterOption", value.asInstanceOf[js.Any])
    @scala.inline
    def getPopupContainer(value: () => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction0(value))
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def notFoundContentReactElement(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def notFoundContent(value: ReactElement): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLTextAreaElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* text */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLTextAreaElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onSearch(value: (/* text */ String, /* prefix */ String) => Unit): this.type = set("onSearch", js.Any.fromFunction2(value))
    @scala.inline
    def onSelect(value: (/* option */ OptionProps, /* prefix */ String) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixVarargs(value: String*): this.type = set("prefix", js.Array(value :_*))
    @scala.inline
    def prefix(value: String | js.Array[String]): this.type = set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def split(value: String): this.type = set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionName(value: String): this.type = set("transitionName", value.asInstanceOf[js.Any])
    @scala.inline
    def validateSearch(value: (/* text */ String, MentionProps) => Boolean): this.type = set("validateSearch", js.Any.fromFunction2(value))
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MentionProps with RefAttributes[HTMLElement]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Mentions.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Option {
    @JSImport("antd/lib/mentions", "default.Option")
    @js.native
    object component extends js.Object
    
    def withProps(p: OptionProps): SharedBuilder_OptionProps474254931 = new SharedBuilder_OptionProps474254931(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Option.type): SharedBuilder_OptionProps474254931 = new SharedBuilder_OptionProps474254931(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

