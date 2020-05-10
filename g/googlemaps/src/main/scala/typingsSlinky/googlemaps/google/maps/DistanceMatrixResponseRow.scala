package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceMatrixResponseRow extends js.Object {
  var elements: js.Array[DistanceMatrixResponseElement] = js.native
}

object DistanceMatrixResponseRow {
  @scala.inline
  def apply(elements: js.Array[DistanceMatrixResponseElement]): DistanceMatrixResponseRow = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceMatrixResponseRow]
  }
  @scala.inline
  implicit class DistanceMatrixResponseRowOps[Self <: DistanceMatrixResponseRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElements(value: js.Array[DistanceMatrixResponseElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elements")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

