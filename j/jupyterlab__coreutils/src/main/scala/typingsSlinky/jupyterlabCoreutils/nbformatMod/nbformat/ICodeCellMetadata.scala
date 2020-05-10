package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.jupyterlabCoreutils.PartialICodeCellJupyterMe
import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for a code cell.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ICellMetadata because Already inherited */ @js.native
trait ICodeCellMetadata extends IBaseCellMetadata {
  /**
    * Whether the cell is collapsed/expanded.
    */
  var collapsed: Boolean = js.native
  /**
    * The Jupyter metadata namespace
    */
  @JSName("jupyter")
  var jupyter_ICodeCellMetadata: PartialICodeCellJupyterMe = js.native
  /**
    * Whether the cell's output is scrolled, unscrolled, or autoscrolled.
    */
  var scrolled: Boolean | auto = js.native
}

object ICodeCellMetadata {
  @scala.inline
  def apply(
    collapsed: Boolean,
    jupyter: PartialICodeCellJupyterMe,
    name: String,
    scrolled: Boolean | auto,
    tags: js.Array[String],
    trusted: Boolean
  ): ICodeCellMetadata = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], jupyter = jupyter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], trusted = trusted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCellMetadata]
  }
  @scala.inline
  implicit class ICodeCellMetadataOps[Self <: ICodeCellMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJupyter(value: PartialICodeCellJupyterMe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jupyter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrolled(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

