package typingsSlinky.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLanguagesResource extends js.Object {
  /**
    * Supported language code, generally consisting of its ISO 639-1
    * identifier. (E.g. &#39;en&#39;, &#39;ja&#39;). In certain cases, BCP-47
    * codes including language + region identifiers are returned (e.g.
    * &#39;zh-TW&#39; and &#39;zh-CH&#39;)
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Human readable name of the language localized to the target language.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaLanguagesResource {
  @scala.inline
  def apply(): SchemaLanguagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguagesResource]
  }
  @scala.inline
  implicit class SchemaLanguagesResourceOps[Self <: SchemaLanguagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

