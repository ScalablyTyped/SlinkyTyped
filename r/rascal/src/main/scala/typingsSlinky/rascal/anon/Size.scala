package typingsSlinky.rascal.anon

import typingsSlinky.rascal.rascalStrings.inMemory
import typingsSlinky.rascal.rascalStrings.inMemoryCluster
import typingsSlinky.rascal.rascalStrings.stub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Size extends StObject {
  
  var size: js.UndefOr[Double] = js.native
  
  var `type`: stub | inMemory | inMemoryCluster = js.native
}
object Size {
  
  @scala.inline
  def apply(`type`: stub | inMemory | inMemoryCluster): Size = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Size]
  }
  
  @scala.inline
  implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: stub | inMemory | inMemoryCluster): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
