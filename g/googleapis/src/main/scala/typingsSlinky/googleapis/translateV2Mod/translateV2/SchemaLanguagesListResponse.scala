package typingsSlinky.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLanguagesListResponse extends js.Object {
  /**
    * List of source/target languages supported by the translation API. If
    * target parameter is unspecified, the list is sorted by the ASCII code
    * point order of the language code. If target parameter is specified, the
    * list is sorted by the collation order of the language name in the target
    * language.
    */
  var languages: js.UndefOr[js.Array[SchemaLanguagesResource]] = js.native
}

object SchemaLanguagesListResponse {
  @scala.inline
  def apply(): SchemaLanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguagesListResponse]
  }
  @scala.inline
  implicit class SchemaLanguagesListResponseOps[Self <: SchemaLanguagesListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguages(value: js.Array[SchemaLanguagesResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languages")(js.undefined)
        ret
    }
  }
  
}

