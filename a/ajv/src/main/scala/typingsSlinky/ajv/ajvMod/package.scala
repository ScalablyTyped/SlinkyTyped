package typingsSlinky.ajv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ajvMod {
  type FormatValidator = String | js.RegExp | (js.Function1[/* data */ String, Boolean | js.Thenable[js.Any]])
  type MissingRefError = typingsSlinky.ajv.ajvMod.AjvErrors.MissingRefError
  type NumberFormatValidator = js.Function1[/* data */ Double, Boolean | js.Thenable[js.Any]]
  type ValidationError = typingsSlinky.ajv.ajvMod.AjvErrors.ValidationError
}
