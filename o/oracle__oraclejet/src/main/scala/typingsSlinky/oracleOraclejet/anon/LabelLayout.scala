package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelLayout extends js.Object {
  var id: js.Any = js.native
  var labelLayout: typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object LabelLayout {
  @scala.inline
  def apply(
    id: js.Any,
    labelLayout: typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout,
    x: Double,
    y: Double
  ): LabelLayout = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], labelLayout = labelLayout.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelLayout]
  }
  @scala.inline
  implicit class LabelLayoutOps[Self <: LabelLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelLayout(value: typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

