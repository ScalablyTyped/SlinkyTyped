package typingsSlinky.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationReferenceDataSourceRequest extends StObject {
  
  /**
    * Name of an existing application.
    */
  var ApplicationName: typingsSlinky.awsSdk.kinesisanalyticsMod.ApplicationName = js.native
  
  /**
    * Version of the application. You can use the DescribeApplication operation to get the current application version. If the version specified is not the current version, the ConcurrentModificationException is returned.
    */
  var CurrentApplicationVersionId: ApplicationVersionId = js.native
  
  /**
    * ID of the reference data source. When you add a reference data source to your application using the AddApplicationReferenceDataSource, Amazon Kinesis Analytics assigns an ID. You can use the DescribeApplication operation to get the reference ID. 
    */
  var ReferenceId: Id = js.native
}
object DeleteApplicationReferenceDataSourceRequest {
  
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    CurrentApplicationVersionId: ApplicationVersionId,
    ReferenceId: Id
  ): DeleteApplicationReferenceDataSourceRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], CurrentApplicationVersionId = CurrentApplicationVersionId.asInstanceOf[js.Any], ReferenceId = ReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationReferenceDataSourceRequest]
  }
  
  @scala.inline
  implicit class DeleteApplicationReferenceDataSourceRequestMutableBuilder[Self <: DeleteApplicationReferenceDataSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "CurrentApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceId(value: Id): Self = StObject.set(x, "ReferenceId", value.asInstanceOf[js.Any])
  }
}
