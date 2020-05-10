package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry extends js.Object {
  /**
    * An axis-aligned coarse representation of the location of the recognized item on the document page.
    */
  var BoundingBox: js.UndefOr[typingsSlinky.awsSdk.textractMod.BoundingBox] = js.native
  /**
    * Within the bounding box, a fine-grained polygon around the recognized item.
    */
  var Polygon: js.UndefOr[typingsSlinky.awsSdk.textractMod.Polygon] = js.native
}

object Geometry {
  @scala.inline
  def apply(): Geometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingBox(value: BoundingBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BoundingBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BoundingBox")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygon(value: Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Polygon")(js.undefined)
        ret
    }
  }
  
}

