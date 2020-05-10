package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableError extends js.Object {
  /**
    * The details about the error.
    */
  var ErrorDetail: js.UndefOr[typingsSlinky.awsSdk.glueMod.ErrorDetail] = js.native
  /**
    * The name of the table. For Hive compatibility, this must be entirely lowercase.
    */
  var TableName: js.UndefOr[NameString] = js.native
}

object TableError {
  @scala.inline
  def apply(): TableError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableError]
  }
  @scala.inline
  implicit class TableErrorOps[Self <: TableError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorDetail(value: ErrorDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
        ret
    }
  }
  
}

