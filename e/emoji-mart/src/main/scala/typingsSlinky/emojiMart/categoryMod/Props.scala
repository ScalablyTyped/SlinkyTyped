package typingsSlinky.emojiMart.categoryMod

import typingsSlinky.emojiMart.nimbleEmojiIndexMod.EmojiData
import typingsSlinky.emojiMart.sharedPropsMod.CategoryName
import typingsSlinky.emojiMart.sharedPropsMod.EmojiProps
import typingsSlinky.emojiMart.sharedPropsMod.I18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  var emojiProps: EmojiProps = js.native
  var emojis: js.UndefOr[js.Array[String | EmojiData]] = js.native
  var hasStickyPosition: js.UndefOr[Boolean] = js.native
  var i18n: I18n = js.native
  var id: CategoryName = js.native
  var name: String = js.native
  var native: Boolean = js.native
  var perLine: Double = js.native
  var recent: js.UndefOr[js.Array[String]] = js.native
}

object Props {
  @scala.inline
  def apply(
    emojiProps: EmojiProps,
    i18n: I18n,
    id: CategoryName,
    name: String,
    native: Boolean,
    perLine: Double
  ): Props = {
    val __obj = js.Dynamic.literal(emojiProps = emojiProps.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any], perLine = perLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmojiProps(value: EmojiProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojiProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withI18n(value: I18n): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: CategoryName): Self = {
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
    def withNative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("native")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmojis(value: js.Array[String | EmojiData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmojis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojis")(js.undefined)
        ret
    }
    @scala.inline
    def withHasStickyPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStickyPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasStickyPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasStickyPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withRecent(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recent")(js.undefined)
        ret
    }
  }
  
}

