package typingsSlinky.cathoQuantum.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends StObject {
  
  var content: js.UndefOr[ReactElement] = js.native
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var opened: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object Content {
  
  @scala.inline
  def apply(): Content = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOpened(value: Boolean): Self = StObject.set(x, "opened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
