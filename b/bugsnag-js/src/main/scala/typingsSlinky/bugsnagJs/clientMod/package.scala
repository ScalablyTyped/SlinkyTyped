package typingsSlinky.bugsnagJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.std.Error
    - typingsSlinky.bugsnagJs.AnonErrorClass
    - typingsSlinky.bugsnagJs.AnonMessage
    - js.Any
  */
  type NotifiableError = typingsSlinky.bugsnagJs.clientMod._NotifiableError | js.Error | js.Any
}
