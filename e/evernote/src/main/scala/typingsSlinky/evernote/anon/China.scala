package typingsSlinky.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait China extends js.Object {
  var china: js.UndefOr[Boolean] = js.native
  var consumerKey: js.UndefOr[String] = js.native
  var consumerSecret: js.UndefOr[String] = js.native
  var sandbox: js.UndefOr[Boolean] = js.native
  var serviceHost: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
}

object China {
  @scala.inline
  def apply(): China = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[China]
  }
  @scala.inline
  implicit class ChinaOps[Self <: China] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChina(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("china")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChina: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("china")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumerKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerKey")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumerSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withSandbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceHost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceHost")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

