package typingsSlinky.reactDatagrid.mod.ReactDataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowProps extends js.Object {
  /**
    * a class name for the row
    */
  var className: String = js.native
  /**
    * the index of the row
    */
  var index: Double = js.native
  /**
    * a class name for the row when the mouse is over it
    */
  var overClassName: String = js.native
  /**
    * a class name for the row when selected
    */
  var selectedClassName: String = js.native
}

object RowProps {
  @scala.inline
  def apply(className: String, index: Double, overClassName: String, selectedClassName: String): RowProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], overClassName = overClassName.asInstanceOf[js.Any], selectedClassName = selectedClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
  @scala.inline
  implicit class RowPropsOps[Self <: RowProps] (val x: Self) extends AnyVal {
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
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedClassName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

