package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteApplicationVersionMessage extends StObject {
  
  /**
    * The name of the application to which the version belongs.
    */
  var ApplicationName: typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  
  /**
    * Set to true to delete the source bundle from your storage bucket. Otherwise, the application version is deleted only from Elastic Beanstalk and the source bundle remains in Amazon S3.
    */
  var DeleteSourceBundle: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.DeleteSourceBundle] = js.native
  
  /**
    * The label of the version to delete.
    */
  var VersionLabel: typingsSlinky.awsSdk.elasticbeanstalkMod.VersionLabel = js.native
}
object DeleteApplicationVersionMessage {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName, VersionLabel: VersionLabel): DeleteApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationVersionMessage]
  }
  
  @scala.inline
  implicit class DeleteApplicationVersionMessageMutableBuilder[Self <: DeleteApplicationVersionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSourceBundle(value: DeleteSourceBundle): Self = StObject.set(x, "DeleteSourceBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteSourceBundleUndefined: Self = StObject.set(x, "DeleteSourceBundle", js.undefined)
    
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = StObject.set(x, "VersionLabel", value.asInstanceOf[js.Any])
  }
}
