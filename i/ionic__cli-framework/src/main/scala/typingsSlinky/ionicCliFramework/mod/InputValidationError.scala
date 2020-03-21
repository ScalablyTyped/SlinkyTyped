package typingsSlinky.ionicCliFramework.mod

import typingsSlinky.ionicCliFramework.definitionsMod.ValidationError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework", "InputValidationError")
@js.native
class InputValidationError protected ()
  extends typingsSlinky.ionicCliFramework.errorsMod.InputValidationError {
  def this(message: String, errors: js.Array[ValidationError]) = this()
}

