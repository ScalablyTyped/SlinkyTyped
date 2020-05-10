package typingsSlinky.oracleOraclejet.ojprogressMod

import typingsSlinky.oracleOraclejet.AnonAriaIndeterminateProgressText
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.bar
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojProgressSettableProperties extends baseComponentSettableProperties {
  var max: Double = js.native
  @JSName("translations")
  var translations_ojProgressSettableProperties: AnonAriaIndeterminateProgressText = js.native
  var `type`: bar | circle = js.native
  var value: Double = js.native
}

object ojProgressSettableProperties {
  @scala.inline
  def apply(max: Double, translations: AnonAriaIndeterminateProgressText, `type`: bar | circle, value: Double): ojProgressSettableProperties = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressSettableProperties]
  }
  @scala.inline
  implicit class ojProgressSettablePropertiesOps[Self <: ojProgressSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonAriaIndeterminateProgressText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: bar | circle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

