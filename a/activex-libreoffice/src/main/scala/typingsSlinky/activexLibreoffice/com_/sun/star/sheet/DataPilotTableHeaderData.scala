package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * information about a cell within the column or row header area of a DataPilot table.
  *
  * This struct contains information about a particular cell located within the column or row header area of a DataPilot table. This is the type that is
  * contained in {@link DataPilotTablePositionData.PositionData} when the value of {@link DataPilotTablePositionData.PositionType} is either {@link
  * DataPilotTablePositionType.ROW_HEADER} or {@link DataPilotTablePositionType.COLUMN_HEADER} .
  * @see com.sun.star.sheet.DataPilotTablePositionData
  * @see com.sun.star.sheet.DataPilotTablePositionType
  * @see com.sun.star.sheet.DataPilotFieldFilter
  * @see com.sun.star.sheet.DataResult
  * @since OOo 3.0
  */
@js.native
trait DataPilotTableHeaderData extends js.Object {
  /** number of dimensions */
  var Dimension: Double = js.native
  /** flag */
  var Flags: Double = js.native
  /** hierarchy */
  var Hierarchy: Double = js.native
  /** level */
  var Level: Double = js.native
  /** member name */
  var MemberName: String = js.native
}

object DataPilotTableHeaderData {
  @scala.inline
  def apply(Dimension: Double, Flags: Double, Hierarchy: Double, Level: Double, MemberName: String): DataPilotTableHeaderData = {
    val __obj = js.Dynamic.literal(Dimension = Dimension.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], Hierarchy = Hierarchy.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotTableHeaderData]
  }
  @scala.inline
  implicit class DataPilotTableHeaderDataOps[Self <: DataPilotTableHeaderData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimension(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHierarchy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hierarchy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMemberName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MemberName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

