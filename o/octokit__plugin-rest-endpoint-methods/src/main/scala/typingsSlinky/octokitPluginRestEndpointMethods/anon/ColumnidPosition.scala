package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnidPosition extends js.Object {
  var column_id: Required = js.native
  var position: Validation = js.native
}

object ColumnidPosition {
  @scala.inline
  def apply(column_id: Required, position: Validation): ColumnidPosition = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnidPosition]
  }
  @scala.inline
  implicit class ColumnidPositionOps[Self <: ColumnidPosition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Validation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

