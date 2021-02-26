package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
  /**
    * The job arguments used when this trigger fires. For this job run, they replace the default arguments set in the job definition itself. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the Calling AWS Glue APIs in Python topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the Special Parameters Used by AWS Glue topic in the developer guide.
    */
  var Arguments: js.UndefOr[GenericMap] = js.native
  
  /**
    * The name of the crawler to be used with this action.
    */
  var CrawlerName: js.UndefOr[NameString] = js.native
  
  /**
    * The name of a job to be executed.
    */
  var JobName: js.UndefOr[NameString] = js.native
  
  /**
    * Specifies configuration properties of a job run notification.
    */
  var NotificationProperty: js.UndefOr[typingsSlinky.awsSdk.glueMod.NotificationProperty] = js.native
  
  /**
    * The name of the SecurityConfiguration structure to be used with this action.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  
  /**
    * The JobRun timeout in minutes. This is the maximum time that a job run can consume resources before it is terminated and enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value set in the parent job.
    */
  var Timeout: js.UndefOr[typingsSlinky.awsSdk.glueMod.Timeout] = js.native
}
object Action {
  
  @scala.inline
  def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: GenericMap): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "Arguments", js.undefined)
    
    @scala.inline
    def setCrawlerName(value: NameString): Self = StObject.set(x, "CrawlerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlerNameUndefined: Self = StObject.set(x, "CrawlerName", js.undefined)
    
    @scala.inline
    def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setNotificationProperty(value: NotificationProperty): Self = StObject.set(x, "NotificationProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationPropertyUndefined: Self = StObject.set(x, "NotificationProperty", js.undefined)
    
    @scala.inline
    def setSecurityConfiguration(value: NameString): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
    
    @scala.inline
    def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
  }
}
