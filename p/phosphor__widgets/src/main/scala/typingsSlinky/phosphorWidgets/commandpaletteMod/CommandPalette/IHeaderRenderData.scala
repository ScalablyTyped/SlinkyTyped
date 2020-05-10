package typingsSlinky.phosphorWidgets.commandpaletteMod.CommandPalette

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The render data for a command palette header.
  */
@js.native
trait IHeaderRenderData extends js.Object {
  /**
    * The category of the header.
    */
  val category: String = js.native
  /**
    * The indices of the matched characters in the category.
    */
  val indices: js.Array[Double] | Null = js.native
}

object IHeaderRenderData {
  @scala.inline
  def apply(category: String): IHeaderRenderData = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeaderRenderData]
  }
  @scala.inline
  implicit class IHeaderRenderDataOps[Self <: IHeaderRenderData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndicesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(null)
        ret
    }
  }
  
}

