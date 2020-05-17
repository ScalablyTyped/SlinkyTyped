package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the settings defining a data record.
  */
@js.native
trait DataRecordOptions extends js.Object {
  /**
    * Gets or sets the index of the active data record.
    */
  var activeRecordIndex: Double = js.native
  /**
    * Gets or sets the count of data source records.
    */
  var recordCount: Double = js.native
}

object DataRecordOptions {
  @scala.inline
  def apply(activeRecordIndex: Double, recordCount: Double): DataRecordOptions = {
    val __obj = js.Dynamic.literal(activeRecordIndex = activeRecordIndex.asInstanceOf[js.Any], recordCount = recordCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRecordOptions]
  }
  @scala.inline
  implicit class DataRecordOptionsOps[Self <: DataRecordOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveRecordIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeRecordIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

