package typingsSlinky.reactMdl.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabBarProps
  extends MDLHTMLAttributes
     with MDLDOMAttributes[TabBar] {
  
  var activeTab: js.UndefOr[Double] = js.native
  
  var cssPrefix: String = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* tabId */ Double, _]] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[TabBar]] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object TabBarProps {
  
  @scala.inline
  def apply(cssPrefix: String): TabBarProps = {
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarProps]
  }
  
  @scala.inline
  implicit class TabBarPropsMutableBuilder[Self <: TabBarProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTab(value: Double): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
    
    @scala.inline
    def setCssPrefix(value: String): Self = StObject.set(x, "cssPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* tabId */ Double => _): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[TabBar] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
