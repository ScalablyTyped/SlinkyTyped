package typingsSlinky.oracleOraclejet.ojprogresslistMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.ojdataproviderMod.DataProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojprogresslist.ojProgressListSettableProperties> */
@js.native
trait ojProgressListSettablePropertiesLenient
  extends /* key */ StringDictionary[js.Any] {
  var data: js.UndefOr[DataProvider[_, _]] = js.native
}

object ojProgressListSettablePropertiesLenient {
  @scala.inline
  def apply(): ojProgressListSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojProgressListSettablePropertiesLenient]
  }
  @scala.inline
  implicit class ojProgressListSettablePropertiesLenientOps[Self <: ojProgressListSettablePropertiesLenient] (val x: Self) extends AnyVal {
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
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

