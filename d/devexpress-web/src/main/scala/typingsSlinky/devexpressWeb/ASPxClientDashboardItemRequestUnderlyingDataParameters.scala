package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains parameters used to obtain the underlying data for the dashboard item.
  */
@js.native
trait ASPxClientDashboardItemRequestUnderlyingDataParameters extends js.Object {
  /**
    * Gets or sets axis points used to obtain the underlying data.
    */
  var AxisPoints: js.Array[ASPxClientDashboardItemDataAxisPoint] = js.native
  /**
    * Gets or sets an array of data member identifiers used to obtain underlying data.
    */
  var DataMembers: js.Array[String] = js.native
  /**
    * Gets or sets the unique dimension value used to obtain the underlying data.
    */
  var UniqueValuesByAxisName: js.Any = js.native
  /**
    * Gets or sets the dimension value used to obtain the underlying data.
    */
  var ValuesByAxisName: js.Any = js.native
}

object ASPxClientDashboardItemRequestUnderlyingDataParameters {
  @scala.inline
  def apply(
    AxisPoints: js.Array[ASPxClientDashboardItemDataAxisPoint],
    DataMembers: js.Array[String],
    UniqueValuesByAxisName: js.Any,
    ValuesByAxisName: js.Any
  ): ASPxClientDashboardItemRequestUnderlyingDataParameters = {
    val __obj = js.Dynamic.literal(AxisPoints = AxisPoints.asInstanceOf[js.Any], DataMembers = DataMembers.asInstanceOf[js.Any], UniqueValuesByAxisName = UniqueValuesByAxisName.asInstanceOf[js.Any], ValuesByAxisName = ValuesByAxisName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemRequestUnderlyingDataParameters]
  }
  @scala.inline
  implicit class ASPxClientDashboardItemRequestUnderlyingDataParametersOps[Self <: ASPxClientDashboardItemRequestUnderlyingDataParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAxisPoints(value: js.Array[ASPxClientDashboardItemDataAxisPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AxisPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataMembers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUniqueValuesByAxisName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UniqueValuesByAxisName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuesByAxisName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValuesByAxisName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

