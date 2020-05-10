package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error information about the response.
  */
@js.native
trait SchemaErrorInfo extends js.Object {
  var errorMessages: js.UndefOr[js.Array[SchemaErrorMessage]] = js.native
}

object SchemaErrorInfo {
  @scala.inline
  def apply(): SchemaErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorInfo]
  }
  @scala.inline
  implicit class SchemaErrorInfoOps[Self <: SchemaErrorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorMessages(value: js.Array[SchemaErrorMessage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessages")(js.undefined)
        ret
    }
  }
  
}

