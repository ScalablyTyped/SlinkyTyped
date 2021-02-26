package typingsSlinky.fancybox

import typingsSlinky.fancybox.fancyboxStrings.`inline`
import typingsSlinky.fancybox.fancyboxStrings.ajax
import typingsSlinky.fancybox.fancyboxStrings.html
import typingsSlinky.fancybox.fancyboxStrings.iframe
import typingsSlinky.fancybox.fancyboxStrings.image
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxGroupItem extends StObject {
  
  var opts: js.UndefOr[FancyBoxOptions] = js.native
  
  var src: String = js.native
  
  var `type`: js.UndefOr[image | `inline` | ajax | iframe | html] = js.native
}
object FancyBoxGroupItem {
  
  @scala.inline
  def apply(src: String): FancyBoxGroupItem = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItem]
  }
  
  @scala.inline
  implicit class FancyBoxGroupItemMutableBuilder[Self <: FancyBoxGroupItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpts(value: FancyBoxOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: image | `inline` | ajax | iframe | html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
