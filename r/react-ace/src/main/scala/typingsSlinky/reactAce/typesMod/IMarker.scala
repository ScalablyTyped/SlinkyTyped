package typingsSlinky.reactAce.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarker extends js.Object {
  var className: String = js.native
  var endCol: Double = js.native
  var endRow: Double = js.native
  var inFront: js.UndefOr[Boolean] = js.native
  var startCol: Double = js.native
  var startRow: Double = js.native
  var `type`: String = js.native
}

object IMarker {
  @scala.inline
  def apply(
    className: String,
    endCol: Double,
    endRow: Double,
    startCol: Double,
    startRow: Double,
    `type`: String
  ): IMarker = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarker]
  }
  @scala.inline
  implicit class IMarkerOps[Self <: IMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInFront(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFront")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInFront: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inFront")(js.undefined)
        ret
    }
  }
  
}

