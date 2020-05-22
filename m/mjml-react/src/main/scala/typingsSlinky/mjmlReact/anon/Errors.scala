package typingsSlinky.mjmlReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.Array[js.Error]
  var html: String
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[js.Error], html: String): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

