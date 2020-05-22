package typingsSlinky.rechoir.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attempt extends js.Object {
  var error: js.Error | Null
  var module: js.Any
  var moduleName: String
}

object Attempt {
  @scala.inline
  def apply(module: js.Any, moduleName: String, error: js.Error = null): Attempt = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attempt]
  }
}

