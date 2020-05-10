package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiasettingsListPosDataProvidersResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var posDataProviders: js.UndefOr[js.Array[PosDataProviders]] = js.native
}

object LiasettingsListPosDataProvidersResponse {
  @scala.inline
  def apply(): LiasettingsListPosDataProvidersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsListPosDataProvidersResponse]
  }
  @scala.inline
  implicit class LiasettingsListPosDataProvidersResponseOps[Self <: LiasettingsListPosDataProvidersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPosDataProviders(value: js.Array[PosDataProviders]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosDataProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviders")(js.undefined)
        ret
    }
  }
  
}

