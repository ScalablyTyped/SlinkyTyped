package typingsSlinky.blueprintjsCore.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.tabMod.TabId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tabs/tabs.ITabsProps> */
@js.native
trait PartialITabsProps extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var defaultSelectedTabId: js.UndefOr[TabId] = js.native
  
  var id: js.UndefOr[TabId] = js.native
  
  var large: js.UndefOr[Boolean] = js.native
  
  var onChange: js.UndefOr[
    js.Function3[
      /* newTabId */ TabId, 
      /* prevTabId */ js.UndefOr[TabId], 
      /* event */ SyntheticMouseEvent[HTMLElement], 
      Unit
    ]
  ] = js.native
  
  var renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.native
  
  var selectedTabId: js.UndefOr[TabId] = js.native
  
  var vertical: js.UndefOr[Boolean] = js.native
}
object PartialITabsProps {
  
  @scala.inline
  def apply(): PartialITabsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialITabsProps]
  }
  
  @scala.inline
  implicit class PartialITabsPropsMutableBuilder[Self <: PartialITabsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDefaultSelectedTabId(value: TabId): Self = StObject.set(x, "defaultSelectedTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultSelectedTabIdUndefined: Self = StObject.set(x, "defaultSelectedTabId", js.undefined)
    
    @scala.inline
    def setId(value: TabId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* newTabId */ TabId, /* prevTabId */ js.UndefOr[TabId], /* event */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setRenderActiveTabPanelOnly(value: Boolean): Self = StObject.set(x, "renderActiveTabPanelOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderActiveTabPanelOnlyUndefined: Self = StObject.set(x, "renderActiveTabPanelOnly", js.undefined)
    
    @scala.inline
    def setSelectedTabId(value: TabId): Self = StObject.set(x, "selectedTabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTabIdUndefined: Self = StObject.set(x, "selectedTabId", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
