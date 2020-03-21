package typingsSlinky.jestTypes

import typingsSlinky.jestTypes.circusMod.Event
import typingsSlinky.jestTypes.circusMod.Exception
import typingsSlinky.jestTypes.jestTypesStrings.error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorException extends Event {
  var error: Exception
  var name: error_
}

object AnonErrorException {
  @scala.inline
  def apply(error: Exception, name: error_): AnonErrorException = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorException]
  }
}

