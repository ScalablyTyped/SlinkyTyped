package typingsSlinky.jupyterlabCoreutils.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.IRawCellMetadata> */
@js.native
trait PartialIRawCellMetadata extends js.Object {
  var format: js.UndefOr[String] = js.native
  var jupyter: js.UndefOr[PartialIBaseCellJupyterMe] = js.native
  var name: js.UndefOr[String] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var trusted: js.UndefOr[Boolean] = js.native
}

object PartialIRawCellMetadata {
  @scala.inline
  def apply(): PartialIRawCellMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIRawCellMetadata]
  }
  @scala.inline
  implicit class PartialIRawCellMetadataOps[Self <: PartialIRawCellMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withJupyter(value: PartialIBaseCellJupyterMe): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jupyter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJupyter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jupyter")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTrusted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrusted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusted")(js.undefined)
        ret
    }
  }
  
}

