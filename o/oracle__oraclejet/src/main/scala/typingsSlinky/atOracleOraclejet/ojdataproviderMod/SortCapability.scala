package typingsSlinky.atOracleOraclejet.ojdataproviderMod

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortCapability[D] extends js.Object {
  var attributes: none | single | multiple
}

object SortCapability {
  @scala.inline
  def apply[D](attributes: none | single | multiple): SortCapability[D] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortCapability[D]]
  }
}

