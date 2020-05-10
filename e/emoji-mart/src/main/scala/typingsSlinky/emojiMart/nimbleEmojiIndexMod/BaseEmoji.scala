package typingsSlinky.emojiMart.nimbleEmojiIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseEmoji extends EmojiData {
  var colons: String = js.native
  /** Reverse mapping to keyof emoticons */
  var emoticons: js.Array[String] = js.native
  var id: String = js.native
  var name: String = js.native
  var native: String = js.native
  var skin: EmojiSkin | Null = js.native
  var unified: String = js.native
}

object BaseEmoji {
  @scala.inline
  def apply(
    colons: String,
    emoticons: js.Array[String],
    id: String,
    name: String,
    native: String,
    unified: String
  ): BaseEmoji = {
    val __obj = js.Dynamic.literal(colons = colons.asInstanceOf[js.Any], emoticons = emoticons.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseEmoji]
  }
  @scala.inline
  implicit class BaseEmojiOps[Self <: BaseEmoji] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColons(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmoticons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoticons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNative(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkin(value: EmojiSkin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkinNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin")(null)
        ret
    }
  }
  
}

