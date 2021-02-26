package typingsSlinky.reactRouterDom

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import typingsSlinky.history.mod.History
import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationDescriptor
import typingsSlinky.history.mod.LocationState
import typingsSlinky.react.mod.AnchorHTMLAttributes
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.PropsWithoutRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactRouter.mod.MemoryRouterProps
import typingsSlinky.reactRouter.mod.Omit
import typingsSlinky.reactRouter.mod.PromptProps
import typingsSlinky.reactRouter.mod.RedirectProps
import typingsSlinky.reactRouter.mod.RouteComponentProps
import typingsSlinky.reactRouter.mod.RouteProps
import typingsSlinky.reactRouter.mod.RouterProps
import typingsSlinky.reactRouter.mod.StaticContext
import typingsSlinky.reactRouter.mod.StaticRouterProps
import typingsSlinky.reactRouter.mod.SwitchProps
import typingsSlinky.reactRouter.mod.WithRouterProps
import typingsSlinky.reactRouter.mod.WithRouterStatics
import typingsSlinky.reactRouter.mod.`match`
import typingsSlinky.reactRouterDom.anon.ReadonlyMemoryRouterProps
import typingsSlinky.reactRouterDom.anon.ReadonlyPromptProps
import typingsSlinky.reactRouterDom.anon.ReadonlyRedirectProps
import typingsSlinky.reactRouterDom.anon.ReadonlyRouterProps
import typingsSlinky.reactRouterDom.anon.ReadonlyStaticRouterProps
import typingsSlinky.reactRouterDom.anon.ReadonlySwitchProps
import typingsSlinky.reactRouterDom.reactRouterDomStrings.hashbang
import typingsSlinky.reactRouterDom.reactRouterDomStrings.history
import typingsSlinky.reactRouterDom.reactRouterDomStrings.location
import typingsSlinky.reactRouterDom.reactRouterDomStrings.noslash
import typingsSlinky.reactRouterDom.reactRouterDomStrings.slash
import typingsSlinky.reactRouterDom.reactRouterDomStrings.staticContext
import typingsSlinky.std.Parameters
import typingsSlinky.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-router-dom", "BrowserRouter")
  @js.native
  class BrowserRouter protected ()
    extends Component[BrowserRouterProps, js.Any, js.Any] {
    def this(props: BrowserRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BrowserRouterProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-dom", "HashRouter")
  @js.native
  class HashRouter protected ()
    extends Component[HashRouterProps, js.Any, js.Any] {
    def this(props: HashRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HashRouterProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-dom", "Link")
  @js.native
  def Link[S](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<Link<S>> is not an array type */ params: Parameters[Link[S]]
  ): ReturnType[Link[S]] = js.native
  type Link[S] = ForwardRefExoticComponent[PropsWithoutRef[LinkProps[S]] with RefAttributes[HTMLAnchorElement]]
  
  @JSImport("react-router-dom", "MemoryRouter")
  @js.native
  class MemoryRouter protected ()
    extends typingsSlinky.reactRouter.mod.MemoryRouter {
    def this(props: MemoryRouterProps) = this()
    def this(props: ReadonlyMemoryRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MemoryRouterProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-dom", "NavLink")
  @js.native
  def NavLink[S](
    // TODO: Define this as ...params: Parameters<NavLink<S>> when only TypeScript >= 3.1 support is needed.
  props: PropsWithoutRef[NavLinkProps[S]] with RefAttributes[HTMLAnchorElement]
  ): ReturnType[NavLink[S]] = js.native
  type NavLink[S] = ForwardRefExoticComponent[PropsWithoutRef[NavLinkProps[S]] with RefAttributes[HTMLAnchorElement]]
  
  @JSImport("react-router-dom", "Prompt")
  @js.native
  class Prompt protected ()
    extends typingsSlinky.reactRouter.mod.Prompt {
    def this(props: PromptProps) = this()
    def this(props: ReadonlyPromptProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PromptProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-dom", "Redirect")
  @js.native
  class Redirect protected ()
    extends typingsSlinky.reactRouter.mod.Redirect {
    def this(props: RedirectProps) = this()
    def this(props: ReadonlyRedirectProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RedirectProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-dom", "Route")
  @js.native
  class Route[T /* <: RouteProps */] protected ()
    extends typingsSlinky.reactRouter.mod.Route[T] {
    def this(props: T) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: T, context: js.Any) = this()
  }
  
  @JSImport("react-router-dom", "Router")
  @js.native
  class Router protected ()
    extends typingsSlinky.reactRouter.mod.Router {
    def this(props: RouterProps) = this()
    def this(props: ReadonlyRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RouterProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-dom", "StaticRouter")
  @js.native
  class StaticRouter protected ()
    extends typingsSlinky.reactRouter.mod.StaticRouter {
    def this(props: StaticRouterProps) = this()
    def this(props: ReadonlyStaticRouterProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StaticRouterProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-dom", "Switch")
  @js.native
  class Switch protected ()
    extends typingsSlinky.reactRouter.mod.Switch {
    def this(props: SwitchProps) = this()
    def this(props: ReadonlySwitchProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SwitchProps, context: js.Any) = this()
  }
  
  @JSImport("react-router-dom", "generatePath")
  @js.native
  def generatePath(pattern: String): String = js.native
  @JSImport("react-router-dom", "generatePath")
  @js.native
  def generatePath(pattern: String, params: StringDictionary[js.UndefOr[String | Double | Boolean]]): String = js.native
  
  @JSImport("react-router-dom", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String): `match`[Params] | Null = js.native
  @JSImport("react-router-dom", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: String, parent: `match`[Params]): `match`[Params] | Null = js.native
  @JSImport("react-router-dom", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String]): `match`[Params] | Null = js.native
  @JSImport("react-router-dom", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: js.Array[String], parent: `match`[Params]): `match`[Params] | Null = js.native
  @JSImport("react-router-dom", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps): `match`[Params] | Null = js.native
  @JSImport("react-router-dom", "matchPath")
  @js.native
  def matchPath[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.matchPath with TopLevel[js.Any] */](pathname: String, props: RouteProps, parent: `match`[Params]): `match`[Params] | Null = js.native
  
  @JSImport("react-router-dom", "useHistory")
  @js.native
  def useHistory[HistoryLocationState](): History[HistoryLocationState] = js.native
  
  @JSImport("react-router-dom", "useLocation")
  @js.native
  def useLocation[S](): Location[S] = js.native
  
  @JSImport("react-router-dom", "useParams")
  @js.native
  def useParams[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.useParams with TopLevel[js.Any] */](): Params = js.native
  
  @JSImport("react-router-dom", "useRouteMatch")
  @js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.useRouteMatch with TopLevel[js.Any] */](): `match`[Params] = js.native
  @JSImport("react-router-dom", "useRouteMatch")
  @js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.useRouteMatch with TopLevel[js.Any] */](path: String): `match`[Params] | Null = js.native
  @JSImport("react-router-dom", "useRouteMatch")
  @js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.useRouteMatch with TopLevel[js.Any] */](path: js.Array[String]): `match`[Params] | Null = js.native
  @JSImport("react-router-dom", "useRouteMatch")
  @js.native
  def useRouteMatch[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsSlinky.reactRouterDom.reactRouterDomStrings.useRouteMatch with TopLevel[js.Any] */](path: RouteProps): `match`[Params] | Null = js.native
  
  @JSImport("react-router-dom", "withRouter")
  @js.native
  def withRouter[P /* <: RouteComponentProps[_, StaticContext, LocationState] */, C /* <: ReactComponentClass[P] */](component: C with ReactComponentClass[P]): (ReactComponentClass[
    (Omit[
      P, 
      /* keyof react-router.react-router.RouteComponentProps<any, react-router.react-router.StaticContext, history.history.LocationState> */ history | location | typingsSlinky.reactRouterDom.reactRouterDomStrings.`match` | staticContext
    ]) with WithRouterProps[C]
  ]) with WithRouterStatics[C] = js.native
  
  @js.native
  trait BrowserRouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.native
    
    var forceRefresh: js.UndefOr[Boolean] = js.native
    
    var getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
      ] = js.native
    
    var keyLength: js.UndefOr[Double] = js.native
  }
  object BrowserRouterProps {
    
    @scala.inline
    def apply(): BrowserRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserRouterProps]
    }
    
    @scala.inline
    implicit class BrowserRouterPropsMutableBuilder[Self <: BrowserRouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    }
  }
  
  @js.native
  trait HashRouterProps extends StObject {
    
    var basename: js.UndefOr[String] = js.native
    
    var getUserConfirmation: js.UndefOr[
        js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
      ] = js.native
    
    var hashType: js.UndefOr[slash | noslash | hashbang] = js.native
  }
  object HashRouterProps {
    
    @scala.inline
    def apply(): HashRouterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashRouterProps]
    }
    
    @scala.inline
    implicit class HashRouterPropsMutableBuilder[Self <: HashRouterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setGetUserConfirmation(value: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Unit): Self = StObject.set(x, "getUserConfirmation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetUserConfirmationUndefined: Self = StObject.set(x, "getUserConfirmation", js.undefined)
      
      @scala.inline
      def setHashType(value: slash | noslash | hashbang): Self = StObject.set(x, "hashType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashTypeUndefined: Self = StObject.set(x, "hashType", js.undefined)
    }
  }
  
  @js.native
  trait LinkProps[S] extends AnchorHTMLAttributes[HTMLAnchorElement] {
    
    var component: js.UndefOr[ReactComponentClass[_]] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLAnchorElement]] = js.native
    
    var replace: js.UndefOr[Boolean] = js.native
    
    var to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]]) = js.native
  }
  object LinkProps {
    
    @scala.inline
    def apply[S](to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])): LinkProps[S] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps[S]]
    }
    
    @scala.inline
    implicit class LinkPropsMutableBuilder[Self <: LinkProps[_], S] (val x: Self with LinkProps[S]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
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
      def setTo(value: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToFunction1(value: /* location */ Location[S] => LocationDescriptor[S]): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait NavLinkProps[S] extends LinkProps[S] {
    
    var activeClassName: js.UndefOr[String] = js.native
    
    var activeStyle: js.UndefOr[CSSProperties] = js.native
    
    var exact: js.UndefOr[Boolean] = js.native
    
    var isActive: js.UndefOr[js.Function2[/* match */ `match`[_] | Null, /* location */ Location[S], Boolean]] = js.native
    
    var location: js.UndefOr[Location[S]] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object NavLinkProps {
    
    @scala.inline
    def apply[S](to: LocationDescriptor[S] | (js.Function1[/* location */ Location[S], LocationDescriptor[S]])): NavLinkProps[S] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavLinkProps[S]]
    }
    
    @scala.inline
    implicit class NavLinkPropsMutableBuilder[Self <: NavLinkProps[_], S] (val x: Self with NavLinkProps[S]) extends AnyVal {
      
      @scala.inline
      def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      @scala.inline
      def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      @scala.inline
      def setIsActive(value: (/* match */ `match`[_] | Null, /* location */ Location[S]) => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setLocation(value: Location[S]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
