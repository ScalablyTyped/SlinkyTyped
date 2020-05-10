package typingsSlinky.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An explanation of a report failure.
  */
@js.native
trait SchemaReportFailure extends js.Object {
  /**
    * Error code that shows why the report was not created.
    */
  var errorCode: js.UndefOr[String] = js.native
}

object SchemaReportFailure {
  @scala.inline
  def apply(): SchemaReportFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportFailure]
  }
  @scala.inline
  implicit class SchemaReportFailureOps[Self <: SchemaReportFailure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
  }
  
}

