package typingsSlinky.oracleOraclejet.ojformlayoutMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.column
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.row
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.top
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.truncate
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.wrap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojformlayout.ojFormLayoutSettableProperties> */
trait ojFormLayoutSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var direction: js.UndefOr[column | row] = js.undefined
  var labelEdge: js.UndefOr[start | top] = js.undefined
  var labelWidth: js.UndefOr[String] = js.undefined
  var labelWrapping: js.UndefOr[truncate | wrap] = js.undefined
  var maxColumns: js.UndefOr[Double] = js.undefined
}

object ojFormLayoutSettablePropertiesLenient {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    direction: column | row = null,
    labelEdge: start | top = null,
    labelWidth: String = null,
    labelWrapping: truncate | wrap = null,
    maxColumns: js.UndefOr[Double] = js.undefined
  ): ojFormLayoutSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (labelEdge != null) __obj.updateDynamic("labelEdge")(labelEdge.asInstanceOf[js.Any])
    if (labelWidth != null) __obj.updateDynamic("labelWidth")(labelWidth.asInstanceOf[js.Any])
    if (labelWrapping != null) __obj.updateDynamic("labelWrapping")(labelWrapping.asInstanceOf[js.Any])
    if (!js.isUndefined(maxColumns)) __obj.updateDynamic("maxColumns")(maxColumns.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFormLayoutSettablePropertiesLenient]
  }
}

