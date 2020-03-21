package typingsSlinky.jestTypes

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.TestEntry
import typingsSlinky.jestTypes.jestTypesStrings.test_start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameTestTestEntry extends Event {
  var name: test_start
  var test: TestEntry
}

object AnonNameTestTestEntry {
  @scala.inline
  def apply(name: test_start, test: TestEntry): AnonNameTestTestEntry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameTestTestEntry]
  }
}

