package typingsSlinky.emojiMart.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.emojiMart.categoryMod.Props
import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.sharedPropsMod.CategoryName
import typingsSlinky.emojiMart.sharedPropsMod.EmojiProps
import typingsSlinky.emojiMart.sharedPropsMod.I18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Category {
  @JSImport("emoji-mart/dist-es/components", "Category")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.emojiMart.componentsMod.Category] {
    @scala.inline
    def emojisVarargs(value: (String | EmojiData)*): this.type = set("emojis", js.Array(value :_*))
    @scala.inline
    def emojis(value: js.Array[String | EmojiData]): this.type = set("emojis", value.asInstanceOf[js.Any])
    @scala.inline
    def hasStickyPosition(value: Boolean): this.type = set("hasStickyPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def recentVarargs(value: String*): this.type = set("recent", js.Array(value :_*))
    @scala.inline
    def recent(value: js.Array[String]): this.type = set("recent", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    emojiProps: EmojiProps,
    i18n: I18n,
    id: CategoryName,
    name: String,
    native: Boolean,
    perLine: Double
  ): Builder = {
    val __props = js.Dynamic.literal(emojiProps = emojiProps.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], perLine = perLine.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}

