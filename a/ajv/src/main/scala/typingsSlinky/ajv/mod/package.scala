package typingsSlinky.ajv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FormatValidator = java.lang.String | js.RegExp | (js.Function1[/* data */ java.lang.String, scala.Boolean | js.Thenable[js.Any]])
  
  type MissingRefError = typingsSlinky.ajv.mod.AjvErrors.MissingRefError
  
  type NumberFormatValidator = js.Function1[/* data */ scala.Double, scala.Boolean | js.Thenable[js.Any]]
  
  type ValidationError = typingsSlinky.ajv.mod.AjvErrors.ValidationError
}
