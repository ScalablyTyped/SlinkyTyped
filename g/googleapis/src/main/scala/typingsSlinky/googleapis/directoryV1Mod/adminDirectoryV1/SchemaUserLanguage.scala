package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a language entry.
  */
@js.native
trait SchemaUserLanguage extends js.Object {
  /**
    * Other language. User can provide own language name if there is no
    * corresponding Google III language code. If this is set LanguageCode
    * can&#39;t be set
    */
  var customLanguage: js.UndefOr[String] = js.native
  /**
    * Language Code. Should be used for storing Google III LanguageCode string
    * representation for language. Illegal values cause SchemaException.
    */
  var languageCode: js.UndefOr[String] = js.native
}

object SchemaUserLanguage {
  @scala.inline
  def apply(): SchemaUserLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserLanguage]
  }
  @scala.inline
  implicit class SchemaUserLanguageOps[Self <: SchemaUserLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
  }
  
}

