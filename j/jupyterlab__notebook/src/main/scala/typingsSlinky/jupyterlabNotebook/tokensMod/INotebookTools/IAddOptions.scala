package typingsSlinky.jupyterlabNotebook.tokensMod.INotebookTools

import typingsSlinky.jupyterlabNotebook.jupyterlabNotebookStrings.advanced
import typingsSlinky.jupyterlabNotebook.jupyterlabNotebookStrings.common
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to add an item to the notebook tools.
  */
@js.native
trait IAddOptions extends js.Object {
  /**
    * The rank order of the widget among its siblings.
    */
  var rank: js.UndefOr[Double] = js.native
  /**
    * The section to which the tool should be added.
    */
  var section: js.UndefOr[common | advanced] = js.native
  /**
    * The tool to add to the notebook tools area.
    */
  var tool: ITool = js.native
}

object IAddOptions {
  @scala.inline
  def apply(tool: ITool): IAddOptions = {
    val __obj = js.Dynamic.literal(tool = tool.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAddOptions]
  }
  @scala.inline
  implicit class IAddOptionsOps[Self <: IAddOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTool(value: ITool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withSection(value: common | advanced): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("section")(js.undefined)
        ret
    }
  }
  
}

