package typingsSlinky.materialFloatingLabel.constantsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.materialBase.foundationMod.MDCStrings
import typingsSlinky.materialFloatingLabel.materialFloatingLabelStrings.`mdc-floating-label--float-above`
import typingsSlinky.materialFloatingLabel.materialFloatingLabelStrings.`mdc-floating-label--shake`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cssClasses extends MDCStrings {
  var LABEL_FLOAT_ABOVE: `mdc-floating-label--float-above`
  var LABEL_SHAKE: `mdc-floating-label--shake`
}

object cssClasses {
  @scala.inline
  def apply(
    LABEL_FLOAT_ABOVE: `mdc-floating-label--float-above`,
    LABEL_SHAKE: `mdc-floating-label--shake`,
    StringDictionary: StringDictionary[String] = null
  ): cssClasses = {
    val __obj = js.Dynamic.literal(LABEL_FLOAT_ABOVE = LABEL_FLOAT_ABOVE.asInstanceOf[js.Any], LABEL_SHAKE = LABEL_SHAKE.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[cssClasses]
  }
}

