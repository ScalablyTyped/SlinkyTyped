package typingsSlinky.antd

import typingsSlinky.propTypes.mod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGrid extends js.Object {
  var grid: Requireable[_] = js.native
  var itemLayout: Requireable[String] = js.native
}

object AnonGrid {
  @scala.inline
  def apply(grid: Requireable[_], itemLayout: Requireable[String]): AnonGrid = {
    val __obj = js.Dynamic.literal(grid = grid.asInstanceOf[js.Any], itemLayout = itemLayout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGrid]
  }
  @scala.inline
  implicit class AnonGridOps[Self <: AnonGrid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrid(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemLayout(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLayout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

