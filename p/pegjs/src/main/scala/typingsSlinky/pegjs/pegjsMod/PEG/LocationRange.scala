package typingsSlinky.pegjs.pegjsMod.PEG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationRange extends js.Object {
  var end: typingsSlinky.pegjs.pegjsMod.PEG.Location
  var start: typingsSlinky.pegjs.pegjsMod.PEG.Location
}

object LocationRange {
  @scala.inline
  def apply(end: typingsSlinky.pegjs.pegjsMod.PEG.Location, start: typingsSlinky.pegjs.pegjsMod.PEG.Location): LocationRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LocationRange]
  }
}

