package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TableRecord...
  */
@js.native
trait ITableRecord extends js.Object {
  /**
    * Comment related to the table.
    */
  var qComment: String = js.native
  /**
    * Information about the fields in the table.
    */
  var qFields: js.Array[IFieldInTableData] = js.native
  /**
    * If set to true, Direct Discovery is used.
    * Direct Discovery fields are not loaded into memory and remain in the external database.
    */
  var qIsDirectDiscovery: Boolean = js.native
  /**
    * This property is set to true if the table contains a synthetic key.
    */
  var qIsSynthetic: Boolean = js.native
  /**
    * This property is set to true if the table is loose.
    */
  var qLoose: Boolean = js.native
  /**
    * Name of the table.
    */
  var qName: String = js.native
  /**
    * Number of rows in the table.
    */
  var qNoOfRows: Double = js.native
  /**
    * Information about the position of the table.
    */
  var qPos: IPoint = js.native
}

object ITableRecord {
  @scala.inline
  def apply(
    qComment: String,
    qFields: js.Array[IFieldInTableData],
    qIsDirectDiscovery: Boolean,
    qIsSynthetic: Boolean,
    qLoose: Boolean,
    qName: String,
    qNoOfRows: Double,
    qPos: IPoint
  ): ITableRecord = {
    val __obj = js.Dynamic.literal(qComment = qComment.asInstanceOf[js.Any], qFields = qFields.asInstanceOf[js.Any], qIsDirectDiscovery = qIsDirectDiscovery.asInstanceOf[js.Any], qIsSynthetic = qIsSynthetic.asInstanceOf[js.Any], qLoose = qLoose.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNoOfRows = qNoOfRows.asInstanceOf[js.Any], qPos = qPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITableRecord]
  }
  @scala.inline
  implicit class ITableRecordOps[Self <: ITableRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQFields(value: js.Array[IFieldInTableData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsDirectDiscovery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsDirectDiscovery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQIsSynthetic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsSynthetic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQLoose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qLoose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNoOfRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNoOfRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQPos(value: IPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qPos")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

