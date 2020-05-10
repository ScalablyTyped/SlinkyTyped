package typingsSlinky.antDesignCompatible.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignCompatible.mentionMod.MentionPlacement
import typingsSlinky.antDesignCompatible.mentionMod.MentionProps
import typingsSlinky.antDesignCompatible.mentionMod.SuggestionItme
import typingsSlinky.antDesignCompatible.mentionMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Mention {
  @JSImport("@ant-design/compatible/lib/mention", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSuggestions(value: js.Array[SuggestionItme]): this.type = set("defaultSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultValue(value: js.Any): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def getSuggestionContainer(value: /* triggerNode */ Element => HTMLElement): this.type = set("getSuggestionContainer", js.Any.fromFunction1(value))
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def multiLines(value: Boolean): this.type = set("multiLines", value.asInstanceOf[js.Any])
    @scala.inline
    def notFoundContent(value: js.Any): this.type = set("notFoundContent", value.asInstanceOf[js.Any])
    @scala.inline
    def onBlur(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onBlur", js.Any.fromFunction1(value))
    @scala.inline
    def onChange(value: /* contentState */ js.Any => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onFocus(value: SyntheticFocusEvent[HTMLElement] => Unit): this.type = set("onFocus", js.Any.fromFunction1(value))
    @scala.inline
    def onSearchChange(value: (/* value */ String, /* trigger */ String) => _): this.type = set("onSearchChange", js.Any.fromFunction2(value))
    @scala.inline
    def onSelect(value: (/* suggestion */ String, /* data */ js.UndefOr[js.Any]) => Unit): this.type = set("onSelect", js.Any.fromFunction2(value))
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def placement(value: MentionPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def prefix(value: String | js.Array[String]): this.type = set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestionStyle(value: CSSProperties): this.type = set("suggestionStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def suggestions(value: js.Array[ReactElement]): this.type = set("suggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MentionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Mention.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

