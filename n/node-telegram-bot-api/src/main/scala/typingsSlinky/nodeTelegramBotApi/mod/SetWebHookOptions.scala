package typingsSlinky.nodeTelegramBotApi.mod

import typingsSlinky.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetWebHookOptions extends js.Object {
  var allowed_updates: js.UndefOr[js.Array[String]] = js.native
  var certificate: js.UndefOr[String | Stream] = js.native
  var max_connections: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object SetWebHookOptions {
  @scala.inline
  def apply(): SetWebHookOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetWebHookOptions]
  }
  @scala.inline
  implicit class SetWebHookOptionsOps[Self <: SetWebHookOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed_updates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_updates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowed_updates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed_updates")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificate(value: String | Stream): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificate")(js.undefined)
        ret
    }
    @scala.inline
    def withMax_connections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_connections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax_connections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_connections")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

