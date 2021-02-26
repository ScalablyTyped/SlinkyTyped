package typingsSlinky.antDesignProLayout

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.antDesignProLayout.anon.Pathname
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactRouter.mod.StaticContext
import typingsSlinky.reactRouter.mod.`match`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsMod {
  
  @js.native
  trait LinkProps extends AnchorHTMLAttributes[HTMLAnchorElement] {
    
    var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var to: LocationDescriptor[LocationState] = js.native
  }
  object LinkProps {
    
    @scala.inline
    def apply(to: LocationDescriptor[LocationState]): LinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLAnchorElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ HTMLAnchorElement | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[HTMLAnchorElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      @scala.inline
      def setTo(value: LocationDescriptor[LocationState]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MenuDataItem
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * @name 子菜单
      */
    var children: js.UndefOr[js.Array[MenuDataItem]] = js.native
    
    /**
      * @name disable 菜单选项
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * @name 隐藏自己，并且将子节点提升到与自己平级
      */
    var flatMenu: js.UndefOr[Boolean] = js.native
    
    /**
      * @name 在菜单中隐藏子节点
      */
    var hideChildrenInMenu: js.UndefOr[Boolean] = js.native
    
    /**
      * @name 在菜单中隐藏自己和子节点
      */
    var hideInMenu: js.UndefOr[Boolean] = js.native
    
    /**
      * @name 菜单的icon
      */
    var icon: js.UndefOr[ReactElement] = js.native
    
    /**
      * @name 用于标定选中的值，默认是 path
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * @name 自定义菜单的国际化 key
      */
    var locale: js.UndefOr[String | `false`] = js.native
    
    /**
      * @name 菜单的名字
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * @name 自定义父节点
      * @description 当此节点被选中的时候也会选中 parentKeys 的节点
      */
    var parentKeys: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * @name 路径
      */
    var path: js.UndefOr[String] = js.native
  }
  object MenuDataItem {
    
    @scala.inline
    def apply(): MenuDataItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuDataItem]
    }
    
    @scala.inline
    implicit class MenuDataItemMutableBuilder[Self <: MenuDataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[MenuDataItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: MenuDataItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFlatMenu(value: Boolean): Self = StObject.set(x, "flatMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatMenuUndefined: Self = StObject.set(x, "flatMenu", js.undefined)
      
      @scala.inline
      def setHideChildrenInMenu(value: Boolean): Self = StObject.set(x, "hideChildrenInMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideChildrenInMenuUndefined: Self = StObject.set(x, "hideChildrenInMenu", js.undefined)
      
      @scala.inline
      def setHideInMenu(value: Boolean): Self = StObject.set(x, "hideInMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideInMenuUndefined: Self = StObject.set(x, "hideInMenu", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconReactElement(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParentKeys(value: js.Array[String]): Self = StObject.set(x, "parentKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentKeysUndefined: Self = StObject.set(x, "parentKeys", js.undefined)
      
      @scala.inline
      def setParentKeysVarargs(value: String*): Self = StObject.set(x, "parentKeys", js.Array(value :_*))
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait MessageDescriptor extends StObject {
    
    var defaultMessage: js.UndefOr[String] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var id: js.Any = js.native
  }
  object MessageDescriptor {
    
    @scala.inline
    def apply(id: js.Any): MessageDescriptor = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageDescriptor]
    }
    
    @scala.inline
    implicit class MessageDescriptorMutableBuilder[Self <: MessageDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultMessage(value: String): Self = StObject.set(x, "defaultMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMessageUndefined: Self = StObject.set(x, "defaultMessage", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Route extends MenuDataItem {
    
    var routes: js.UndefOr[js.Array[Route]] = js.native
  }
  object Route {
    
    @scala.inline
    def apply(): Route = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoutes(value: js.Array[Route]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      @scala.inline
      def setRoutesVarargs(value: Route*): Self = StObject.set(x, "routes", js.Array(value :_*))
    }
  }
  
  /* Inlined parent std.Omit<react-router-dom.react-router-dom.RouteComponentProps<{}, react-router.react-router.StaticContext, history.history.LocationState>, 'location'> */
  @js.native
  trait RouterTypes[P] extends StObject {
    
    var computedMatch: js.UndefOr[`match`[P]] = js.native
    
    var history: History[LocationState] = js.native
    
    var location: Location[LocationState] | Pathname = js.native
    
    var `match`: typingsSlinky.reactRouter.mod.`match`[js.Object] = js.native
    
    var route: js.UndefOr[Route] = js.native
    
    var staticContext: js.UndefOr[StaticContext] = js.native
  }
  object RouterTypes {
    
    @scala.inline
    def apply[P](
      history: History[LocationState],
      location: Location[LocationState] | Pathname,
      `match`: `match`[js.Object]
    ): RouterTypes[P] = {
      val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterTypes[P]]
    }
    
    @scala.inline
    implicit class RouterTypesMutableBuilder[Self <: RouterTypes[_], P] (val x: Self with RouterTypes[P]) extends AnyVal {
      
      @scala.inline
      def setComputedMatch(value: `match`[P]): Self = StObject.set(x, "computedMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComputedMatchUndefined: Self = StObject.set(x, "computedMatch", js.undefined)
      
      @scala.inline
      def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Location[LocationState] | Pathname): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(value: `match`[js.Object]): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      @scala.inline
      def setStaticContext(value: StaticContext): Self = StObject.set(x, "staticContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticContextUndefined: Self = StObject.set(x, "staticContext", js.undefined)
    }
  }
  
  type WithFalse[T] = T | `false`
}
