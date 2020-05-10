package typingsSlinky.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main language translation response message.
  */
@js.native
trait SchemaTranslationsListResponse extends js.Object {
  /**
    * Translations contains list of translation results of given text
    */
  var translations: js.UndefOr[js.Array[SchemaTranslationsResource]] = js.native
}

object SchemaTranslationsListResponse {
  @scala.inline
  def apply(): SchemaTranslationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTranslationsListResponse]
  }
  @scala.inline
  implicit class SchemaTranslationsListResponseOps[Self <: SchemaTranslationsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslations(value: js.Array[SchemaTranslationsResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

