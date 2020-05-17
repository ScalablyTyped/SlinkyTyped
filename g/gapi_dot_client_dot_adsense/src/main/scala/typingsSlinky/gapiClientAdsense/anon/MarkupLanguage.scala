package typingsSlinky.gapiClientAdsense.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkupLanguage extends js.Object {
  /** The markup language to use for this ad unit. */
  var markupLanguage: js.UndefOr[String] = js.native
  /** The scripting language to use for this ad unit. */
  var scriptingLanguage: js.UndefOr[String] = js.native
  /** Size of this ad unit. */
  var size: js.UndefOr[String] = js.native
  /** Type of this ad unit. */
  var `type`: js.UndefOr[String] = js.native
}

object MarkupLanguage {
  @scala.inline
  def apply(): MarkupLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkupLanguage]
  }
  @scala.inline
  implicit class MarkupLanguageOps[Self <: MarkupLanguage] (val x: Self) extends AnyVal {
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

