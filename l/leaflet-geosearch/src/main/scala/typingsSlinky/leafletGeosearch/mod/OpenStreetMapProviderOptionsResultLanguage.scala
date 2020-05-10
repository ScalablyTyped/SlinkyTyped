package typingsSlinky.leafletGeosearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenStreetMapProviderOptionsResultLanguage extends js.Object {
  var `accept-language`: js.UndefOr[String] = js.native
}

object OpenStreetMapProviderOptionsResultLanguage {
  @scala.inline
  def apply(): OpenStreetMapProviderOptionsResultLanguage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenStreetMapProviderOptionsResultLanguage]
  }
  @scala.inline
  implicit class OpenStreetMapProviderOptionsResultLanguageOps[Self <: OpenStreetMapProviderOptionsResultLanguage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAccept-language`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAccept-language`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accept-language")(js.undefined)
        ret
    }
  }
  
}

