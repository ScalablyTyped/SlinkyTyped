package typingsSlinky.emojiMart.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emojiMart.dataMod.Data
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typingsSlinky.emojiMart.nimbleEmojiMod.NimbleEmojiProps
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSet
import typingsSlinky.emojiMart.sharedPropsMod.EmojiSheetSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NimbleEmoji {
  
  @JSImport("emoji-mart/dist-es/components/emoji/nimble-emoji", "default")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def backgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): this.type = set("backgroundImageFn", js.Any.fromFunction2(value))
    
    @scala.inline
    def fallback(value: (/* emoji */ EmojiData, NimbleEmojiProps) => ReactComponentClass[js.Object] | ReactElement): this.type = set("fallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def forceSize(value: Boolean): this.type = set("forceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def html(value: Boolean): this.type = set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def native(value: Boolean): this.type = set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onLeave(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onLeave", js.Any.fromFunction2(value))
    
    @scala.inline
    def onOver(value: (/* emoji */ EmojiData, /* e */ SyntheticMouseEvent[HTMLElement]) => Unit): this.type = set("onOver", js.Any.fromFunction2(value))
    
    @scala.inline
    def set(value: EmojiSet): this.type = set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sheetColumns(value: Double): this.type = set("sheetColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sheetRows(value: Double): this.type = set("sheetRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sheetSize(value: EmojiSheetSize): this.type = set("sheetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def skin(value: EmojiSkin): this.type = set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tooltip(value: Boolean): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NimbleEmojiProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: Data, emoji: String | EmojiData, size: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[NimbleEmojiProps]))
  }
}
