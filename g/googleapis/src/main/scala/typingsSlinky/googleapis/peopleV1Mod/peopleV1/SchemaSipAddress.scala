package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s SIP address. Session Initial Protocol addresses are used for
  * VoIP communications to make voice or video calls over the internet.
  */
@js.native
trait SchemaSipAddress extends js.Object {
  /**
    * The read-only type of the SIP address translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.native
  /**
    * Metadata about the SIP address.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The type of the SIP address. The type can be custom or or one of these
    * predefined values:  * `home` * `work` * `mobile` * `other`
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The SIP address in the [RFC
    * 3261 19.1](https://tools.ietf.org/html/rfc3261#section-19.1) SIP URI
    * format.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaSipAddress {
  @scala.inline
  def apply(): SchemaSipAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSipAddress]
  }
  @scala.inline
  implicit class SchemaSipAddressOps[Self <: SchemaSipAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedType")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: SchemaFieldMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

