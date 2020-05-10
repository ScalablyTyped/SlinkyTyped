package typingsSlinky.awsSdkClientS3Browser.typesLoggingEnabledMod

import typingsSlinky.awsSdkClientS3Browser.typesTargetGrantMod.TargetGrant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggingEnabled extends js.Object {
  /**
    * <p>Specifies the bucket where you want Amazon S3 to store server access logs. You can have your logs delivered to any bucket that you own, including the same bucket that is being logged. You can also configure multiple buckets to deliver their logs to the same target bucket. In this case you should choose a different TargetPrefix for each source bucket so that the delivered log files can be distinguished by key.</p>
    */
  var TargetBucket: String = js.native
  /**
    * _TargetGrants shape
    */
  var TargetGrants: js.UndefOr[js.Array[TargetGrant] | js.Iterable[TargetGrant]] = js.native
  /**
    * <p>This element lets you specify a prefix for the keys that the log files will be stored under.</p>
    */
  var TargetPrefix: String = js.native
}

object LoggingEnabled {
  @scala.inline
  def apply(TargetBucket: String, TargetPrefix: String): LoggingEnabled = {
    val __obj = js.Dynamic.literal(TargetBucket = TargetBucket.asInstanceOf[js.Any], TargetPrefix = TargetPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingEnabled]
  }
  @scala.inline
  implicit class LoggingEnabledOps[Self <: LoggingEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetBucket(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetBucket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetGrantsIterable(value: js.Iterable[TargetGrant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGrants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetGrants(value: js.Array[TargetGrant] | js.Iterable[TargetGrant]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGrants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetGrants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetGrants")(js.undefined)
        ret
    }
  }
  
}

