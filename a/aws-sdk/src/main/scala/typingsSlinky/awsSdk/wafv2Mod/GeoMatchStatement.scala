package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoMatchStatement extends js.Object {
  /**
    * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the ISO 3166 international standard. 
    */
  var CountryCodes: js.UndefOr[typingsSlinky.awsSdk.wafv2Mod.CountryCodes] = js.native
}

object GeoMatchStatement {
  @scala.inline
  def apply(): GeoMatchStatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoMatchStatement]
  }
  @scala.inline
  implicit class GeoMatchStatementOps[Self <: GeoMatchStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryCodes(value: CountryCodes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CountryCodes")(js.undefined)
        ret
    }
  }
  
}

