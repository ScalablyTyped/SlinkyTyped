package typingsSlinky.gcsResumableUpload.mod

import typingsSlinky.googleAuthLibrary.googleauthMod.GoogleAuthOptions
import typingsSlinky.googleAuthLibrary.mod.GoogleAuth
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadConfig extends js.Object {
  /**
    * The API endpoint used for the request.
    * Defaults to `storage.googleapis.com`.
    */
  var apiEndpoint: js.UndefOr[String] = js.native
  /**
    * If you want to re-use an auth client from google-auto-auth, pass an
    * instance here.
    */
  var authClient: js.UndefOr[GoogleAuth] = js.native
  /**
    * The GoogleAuthOptions passed to google-auth-library
    */
  var authConfig: js.UndefOr[GoogleAuthOptions] = js.native
  /**
    * The name of the destination bucket.
    */
  var bucket: String = js.native
  /**
    * Where the gcs-resumable-upload configuration file should be stored on your
    * system. This maps to the configstore option by the same name.
    */
  var configPath: js.UndefOr[String] = js.native
  /**
    * The name of the destination file.
    */
  var file: String = js.native
  /**
    * This will cause the upload to fail if the current generation of the remote
    * object does not match the one provided here.
    */
  var generation: js.UndefOr[Double] = js.native
  /**
    * A customer-supplied encryption key. See
    * https://cloud.google.com/storage/docs/encryption#customer-supplied.
    */
  var key: js.UndefOr[String | Buffer] = js.native
  /**
    * Resource name of the Cloud KMS key, of the form
    * `projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key`,
    * that will be used to encrypt the object. Overrides the object metadata's
    * `kms_key_name` value, if any.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
  /**
    * Any metadata you wish to set on the object.
    */
  var metadata: js.UndefOr[ConfigMetadata] = js.native
  /**
    * The starting byte of the upload stream, for resuming an interrupted upload.
    * See
    * https://cloud.google.com/storage/docs/json_api/v1/how-tos/resumable-upload#resume-upload.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Set an Origin header when creating the resumable upload URI.
    */
  var origin: js.UndefOr[String] = js.native
  /**
    * Specify query parameters that go along with the initial upload request. See
    * https://cloud.google.com/storage/docs/json_api/v1/objects/insert#parameters
    */
  var params: js.UndefOr[QueryParameters] = js.native
  /**
    * Apply a predefined set of access controls to the created file.
    */
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
  /**
    * Make the uploaded file private. (Alias for config.predefinedAcl =
    * 'private')
    */
  var `private`: js.UndefOr[Boolean] = js.native
  /**
    * Make the uploaded file public. (Alias for config.predefinedAcl =
    * 'publicRead')
    */
  var public: js.UndefOr[Boolean] = js.native
  /**
    * If you already have a resumable URI from a previously-created resumable
    * upload, just pass it in here and we'll use that.
    */
  var uri: js.UndefOr[String] = js.native
  /**
    * If the bucket being accessed has requesterPays functionality enabled, this
    * can be set to control which project is billed for the access of this file.
    */
  var userProject: js.UndefOr[String] = js.native
}

object UploadConfig {
  @scala.inline
  def apply(bucket: String, file: String): UploadConfig = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadConfig]
  }
  @scala.inline
  implicit class UploadConfigOps[Self <: UploadConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthClient(value: GoogleAuth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authClient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authClient")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthConfig(value: GoogleAuthOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configPath")(js.undefined)
        ret
    }
    @scala.inline
    def withGeneration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generation")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String | Buffer): Self = {
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
    def withKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: ConfigMetadata): Self = {
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
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withParams(value: QueryParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedAcl(value: PredefinedAcl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedAcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedAcl")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("private")(js.undefined)
        ret
    }
    @scala.inline
    def withPublic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("public")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(js.undefined)
        ret
    }
  }
  
}

