package typingsSlinky.emojiMart.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emojiMart.dataMod.Data
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.CustomEmoji
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typingsSlinky.emojiMart.nimblePickerMod.NimblePickerProps
import typingsSlinky.emojiMart.nimblePickerMod.default
import typingsSlinky.emojiMart.sharedPropsMod.CategoryName
import typingsSlinky.emojiMart.sharedPropsMod.CustomIcons
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSet
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSheetSize
import typingsSlinky.emojiMart.sharedPropsMod.PartialI18n
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NimblePicker {
  @JSImport("emoji-mart/dist-es/components/picker/nimble-picker", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def backgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): this.type = set("backgroundImageFn", js.Any.fromFunction2(value))
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def custom(value: js.Array[CustomEmoji]): this.type = set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def darkMode(value: Boolean): this.type = set("darkMode", value.asInstanceOf[js.Any])
    @scala.inline
    def defaultSkin(value: EmojiSkin): this.type = set("defaultSkin", value.asInstanceOf[js.Any])
    @scala.inline
    def emoji(value: String): this.type = set("emoji", value.asInstanceOf[js.Any])
    @scala.inline
    def emojiSize(value: Double): this.type = set("emojiSize", value.asInstanceOf[js.Any])
    @scala.inline
    def emojiTooltip(value: Boolean): this.type = set("emojiTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def emojisToShowFilter(value: /* emoji */ EmojiData => Boolean): this.type = set("emojisToShowFilter", js.Any.fromFunction1(value))
    @scala.inline
    def exclude(value: js.Array[CategoryName]): this.type = set("exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def i18n(value: PartialI18n): this.type = set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def icons(value: CustomIcons): this.type = set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def include(value: js.Array[CategoryName]): this.type = set("include", value.asInstanceOf[js.Any])
    @scala.inline
    def native(value: Boolean): this.type = set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def notFound(value: () => ReactComponentClass[js.Object]): this.type = set("notFound", js.Any.fromFunction0(value))
    @scala.inline
    def notFoundEmoji(value: String): this.type = set("notFoundEmoji", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def onSelect(value: /* emoji */ EmojiData => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def onSkinChange(value: /* skin */ EmojiSkin => Unit): this.type = set("onSkinChange", js.Any.fromFunction1(value))
    @scala.inline
    def perLine(value: Double): this.type = set("perLine", value.asInstanceOf[js.Any])
    @scala.inline
    def recent(value: js.Array[String]): this.type = set("recent", value.asInstanceOf[js.Any])
    @scala.inline
    def set(value: EmojiSet): this.type = set("set", value.asInstanceOf[js.Any])
    @scala.inline
    def sheetSize(value: EmojiSheetSize): this.type = set("sheetSize", value.asInstanceOf[js.Any])
    @scala.inline
    def showPreview(value: Boolean): this.type = set("showPreview", value.asInstanceOf[js.Any])
    @scala.inline
    def showSkinTones(value: Boolean): this.type = set("showSkinTones", value.asInstanceOf[js.Any])
    @scala.inline
    def skin(value: EmojiSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def skinEmoji(value: String): this.type = set("skinEmoji", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NimblePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(data: Data): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NimblePickerProps]))
  }
}

