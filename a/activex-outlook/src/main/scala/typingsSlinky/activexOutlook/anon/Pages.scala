package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.PropertyPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pages extends StObject {
  
  val Pages: PropertyPages = js.native
}
object Pages {
  
  @scala.inline
  def apply(Pages: PropertyPages): Pages = {
    val __obj = js.Dynamic.literal(Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pages]
  }
  
  @scala.inline
  implicit class PagesMutableBuilder[Self <: Pages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPages(value: PropertyPages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
  }
}
