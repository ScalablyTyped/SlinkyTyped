package typingsSlinky.csstype.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Page[TLength] extends StObject {
  
  var size: js.UndefOr[PageSizeProperty[TLength]] = js.native
}
object Page {
  
  @scala.inline
  def apply[TLength](): Page[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page[TLength]]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page[_], TLength] (val x: Self with Page[TLength]) extends AnyVal {
    
    @scala.inline
    def setSize(value: PageSizeProperty[TLength]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
