package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Matrix4
import typingsSlinky.cesium.mod.PolygonGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.native
  var geometry: typingsSlinky.cesium.mod.Geometry | PolygonGeometry = js.native
  var id: js.UndefOr[js.Any] = js.native
  var modelMatrix: js.UndefOr[Matrix4] = js.native
}

object Geometry {
  @scala.inline
  def apply(geometry: typingsSlinky.cesium.mod.Geometry | PolygonGeometry): Geometry = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  implicit class GeometryOps[Self <: Geometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeometry(value: typingsSlinky.cesium.mod.Geometry | PolygonGeometry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withModelMatrix(value: Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelMatrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelMatrix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelMatrix")(js.undefined)
        ret
    }
  }
  
}

