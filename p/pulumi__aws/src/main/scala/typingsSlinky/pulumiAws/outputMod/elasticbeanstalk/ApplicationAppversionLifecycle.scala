package typingsSlinky.pulumiAws.outputMod.elasticbeanstalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationAppversionLifecycle extends js.Object {
  /**
    * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
    */
  var deleteSourceFromS3: js.UndefOr[Boolean] = js.native
  /**
    * The number of days to retain an application version ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
    */
  var maxAgeInDays: js.UndefOr[Double] = js.native
  /**
    * The maximum number of application versions to retain ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
    */
  var maxCount: js.UndefOr[Double] = js.native
  /**
    * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
    */
  var serviceRole: String = js.native
}

object ApplicationAppversionLifecycle {
  @scala.inline
  def apply(serviceRole: String): ApplicationAppversionLifecycle = {
    val __obj = js.Dynamic.literal(serviceRole = serviceRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationAppversionLifecycle]
  }
  @scala.inline
  implicit class ApplicationAppversionLifecycleOps[Self <: ApplicationAppversionLifecycle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteSourceFromS3(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSourceFromS3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteSourceFromS3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteSourceFromS3")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAgeInDays(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeInDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAgeInDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAgeInDays")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxCount")(js.undefined)
        ret
    }
  }
  
}

