package typingsSlinky.pulumiAws.getStackMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStackResult extends js.Object {
  /**
    * A list of capabilities
    */
  val capabilities: js.Array[String] = js.native
  /**
    * Description of the stack
    */
  val description: String = js.native
  /**
    * Whether the rollback of the stack is disabled when stack creation fails
    */
  val disableRollback: Boolean = js.native
  /**
    * The ARN of the IAM role used to create the stack.
    */
  val iamRoleArn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * A list of SNS topic ARNs to publish stack related events
    */
  val notificationArns: js.Array[String] = js.native
  /**
    * A map of outputs from the stack.
    */
  val outputs: StringDictionary[js.Any] = js.native
  /**
    * A map of parameters that specify input parameters for the stack.
    */
  val parameters: StringDictionary[js.Any] = js.native
  /**
    * A map of tags associated with this stack.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * Structure containing the template body.
    */
  val templateBody: String = js.native
  /**
    * The amount of time that can pass before the stack status becomes `CREATE_FAILED`
    */
  val timeoutInMinutes: Double = js.native
}

object GetStackResult {
  @scala.inline
  def apply(
    capabilities: js.Array[String],
    description: String,
    disableRollback: Boolean,
    iamRoleArn: String,
    id: String,
    name: String,
    notificationArns: js.Array[String],
    outputs: StringDictionary[js.Any],
    parameters: StringDictionary[js.Any],
    tags: StringDictionary[js.Any],
    templateBody: String,
    timeoutInMinutes: Double
  ): GetStackResult = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], disableRollback = disableRollback.asInstanceOf[js.Any], iamRoleArn = iamRoleArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notificationArns = notificationArns.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], templateBody = templateBody.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStackResult]
  }
  @scala.inline
  implicit class GetStackResultOps[Self <: GetStackResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableRollback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRollback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIamRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamRoleArn")(value.asInstanceOf[js.Any])
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
    def withNotificationArns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParameters(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeoutInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

