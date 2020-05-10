package typingsSlinky.ipp

import typingsSlinky.ipp.mod.CharacterSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIppattributefidelity extends js.Object {
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.native
  var `attributes-natural-language`: js.UndefOr[String] = js.native
  var `ipp-attribute-fidelity`: js.UndefOr[Boolean] = js.native
  var `job-impressions`: js.UndefOr[Double] = js.native
  var `job-k-octets`: js.UndefOr[Double] = js.native
  var `job-media-sheets`: js.UndefOr[Double] = js.native
  var `job-name`: js.UndefOr[String] = js.native
  var `printer-uri`: js.UndefOr[String] = js.native
  var `requesting-user-name`: String = js.native
}

object AnonIppattributefidelity {
  @scala.inline
  def apply(`requesting-user-name`: String): AnonIppattributefidelity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIppattributefidelity]
  }
  @scala.inline
  implicit class AnonIppattributefidelityOps[Self <: AnonIppattributefidelity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withRequesting-user-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesting-user-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withAttributes-charset`(value: CharacterSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-charset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAttributes-charset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-charset")(js.undefined)
        ret
    }
    @scala.inline
    def `withAttributes-natural-language`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-natural-language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutAttributes-natural-language`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes-natural-language")(js.undefined)
        ret
    }
    @scala.inline
    def `withIpp-attribute-fidelity`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipp-attribute-fidelity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutIpp-attribute-fidelity`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipp-attribute-fidelity")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-impressions`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-impressions`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-impressions")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-k-octets`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-k-octets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-k-octets`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-k-octets")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-media-sheets`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-media-sheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-media-sheets`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-media-sheets")(js.undefined)
        ret
    }
    @scala.inline
    def `withJob-name`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutJob-name`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("job-name")(js.undefined)
        ret
    }
    @scala.inline
    def `withPrinter-uri`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutPrinter-uri`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printer-uri")(js.undefined)
        ret
    }
  }
  
}

