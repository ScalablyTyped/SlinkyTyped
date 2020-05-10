package typingsSlinky.oracleOraclejet.ojlabelMod

import typingsSlinky.oracleOraclejet.AnonDefinitionSource
import typingsSlinky.oracleOraclejet.AnonTooltipHelp
import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojLabelSettableProperties extends baseComponentSettableProperties {
  var `for`: String | Null = js.native
  var help: AnonDefinitionSource = js.native
  var labelId: String | Null = js.native
  var showRequired: Boolean | Null = js.native
  @JSName("translations")
  var translations_ojLabelSettableProperties: AnonTooltipHelp = js.native
}

object ojLabelSettableProperties {
  @scala.inline
  def apply(help: AnonDefinitionSource, translations: AnonTooltipHelp): ojLabelSettableProperties = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLabelSettableProperties]
  }
  @scala.inline
  implicit class ojLabelSettablePropertiesOps[Self <: ojLabelSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHelp(value: AnonDefinitionSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslations(value: AnonTooltipHelp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(null)
        ret
    }
    @scala.inline
    def withLabelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelIdNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelId")(null)
        ret
    }
    @scala.inline
    def withShowRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowRequiredNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRequired")(null)
        ret
    }
  }
  
}

