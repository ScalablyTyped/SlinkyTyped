package typingsSlinky.pulumiAws.inputMod.kms

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretsSecret extends js.Object {
  /**
    * An optional mapping that makes up the Encryption Context for the secret.
    */
  var context: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * An optional list of Grant Tokens for the secret.
    */
  var grantTokens: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name to export this secret under in the attributes.
    */
  var name: String = js.native
  /**
    * Base64 encoded payload, as returned from a KMS encrypt operation.
    */
  var payload: String = js.native
}

object GetSecretsSecret {
  @scala.inline
  def apply(name: String, payload: String): GetSecretsSecret = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretsSecret]
  }
  @scala.inline
  implicit class GetSecretsSecretOps[Self <: GetSecretsSecret] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withGrantTokens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantTokens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantTokens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grantTokens")(js.undefined)
        ret
    }
  }
  
}

