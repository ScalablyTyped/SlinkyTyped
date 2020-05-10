package typingsSlinky.awsSdk.macieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassificationType extends js.Object {
  /**
    * A continuous classification of the objects that are added to a specified S3 bucket. Amazon Macie begins performing continuous classification after a bucket is successfully associated with Amazon Macie. 
    */
  var continuous: S3ContinuousClassificationType = js.native
  /**
    * A one-time classification of all of the existing objects in a specified S3 bucket. 
    */
  var oneTime: S3OneTimeClassificationType = js.native
}

object ClassificationType {
  @scala.inline
  def apply(continuous: S3ContinuousClassificationType, oneTime: S3OneTimeClassificationType): ClassificationType = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], oneTime = oneTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassificationType]
  }
  @scala.inline
  implicit class ClassificationTypeOps[Self <: ClassificationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuous(value: S3ContinuousClassificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneTime(value: S3OneTimeClassificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

