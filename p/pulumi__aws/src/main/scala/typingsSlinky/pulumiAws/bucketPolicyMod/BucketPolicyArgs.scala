package typingsSlinky.pulumiAws.bucketPolicyMod

import typingsSlinky.pulumiAws.documentsMod.PolicyDocument
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketPolicyArgs extends js.Object {
  /**
    * The name of the bucket to which to apply the policy.
    */
  val bucket: Input[String] = js.native
  val policy: Input[String | PolicyDocument] = js.native
}

object BucketPolicyArgs {
  @scala.inline
  def apply(bucket: Input[String], policy: Input[String | PolicyDocument]): BucketPolicyArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPolicyArgs]
  }
  @scala.inline
  implicit class BucketPolicyArgsOps[Self <: BucketPolicyArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolicy(value: Input[String | PolicyDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

