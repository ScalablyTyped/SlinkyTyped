package typingsSlinky.oracleOraclejet.ojdvtBaseMod

import typingsSlinky.oracleOraclejet.anon.LabelCountWithTotal
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dvtBaseComponentSettableProperties extends baseComponentSettableProperties {
  var trackResize: on | off = js.native
  @JSName("translations")
  var translations_dvtBaseComponentSettableProperties: LabelCountWithTotal = js.native
}

object dvtBaseComponentSettableProperties {
  @scala.inline
  def apply(trackResize: on | off, translations: LabelCountWithTotal): dvtBaseComponentSettableProperties = {
    val __obj = js.Dynamic.literal(trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[dvtBaseComponentSettableProperties]
  }
  @scala.inline
  implicit class dvtBaseComponentSettablePropertiesOps[Self <: dvtBaseComponentSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackResize(value: on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: LabelCountWithTotal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

