package typingsSlinky.oracleOraclejet.ojlabelMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.AnonDefinitionSource
import typingsSlinky.oracleOraclejet.AnonTooltipHelp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlabel.ojLabelSettableProperties> */
@js.native
trait ojLabelSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var `for`: js.UndefOr[String] = js.native
  var help: js.UndefOr[AnonDefinitionSource] = js.native
  var labelId: js.UndefOr[String] = js.native
  var showRequired: js.UndefOr[Boolean] = js.native
  var translations: js.UndefOr[AnonTooltipHelp] = js.native
}

object ojLabelSettablePropertiesLenient {
  @scala.inline
  def apply(): ojLabelSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojLabelSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojLabelSettablePropertiesLenientOps[Self <: ojLabelSettablePropertiesLenient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("for")(js.undefined)
        ret
    }
    @scala.inline
    def withHelp(value: AnonDefinitionSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelId")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslations(value: AnonTooltipHelp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translations")(js.undefined)
        ret
    }
  }
  
}

