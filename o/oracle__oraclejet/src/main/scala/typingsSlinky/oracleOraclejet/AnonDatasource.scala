package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ContextStatus
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.edit
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.navigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDatasource[K, D] extends js.Object {
  var datasource: (DataProvider[K, D]) | Null
  var mode: edit | navigation
  var status: ContextStatus[K]
}

object AnonDatasource {
  @scala.inline
  def apply[K, D](mode: edit | navigation, status: ContextStatus[K], datasource: DataProvider[K, D] = null): AnonDatasource[K, D] = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (datasource != null) __obj.updateDynamic("datasource")(datasource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatasource[K, D]]
  }
}

