package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFaqResponse extends js.Object {
  /**
    * The date and time that the FAQ was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The description of the FAQ that you provided when it was created.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.kendraMod.Description] = js.native
  /**
    * If the Status field is FAILED, the ErrorMessage field contains the reason why the FAQ failed.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.kendraMod.ErrorMessage] = js.native
  /**
    * The identifier of the FAQ.
    */
  var Id: js.UndefOr[FaqId] = js.native
  /**
    * The identifier of the index that contains the FAQ.
    */
  var IndexId: js.UndefOr[typingsSlinky.awsSdk.kendraMod.IndexId] = js.native
  /**
    * The name that you gave the FAQ when it was created.
    */
  var Name: js.UndefOr[FaqName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role that provides access to the S3 bucket containing the input files for the FAQ.
    */
  var RoleArn: js.UndefOr[typingsSlinky.awsSdk.kendraMod.RoleArn] = js.native
  var S3Path: js.UndefOr[typingsSlinky.awsSdk.kendraMod.S3Path] = js.native
  /**
    * The status of the FAQ. It is ready to use when the status is ACTIVE.
    */
  var Status: js.UndefOr[FaqStatus] = js.native
  /**
    * The date and time that the FAQ was last updated.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.native
}

object DescribeFaqResponse {
  @scala.inline
  def apply(): DescribeFaqResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFaqResponse]
  }
  @scala.inline
  implicit class DescribeFaqResponseOps[Self <: DescribeFaqResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    @scala.inline
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: FaqId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexId(value: IndexId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: FaqName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withRoleArn(value: RoleArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Path(value: S3Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Path: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Path")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: FaqStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(js.undefined)
        ret
    }
  }
  
}

