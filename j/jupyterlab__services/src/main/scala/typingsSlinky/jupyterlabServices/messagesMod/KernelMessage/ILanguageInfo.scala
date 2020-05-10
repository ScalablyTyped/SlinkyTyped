package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ILanguageInfoMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The kernel language information specification.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
  */
@js.native
trait ILanguageInfo extends ILanguageInfoMetadata {
  var nbconverter_exporter: js.UndefOr[String] = js.native
  var version: String = js.native
}

object ILanguageInfo {
  @scala.inline
  def apply(name: String, version: String): ILanguageInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfo]
  }
  @scala.inline
  implicit class ILanguageInfoOps[Self <: ILanguageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNbconverter_exporter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbconverter_exporter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNbconverter_exporter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbconverter_exporter")(js.undefined)
        ret
    }
  }
  
}

