package typingsSlinky.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagCount extends StObject {
  
  /**
    * Type of count.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Value of count.
    */
  var value: js.UndefOr[Double] = js.native
}
object TagCount {
  
  @scala.inline
  def apply(): TagCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagCount]
  }
  
  @scala.inline
  implicit class TagCountMutableBuilder[Self <: TagCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
