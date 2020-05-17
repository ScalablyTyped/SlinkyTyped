package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the measure metadata.
  */
@js.native
trait ASPxClientDashboardItemDataMeasure extends js.Object {
  /**
    * Gets the data member that identifies the data source list used to provide data for the current measure.
    */
  var DataMember: String = js.native
  /**
    * Gets the measure identifier.
    */
  var Id: String = js.native
  /**
    * Gets the name of the measure.
    */
  var Name: String = js.native
  /**
    * Gets the type of summary function calculated against the current measure.
    */
  var SummaryType: String = js.native
  /**
    * Formats the specified value using format settings of the current measure. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  def Format(value: js.Any): String = js.native
}

object ASPxClientDashboardItemDataMeasure {
  @scala.inline
  def apply(DataMember: String, Format: js.Any => String, Id: String, Name: String, SummaryType: String): ASPxClientDashboardItemDataMeasure = {
    val __obj = js.Dynamic.literal(DataMember = DataMember.asInstanceOf[js.Any], Format = js.Any.fromFunction1(Format), Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SummaryType = SummaryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataMeasure]
  }
  @scala.inline
  implicit class ASPxClientDashboardItemDataMeasureOps[Self <: ASPxClientDashboardItemDataMeasure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataMember(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataMember")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormat(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummaryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SummaryType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

