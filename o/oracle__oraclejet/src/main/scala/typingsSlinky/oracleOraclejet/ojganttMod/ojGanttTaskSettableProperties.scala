package typingsSlinky.oracleOraclejet.ojganttMod

import typingsSlinky.oracleOraclejet.anon.End
import typingsSlinky.oracleOraclejet.anon.Value
import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.end
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.innerCenter
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.innerEnd
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.innerStart
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.milestone
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.none
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.normal
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.start
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.summary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojGanttTaskSettableProperties extends JetSettableProperties {
  var baseline: End
  var borderRadius: String
  var end: String
  var height: Double | Null
  var label: String
  var labelPosition: start | innerCenter | innerStart | innerEnd | end | none
  var labelStyle: js.Object
  var progress: Value
  var rowId: js.UndefOr[js.Any] = js.undefined
  var shortDesc: String | Null
  var start: String
  var svgClassName: String
  var svgStyle: js.Object
  var `type`: normal | milestone | summary | auto
}

object ojGanttTaskSettableProperties {
  @scala.inline
  def apply(
    baseline: End,
    borderRadius: String,
    end: String,
    label: String,
    labelPosition: start | innerCenter | innerStart | innerEnd | end | none,
    labelStyle: js.Object,
    progress: Value,
    start: String,
    svgClassName: String,
    svgStyle: js.Object,
    `type`: normal | milestone | summary | auto,
    height: Double = null.asInstanceOf[Double],
    rowId: js.Any = null,
    shortDesc: String = null
  ): ojGanttTaskSettableProperties = {
    val __obj = js.Dynamic.literal(baseline = baseline.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], svgClassName = svgClassName.asInstanceOf[js.Any], svgStyle = svgStyle.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], shortDesc = shortDesc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojGanttTaskSettableProperties]
  }
}

