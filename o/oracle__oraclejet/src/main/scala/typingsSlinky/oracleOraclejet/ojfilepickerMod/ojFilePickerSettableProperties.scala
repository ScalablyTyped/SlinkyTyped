package typingsSlinky.oracleOraclejet.ojfilepickerMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.click
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.clickAndDrop
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.drop
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.multiple
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFilePickerSettableProperties extends JetSettableProperties {
  var accept: js.Array[String] | Null
  var selectOn: auto | click | drop | clickAndDrop
  var selectionMode: multiple | single
}

object ojFilePickerSettableProperties {
  @scala.inline
  def apply(
    selectOn: auto | click | drop | clickAndDrop,
    selectionMode: multiple | single,
    accept: js.Array[String] = null
  ): ojFilePickerSettableProperties = {
    val __obj = js.Dynamic.literal(selectOn = selectOn.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojFilePickerSettableProperties]
  }
}

