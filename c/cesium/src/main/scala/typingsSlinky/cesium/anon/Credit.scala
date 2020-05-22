package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credit extends js.Object {
  var credit: js.UndefOr[typingsSlinky.cesium.mod.Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var tilingScheme: js.UndefOr[typingsSlinky.cesium.mod.TilingScheme] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var url: String
}

object Credit {
  @scala.inline
  def apply(
    url: String,
    credit: typingsSlinky.cesium.mod.Credit | String = null,
    ellipsoid: typingsSlinky.cesium.mod.Ellipsoid = null,
    proxy: js.Any = null,
    tilingScheme: typingsSlinky.cesium.mod.TilingScheme = null,
    token: String = null
  ): Credit = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credit]
  }
}

