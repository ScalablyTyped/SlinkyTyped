package typingsSlinky.gridTemplateParser.anon

import typingsSlinky.gridTemplateParser.mod.Track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<grid-template-parser.grid-template-parser.Area> */
@js.native
trait PartialArea extends js.Object {
  var column: js.UndefOr[Track] = js.native
  var row: js.UndefOr[Track] = js.native
}

object PartialArea {
  @scala.inline
  def apply(): PartialArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialArea]
  }
  @scala.inline
  implicit class PartialAreaOps[Self <: PartialArea] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Track): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(js.undefined)
        ret
    }
    @scala.inline
    def withRow(value: Track): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("row")(js.undefined)
        ret
    }
  }
  
}

