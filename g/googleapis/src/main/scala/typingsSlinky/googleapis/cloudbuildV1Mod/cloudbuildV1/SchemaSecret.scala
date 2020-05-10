package typingsSlinky.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Pairs a set of secret environment variables containing encrypted values
  * with the Cloud KMS key to use to decrypt the value.
  */
@js.native
trait SchemaSecret extends js.Object {
  /**
    * Cloud KMS key name to use to decrypt these envs.
    */
  var kmsKeyName: js.UndefOr[String] = js.native
  /**
    * Map of environment variable name to its encrypted value.  Secret
    * environment variables must be unique across all of a build&#39;s secrets,
    * and must be used by at least one build step. Values can be at most 64 KB
    * in size. There can be at most 100 secret values across all of a
    * build&#39;s secrets.
    */
  var secretEnv: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaSecret {
  @scala.inline
  def apply(): SchemaSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecret]
  }
  @scala.inline
  implicit class SchemaSecretOps[Self <: SchemaSecret] (val x: Self) extends AnyVal {
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
    def withSecretEnv(value: StringDictionary[String]): Self = {
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

