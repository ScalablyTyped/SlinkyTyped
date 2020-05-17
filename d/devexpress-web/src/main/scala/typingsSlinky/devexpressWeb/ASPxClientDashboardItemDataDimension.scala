package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the dimension metadata.
  */
@js.native
trait ASPxClientDashboardItemDataDimension extends js.Object {
  /**
    * Gets the data member identifier for the current dimension.
    */
  var DataMember: String = js.native
  /**
    * Gets the group interval for date-time values for the current dimension.
    */
  var DateTimeGroupInterval: String = js.native
  /**
    * Gets the dimension identifier.
    */
  var Id: String = js.native
  /**
    * Gets or sets the name of the dimension.
    */
  var Name: String = js.native
  /**
    * Gets the group interval for string values.
    */
  var TextGroupInterval: String = js.native
  /**
    * Formats the specified value using format settings of the current dimension. A String that represents the formatted value.
    * @param value A value to be formatted.
    */
  def Format(value: js.Any): String = js.native
}

object ASPxClientDashboardItemDataDimension {
  @scala.inline
  def apply(
    DataMember: String,
    DateTimeGroupInterval: String,
    Format: js.Any => String,
    Id: String,
    Name: String,
    TextGroupInterval: String
  ): ASPxClientDashboardItemDataDimension = {
    val __obj = js.Dynamic.literal(DataMember = DataMember.asInstanceOf[js.Any], DateTimeGroupInterval = DateTimeGroupInterval.asInstanceOf[js.Any], Format = js.Any.fromFunction1(Format), Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TextGroupInterval = TextGroupInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDashboardItemDataDimension]
  }
  @scala.inline
  implicit class ASPxClientDashboardItemDataDimensionOps[Self <: ASPxClientDashboardItemDataDimension] (val x: Self) extends AnyVal {
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
    def withDateTimeGroupInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateTimeGroupInterval")(value.asInstanceOf[js.Any])
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
    def withTextGroupInterval(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextGroupInterval")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

