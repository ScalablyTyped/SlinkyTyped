package typingsSlinky.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INotebookMetadata extends js.Object {
  var kernelspec: IKernelInfo = js.native
  var language_info: js.UndefOr[ILanguageInfo] = js.native
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object INotebookMetadata {
  @scala.inline
  def apply(kernelspec: IKernelInfo): INotebookMetadata = {
    val __obj = js.Dynamic.literal(kernelspec = kernelspec.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookMetadata]
  }
  @scala.inline
  implicit class INotebookMetadataOps[Self <: INotebookMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKernelspec(value: IKernelInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelspec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage_info(value: ILanguageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage_info: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_info")(js.undefined)
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
  }
  
}

