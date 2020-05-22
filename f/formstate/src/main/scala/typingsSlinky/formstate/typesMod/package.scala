package typingsSlinky.formstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ValidationResponse = js.UndefOr[
    java.lang.String | scala.Null | typingsSlinky.formstate.formstateBooleans.`false`
  ]
  type Validator[TValue] = js.Function1[/* value */ TValue, typingsSlinky.formstate.typesMod.ValidatorResponse]
  type ValidatorResponse = typingsSlinky.formstate.typesMod.ValidationResponse | js.Promise[typingsSlinky.formstate.typesMod.ValidationResponse]
}
