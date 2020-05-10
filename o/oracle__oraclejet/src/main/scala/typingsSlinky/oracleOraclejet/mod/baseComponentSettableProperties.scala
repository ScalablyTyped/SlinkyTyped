package typingsSlinky.oracleOraclejet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait baseComponentSettableProperties extends JetSettableProperties {
  var translations: js.Object | Null = js.native
}

object baseComponentSettableProperties {
  @scala.inline
  def apply(): baseComponentSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[baseComponentSettableProperties]
  }
  @scala.inline
  implicit class baseComponentSettablePropertiesOps[Self <: baseComponentSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTranslations(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslationsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(null)
        ret
    }
  }
  
}

