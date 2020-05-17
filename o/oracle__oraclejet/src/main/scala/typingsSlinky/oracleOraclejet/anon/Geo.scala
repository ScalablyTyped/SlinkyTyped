package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geo extends js.Object {
  var geo: js.Object = js.native
  var propertiesKeys: LongLabel = js.native
}

object Geo {
  @scala.inline
  def apply(geo: js.Object, propertiesKeys: LongLabel): Geo = {
    val __obj = js.Dynamic.literal(geo = geo.asInstanceOf[js.Any], propertiesKeys = propertiesKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geo]
  }
  @scala.inline
  implicit class GeoOps[Self <: Geo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertiesKeys(value: LongLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertiesKeys")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

