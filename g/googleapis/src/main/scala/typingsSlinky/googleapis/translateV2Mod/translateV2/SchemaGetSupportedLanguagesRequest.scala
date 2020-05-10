package typingsSlinky.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request message for discovering supported languages.
  */
@js.native
trait SchemaGetSupportedLanguagesRequest extends js.Object {
  /**
    * The language to use to return localized, human readable names of
    * supported languages.
    */
  var target: js.UndefOr[String] = js.native
}

object SchemaGetSupportedLanguagesRequest {
  @scala.inline
  def apply(): SchemaGetSupportedLanguagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetSupportedLanguagesRequest]
  }
  @scala.inline
  implicit class SchemaGetSupportedLanguagesRequestOps[Self <: SchemaGetSupportedLanguagesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

