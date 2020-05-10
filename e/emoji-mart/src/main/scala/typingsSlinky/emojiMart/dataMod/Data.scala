package typingsSlinky.emojiMart.dataMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  var aliases: StringDictionary[String] = js.native
  var categories: js.Array[Category] = js.native
  var compressed: Boolean = js.native
  var emojis: StringDictionary[Emoji] = js.native
}

object Data {
  @scala.inline
  def apply(
    aliases: StringDictionary[String],
    categories: js.Array[Category],
    compressed: Boolean,
    emojis: StringDictionary[Emoji]
  ): Data = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], compressed = compressed.asInstanceOf[js.Any], emojis = emojis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCategories(value: js.Array[Category]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompressed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compressed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmojis(value: StringDictionary[Emoji]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emojis")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

