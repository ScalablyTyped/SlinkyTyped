package typingsSlinky.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuppressionListDestination extends StObject {
  
  /**
    * The type of action that you want to perform on the address. Acceptable values:   PUT: add the addresses to the suppression list. If the record already exists, it will override it with the new value.   DELETE: remove the addresses from the suppression list.  
    */
  var SuppressionListImportAction: typingsSlinky.awsSdk.sesv2Mod.SuppressionListImportAction = js.native
}
object SuppressionListDestination {
  
  @scala.inline
  def apply(SuppressionListImportAction: SuppressionListImportAction): SuppressionListDestination = {
    val __obj = js.Dynamic.literal(SuppressionListImportAction = SuppressionListImportAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressionListDestination]
  }
  
  @scala.inline
  implicit class SuppressionListDestinationMutableBuilder[Self <: SuppressionListDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuppressionListImportAction(value: SuppressionListImportAction): Self = StObject.set(x, "SuppressionListImportAction", value.asInstanceOf[js.Any])
  }
}
