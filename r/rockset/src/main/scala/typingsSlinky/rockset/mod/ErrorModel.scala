package typingsSlinky.rockset.mod

import typingsSlinky.rockset.rocksetStrings.ALREADYEXISTS
import typingsSlinky.rockset.rocksetStrings.AUTHEXCEPTION
import typingsSlinky.rockset.rocksetStrings.CONNECTION_ERROR
import typingsSlinky.rockset.rocksetStrings.DEPENDENTRESOURCES
import typingsSlinky.rockset.rocksetStrings.FORBIDDEN
import typingsSlinky.rockset.rocksetStrings.INTEGRATION_NOT_FOUND
import typingsSlinky.rockset.rocksetStrings.INTERNALERROR
import typingsSlinky.rockset.rocksetStrings.INVALIDINPUT
import typingsSlinky.rockset.rocksetStrings.NOTFOUND
import typingsSlinky.rockset.rocksetStrings.NOTIMPLEMENTEDYET
import typingsSlinky.rockset.rocksetStrings.NOT_READY
import typingsSlinky.rockset.rocksetStrings.QUERY_ERROR
import typingsSlinky.rockset.rocksetStrings.QUERY_TIMEOUT
import typingsSlinky.rockset.rocksetStrings.RESOURCEEXCEEDED
import typingsSlinky.rockset.rocksetStrings.ROLE_NOT_FOUND
import typingsSlinky.rockset.rocksetStrings.VERSIONEXCEPTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorModel extends js.Object {
  // Column where the error happened (if applicable)
  var column: js.UndefOr[Double] = js.native
  // Line where the error happened (if applicable)
  var line: js.UndefOr[Double] = js.native
  // descriptive message about the error
  var message: js.UndefOr[String] = js.native
  // Internal trace ID to help with debugging
  var trace_id: js.UndefOr[String] = js.native
  // category of the error
  var `type`: js.UndefOr[
    AUTHEXCEPTION | VERSIONEXCEPTION | INTERNALERROR | INVALIDINPUT | NOTIMPLEMENTEDYET | RESOURCEEXCEEDED | ALREADYEXISTS | NOTFOUND | DEPENDENTRESOURCES | QUERY_ERROR | NOT_READY | FORBIDDEN | QUERY_TIMEOUT | INTEGRATION_NOT_FOUND | ROLE_NOT_FOUND | CONNECTION_ERROR
  ] = js.native
}

object ErrorModel {
  @scala.inline
  def apply(): ErrorModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorModel]
  }
  @scala.inline
  implicit class ErrorModelOps[Self <: ErrorModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withTrace_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrace_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace_id")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: AUTHEXCEPTION | VERSIONEXCEPTION | INTERNALERROR | INVALIDINPUT | NOTIMPLEMENTEDYET | RESOURCEEXCEEDED | ALREADYEXISTS | NOTFOUND | DEPENDENTRESOURCES | QUERY_ERROR | NOT_READY | FORBIDDEN | QUERY_TIMEOUT | INTEGRATION_NOT_FOUND | ROLE_NOT_FOUND | CONNECTION_ERROR
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

