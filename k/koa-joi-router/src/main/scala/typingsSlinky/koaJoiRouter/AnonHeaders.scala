package typingsSlinky.koaJoiRouter

import typingsSlinky.joi.mod.SchemaLike
import typingsSlinky.koaJoiRouter.mod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders extends OutputValidation {
  var headers: SchemaLike
}

object AnonHeaders {
  @scala.inline
  def apply(headers: SchemaLike = null): AnonHeaders = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaders]
  }
}

