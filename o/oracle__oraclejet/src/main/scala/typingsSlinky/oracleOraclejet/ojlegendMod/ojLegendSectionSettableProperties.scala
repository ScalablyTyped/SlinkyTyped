package typingsSlinky.oracleOraclejet.ojlegendMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.center
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.off
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.on
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLegendSectionSettableProperties extends JetSettableProperties {
  var collapsible: js.UndefOr[on | off] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textHalign: js.UndefOr[center | end | start] = js.undefined
  var textStyle: js.UndefOr[js.Object] = js.undefined
}

object ojLegendSectionSettableProperties {
  @scala.inline
  def apply(
    collapsible: on | off = null,
    text: String = null,
    textHalign: center | end | start = null,
    textStyle: js.Object = null
  ): ojLegendSectionSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (collapsible != null) __obj.updateDynamic("collapsible")(collapsible.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textHalign != null) __obj.updateDynamic("textHalign")(textHalign.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendSectionSettableProperties]
  }
}

