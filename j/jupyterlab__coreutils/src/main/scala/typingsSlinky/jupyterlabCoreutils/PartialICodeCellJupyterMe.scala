package typingsSlinky.jupyterlabCoreutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.ICodeCellJupyterMetadata> */
@js.native
trait PartialICodeCellJupyterMe extends js.Object {
  var outputs_hidden: js.UndefOr[Boolean] = js.native
  var source_hidden: js.UndefOr[Boolean] = js.native
}

object PartialICodeCellJupyterMe {
  @scala.inline
  def apply(): PartialICodeCellJupyterMe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialICodeCellJupyterMe]
  }
  @scala.inline
  implicit class PartialICodeCellJupyterMeOps[Self <: PartialICodeCellJupyterMe] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutOutputs_hidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs_hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withSource_hidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource_hidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_hidden")(js.undefined)
        ret
    }
  }
  
}

