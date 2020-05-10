package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojrouterMod.urlParamAdapter
import typingsSlinky.oracleOraclejet.ojrouterMod.urlPathAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var rootInstanceName: js.UndefOr[String] = js.native
  var urlAdapter: js.UndefOr[urlPathAdapter | urlParamAdapter] = js.native
}

object AnonBaseUrl {
  @scala.inline
  def apply(): AnonBaseUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBaseUrl]
  }
  @scala.inline
  implicit class AnonBaseUrlOps[Self <: AnonBaseUrl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRootInstanceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootInstanceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootInstanceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootInstanceName")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlAdapter(value: urlPathAdapter | urlParamAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlAdapter")(js.undefined)
        ret
    }
  }
  
}

