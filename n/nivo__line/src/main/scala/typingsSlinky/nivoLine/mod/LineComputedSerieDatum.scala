package typingsSlinky.nivoLine.mod

import typingsSlinky.nivoLine.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineComputedSerieDatum extends js.Object {
  var data: LineDatum
  var position: X
}

object LineComputedSerieDatum {
  @scala.inline
  def apply(data: LineDatum, position: X): LineComputedSerieDatum = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineComputedSerieDatum]
  }
}

