package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Credentials that can be used to authenticate as a service account.
  */
@js.native
trait SchemaServiceAccountKey extends js.Object {
  /**
    * The body of the private key credentials file, in string format. This is
    * only populated when the ServiceAccountKey is created, and is not stored
    * by Google.
    */
  var data: js.UndefOr[String] = js.native
  /**
    * An opaque, unique identifier for this ServiceAccountKey. Assigned by the
    * server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#serviceAccountKey&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Public key data for the credentials file. This is an X.509 cert. If you
    * are using the googleCredentials key type, this is identical to the cert
    * that can be retrieved by using the X.509 cert url inside of the
    * credentials file.
    */
  var publicData: js.UndefOr[String] = js.native
  /**
    * The file format of the generated key data.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaServiceAccountKey {
  @scala.inline
  def apply(): SchemaServiceAccountKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountKey]
  }
  @scala.inline
  implicit class SchemaServiceAccountKeyOps[Self <: SchemaServiceAccountKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withPublicData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicData")(js.undefined)
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
  }
  
}

