package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian3
import typingsSlinky.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaximumCorner extends js.Object {
  var maximumCorner: Cartesian3 = js.native
  var minimumCorner: Cartesian3 = js.native
  var vertexFormat: js.UndefOr[VertexFormat] = js.native
}

object AnonMaximumCorner {
  @scala.inline
  def apply(maximumCorner: Cartesian3, minimumCorner: Cartesian3): AnonMaximumCorner = {
    val __obj = js.Dynamic.literal(maximumCorner = maximumCorner.asInstanceOf[js.Any], minimumCorner = minimumCorner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaximumCorner]
  }
  @scala.inline
  implicit class AnonMaximumCornerOps[Self <: AnonMaximumCorner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaximumCorner(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinimumCorner(value: Cartesian3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertexFormat(value: VertexFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexFormat")(js.undefined)
        ret
    }
  }
  
}

