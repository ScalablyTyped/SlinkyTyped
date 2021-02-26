package typingsSlinky.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlatformApplicationsInput extends StObject {
  
  /**
    * NextToken string is used when calling ListPlatformApplications action to retrieve additional records that are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object ListPlatformApplicationsInput {
  
  @scala.inline
  def apply(): ListPlatformApplicationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformApplicationsInput]
  }
  
  @scala.inline
  implicit class ListPlatformApplicationsInputMutableBuilder[Self <: ListPlatformApplicationsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
