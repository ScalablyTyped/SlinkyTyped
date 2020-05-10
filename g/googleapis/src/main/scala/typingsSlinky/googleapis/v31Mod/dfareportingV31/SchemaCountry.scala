package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a country that can be targeted by ads.
  */
@js.native
trait SchemaCountry extends js.Object {
  /**
    * Country code.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * DART ID of this country. This is the ID used for targeting and generating
    * reports.
    */
  var dartId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#country&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this country.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether ad serving supports secure servers in this country.
    */
  var sslEnabled: js.UndefOr[Boolean] = js.native
}

object SchemaCountry {
  @scala.inline
  def apply(): SchemaCountry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountry]
  }
  @scala.inline
  implicit class SchemaCountryOps[Self <: SchemaCountry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDartId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dartId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDartId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dartId")(js.undefined)
        ret
    }
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSslEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslEnabled")(js.undefined)
        ret
    }
  }
  
}

