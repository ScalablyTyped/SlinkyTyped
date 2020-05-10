package typingsSlinky.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a CSV file attachment, as a list of column headers and
  * a list of data rows.
  */
@js.native
trait SchemaCsv extends js.Object {
  /**
    * The list of data rows in a CSV file, as string arrays rather than as a
    * single comma-separated string.
    */
  var dataRows: js.UndefOr[js.Array[SchemaCsvRow]] = js.native
  /**
    * The list of headers for data columns in a CSV file.
    */
  var headers: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCsv {
  @scala.inline
  def apply(): SchemaCsv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCsv]
  }
  @scala.inline
  implicit class SchemaCsvOps[Self <: SchemaCsv] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRows(value: js.Array[SchemaCsvRow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRows")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
  }
  
}

