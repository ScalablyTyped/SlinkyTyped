package typingsSlinky.gapiClientCloudbuild.gapi.client.cloudbuild

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Secret extends js.Object {
  /** Cloud KMS key name to use to decrypt these envs. */
  var kmsKeyName: js.UndefOr[String] = js.native
  /**
    * Map of environment variable name to its encrypted value.
    *
    * Secret environment variables must be unique across all of a build's
    * secrets, and must be used by at least one build step. Values can be at most
    * 1 KB in size. There can be at most ten secret values across all of a
    * build's secrets.
    */
  var secretEnv: js.UndefOr[Record[String, String]] = js.native
}

object Secret {
  @scala.inline
  def apply(): Secret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Secret]
  }
  @scala.inline
  implicit class SecretOps[Self <: Secret] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSecretEnv(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretEnv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretEnv")(js.undefined)
        ret
    }
  }
  
}

