package typingsSlinky.knockback.Knockback

import typingsSlinky.backbone.mod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventWatcher extends Destroyable {
  def emitter(): Model = js.native
  def emitter(newEmitter: Model): js.Any = js.native
  def registerCallbacks(obj: js.Any, callback_info: js.Any): js.Any = js.native
  def releaseCallbacks(obj: js.Any): js.Any = js.native
}

