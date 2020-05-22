package typingsSlinky.mendixmodelsdk.deltaManagerMod

import typingsSlinky.mendixmodelsdk.deltasDeltasMod.Delta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeltaChange extends js.Object {
  var delta: Delta
  var reverseDelta: Delta | js.Error
}

object IDeltaChange {
  @scala.inline
  def apply(delta: Delta, reverseDelta: Delta | js.Error): IDeltaChange = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], reverseDelta = reverseDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeltaChange]
  }
}

