package typingsSlinky.pulumiAws.inputMod.s3

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InventoryFilter extends StObject {
  
  /**
    * The prefix that an object must have to be included in the inventory results.
    */
  var prefix: js.UndefOr[Input[String]] = js.native
}
object InventoryFilter {
  
  @scala.inline
  def apply(): InventoryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryFilter]
  }
  
  @scala.inline
  implicit class InventoryFilterMutableBuilder[Self <: InventoryFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
