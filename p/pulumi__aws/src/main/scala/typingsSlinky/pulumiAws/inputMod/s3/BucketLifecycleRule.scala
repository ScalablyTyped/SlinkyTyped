package typingsSlinky.pulumiAws.inputMod.s3

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLifecycleRule extends js.Object {
  /**
    * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
    */
  var abortIncompleteMultipartUploadDays: js.UndefOr[Input[Double]] = js.native
  /**
    * Boolean which indicates if this criteria is enabled.
    */
  var enabled: Input[Boolean] = js.native
  /**
    * Specifies a period in the object's expire (documented below).
    */
  var expiration: js.UndefOr[Input[BucketLifecycleRuleExpiration]] = js.native
  /**
    * Canonical user id to grant for. Used only when `type` is `CanonicalUser`.
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies when noncurrent object versions expire (documented below).
    */
  var noncurrentVersionExpiration: js.UndefOr[Input[BucketLifecycleRuleNoncurrentVersionExpiration]] = js.native
  /**
    * Specifies when noncurrent object versions transitions (documented below).
    */
  var noncurrentVersionTransitions: js.UndefOr[Input[js.Array[Input[BucketLifecycleRuleNoncurrentVersionTransition]]]] = js.native
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Specifies a period in the object's transitions (documented below).
    */
  var transitions: js.UndefOr[Input[js.Array[Input[BucketLifecycleRuleTransition]]]] = js.native
}

object BucketLifecycleRule {
  @scala.inline
  def apply(enabled: Input[Boolean]): BucketLifecycleRule = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLifecycleRule]
  }
  @scala.inline
  implicit class BucketLifecycleRuleOps[Self <: BucketLifecycleRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbortIncompleteMultipartUploadDays(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortIncompleteMultipartUploadDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortIncompleteMultipartUploadDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortIncompleteMultipartUploadDays")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: Input[BucketLifecycleRuleExpiration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNoncurrentVersionExpiration(value: Input[BucketLifecycleRuleNoncurrentVersionExpiration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noncurrentVersionExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoncurrentVersionExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noncurrentVersionExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withNoncurrentVersionTransitions(value: Input[js.Array[Input[BucketLifecycleRuleNoncurrentVersionTransition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noncurrentVersionTransitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoncurrentVersionTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noncurrentVersionTransitions")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitions(value: Input[js.Array[Input[BucketLifecycleRuleTransition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(js.undefined)
        ret
    }
  }
  
}

