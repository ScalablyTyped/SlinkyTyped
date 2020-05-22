package typingsSlinky.objectAssignDeep.mod

import typingsSlinky.objectAssignDeep.objectAssignDeepStrings.merge
import typingsSlinky.objectAssignDeep.objectAssignDeepStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var arrayBehaviour: replace | merge
}

object Options {
  @scala.inline
  def apply(arrayBehaviour: replace | merge): Options = {
    val __obj = js.Dynamic.literal(arrayBehaviour = arrayBehaviour.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

