package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGlobalTableOutput extends StObject {
  
  /**
    * Contains the details of the global table.
    */
  var GlobalTableDescription: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.GlobalTableDescription] = js.native
}
object UpdateGlobalTableOutput {
  
  @scala.inline
  def apply(): UpdateGlobalTableOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGlobalTableOutput]
  }
  
  @scala.inline
  implicit class UpdateGlobalTableOutputMutableBuilder[Self <: UpdateGlobalTableOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalTableDescription(value: GlobalTableDescription): Self = StObject.set(x, "GlobalTableDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableDescriptionUndefined: Self = StObject.set(x, "GlobalTableDescription", js.undefined)
  }
}
