package typingsSlinky.ajv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MissingRefError = typingsSlinky.ajv.mod.AjvErrors.MissingRefError
  type NumberFormatValidator = js.Function1[/* data */ scala.Double, scala.Boolean | js.Thenable[js.Any]]
  type ValidationError = typingsSlinky.ajv.mod.AjvErrors.ValidationError
}
