package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketLogging extends js.Object {
  /**
    * The name of the bucket that will receive the log objects.
    */
  var targetBucket: Input[String] = js.native
  /**
    * To specify a key prefix for log objects.
    */
  var targetPrefix: js.UndefOr[Input[String]] = js.native
}

object BucketLogging {
  @scala.inline
  def apply(targetBucket: Input[String]): BucketLogging = {
    val __obj = js.Dynamic.literal(targetBucket = targetBucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketLogging]
  }
  @scala.inline
  implicit class BucketLoggingOps[Self <: BucketLogging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetBucket(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetPrefix(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPrefix")(js.undefined)
        ret
    }
  }
  
}

