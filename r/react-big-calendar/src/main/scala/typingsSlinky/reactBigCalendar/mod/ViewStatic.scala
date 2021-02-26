package typingsSlinky.reactBigCalendar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewStatic extends StObject {
  
  def navigate(date: js.Date, action: NavigateAction, props: js.Any): js.Date = js.native
  
  def title(date: js.Date, options: TitleOptions): String = js.native
}
object ViewStatic {
  
  @scala.inline
  def apply(navigate: (js.Date, NavigateAction, js.Any) => js.Date, title: (js.Date, TitleOptions) => String): ViewStatic = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction3(navigate), title = js.Any.fromFunction2(title))
    __obj.asInstanceOf[ViewStatic]
  }
  
  @scala.inline
  implicit class ViewStaticMutableBuilder[Self <: ViewStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNavigate(value: (js.Date, NavigateAction, js.Any) => js.Date): Self = StObject.set(x, "navigate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTitle(value: (js.Date, TitleOptions) => String): Self = StObject.set(x, "title", js.Any.fromFunction2(value))
  }
}
