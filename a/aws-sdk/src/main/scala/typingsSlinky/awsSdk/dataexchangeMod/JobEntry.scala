package typingsSlinky.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobEntry extends StObject {
  
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
  implicit class JobEntryMutableBuilder[Self <: JobEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: ResponseDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: ListOfJobError): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: JobError*): Self = StObject.set(x, "Errors", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
  }
}
