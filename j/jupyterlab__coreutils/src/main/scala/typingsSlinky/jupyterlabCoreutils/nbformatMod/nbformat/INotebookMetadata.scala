package typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default metadata for the notebook.
  */
@js.native
trait INotebookMetadata extends JSONObject {
  var kernelspec: js.UndefOr[IKernelspecMetadata] = js.native
  var language_info: js.UndefOr[ILanguageInfoMetadata] = js.native
  var orig_nbformat: Double = js.native
}

object INotebookMetadata {
  @scala.inline
  def apply(orig_nbformat: Double): INotebookMetadata = {
    val __obj = js.Dynamic.literal(orig_nbformat = orig_nbformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookMetadata]
  }
  @scala.inline
  implicit class INotebookMetadataOps[Self <: INotebookMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOrig_nbformat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orig_nbformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelspec(value: IKernelspecMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelspec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKernelspec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelspec")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage_info(value: ILanguageInfoMetadata): Self = {
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
  }
  
}

