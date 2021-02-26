package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.antDesignProLayout.anon.BreadcrumbRender
import typingsSlinky.antDesignProLayout.anon.PartialRouterTypesRoute
import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.siderMenuSiderMenuMod.SiderMenuProps
import typingsSlinky.antDesignProLayout.typingsMod.MenuDataItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicLayoutMod extends Shortcut {
  
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  @JSImport("@ant-design/pro-layout/lib/BasicLayout", JSImport.Default)
  @js.native
  val default: ReactComponentClass[BasicLayoutProps] = js.native
  
  /* Inlined {[ K in 'location' ]: @ant-design/pro-layout.@ant-design/pro-layout/lib/BasicLayout.BasicLayoutProps[K]} & {  breadcrumb :{[path: string] : @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.MenuDataItem}} */
  @js.native
  trait BasicLayoutContext extends StObject {
    
    var breadcrumb: StringDictionary[MenuDataItem] = js.native
    
    var location: js.UndefOr[js.Any] = js.native
  }
  object BasicLayoutContext {
    
    @scala.inline
    def apply(breadcrumb: StringDictionary[MenuDataItem]): BasicLayoutContext = {
      val __obj = js.Dynamic.literal(breadcrumb = breadcrumb.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicLayoutContext]
    }
    
    @scala.inline
    implicit class BasicLayoutContextMutableBuilder[Self <: BasicLayoutContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreadcrumb(value: StringDictionary[MenuDataItem]): Self = StObject.set(x, "breadcrumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: js.Any): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    }
  }
  
  type BasicLayoutProps = PartialRouterTypesRoute with SiderMenuProps with HeaderViewProps with BreadcrumbRender
  
  type _To = ReactComponentClass[BasicLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `basicLayoutMod.foo` */
  override def _to: ReactComponentClass[BasicLayoutProps] = default
}
