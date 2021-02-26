package typingsSlinky.reactNativeNavigation

import typingsSlinky.reactNativeNavigation.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  @js.native
  trait ExternalComponent extends StObject {
    
    /**
      * Set the screen's id so Navigation.mergeOptions can be used to update options
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Name of your component
      */
    var name: String | Double = js.native
    
    /**
      * Configure component options
      */
    var options: js.UndefOr[Options] = js.native
    
    /**
      * Properties to pass down to the component
      */
    var passProps: js.UndefOr[js.Object] = js.native
  }
  object ExternalComponent {
    
    @scala.inline
    def apply(name: String | Double): ExternalComponent = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalComponent]
    }
    
    @scala.inline
    implicit class ExternalComponentMutableBuilder[Self <: ExternalComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPassProps(value: js.Object): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    }
  }
  
  @js.native
  trait Layout[P] extends StObject {
    
    /**
      * Set the bottom tabs
      */
    var bottomTabs: js.UndefOr[LayoutBottomTabs] = js.native
    
    /**
      * Set the component
      */
    var component: js.UndefOr[LayoutComponent[P]] = js.native
    
    /**
      * Set the external component
      */
    var externalComponent: js.UndefOr[ExternalComponent] = js.native
    
    /**
      * Set the side menu
      */
    var sideMenu: js.UndefOr[LayoutSideMenu] = js.native
    
    /**
      * Set the split view
      */
    var splitView: js.UndefOr[LayoutSplitView] = js.native
    
    /**
      * Set the stack
      */
    var stack: js.UndefOr[LayoutStack] = js.native
    
    /**
      * Set the top tabs
      */
    var topTabs: js.UndefOr[LayoutTopTabs] = js.native
  }
  object Layout {
    
    @scala.inline
    def apply[P](): Layout[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layout[P]]
    }
    
    @scala.inline
    implicit class LayoutMutableBuilder[Self <: Layout[_], P] (val x: Self with Layout[P]) extends AnyVal {
      
      @scala.inline
      def setBottomTabs(value: LayoutBottomTabs): Self = StObject.set(x, "bottomTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomTabsUndefined: Self = StObject.set(x, "bottomTabs", js.undefined)
      
      @scala.inline
      def setComponent(value: LayoutComponent[P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setExternalComponent(value: ExternalComponent): Self = StObject.set(x, "externalComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalComponentUndefined: Self = StObject.set(x, "externalComponent", js.undefined)
      
      @scala.inline
      def setSideMenu(value: LayoutSideMenu): Self = StObject.set(x, "sideMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideMenuUndefined: Self = StObject.set(x, "sideMenu", js.undefined)
      
      @scala.inline
      def setSplitView(value: LayoutSplitView): Self = StObject.set(x, "splitView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitViewUndefined: Self = StObject.set(x, "splitView", js.undefined)
      
      @scala.inline
      def setStack(value: LayoutStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setTopTabs(value: LayoutTopTabs): Self = StObject.set(x, "topTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopTabsUndefined: Self = StObject.set(x, "topTabs", js.undefined)
    }
  }
  
  @js.native
  trait LayoutBottomTabs extends StObject {
    
    /**
      * Set the children screens
      */
    var children: js.UndefOr[js.Array[LayoutTabsChildren]] = js.native
    
    /**
      * Set ID of the stack so you can use Navigation.mergeOptions to
      * update options
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Set the bottom tabs options
      */
    var options: js.UndefOr[Options] = js.native
  }
  object LayoutBottomTabs {
    
    @scala.inline
    def apply(): LayoutBottomTabs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutBottomTabs]
    }
    
    @scala.inline
    implicit class LayoutBottomTabsMutableBuilder[Self <: LayoutBottomTabs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[LayoutTabsChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: LayoutTabsChildren*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait LayoutComponent[P] extends StObject {
    
    /**
      * Component reference id, Auto generated if empty
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Name of your component
      */
    var name: String | Double = js.native
    
    /**
      * Styling options
      */
    var options: js.UndefOr[Options] = js.native
    
    /**
      * Properties to pass down to the component
      */
    var passProps: js.UndefOr[P] = js.native
  }
  object LayoutComponent {
    
    @scala.inline
    def apply[P](name: String | Double): LayoutComponent[P] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutComponent[P]]
    }
    
    @scala.inline
    implicit class LayoutComponentMutableBuilder[Self <: LayoutComponent[_], P] (val x: Self with LayoutComponent[P]) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPassProps(value: P): Self = StObject.set(x, "passProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassPropsUndefined: Self = StObject.set(x, "passProps", js.undefined)
    }
  }
  
  @js.native
  trait LayoutRoot extends StObject {
    
    var modals: js.UndefOr[js.Any] = js.native
    
    var overlays: js.UndefOr[js.Any] = js.native
    
    /**
      * Set the root
      */
    var root: Layout[js.Object] = js.native
  }
  object LayoutRoot {
    
    @scala.inline
    def apply(root: Layout[js.Object]): LayoutRoot = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutRoot]
    }
    
    @scala.inline
    implicit class LayoutRootMutableBuilder[Self <: LayoutRoot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModals(value: js.Any): Self = StObject.set(x, "modals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalsUndefined: Self = StObject.set(x, "modals", js.undefined)
      
      @scala.inline
      def setOverlays(value: js.Any): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
      
      @scala.inline
      def setRoot(value: Layout[js.Object]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LayoutSideMenu extends StObject {
    
    /**
      * Set the center view
      */
    var center: Layout[js.Object] = js.native
    
    /**
      * Set ID of the stack so you can use Navigation.mergeOptions to
      * update options
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Set the left side bar
      */
    var left: js.UndefOr[LayoutStackChildren] = js.native
    
    /**
      * Set the bottom tabs options
      */
    var options: js.UndefOr[Options] = js.native
    
    /**
      * Set the right side bar
      */
    var right: js.UndefOr[LayoutStackChildren] = js.native
  }
  object LayoutSideMenu {
    
    @scala.inline
    def apply(center: Layout[js.Object]): LayoutSideMenu = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutSideMenu]
    }
    
    @scala.inline
    implicit class LayoutSideMenuMutableBuilder[Self <: LayoutSideMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: Layout[js.Object]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLeft(value: LayoutStackChildren): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setRight(value: LayoutStackChildren): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    }
  }
  
  @js.native
  trait LayoutSplitView extends StObject {
    
    /**
      * Set detail layout (the larger screen, flexes)
      */
    var detail: js.UndefOr[Layout[js.Object]] = js.native
    
    /**
      * Set ID of the stack so you can use Navigation.mergeOptions to
      * update options
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Set master layout (the smaller screen, sidebar)
      */
    var master: js.UndefOr[Layout[js.Object]] = js.native
    
    /**
      * Configure split view
      */
    var options: js.UndefOr[Options] = js.native
  }
  object LayoutSplitView {
    
    @scala.inline
    def apply(): LayoutSplitView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutSplitView]
    }
    
    @scala.inline
    implicit class LayoutSplitViewMutableBuilder[Self <: LayoutSplitView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetail(value: Layout[js.Object]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMaster(value: Layout[js.Object]): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait LayoutStack extends StObject {
    
    /**
      * Set children screens
      */
    var children: js.UndefOr[js.Array[LayoutStackChildren]] = js.native
    
    /**
      * Set ID of the stack so you can use Navigation.mergeOptions to
      * update options
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Set options
      */
    var options: js.UndefOr[Options] = js.native
  }
  object LayoutStack {
    
    @scala.inline
    def apply(): LayoutStack = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutStack]
    }
    
    @scala.inline
    implicit class LayoutStackMutableBuilder[Self <: LayoutStack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[LayoutStackChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: LayoutStackChildren*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  @js.native
  trait LayoutStackChildren extends StObject {
    
    /**
      * Set component
      */
    var component: js.UndefOr[LayoutComponent[js.Object]] = js.native
    
    /**
      * Set the external component
      */
    var externalComponent: js.UndefOr[ExternalComponent] = js.native
  }
  object LayoutStackChildren {
    
    @scala.inline
    def apply(): LayoutStackChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutStackChildren]
    }
    
    @scala.inline
    implicit class LayoutStackChildrenMutableBuilder[Self <: LayoutStackChildren] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: LayoutComponent[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setExternalComponent(value: ExternalComponent): Self = StObject.set(x, "externalComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalComponentUndefined: Self = StObject.set(x, "externalComponent", js.undefined)
    }
  }
  
  @js.native
  trait LayoutTabsChildren extends StObject {
    
    /**
      * Set component
      */
    var component: js.UndefOr[LayoutComponent[js.Object]] = js.native
    
    /**
      * Set the external component
      */
    var externalComponent: js.UndefOr[ExternalComponent] = js.native
    
    /**
      * Set the side menu
      */
    var sideMenu: js.UndefOr[LayoutSideMenu] = js.native
    
    /**
      * Set stack
      */
    var stack: js.UndefOr[LayoutStack] = js.native
  }
  object LayoutTabsChildren {
    
    @scala.inline
    def apply(): LayoutTabsChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutTabsChildren]
    }
    
    @scala.inline
    implicit class LayoutTabsChildrenMutableBuilder[Self <: LayoutTabsChildren] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: LayoutComponent[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setExternalComponent(value: ExternalComponent): Self = StObject.set(x, "externalComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalComponentUndefined: Self = StObject.set(x, "externalComponent", js.undefined)
      
      @scala.inline
      def setSideMenu(value: LayoutSideMenu): Self = StObject.set(x, "sideMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideMenuUndefined: Self = StObject.set(x, "sideMenu", js.undefined)
      
      @scala.inline
      def setStack(value: LayoutStack): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  @js.native
  trait LayoutTopTabs extends StObject {
    
    /**
      * Set the children screens
      */
    var children: js.UndefOr[js.Array[LayoutTabsChildren]] = js.native
    
    /**
      * Set the layout's id so Navigation.mergeOptions can be used to update options
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * Configure top tabs
      */
    var options: js.UndefOr[Options] = js.native
  }
  object LayoutTopTabs {
    
    @scala.inline
    def apply(): LayoutTopTabs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutTopTabs]
    }
    
    @scala.inline
    implicit class LayoutTopTabsMutableBuilder[Self <: LayoutTopTabs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[LayoutTabsChildren]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: LayoutTabsChildren*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
