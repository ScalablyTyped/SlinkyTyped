package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties of this service correspond to the similar named attributes and subelements of the XML element {@link chart2} :increment in the {@link
  * chart2} file format.
  */
@js.native
trait LogicTargetModel extends js.Object {
  /**
    * not BOUND nor CONSTRAINED in terms of Listener notifications, each element in the sequence must implement the service {@link
    * com.sun.star.chart2.CoordinateSystem}
    */
  var CoordinateSystems: SafeArray[XPropertySet] = js.native
  /** identifies an instance of this service within one chart document. */
  var ID: String = js.native
  /**
    * identifies an instance of the service com::sun::star::chart2::LegendModel within one chart document. that instance is used to automatically calculate
    * missing properties
    */
  var LegendID: String = js.native
  /**
    * MAYBEVOID, not BOUND nor CONSTRAINED in terms of Listener notifications, each element in the sequence must implement the service {@link
    * com.sun.star.chart2.LogicTargetModel}
    */
  var LogicTargetModels: SafeArray[XPropertySet] = js.native
}

object LogicTargetModel {
  @scala.inline
  def apply(
    CoordinateSystems: SafeArray[XPropertySet],
    ID: String,
    LegendID: String,
    LogicTargetModels: SafeArray[XPropertySet]
  ): LogicTargetModel = {
    val __obj = js.Dynamic.literal(CoordinateSystems = CoordinateSystems.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], LegendID = LegendID.asInstanceOf[js.Any], LogicTargetModels = LogicTargetModels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicTargetModel]
  }
  @scala.inline
  implicit class LogicTargetModelOps[Self <: LogicTargetModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinateSystems(value: SafeArray[XPropertySet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoordinateSystems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLegendID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LegendID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicTargetModels(value: SafeArray[XPropertySet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicTargetModels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

