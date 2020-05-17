package typingsSlinky.instagramPrivateApi.anon

import typingsSlinky.instagramPrivateApi.instagramPrivateApiStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Countrycode extends js.Object {
  var country_code: String = js.native
  var source: js.Array[String | default] = js.native
}

object Countrycode {
  @scala.inline
  def apply(country_code: String, source: js.Array[String | default]): Countrycode = {
    val __obj = js.Dynamic.literal(country_code = country_code.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countrycode]
  }
  @scala.inline
  implicit class CountrycodeOps[Self <: Countrycode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountry_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: js.Array[String | default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

