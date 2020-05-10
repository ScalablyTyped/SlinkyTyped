package typingsSlinky.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Language Targeting.
  */
@js.native
trait SchemaLanguageTargeting extends js.Object {
  /**
    * Languages that this ad targets. For each language only languageId is
    * required. The other fields are populated automatically when the ad is
    * inserted or updated.
    */
  var languages: js.UndefOr[js.Array[SchemaLanguage]] = js.native
}

object SchemaLanguageTargeting {
  @scala.inline
  def apply(): SchemaLanguageTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguageTargeting]
  }
  @scala.inline
  implicit class SchemaLanguageTargetingOps[Self <: SchemaLanguageTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguages(value: js.Array[SchemaLanguage]): Self = {
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

