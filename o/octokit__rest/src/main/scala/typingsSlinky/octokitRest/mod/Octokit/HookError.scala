package typingsSlinky.octokitRest.mod.Octokit

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.octokitRest.AnonField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Error & {  status  :number,   headers  :{[header: string] : string},   documentation_url ? :string,   errors ? :[{  resource  :string,   field  :string,   code  :string}]} */
trait HookError extends js.Object {
  var documentation_url: js.UndefOr[String] = js.undefined
  var errors: js.UndefOr[js.Array[AnonField]] = js.undefined
  var headers: StringDictionary[String]
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
  var status: Double
}

object HookError {
  @scala.inline
  def apply(
    headers: StringDictionary[String],
    message: String,
    name: String,
    status: Double,
    documentation_url: String = null,
    errors: js.Array[AnonField] = null,
    stack: String = null
  ): HookError = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (documentation_url != null) __obj.updateDynamic("documentation_url")(documentation_url.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookError]
  }
}

