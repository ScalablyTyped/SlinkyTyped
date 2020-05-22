package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardInfoPre extends KeyboardInfo {
  /**
    * Defines whether the engine should skip the next onKeyboardObservable associated to this pre.
    */
  var skipOnPointerObservable: Boolean
}

object KeyboardInfoPre {
  @scala.inline
  def apply(event: KeyboardEvent, skipOnPointerObservable: Boolean, `type`: Double): KeyboardInfoPre = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], skipOnPointerObservable = skipOnPointerObservable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardInfoPre]
  }
}

