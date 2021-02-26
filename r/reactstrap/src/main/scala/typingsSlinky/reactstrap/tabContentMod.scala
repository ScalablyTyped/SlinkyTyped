package typingsSlinky.reactstrap

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.reactstrap.mod.CSSModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabContentMod {
  
  @JSImport("reactstrap/lib/TabContent", JSImport.Default)
  @js.native
  class default ()
    extends Component[TabContentProps, js.Object, js.Any]
  
  type TabContent = ReactComponentClass[TabContentProps]
  
  @js.native
  trait TabContentProps
    extends HTMLAttributes[HTMLElement]
       with /* key */ StringDictionary[js.Any] {
    
    var activeTab: js.UndefOr[Double | String] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var tag: js.UndefOr[ReactElement] = js.native
  }
  object TabContentProps {
    
    @scala.inline
    def apply(): TabContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabContentProps]
    }
    
    @scala.inline
    implicit class TabContentPropsMutableBuilder[Self <: TabContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTab(value: Double | String): Self = StObject.set(x, "activeTab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTabUndefined: Self = StObject.set(x, "activeTab", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setTag(value: ReactElement): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
