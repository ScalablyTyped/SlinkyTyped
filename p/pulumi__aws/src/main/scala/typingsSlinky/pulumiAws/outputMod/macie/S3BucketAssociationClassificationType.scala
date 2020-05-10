package typingsSlinky.pulumiAws.outputMod.macie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3BucketAssociationClassificationType extends js.Object {
  /**
    * A string value indicating that Macie perform a one-time classification of all of the existing objects in the bucket.
    * The only valid value is the default value, `FULL`.
    */
  var continuous: js.UndefOr[String] = js.native
  /**
    * A string value indicating whether or not Macie performs a one-time classification of all of the existing objects in the bucket.
    * Valid values are `NONE` and `FULL`. Defaults to `NONE` indicating that Macie only classifies objects that are added after the association was created.
    */
  var oneTime: js.UndefOr[String] = js.native
}

object S3BucketAssociationClassificationType {
  @scala.inline
  def apply(): S3BucketAssociationClassificationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketAssociationClassificationType]
  }
  @scala.inline
  implicit class S3BucketAssociationClassificationTypeOps[Self <: S3BucketAssociationClassificationType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContinuous(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinuous: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continuous")(js.undefined)
        ret
    }
    @scala.inline
    def withOneTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneTime")(js.undefined)
        ret
    }
  }
  
}

