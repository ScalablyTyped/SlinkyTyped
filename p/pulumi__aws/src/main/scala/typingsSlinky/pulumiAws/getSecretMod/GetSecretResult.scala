package typingsSlinky.pulumiAws.getSecretMod

import typingsSlinky.pulumiAws.outputMod.kms.GetSecretSecret
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val secrets: js.Array[GetSecretSecret] = js.native
}

object GetSecretResult {
  @scala.inline
  def apply(id: String, secrets: js.Array[GetSecretSecret]): GetSecretResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretResult]
  }
  @scala.inline
  implicit class GetSecretResultOps[Self <: GetSecretResult] (val x: Self) extends AnyVal {
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
    def withSecrets(value: js.Array[GetSecretSecret]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secrets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

