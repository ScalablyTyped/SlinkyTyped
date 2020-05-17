package typingsSlinky.jupyterlabCoreutils.anon

import typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/coreutils.@jupyterlab/coreutils/lib/nbformat.nbformat.ICodeCellMetadata> */
@js.native
trait PartialICodeCellMetadata extends js.Object {
  var collapsed: js.UndefOr[Boolean] = js.native
  var jupyter: js.UndefOr[PartialICodeCellJupyterMe] = js.native
  var name: js.UndefOr[String] = js.native
  var scrolled: js.UndefOr[Boolean | auto] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
  var trusted: js.UndefOr[Boolean] = js.native
}

object PartialICodeCellMetadata {
  @scala.inline
  def apply(): PartialICodeCellMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialICodeCellMetadata]
  }
  @scala.inline
  implicit class PartialICodeCellMetadataOps[Self <: PartialICodeCellMetadata] (val x: Self) extends AnyVal {
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
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withJupyter(value: PartialICodeCellJupyterMe): Self = {
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
    def withScrolled(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrolled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrolled")(js.undefined)
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

