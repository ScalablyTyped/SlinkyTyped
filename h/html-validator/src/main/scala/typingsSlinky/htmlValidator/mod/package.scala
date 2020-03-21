package typingsSlinky.htmlValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ValidationMessageLocationObject = typingsSlinky.htmlValidator.mod.ValidationMessageSimpleObject with typingsSlinky.htmlValidator.mod.ValidationMessageBasicLocationObject
  type ValidationMessageObject = typingsSlinky.htmlValidator.mod.ValidationMessageSimpleObject | typingsSlinky.htmlValidator.mod.ValidationMessageLocationObject
  type ValidationMessageSimpleObject = (typingsSlinky.htmlValidator.mod.ValidationMessageBasicErrorObject | typingsSlinky.htmlValidator.mod.ValidationMessageBasicInfoObject | typingsSlinky.htmlValidator.mod.ValidationMessageBasicNonDocumentErrorObject) with typingsSlinky.htmlValidator.mod.ValidationMessageBasicObject
}
