package typingsSlinky.awsSdk.macieMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateS3ResourcesResult extends StObject {
  
  /**
    * S3 resources that couldn't be removed from being monitored and classified by Amazon Macie Classic. An error code and an error message are provided for each failed item. 
    */
  var failedS3Resources: js.UndefOr[FailedS3Resources] = js.native
}
object DisassociateS3ResourcesResult {
  
  @scala.inline
  def apply(): DisassociateS3ResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateS3ResourcesResult]
  }
  
  @scala.inline
  implicit class DisassociateS3ResourcesResultMutableBuilder[Self <: DisassociateS3ResourcesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedS3Resources(value: FailedS3Resources): Self = StObject.set(x, "failedS3Resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedS3ResourcesUndefined: Self = StObject.set(x, "failedS3Resources", js.undefined)
    
    @scala.inline
    def setFailedS3ResourcesVarargs(value: FailedS3Resource*): Self = StObject.set(x, "failedS3Resources", js.Array(value :_*))
  }
}
