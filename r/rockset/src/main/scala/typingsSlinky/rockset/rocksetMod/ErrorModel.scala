package typingsSlinky.rockset.rocksetMod

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

trait ErrorModel extends js.Object {
  // Column where the error happened (if applicable)
  var column: js.UndefOr[Double] = js.undefined
  // Line where the error happened (if applicable)
  var line: js.UndefOr[Double] = js.undefined
  // descriptive message about the error
  var message: js.UndefOr[String] = js.undefined
  // Internal trace ID to help with debugging
  var trace_id: js.UndefOr[String] = js.undefined
  // category of the error
  var `type`: js.UndefOr[
    AUTHEXCEPTION | VERSIONEXCEPTION | INTERNALERROR | INVALIDINPUT | NOTIMPLEMENTEDYET | RESOURCEEXCEEDED | ALREADYEXISTS | NOTFOUND | DEPENDENTRESOURCES | QUERY_ERROR | NOT_READY | FORBIDDEN | QUERY_TIMEOUT | INTEGRATION_NOT_FOUND | ROLE_NOT_FOUND | CONNECTION_ERROR
  ] = js.undefined
}

object ErrorModel {
  @scala.inline
  def apply(
    column: Int | Double = null,
    line: Int | Double = null,
    message: String = null,
    trace_id: String = null,
    `type`: AUTHEXCEPTION | VERSIONEXCEPTION | INTERNALERROR | INVALIDINPUT | NOTIMPLEMENTEDYET | RESOURCEEXCEEDED | ALREADYEXISTS | NOTFOUND | DEPENDENTRESOURCES | QUERY_ERROR | NOT_READY | FORBIDDEN | QUERY_TIMEOUT | INTEGRATION_NOT_FOUND | ROLE_NOT_FOUND | CONNECTION_ERROR = null
  ): ErrorModel = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (trace_id != null) __obj.updateDynamic("trace_id")(trace_id.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorModel]
  }
}

