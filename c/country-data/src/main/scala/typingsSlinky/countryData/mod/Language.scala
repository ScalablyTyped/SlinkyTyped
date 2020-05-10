package typingsSlinky.countryData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Language extends js.Object {
  val alpha2: String = js.native
  val alpha3: String = js.native
  val bibliographic: String = js.native
  val name: String = js.native
}

object Language {
  @scala.inline
  def apply(alpha2: String, alpha3: String, bibliographic: String, name: String): Language = {
    val __obj = js.Dynamic.literal(alpha2 = alpha2.asInstanceOf[js.Any], alpha3 = alpha3.asInstanceOf[js.Any], bibliographic = bibliographic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlpha3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBibliographic(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bibliographic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

