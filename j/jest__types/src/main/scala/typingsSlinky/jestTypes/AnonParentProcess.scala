package typingsSlinky.jestTypes

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.Process
import typingsSlinky.jestTypes.jestTypesStrings.setup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParentProcess extends Event {
  var name: setup
  var parentProcess: Process
  var testNamePattern: js.UndefOr[String] = js.undefined
}

object AnonParentProcess {
  @scala.inline
  def apply(name: setup, parentProcess: Process, testNamePattern: String = null): AnonParentProcess = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentProcess = parentProcess.asInstanceOf[js.Any])
    if (testNamePattern != null) __obj.updateDynamic("testNamePattern")(testNamePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParentProcess]
  }
}

