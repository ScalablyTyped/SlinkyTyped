package typingsSlinky.divaJs.anon

import typingsSlinky.divaJs.interfacesMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Col extends js.Object {
  var col: Double = js.native
  var dimensions: typingsSlinky.divaJs.interfacesMod.Dimensions = js.native
  var offset: Offset = js.native
  var row: Double = js.native
  var url: String = js.native
}

object Col {
  @scala.inline
  def apply(
    col: Double,
    dimensions: typingsSlinky.divaJs.interfacesMod.Dimensions,
    offset: Offset,
    row: Double,
    url: String
  ): Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
  @scala.inline
  implicit class ColOps[Self <: Col] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCol(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensions(value: typingsSlinky.divaJs.interfacesMod.Dimensions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRow(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

