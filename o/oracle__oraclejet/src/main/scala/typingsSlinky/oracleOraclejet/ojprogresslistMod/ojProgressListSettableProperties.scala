package typingsSlinky.oracleOraclejet.ojprogresslistMod

import typingsSlinky.oracleOraclejet.mod.JetSettableProperties
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ojProgressListSettableProperties extends JetSettableProperties {
  var data: (DataProvider[_, _]) | Null = js.native
}

object ojProgressListSettableProperties {
  @scala.inline
  def apply(): ojProgressListSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojProgressListSettableProperties]
  }
  @scala.inline
  implicit class ojProgressListSettablePropertiesOps[Self <: ojProgressListSettableProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: DataProvider[_, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(null)
        ret
    }
  }
  
}

