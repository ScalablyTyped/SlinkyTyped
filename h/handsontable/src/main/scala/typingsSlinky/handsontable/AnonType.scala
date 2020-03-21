package typingsSlinky.handsontable

import typingsSlinky.handsontable.handsontableStrings.average
import typingsSlinky.handsontable.handsontableStrings.count
import typingsSlinky.handsontable.handsontableStrings.max
import typingsSlinky.handsontable.handsontableStrings.min
import typingsSlinky.handsontable.handsontableStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: sum | min | max | count | average
}

object AnonType {
  @scala.inline
  def apply(`type`: sum | min | max | count | average): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

