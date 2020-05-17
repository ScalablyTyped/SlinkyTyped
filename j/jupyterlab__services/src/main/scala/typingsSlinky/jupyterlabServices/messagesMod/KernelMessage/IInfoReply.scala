package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Text
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'kernel_info_reply'` message content.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-info).
  */
@js.native
trait IInfoReply extends IReplyOkContent {
  var banner: String = js.native
  var help_links: js.Array[Text] = js.native
  var implementation: String = js.native
  var implementation_version: String = js.native
  var language_info: ILanguageInfo = js.native
  var protocol_version: String = js.native
}

object IInfoReply {
  @scala.inline
  def apply(
    banner: String,
    help_links: js.Array[Text],
    implementation: String,
    implementation_version: String,
    language_info: ILanguageInfo,
    protocol_version: String,
    status: ok
  ): IInfoReply = {
    val __obj = js.Dynamic.literal(banner = banner.asInstanceOf[js.Any], help_links = help_links.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], implementation_version = implementation_version.asInstanceOf[js.Any], language_info = language_info.asInstanceOf[js.Any], protocol_version = protocol_version.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoReply]
  }
  @scala.inline
  implicit class IInfoReplyOps[Self <: IInfoReply] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBanner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("banner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelp_links(value: js.Array[Text]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help_links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplementation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplementation_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage_info(value: ILanguageInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol_version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

