package typingsSlinky.hapi.mod.Lifecycle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Each lifecycle method must return a value or a promise that resolves into a value. If a lifecycle method returns
  * without a value or resolves to an undefined value, an Internal Server Error (500) error response is sent.
  * The return value must be one of:
  * - Plain value: null, string, number, boolean
  * - Buffer object
  * - Error object: plain Error OR a Boom object.
  * - Stream object
  * - any object or array
  * - a toolkit signal:
  * - a toolkit method response:
  * - a promise object that resolve to any of the above values
  * For more info please [See docs](https://github.com/hapijs/hapi/blob/master/API.md#lifecycle-methods)
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hapi.mod.Lifecycle.ReturnValueTypes
  - js.Promise[typingsSlinky.hapi.mod.Lifecycle.ReturnValueTypes]
*/
trait ReturnValue extends js.Object

object ReturnValue {
  @scala.inline
  implicit def apply(value: js.Promise[ReturnValueTypes]): ReturnValue = value.asInstanceOf[ReturnValue]
  @scala.inline
  implicit def apply(value: ReturnValueTypes): ReturnValue = value.asInstanceOf[ReturnValue]
}

