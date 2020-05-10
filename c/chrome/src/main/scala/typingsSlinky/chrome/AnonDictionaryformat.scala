package typingsSlinky.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictionaryformat extends js.Object {
  var dictionary_format: js.UndefOr[String] = js.native
  var dictionary_language: js.UndefOr[String] = js.native
  var dictionary_locale: js.UndefOr[String] = js.native
  var dictionary_path: js.UndefOr[String] = js.native
}

object AnonDictionaryformat {
  @scala.inline
  def apply(): AnonDictionaryformat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictionaryformat]
  }
  @scala.inline
  implicit class AnonDictionaryformatOps[Self <: AnonDictionaryformat] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDictionary_format(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionary_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_format")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionary_language(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionary_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_language")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionary_locale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionary_locale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_locale")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionary_path(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionary_path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary_path")(js.undefined)
        ret
    }
  }
  
}

