package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetId extends js.Object {
  var accessToken: js.UndefOr[String] = js.native
  var assetId: Double = js.native
  var server: js.UndefOr[String] = js.native
}

object AssetId {
  @scala.inline
  def apply(assetId: Double): AssetId = {
    val __obj = js.Dynamic.literal(assetId = assetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetId]
  }
  @scala.inline
  implicit class AssetIdOps[Self <: AssetId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssetId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("server")(js.undefined)
        ret
    }
  }
  
}

