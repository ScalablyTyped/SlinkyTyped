package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcLinks extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfVpcLink] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object VpcLinks {
  
  @scala.inline
  def apply(): VpcLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcLinks]
  }
  
  @scala.inline
  implicit class VpcLinksMutableBuilder[Self <: VpcLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfVpcLink): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: VpcLink*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
