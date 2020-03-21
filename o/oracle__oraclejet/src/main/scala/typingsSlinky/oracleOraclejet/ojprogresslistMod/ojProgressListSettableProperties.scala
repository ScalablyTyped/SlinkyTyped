package typingsSlinky.oracleOraclejet.ojprogresslistMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojProgressListSettableProperties extends JetSettableProperties {
  var data: (DataProvider[_, _]) | Null
}

object ojProgressListSettableProperties {
  @scala.inline
  def apply(data: DataProvider[_, _] = null): ojProgressListSettableProperties = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojProgressListSettableProperties]
  }
}

