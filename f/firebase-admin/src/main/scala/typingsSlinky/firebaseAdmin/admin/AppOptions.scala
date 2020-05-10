package typingsSlinky.firebaseAdmin.admin

import typingsSlinky.firebaseAdmin.admin.credential.Credential
import typingsSlinky.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Available options to pass to [`initializeApp()`](admin#.initializeApp).
  */
@js.native
trait AppOptions extends js.Object {
  /**
    * A {@link admin.credential.Credential `Credential`} object used to
    * authenticate the Admin SDK.
    *
    * See [Initialize the SDK](/docs/admin/setup#initialize_the_sdk) for detailed
    * documentation and code samples.
    */
  var credential: js.UndefOr[Credential] = js.native
  /**
    * The object to use as the [`auth`](/docs/reference/security/database/#auth)
    * variable in your Realtime Database Rules when the Admin SDK reads from or
    * writes to the Realtime Database. This allows you to downscope the Admin SDK
    * from its default full read and write privileges.
    *
    * You can pass `null` to act as an unauthenticated client.
    *
    * See
    * [Authenticate with limited privileges](/docs/database/admin/start#authenticate-with-limited-privileges)
    * for detailed documentation and code samples.
    */
  var databaseAuthVariableOverride: js.UndefOr[js.Object | Null] = js.native
  /**
    * The URL of the Realtime Database from which to read and write data.
    */
  var databaseURL: js.UndefOr[String] = js.native
  /**
    * An [HTTP Agent](https://nodejs.org/api/http.html#http_class_http_agent)
    * to be used when making outgoing HTTP calls. This Agent instance is used
    * by all services that make REST calls (e.g. `auth`, `messaging`,
    * `projectManagement`).
    *
    * Realtime Database and Firestore use other means of communicating with
    * the backend servers, so they do not use this HTTP Agent. `Credential`
    * instances also do not use this HTTP Agent, but instead support
    * specifying an HTTP Agent in the corresponding factory methods.
    */
  var httpAgent: js.UndefOr[Agent] = js.native
  /**
    * The ID of the Google Cloud project associated with the App.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * The ID of the service account to be used for signing custom tokens. This
    * can be found in the `client_email` field of a service account JSON file.
    */
  var serviceAccountId: js.UndefOr[String] = js.native
  /**
    * The name of the Google Cloud Storage bucket used for storing application data.
    * Use only the bucket name without any prefixes or additions (do *not* prefix
    * the name with "gs://").
    */
  var storageBucket: js.UndefOr[String] = js.native
}

object AppOptions {
  @scala.inline
  def apply(): AppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppOptions]
  }
  @scala.inline
  implicit class AppOptionsOps[Self <: AppOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredential(value: Credential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseAuthVariableOverride(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseAuthVariableOverride")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseAuthVariableOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseAuthVariableOverride")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseAuthVariableOverrideNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseAuthVariableOverride")(null)
        ret
    }
    @scala.inline
    def withDatabaseURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseURL")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpAgent(value: Agent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpAgent")(js.undefined)
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
    def withServiceAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageBucket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageBucket")(js.undefined)
        ret
    }
  }
  
}

