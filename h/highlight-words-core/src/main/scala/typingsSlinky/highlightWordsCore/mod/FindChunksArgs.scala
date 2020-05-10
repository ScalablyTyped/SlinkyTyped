package typingsSlinky.highlightWordsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindChunksArgs extends js.Object {
  var autoEscape: js.UndefOr[Boolean] = js.native
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  var searchWords: js.Array[String] = js.native
  var textToHighlight: String = js.native
}

object FindChunksArgs {
  @scala.inline
  def apply(searchWords: js.Array[String], textToHighlight: String): FindChunksArgs = {
    val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindChunksArgs]
  }
  @scala.inline
  implicit class FindChunksArgsOps[Self <: FindChunksArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearchWords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextToHighlight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textToHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoEscape(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEscape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoEscape")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withSanitize(value: /* text */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSanitize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(js.undefined)
        ret
    }
  }
  
}

