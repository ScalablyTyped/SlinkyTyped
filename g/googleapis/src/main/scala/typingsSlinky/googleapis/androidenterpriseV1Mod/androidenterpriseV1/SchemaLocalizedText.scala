package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A localized string with its locale.
  */
@js.native
trait SchemaLocalizedText extends js.Object {
  /**
    * The BCP47 tag for a locale. (e.g. &quot;en-US&quot;, &quot;de&quot;).
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The text localized in the associated locale.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaLocalizedText {
  @scala.inline
  def apply(): SchemaLocalizedText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedText]
  }
  @scala.inline
  implicit class SchemaLocalizedTextOps[Self <: SchemaLocalizedText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

