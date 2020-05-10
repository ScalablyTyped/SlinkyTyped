package typingsSlinky.navermaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCountry extends js.Object {
  var country: String = js.native
  var dongmyun: String = js.native
  var rest: String = js.native
  var sido: String = js.native
  var sigugun: String = js.native
}

object AnonCountry {
  @scala.inline
  def apply(country: String, dongmyun: String, rest: String, sido: String, sigugun: String): AnonCountry = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], dongmyun = dongmyun.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], sido = sido.asInstanceOf[js.Any], sigugun = sigugun.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCountry]
  }
  @scala.inline
  implicit class AnonCountryOps[Self <: AnonCountry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDongmyun(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dongmyun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSido(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sido")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSigugun(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sigugun")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

