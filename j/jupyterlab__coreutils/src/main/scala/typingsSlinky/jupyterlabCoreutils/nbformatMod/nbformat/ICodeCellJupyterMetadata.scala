package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Jupyter metadata namespace for code cells.
  */
@js.native
trait ICodeCellJupyterMetadata extends IBaseCellJupyterMetadata {
  /**
    * Whether the outputs are hidden. See https://github.com/jupyter/nbformat/issues/137.
    */
  var outputs_hidden: Boolean = js.native
}

object ICodeCellJupyterMetadata {
  @scala.inline
  def apply(outputs_hidden: Boolean, source_hidden: Boolean): ICodeCellJupyterMetadata = {
    val __obj = js.Dynamic.literal(outputs_hidden = outputs_hidden.asInstanceOf[js.Any], source_hidden = source_hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCellJupyterMetadata]
  }
  @scala.inline
  implicit class ICodeCellJupyterMetadataOps[Self <: ICodeCellJupyterMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputs_hidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs_hidden")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

