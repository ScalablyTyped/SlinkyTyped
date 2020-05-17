package typingsSlinky.applicationinsightsJs.Microsoft.Telemetry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data[TDomain] extends Base {
  var baseData: TDomain = js.native
}

object Data {
  @scala.inline
  def apply[TDomain](baseData: TDomain, baseType: String): Data[TDomain] = {
    val __obj = js.Dynamic.literal(baseData = baseData.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TDomain]]
  }
  @scala.inline
  implicit class DataOps[Self[tdomain] <: Data[tdomain], TDomain] (val x: Self[TDomain]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDomain] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDomain]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TDomain] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TDomain] with Other]
    @scala.inline
    def withBaseData(value: TDomain): Self[TDomain] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

