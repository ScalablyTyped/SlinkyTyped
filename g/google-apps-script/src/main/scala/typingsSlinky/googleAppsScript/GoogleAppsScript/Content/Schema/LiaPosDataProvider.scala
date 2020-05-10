package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiaPosDataProvider extends js.Object {
  var posDataProviderId: js.UndefOr[String] = js.native
  var posExternalAccountId: js.UndefOr[String] = js.native
}

object LiaPosDataProvider {
  @scala.inline
  def apply(): LiaPosDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaPosDataProvider]
  }
  @scala.inline
  implicit class LiaPosDataProviderOps[Self <: LiaPosDataProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosDataProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosDataProviderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviderId")(js.undefined)
        ret
    }
    @scala.inline
    def withPosExternalAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posExternalAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosExternalAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posExternalAccountId")(js.undefined)
        ret
    }
  }
  
}

