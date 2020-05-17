package typingsSlinky.gapiClientYoutubeanalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnType extends js.Object {
  /** The type of the column (DIMENSION or METRIC). */
  var columnType: js.UndefOr[String] = js.native
  /** The type of the data in the column (STRING, INTEGER, FLOAT, etc.). */
  var dataType: js.UndefOr[String] = js.native
  /** The name of the dimension or metric. */
  var name: js.UndefOr[String] = js.native
}

object ColumnType {
  @scala.inline
  def apply(): ColumnType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnType]
  }
  @scala.inline
  implicit class ColumnTypeOps[Self <: ColumnType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumnType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnType")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

