package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudFirestore.anon.Clientemail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings
  extends /* key */ StringDictionary[js.Any] {
  /**
    * The 'client_email' and 'private_key' properties of the service account
    * to use with your Firestore project. Can be omitted in environments that
    * support {@link https://cloud.google.com/docs/authentication Application
    * Default Credentials}. If your credentials are stored in a JSON file, you
    * can specify a `keyFilename` instead.
    */
  var credentials: js.UndefOr[Clientemail] = js.native
  /** The hostname to connect to. */
  var host: js.UndefOr[String] = js.native
  /**
    * Local file containing the Service Account credentials as downloaded from
    * the Google Developers Console. Can  be omitted in environments that
    * support {@link https://cloud.google.com/docs/authentication Application
    * Default Credentials}. To configure Firestore with custom credentials, use
    * the `credentials` property to provide the `client_email` and
    * `private_key` of your service account.
    */
  var keyFilename: js.UndefOr[String] = js.native
  /**
    * The maximum number of idle GRPC channels to keep. A smaller number of idle
    * channels reduces memory usage but increases request latency for clients
    * with fluctuating request rates. If set to 0, shuts down all GRPC channels
    * when the client becomes idle. Defaults to 1.
    */
  var maxIdleChannels: js.UndefOr[Double] = js.native
  /** The port to connect to. */
  var port: js.UndefOr[Double] = js.native
  /**
    * The project ID from the Google Developer's Console, e.g.
    * 'grape-spaceship-123'. We will also check the environment variable
    * GCLOUD_PROJECT for your project ID.  Can be omitted in environments that
    * support {@link https://cloud.google.com/docs/authentication Application
    * Default Credentials}
    */
  var projectId: js.UndefOr[String] = js.native
  /** Whether to use SSL when connecting. */
  var ssl: js.UndefOr[Boolean] = js.native
}

object Settings {
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: Clientemail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxIdleChannels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIdleChannels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxIdleChannels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxIdleChannels")(js.undefined)
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
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withSsl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssl")(js.undefined)
        ret
    }
  }
  
}

