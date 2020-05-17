package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionic.definitionsMod.APIResponseSuccess
  - typingsSlinky.ionic.definitionsMod.APIResponseError
*/
trait APIResponse extends js.Object

object APIResponse {
  @scala.inline
  implicit def apply(value: APIResponseError): APIResponse = value.asInstanceOf[APIResponse]
  @scala.inline
  implicit def apply(value: APIResponseSuccess): APIResponse = value.asInstanceOf[APIResponse]
}

