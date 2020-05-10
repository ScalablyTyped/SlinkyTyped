package typingsSlinky.emojiMart.nimbleEmojiIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomEmoji extends EmojiData {
  // colons is overridden by :id:
  var colons: js.UndefOr[String] = js.native
  var emoticons: js.UndefOr[js.Array[String]] = js.native
  // id is overridden by short_names[0]
  var id: js.UndefOr[String] = js.native
  var imageUrl: String = js.native
  var keywords: js.UndefOr[js.Array[String]] = js.native
  var name: String = js.native
  /** Must contain at least one name. The first name is used as the unique id. */
  var short_names: js.Array[String] = js.native
}

object CustomEmoji {
  @scala.inline
  def apply(imageUrl: String, name: String, short_names: js.Array[String]): CustomEmoji = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short_names = short_names.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEmoji]
  }
  @scala.inline
  implicit class CustomEmojiOps[Self <: CustomEmoji] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort_names(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColons(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colons")(js.undefined)
        ret
    }
    @scala.inline
    def withEmoticons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoticons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmoticons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoticons")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
  }
  
}

