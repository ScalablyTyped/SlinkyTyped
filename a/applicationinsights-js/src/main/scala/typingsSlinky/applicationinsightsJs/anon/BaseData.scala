package typingsSlinky.applicationinsightsJs.anon

import typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseData extends js.Object {
  var baseData: FieldType = js.native
  var baseType: FieldType = js.native
}

object BaseData {
  @scala.inline
  def apply(baseData: FieldType, baseType: FieldType): BaseData = {
    val __obj = js.Dynamic.literal(baseData = baseData.asInstanceOf[js.Any], baseType = baseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseData]
  }
  @scala.inline
  implicit class BaseDataOps[Self <: BaseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseData(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseType(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

