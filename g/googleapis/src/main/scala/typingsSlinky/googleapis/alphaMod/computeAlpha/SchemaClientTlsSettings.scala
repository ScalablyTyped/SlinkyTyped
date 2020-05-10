package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client side authentication settings for connection originating from the
  * backend service.
  */
@js.native
trait SchemaClientTlsSettings extends js.Object {
  /**
    * Configures the mechanism to obtain client-side security certificates and
    * identity information. This field is only applicable when mode is set to
    * MUTUAL.
    */
  var clientTlsContext: js.UndefOr[SchemaTlsContext] = js.native
  /**
    * Indicates whether connections to this port should be secured using TLS.
    * The value of this field determines how TLS is enforced. This can be set
    * to one of the following values: DISABLE: Do not setup a TLS connection to
    * the backends. SIMPLE: Originate a TLS connection to the backends. MUTUAL:
    * Secure connections to the backends using mutual TLS by presenting client
    * certificates for authentication.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * SNI string to present to the server during TLS handshake. This field is
    * applicable only when mode is SIMPLE or MUTUAL.
    */
  var sni: js.UndefOr[String] = js.native
  /**
    * A list of alternate names to verify the subject identity in the
    * certificate.If specified, the proxy will verify that the server
    * certificate&#39;s subject alt name matches one of the specified values.
    * This field is applicable only when mode is SIMPLE or MUTUAL.
    */
  var subjectAltNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaClientTlsSettings {
  @scala.inline
  def apply(): SchemaClientTlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientTlsSettings]
  }
  @scala.inline
  implicit class SchemaClientTlsSettingsOps[Self <: SchemaClientTlsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientTlsContext(value: SchemaTlsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTlsContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientTlsContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientTlsContext")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withSni(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sni")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSni: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sni")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectAltNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectAltNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectAltNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectAltNames")(js.undefined)
        ret
    }
  }
  
}

