package typingsSlinky.formstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Validator[TValue] = js.Function1[/* value */ TValue, typingsSlinky.formstate.typesMod.ValidatorResponse]
}
