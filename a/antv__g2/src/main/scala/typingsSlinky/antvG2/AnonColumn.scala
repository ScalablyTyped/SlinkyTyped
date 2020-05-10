package typingsSlinky.antvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumn extends js.Object {
  /**
    * 一般的柱状图占比 1/2
    */
  var column: Double = js.native
  /**
    * 多层的饼图、环图
    */
  var multiplePie: Double = js.native
  /**
    * 玫瑰图柱状占比 1
    */
  var rose: Double = js.native
}

object AnonColumn {
  @scala.inline
  def apply(column: Double, multiplePie: Double, rose: Double): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], multiplePie = multiplePie.asInstanceOf[js.Any], rose = rose.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
  @scala.inline
  implicit class AnonColumnOps[Self <: AnonColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("column")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiplePie(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiplePie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRose(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rose")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

