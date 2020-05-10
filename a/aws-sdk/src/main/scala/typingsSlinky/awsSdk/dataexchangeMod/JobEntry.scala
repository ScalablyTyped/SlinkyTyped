package typingsSlinky.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobEntry extends js.Object {
  /**
    * The ARN for the job.
    */
  var Arn: typingsSlinky.awsSdk.dataexchangeMod.Arn = js.native
  /**
    * The date and time that the job was created, in ISO 8601 format.
    */
  var CreatedAt: js.Date = js.native
  /**
    * Details of the operation to be performed by the job, such as export destination details or import source details.
    */
  var Details: ResponseDetails = js.native
  /**
    * Errors for jobs.
    */
  var Errors: js.UndefOr[ListOfJobError] = js.native
  /**
    * The unique identifier for the job.
    */
  var Id: typingsSlinky.awsSdk.dataexchangeMod.Id = js.native
  /**
    * The state of the job.
    */
  var State: typingsSlinky.awsSdk.dataexchangeMod.State = js.native
  /**
    * The job type.
    */
  var Type: typingsSlinky.awsSdk.dataexchangeMod.Type = js.native
  /**
    * The date and time that the job was last updated, in ISO 8601 format.
    */
  var UpdatedAt: js.Date = js.native
}

object JobEntry {
  @scala.inline
  def apply(
    Arn: Arn,
    CreatedAt: js.Date,
    Details: ResponseDetails,
    Id: Id,
    State: State,
    Type: Type,
    UpdatedAt: js.Date
  ): JobEntry = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreatedAt = CreatedAt.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UpdatedAt = UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobEntry]
  }
  @scala.inline
  implicit class JobEntryOps[Self <: JobEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: ResponseDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: ListOfJobError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Errors")(js.undefined)
        ret
    }
  }
  
}

