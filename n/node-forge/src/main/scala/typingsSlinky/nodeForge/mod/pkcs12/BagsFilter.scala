package typingsSlinky.nodeForge.mod.pkcs12

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BagsFilter extends js.Object {
  var bagType: js.UndefOr[String] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  var localKeyId: js.UndefOr[String] = js.native
  var localKeyIdHex: js.UndefOr[String] = js.native
}

object BagsFilter {
  @scala.inline
  def apply(): BagsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BagsFilter]
  }
  @scala.inline
  implicit class BagsFilterOps[Self <: BagsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBagType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bagType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBagType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bagType")(js.undefined)
        ret
    }
    @scala.inline
    def withFriendlyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFriendlyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("friendlyName")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalKeyIdHex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localKeyIdHex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalKeyIdHex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localKeyIdHex")(js.undefined)
        ret
    }
  }
  
}

