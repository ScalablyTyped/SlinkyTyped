package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateServiceActionInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The self-service action definition. Can be one of the following:  Name  The name of the AWS Systems Manager Document. For example, AWS-RestartEC2Instance.  Version  The AWS Systems Manager automation document version. For example, "Version": "1"   AssumeRole  The Amazon Resource Name (ARN) of the role that performs the self-service actions on your behalf. For example, "AssumeRole": "arn:aws:iam::12345678910:role/ActionRole". To reuse the provisioned product launch role, set to "AssumeRole": "LAUNCH_ROLE".  Parameters  The list of parameters in JSON format. For example: [{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}] or [{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}].  
    */
  var Definition: ServiceActionDefinitionMap = js.native
  /**
    * The service action definition type. For example, SSM_AUTOMATION.
    */
  var DefinitionType: ServiceActionDefinitionType = js.native
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.native
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: typingsSlinky.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  /**
    * The self-service action name.
    */
  var Name: ServiceActionName = js.native
}

object CreateServiceActionInput {
  @scala.inline
  def apply(
    Definition: ServiceActionDefinitionMap,
    DefinitionType: ServiceActionDefinitionType,
    IdempotencyToken: IdempotencyToken,
    Name: ServiceActionName
  ): CreateServiceActionInput = {
    val __obj = js.Dynamic.literal(Definition = Definition.asInstanceOf[js.Any], DefinitionType = DefinitionType.asInstanceOf[js.Any], IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceActionInput]
  }
  @scala.inline
  implicit class CreateServiceActionInputOps[Self <: CreateServiceActionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefinition(value: ServiceActionDefinitionMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Definition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefinitionType(value: ServiceActionDefinitionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefinitionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdempotencyToken(value: IdempotencyToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IdempotencyToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ServiceActionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcceptLanguage(value: AcceptLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ServiceActionDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
  }
  
}

