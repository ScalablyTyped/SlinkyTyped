package typingsSlinky.athenajs.mod

import typingsSlinky.athenajs.anon.InstantiableEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FXInstance extends js.Object {
  def addFX(fxName: String, FxClass: InstantiableEffect): Unit
}

object FXInstance {
  @scala.inline
  def apply(addFX: (String, InstantiableEffect) => Unit): FXInstance = {
    val __obj = js.Dynamic.literal(addFX = js.Any.fromFunction2(addFX))
    __obj.asInstanceOf[FXInstance]
  }
}

