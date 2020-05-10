package typingsSlinky.oracleOraclejet.ojcollapsibleMod

import typingsSlinky.oracleOraclejet.mod.baseComponentSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disclosureIcon
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojCollapsibleSettableProperties extends baseComponentSettableProperties {
  var disabled: Boolean = js.native
  var expandArea: header | disclosureIcon = js.native
  var expanded: Boolean = js.native
}

object ojCollapsibleSettableProperties {
  @scala.inline
  def apply(disabled: Boolean, expandArea: header | disclosureIcon, expanded: Boolean): ojCollapsibleSettableProperties = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], expandArea = expandArea.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojCollapsibleSettableProperties]
  }
  @scala.inline
  implicit class ojCollapsibleSettablePropertiesOps[Self <: ojCollapsibleSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandArea(value: header | disclosureIcon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expanded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

