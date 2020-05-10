package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoundingPoly extends js.Object {
  /** The bounding polygon vertices. */
  var vertices: js.UndefOr[js.Array[Vertex]] = js.native
}

object BoundingPoly {
  @scala.inline
  def apply(): BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingPoly]
  }
  @scala.inline
  implicit class BoundingPolyOps[Self <: BoundingPoly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVertices(value: js.Array[Vertex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(js.undefined)
        ret
    }
  }
  
}

