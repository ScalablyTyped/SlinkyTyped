package typingsSlinky.builderUtil.fsMod

import typingsSlinky.fsExtra.mod.Stats
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyDirOptions extends js.Object {
  var filter: js.UndefOr[Filter | Null] = js.native
  var isUseHardLink: js.UndefOr[(js.Function1[/* file */ String, Boolean]) | Null] = js.native
  var transformer: js.UndefOr[FileTransformer | Null] = js.native
}

object CopyDirOptions {
  @scala.inline
  def apply(): CopyDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDirOptions]
  }
  @scala.inline
  implicit class CopyDirOptionsOps[Self <: CopyDirOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: (/* file */ String, /* stat */ Stats) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(null)
        ret
    }
    @scala.inline
    def withIsUseHardLink(value: /* file */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUseHardLink")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsUseHardLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUseHardLink")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUseHardLinkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUseHardLink")(null)
        ret
    }
    @scala.inline
    def withTransformer(
      value: /* file */ String => (js.Promise[Null | String | Buffer | CopyFileTransformer]) | Null | String | Buffer | CopyFileTransformer
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformer")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformer")(null)
        ret
    }
  }
  
}

