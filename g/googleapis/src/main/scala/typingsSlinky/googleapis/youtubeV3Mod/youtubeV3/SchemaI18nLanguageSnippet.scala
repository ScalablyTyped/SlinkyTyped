package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about an i18n language, such as language code and
  * human-readable name.
  */
@js.native
trait SchemaI18nLanguageSnippet extends js.Object {
  /**
    * A short BCP-47 code that uniquely identifies a language.
    */
  var hl: js.UndefOr[String] = js.native
  /**
    * The human-readable name of the language in the language itself.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaI18nLanguageSnippet {
  @scala.inline
  def apply(): SchemaI18nLanguageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaI18nLanguageSnippet]
  }
  @scala.inline
  implicit class SchemaI18nLanguageSnippetOps[Self <: SchemaI18nLanguageSnippet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hl")(js.undefined)
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

