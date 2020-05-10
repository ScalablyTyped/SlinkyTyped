package typingsSlinky.pulumiAws.getSecretsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.kms.GetSecretsSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretsResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Map containing each `secret` `name` as the key with its decrypted plaintext value
    */
  val plaintext: StringDictionary[String] = js.native
  val secrets: js.Array[GetSecretsSecret] = js.native
}

object GetSecretsResult {
  @scala.inline
  def apply(id: String, plaintext: StringDictionary[String], secrets: js.Array[GetSecretsSecret]): GetSecretsResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretsResult]
  }
  @scala.inline
  implicit class GetSecretsResultOps[Self <: GetSecretsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaintext(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plaintext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecrets(value: js.Array[GetSecretsSecret]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

