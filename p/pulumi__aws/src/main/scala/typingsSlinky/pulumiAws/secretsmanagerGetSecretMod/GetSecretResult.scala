package typingsSlinky.pulumiAws.secretsmanagerGetSecretMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.secretsmanager.GetSecretRotationRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSecretResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret.
    */
  val arn: String = js.native
  /**
    * A description of the secret.
    */
  val description: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The Key Management Service (KMS) Customer Master Key (CMK) associated with the secret.
    */
  val kmsKeyId: String = js.native
  val name: String = js.native
  /**
    * The resource-based policy document that's attached to the secret.
    */
  val policy: String = js.native
  /**
    * Whether rotation is enabled or not.
    */
  val rotationEnabled: Boolean = js.native
  /**
    * Rotation Lambda function Amazon Resource Name (ARN) if rotation is enabled.
    */
  val rotationLambdaArn: String = js.native
  /**
    * Rotation rules if rotation is enabled.
    */
  val rotationRules: js.Array[GetSecretRotationRule] = js.native
  /**
    * Tags of the secret.
    */
  val tags: StringDictionary[js.Any] = js.native
}

object GetSecretResult {
  @scala.inline
  def apply(
    arn: String,
    description: String,
    id: String,
    kmsKeyId: String,
    name: String,
    policy: String,
    rotationEnabled: Boolean,
    rotationLambdaArn: String,
    rotationRules: js.Array[GetSecretRotationRule],
    tags: StringDictionary[js.Any]
  ): GetSecretResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], rotationEnabled = rotationEnabled.asInstanceOf[js.Any], rotationLambdaArn = rotationLambdaArn.asInstanceOf[js.Any], rotationRules = rotationRules.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecretResult]
  }
  @scala.inline
  implicit class GetSecretResultOps[Self <: GetSecretResult] (val x: Self) extends AnyVal {
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
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationLambdaArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationLambdaArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotationRules(value: js.Array[GetSecretRotationRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

