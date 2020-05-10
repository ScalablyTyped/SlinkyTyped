package typingsSlinky.parse.mod._Global_.Parse.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// According to https://parseplatform.org/Parse-SDK-JS/api/2.1.0/Parse.Query.html#fullText
@js.native
trait FullTextOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var diacriticSensitive: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
}

object FullTextOptions {
  @scala.inline
  def apply(): FullTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullTextOptions]
  }
  @scala.inline
  implicit class FullTextOptionsOps[Self <: FullTextOptions] (val x: Self) extends AnyVal {
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
    def withDiacriticSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diacriticSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiacriticSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diacriticSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

