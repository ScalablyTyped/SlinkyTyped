package typingsSlinky.easyXapiSupertest.superagentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function2[
/ * err * / js.Any, 
/ * res * / typingsSlinky.easyXapiSupertest.superagentMod.Response, 
scala.Unit]
  - js.Function1[/ * res * / typingsSlinky.easyXapiSupertest.superagentMod.Response, scala.Unit]
*/
trait CallbackHandler extends js.Object

object CallbackHandler {
  @scala.inline
  implicit def apply(value: js.Function1[/* res */ Response, Unit]): CallbackHandler = value.asInstanceOf[CallbackHandler]
  @scala.inline
  implicit def apply(value: js.Function2[/* err */ js.Any, /* res */ Response, Unit]): CallbackHandler = value.asInstanceOf[CallbackHandler]
}

