package typingsSlinky.namedRoutes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.Express
import typingsSlinky.express.mod.NextFunction
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.express.mod.Request_
import typingsSlinky.express.mod.Response_
import typingsSlinky.express.mod.Router
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.namedRoutes.anon.PartialRouteOptions
import typingsSlinky.namedRoutes.anon.PartialRouterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("named-routes", JSImport.Namespace)
  @js.native
  class ^ () extends NamedRouter {
    def this(options: PartialRouterOptions) = this()
  }
  
  @js.native
  trait NamedRouter extends StObject {
    
    def add(method: String, path: String, callbacks: js.Array[RequestHandler[ParamsDictionary, _, _, Query]]): Unit = js.native
    def add(
      method: String,
      path: String,
      callbacks: js.Array[RequestHandler[ParamsDictionary, _, _, Query]],
      options: PartialRouteOptions
    ): Unit = js.native
    def add(method: String, path: String, callbacks: RequestHandler[ParamsDictionary, _, _, Query]): Unit = js.native
    def add(
      method: String,
      path: String,
      callbacks: RequestHandler[ParamsDictionary, _, _, Query],
      options: PartialRouteOptions
    ): Unit = js.native
    
    def build(name: String): String = js.native
    def build(name: String, params: js.UndefOr[scala.Nothing], method: String): String = js.native
    def build(name: String, params: RouteParams): String = js.native
    def build(name: String, params: RouteParams, method: String): String = js.native
    
    def dispatch(req: Request_[ParamsDictionary, _, _, Query]): Unit = js.native
    def dispatch(req: Request_[ParamsDictionary, _, _, Query], res: js.UndefOr[scala.Nothing], next: NextFunction): Unit = js.native
    def dispatch(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_]): Unit = js.native
    def dispatch(req: Request_[ParamsDictionary, _, _, Query], res: Response_[_], next: NextFunction): Unit = js.native
    
    def extendExpress(app: Express): NamedRouter = js.native
    def extendExpress(app: Router): NamedRouter = js.native
    
    def `match`(req: Request_[ParamsDictionary, _, _, Query]): Boolean | js.Object = js.native
    
    def param(callback: RequestHandler[ParamsDictionary, _, _, Query]): NamedRouter = js.native
    def param(name: String, callback: RequestHandler[ParamsDictionary, _, _, Query]): NamedRouter = js.native
    
    def registerAppHelpers(app: Express): NamedRouter = js.native
  }
  
  @js.native
  trait RouteOptions extends StObject {
    
    var caseSensitive: Boolean = js.native
    
    var name: String = js.native
    
    var recursiveWildcard: Boolean = js.native
    
    var wildcardInPairs: Boolean = js.native
  }
  object RouteOptions {
    
    @scala.inline
    def apply(caseSensitive: Boolean, name: String, recursiveWildcard: Boolean, wildcardInPairs: Boolean): RouteOptions = {
      val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recursiveWildcard = recursiveWildcard.asInstanceOf[js.Any], wildcardInPairs = wildcardInPairs.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteOptions]
    }
    
    @scala.inline
    implicit class RouteOptionsMutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveWildcard(value: Boolean): Self = StObject.set(x, "recursiveWildcard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWildcardInPairs(value: Boolean): Self = StObject.set(x, "wildcardInPairs", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteParams = StringDictionary[String | (js.Array[Boolean | Double | String]) | Double | Boolean | Null]
  
  @js.native
  trait RouterOptions extends StObject {
    
    var caseSensitive: Boolean = js.native
  }
  object RouterOptions {
    
    @scala.inline
    def apply(caseSensitive: Boolean): RouterOptions = {
      val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterOptions]
    }
    
    @scala.inline
    implicit class RouterOptionsMutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    }
  }
  
  object expressServeStaticCoreAugmentingMod {
    
    @js.native
    trait Application extends StObject {
      
      var namedRoutes: NamedRouter = js.native
    }
    object Application {
      
      @scala.inline
      def apply(namedRoutes: NamedRouter): Application = {
        val __obj = js.Dynamic.literal(namedRoutes = namedRoutes.asInstanceOf[js.Any])
        __obj.asInstanceOf[Application]
      }
      
      @scala.inline
      implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNamedRoutes(value: NamedRouter): Self = StObject.set(x, "namedRoutes", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-name
    type IRouterMatcher[T] = js.Function3[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PathParams */ /* path */ js.Any, 
        /* name */ String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestHandler */ /* repeated */ js.Any, 
        T
      ]
  }
}
