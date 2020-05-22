package typingsSlinky.koaJoiRouter.anon

import typingsSlinky.joi.mod.SchemaLike
import typingsSlinky.koaJoiRouter.mod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends OutputValidation {
  var headers: SchemaLike
}

object Headers {
  @scala.inline
  def apply(headers: SchemaLike = null): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

