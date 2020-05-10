package typingsSlinky.nodePushnotifications

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddress extends js.Object {
  var address: js.UndefOr[String] = js.native
  var autoAdjustCache: js.UndefOr[Boolean] = js.native
  var buffersNotifications: js.UndefOr[Boolean] = js.native
  /**
    * An array of trusted certificates. Each element should contain either a filename to load, or a
    * Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs
    * will be used. - You may need to use this as some environments don't include the CA used by
    * Apple (entrust_2048).
    */
  var ca: js.UndefOr[js.Array[Buffer | String]] = js.native
  var cacheLength: js.UndefOr[Double] = js.native
  /**
    * The filename of the connection certificate to load from disk, or a Buffer/String containing the
    * certificate data.
    */
  var cert: js.UndefOr[String] = js.native
  var connectTimeout: js.UndefOr[Double] = js.native
  var connectionRetryLimit: js.UndefOr[Double] = js.native
  var connectionTimeout: js.UndefOr[Double] = js.native
  var disableEPIPEFix: js.UndefOr[Boolean] = js.native
  var disableNagle: js.UndefOr[Boolean] = js.native
  var fastMode: js.UndefOr[Boolean] = js.native
  /** The filename of the connection key to load from disk, or a Buffer or String containing the key data. */
  var key: js.UndefOr[String] = js.native
  var maxConnections: js.UndefOr[Double] = js.native
  var minConnections: js.UndefOr[Double] = js.native
  /** The passphrase for the connection key, if required */
  var passphrase: js.UndefOr[String] = js.native
  /**
    * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing
    * the PFX data. If supplied will always be used instead of certificate and key above.
    */
  var pfx: js.UndefOr[Buffer | String] = js.native
  var port: js.UndefOr[Double] = js.native
  var production: js.UndefOr[Boolean] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /** APN Token */
  var token: js.UndefOr[AnonKey] = js.native
  var voip: js.UndefOr[Boolean] = js.native
}

object AnonAddress {
  @scala.inline
  def apply(): AnonAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAddress]
  }
  @scala.inline
  implicit class AnonAddressOps[Self <: AnonAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAdjustCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAdjustCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAdjustCache")(js.undefined)
        ret
    }
    @scala.inline
    def withBuffersNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffersNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuffersNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffersNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withCa(value: js.Array[Buffer | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ca")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheLength")(js.undefined)
        ret
    }
    @scala.inline
    def withCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionRetryLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionRetryLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionRetryLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableEPIPEFix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEPIPEFix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableEPIPEFix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableEPIPEFix")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableNagle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNagle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableNagle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableNagle")(js.undefined)
        ret
    }
    @scala.inline
    def withFastMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastMode")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withMinConnections(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minConnections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinConnections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minConnections")(js.undefined)
        ret
    }
    @scala.inline
    def withPassphrase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassphrase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passphrase")(js.undefined)
        ret
    }
    @scala.inline
    def withPfx(value: Buffer | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPfx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pfx")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withProduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: AnonKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withVoip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voip")(js.undefined)
        ret
    }
  }
  
}

