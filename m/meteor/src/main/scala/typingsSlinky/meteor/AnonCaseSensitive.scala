package typingsSlinky.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCaseSensitive extends js.Object {
  @JSName("$caseSensitive")
  var $caseSensitive: js.UndefOr[Boolean] = js.native
  @JSName("$diacriticSensitive")
  var $diacriticSensitive: js.UndefOr[Boolean] = js.native
  @JSName("$language")
  var $language: js.UndefOr[String] = js.native
  @JSName("$search")
  var $search: String = js.native
}

object AnonCaseSensitive {
  @scala.inline
  def apply($search: String): AnonCaseSensitive = {
    val __obj = js.Dynamic.literal($search = $search.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCaseSensitive]
  }
  @scala.inline
  implicit class AnonCaseSensitiveOps[Self <: AnonCaseSensitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$search(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$caseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$caseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def with$diacriticSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$diacriticSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$diacriticSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$diacriticSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def with$language(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$language")(js.undefined)
        ret
    }
  }
  
}

