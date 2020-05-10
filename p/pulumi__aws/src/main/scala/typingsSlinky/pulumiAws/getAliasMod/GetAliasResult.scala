package typingsSlinky.pulumiAws.getAliasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAliasResult extends js.Object {
  /**
    * The Amazon Resource Name(ARN) of the key alias.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * ARN pointed to by the alias.
    */
  val targetKeyArn: String = js.native
  /**
    * Key identifier pointed to by the alias.
    */
  val targetKeyId: String = js.native
}

object GetAliasResult {
  @scala.inline
  def apply(arn: String, id: String, name: String, targetKeyArn: String, targetKeyId: String): GetAliasResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetKeyArn = targetKeyArn.asInstanceOf[js.Any], targetKeyId = targetKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAliasResult]
  }
  @scala.inline
  implicit class GetAliasResultOps[Self <: GetAliasResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetKeyArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetKeyArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetKeyId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

