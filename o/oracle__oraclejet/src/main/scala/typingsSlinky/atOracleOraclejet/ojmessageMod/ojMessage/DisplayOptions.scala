package typingsSlinky.atOracleOraclejet.ojmessageMod.ojMessage

import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.auto
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.header
import typingsSlinky.atOracleOraclejet.atOracleOraclejetStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait DisplayOptions extends js.Object {
  var category: js.UndefOr[header | none | auto] = js.undefined
}

object DisplayOptions {
  @scala.inline
  def apply(category: header | none | auto = null): DisplayOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayOptions]
  }
}

