package typingsSlinky.firebaseDatabase.eventMod

import typingsSlinky.firebaseDatabase.eventRegistrationMod.EventRegistration
import typingsSlinky.firebaseDatabase.pathMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/Event", "CancelEvent")
@js.native
class CancelEvent protected () extends Event {
  /**
    * @param {EventRegistration} eventRegistration
    * @param {Error} error
    * @param {!Path} path
    */
  def this(eventRegistration: EventRegistration, error: js.Error, path: Path) = this()
  var error: js.Error = js.native
  var eventRegistration: EventRegistration = js.native
  var path: Path = js.native
}

