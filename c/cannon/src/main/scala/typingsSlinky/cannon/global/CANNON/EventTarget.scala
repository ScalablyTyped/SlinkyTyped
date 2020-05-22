package typingsSlinky.cannon.global.CANNON

import typingsSlinky.cannon.CANNON.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CANNON.EventTarget")
@js.native
class EventTarget ()
  extends typingsSlinky.cannon.CANNON.EventTarget {
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function): typingsSlinky.cannon.CANNON.EventTarget = js.native
  /* CompleteClass */
  override def dispatchEvent(event: IEvent): IEvent = js.native
  /* CompleteClass */
  override def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Function): typingsSlinky.cannon.CANNON.EventTarget = js.native
}

