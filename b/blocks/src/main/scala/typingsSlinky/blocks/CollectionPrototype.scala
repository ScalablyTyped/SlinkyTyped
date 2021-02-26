package typingsSlinky.blocks

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.blocks.anon.Create
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionPrototype
  extends /* propertyName */ StringDictionary[js.Any] {
  
  var options: js.UndefOr[Create] = js.native
}
object CollectionPrototype {
  
  @scala.inline
  def apply(): CollectionPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionPrototype]
  }
  
  @scala.inline
  implicit class CollectionPrototypeMutableBuilder[Self <: CollectionPrototype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: Create): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
