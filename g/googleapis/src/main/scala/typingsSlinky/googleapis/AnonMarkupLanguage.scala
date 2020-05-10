package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMarkupLanguage extends js.Object {
  var markupLanguage: js.UndefOr[String] = js.native
  var scriptingLanguage: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object AnonMarkupLanguage {
  @scala.inline
  def apply(): AnonMarkupLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMarkupLanguage]
  }
  @scala.inline
  implicit class AnonMarkupLanguageOps[Self <: AnonMarkupLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarkupLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markupLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkupLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markupLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withScriptingLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptingLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScriptingLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scriptingLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

