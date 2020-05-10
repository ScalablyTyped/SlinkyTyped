package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The TLS settings for the server.
  */
@js.native
trait SchemaServerTlsSettings extends js.Object {
  /**
    * Configures the mechanism to obtain security certificates and identity
    * information.
    */
  var proxyTlsContext: js.UndefOr[SchemaTlsContext] = js.native
  /**
    * A list of alternate names to verify the subject identity in the
    * certificate presented by the client.
    */
  var subjectAltNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates whether connections should be secured using TLS. The value of
    * this field determines how TLS is enforced. This field can be set to one
    * of the following:   - SIMPLE Secure connections with standard TLS
    * semantics.   - MUTUAL Secure connections to the backends using mutual TLS
    * by presenting client certificates for authentication.
    */
  var tlsMode: js.UndefOr[String] = js.native
}

object SchemaServerTlsSettings {
  @scala.inline
  def apply(): SchemaServerTlsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerTlsSettings]
  }
  @scala.inline
  implicit class SchemaServerTlsSettingsOps[Self <: SchemaServerTlsSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProxyTlsContext(value: SchemaTlsContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyTlsContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyTlsContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyTlsContext")(js.undefined)
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
    @scala.inline
    def withTlsMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tlsMode")(js.undefined)
        ret
    }
  }
  
}

