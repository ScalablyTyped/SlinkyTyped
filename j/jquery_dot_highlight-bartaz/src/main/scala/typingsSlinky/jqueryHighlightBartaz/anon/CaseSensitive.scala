package typingsSlinky.jqueryHighlightBartaz.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var element: js.UndefOr[String] = js.native
  var wordsOnly: js.UndefOr[Boolean] = js.native
}

object CaseSensitive {
  @scala.inline
  def apply(): CaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseSensitive]
  }
  @scala.inline
  implicit class CaseSensitiveOps[Self <: CaseSensitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withWordsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordsOnly")(js.undefined)
        ret
    }
  }
  
}

