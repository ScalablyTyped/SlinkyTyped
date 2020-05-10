package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoordinateSpace extends js.Object {
  var coordinateSpace: js.Any = js.native
  var id: js.Any = js.native
  var labelLayout: LabelLayout = js.native
  var path: String = js.native
}

object AnonCoordinateSpace {
  @scala.inline
  def apply(coordinateSpace: js.Any, id: js.Any, labelLayout: LabelLayout, path: String): AnonCoordinateSpace = {
    val __obj = js.Dynamic.literal(coordinateSpace = coordinateSpace.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labelLayout = labelLayout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoordinateSpace]
  }
  @scala.inline
  implicit class AnonCoordinateSpaceOps[Self <: AnonCoordinateSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinateSpace(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelLayout(value: LabelLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

