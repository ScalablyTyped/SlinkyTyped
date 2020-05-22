package typingsSlinky.cannon.mod

import typingsSlinky.cannon.CANNON.IEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cannon", "World")
@js.native
class World ()
  extends typingsSlinky.cannon.CANNON.World {
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function): typingsSlinky.cannon.CANNON.EventTarget = js.native
  /* CompleteClass */
  override def dispatchEvent(event: IEvent): IEvent = js.native
  /* CompleteClass */
  override def hasEventListener(`type`: String, listener: js.Function): Boolean = js.native
  /* CompleteClass */
  override def removeEventListener(`type`: String, listener: js.Function): typingsSlinky.cannon.CANNON.EventTarget = js.native
}

