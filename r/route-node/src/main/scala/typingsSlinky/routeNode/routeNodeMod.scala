package typingsSlinky.routeNode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pathParser.encodingMod.URLParamsEncodingType
import typingsSlinky.pathParser.mod.Path
import typingsSlinky.routeNode.routeNodeStrings.query
import typingsSlinky.routeNode.routeNodeStrings.url
import typingsSlinky.searchParams.encodeMod.IOptions
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeNodeMod {
  
  @JSImport("route-node/dist/RouteNode", "RouteNode")
  @js.native
  class RouteNode () extends Route {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], path: String) = this()
    def this(name: String, path: String) = this()
    def this(name: js.UndefOr[scala.Nothing], path: js.UndefOr[scala.Nothing], childRoutes: js.Array[Route]) = this()
    def this(name: js.UndefOr[scala.Nothing], path: String, childRoutes: js.Array[Route]) = this()
    def this(name: String, path: js.UndefOr[scala.Nothing], childRoutes: js.Array[Route]) = this()
    def this(name: String, path: String, childRoutes: js.Array[Route]) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.UndefOr[scala.Nothing],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.Array[Route],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: String,
      childRoutes: js.UndefOr[scala.Nothing],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: String,
      childRoutes: js.Array[Route],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: String,
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.UndefOr[scala.Nothing],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: String,
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.Array[Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: String, path: String, childRoutes: js.UndefOr[scala.Nothing], options: RouteNodeOptions) = this()
    def this(name: String, path: String, childRoutes: js.Array[Route], options: RouteNodeOptions) = this()
    
    var absolute: Boolean = js.native
    
    def add(route: js.Array[Route]): this.type = js.native
    def add(route: js.Array[Route], cb: js.UndefOr[scala.Nothing], sort: Boolean): this.type = js.native
    def add(route: js.Array[Route], cb: Callback): this.type = js.native
    def add(route: js.Array[Route], cb: Callback, sort: Boolean): this.type = js.native
    def add(route: Route): this.type = js.native
    def add(route: Route, cb: js.UndefOr[scala.Nothing], sort: Boolean): this.type = js.native
    def add(route: Route, cb: Callback): this.type = js.native
    def add(route: Route, cb: Callback, sort: Boolean): this.type = js.native
    
    def addNode(name: String, path: String): this.type = js.native
    
    var addRouteNode: js.Any = js.native
    
    def buildPath(routeName: String): String = js.native
    def buildPath(routeName: String, params: js.UndefOr[scala.Nothing], options: BuildOptions): String = js.native
    def buildPath(routeName: String, params: Record[String, _]): String = js.native
    def buildPath(routeName: String, params: Record[String, _], options: BuildOptions): String = js.native
    
    def buildState(name: String): RouteNodeState | Null = js.native
    def buildState(name: String, params: Record[String, _]): RouteNodeState | Null = js.native
    
    var checkParents: js.Any = js.native
    
    var children: js.Array[RouteNode] = js.native
    
    var findAbsoluteChildren: js.Any = js.native
    
    var findSlashChild: js.Any = js.native
    
    def getNonAbsoluteChildren(): js.Array[RouteNode] = js.native
    
    def getParentSegments(): js.Array[RouteNode] = js.native
    def getParentSegments(segments: js.Array[RouteNode]): js.Array[RouteNode] = js.native
    
    def getPath(routeName: String): String | Null = js.native
    
    var getSegmentsByName: js.Any = js.native
    
    var getSegmentsMatchingPath: js.Any = js.native
    
    var hasParentsParams: js.Any = js.native
    
    def matchPath(path: String): RouteNodeState | Null = js.native
    def matchPath(path: String, options: MatchOptions): RouteNodeState | Null = js.native
    
    var name: String = js.native
    
    var parent: js.UndefOr[RouteNode] = js.native
    
    var parser: (Path[Record[String, _]]) | Null = js.native
    
    var path: String = js.native
    
    def setParent(parent: RouteNode): Unit = js.native
    
    def setPath(): Unit = js.native
    def setPath(path: String): Unit = js.native
    
    def sortChildren(): Unit = js.native
    
    def sortDescendants(): Unit = js.native
  }
  
  @js.native
  trait BuildOptions extends StObject {
    
    var queryParams: js.UndefOr[IOptions] = js.native
    
    var queryParamsMode: js.UndefOr[QueryParamsMode] = js.native
    
    var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.native
    
    var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.native
  }
  object BuildOptions {
    
    @scala.inline
    def apply(): BuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildOptions]
    }
    
    @scala.inline
    implicit class BuildOptionsMutableBuilder[Self <: BuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsMode(value: QueryParamsMode): Self = StObject.set(x, "queryParamsMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsModeUndefined: Self = StObject.set(x, "queryParamsMode", js.undefined)
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setTrailingSlashMode(value: TrailingSlashMode): Self = StObject.set(x, "trailingSlashMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingSlashModeUndefined: Self = StObject.set(x, "trailingSlashMode", js.undefined)
      
      @scala.inline
      def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* repeated */ js.Any, Unit]
  
  @js.native
  trait MatchOptions extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var queryParams: js.UndefOr[IOptions] = js.native
    
    var queryParamsMode: js.UndefOr[QueryParamsMode] = js.native
    
    var strictTrailingSlash: js.UndefOr[Boolean] = js.native
    
    var strongMatching: js.UndefOr[Boolean] = js.native
    
    var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.native
    
    var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.native
  }
  object MatchOptions {
    
    @scala.inline
    def apply(): MatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchOptions]
    }
    
    @scala.inline
    implicit class MatchOptionsMutableBuilder[Self <: MatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsMode(value: QueryParamsMode): Self = StObject.set(x, "queryParamsMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsModeUndefined: Self = StObject.set(x, "queryParamsMode", js.undefined)
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setStrictTrailingSlash(value: Boolean): Self = StObject.set(x, "strictTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictTrailingSlashUndefined: Self = StObject.set(x, "strictTrailingSlash", js.undefined)
      
      @scala.inline
      def setStrongMatching(value: Boolean): Self = StObject.set(x, "strongMatching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongMatchingUndefined: Self = StObject.set(x, "strongMatching", js.undefined)
      
      @scala.inline
      def setTrailingSlashMode(value: TrailingSlashMode): Self = StObject.set(x, "trailingSlashMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingSlashModeUndefined: Self = StObject.set(x, "trailingSlashMode", js.undefined)
      
      @scala.inline
      def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
  
  @js.native
  trait MatchResponse extends StObject {
    
    var params: Record[String, _] = js.native
    
    var segments: js.Array[RouteNode] = js.native
  }
  object MatchResponse {
    
    @scala.inline
    def apply(params: Record[String, _], segments: js.Array[RouteNode]): MatchResponse = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResponse]
    }
    
    @scala.inline
    implicit class MatchResponseMutableBuilder[Self <: MatchResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: Record[String, _]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegments(value: js.Array[RouteNode]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsVarargs(value: RouteNode*): Self = StObject.set(x, "segments", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.routeNode.routeNodeStrings.default
    - typingsSlinky.routeNode.routeNodeStrings.strict
    - typingsSlinky.routeNode.routeNodeStrings.loose
  */
  trait QueryParamsMode extends StObject
  object QueryParamsMode {
    
    @scala.inline
    def default: typingsSlinky.routeNode.routeNodeStrings.default = "default".asInstanceOf[typingsSlinky.routeNode.routeNodeStrings.default]
    
    @scala.inline
    def loose: typingsSlinky.routeNode.routeNodeStrings.loose = "loose".asInstanceOf[typingsSlinky.routeNode.routeNodeStrings.loose]
    
    @scala.inline
    def strict: typingsSlinky.routeNode.routeNodeStrings.strict = "strict".asInstanceOf[typingsSlinky.routeNode.routeNodeStrings.strict]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.routeNode.routeNodeMod.RouteNode
    - typingsSlinky.routeNode.routeNodeMod.RouteDefinition
  */
  trait Route extends StObject
  
  @js.native
  trait RouteDefinition
    extends /* key */ StringDictionary[js.Any]
       with Route {
    
    var name: String = js.native
    
    var path: String = js.native
  }
  object RouteDefinition {
    
    @scala.inline
    def apply(name: String, path: String): RouteDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDefinition]
    }
    
    @scala.inline
    implicit class RouteDefinitionMutableBuilder[Self <: RouteDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteNodeOptions extends StObject {
    
    var finalSort: js.UndefOr[Boolean] = js.native
    
    var onAdd: js.UndefOr[Callback] = js.native
    
    var parent: js.UndefOr[RouteNode] = js.native
    
    var sort: js.UndefOr[Boolean] = js.native
  }
  object RouteNodeOptions {
    
    @scala.inline
    def apply(): RouteNodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteNodeOptions]
    }
    
    @scala.inline
    implicit class RouteNodeOptionsMutableBuilder[Self <: RouteNodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinalSort(value: Boolean): Self = StObject.set(x, "finalSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalSortUndefined: Self = StObject.set(x, "finalSort", js.undefined)
      
      @scala.inline
      def setOnAdd(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setParent(value: RouteNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  @js.native
  trait RouteNodeState extends StObject {
    
    var meta: RouteNodeStateMeta = js.native
    
    var name: String = js.native
    
    var params: Record[String, _] = js.native
  }
  object RouteNodeState {
    
    @scala.inline
    def apply(meta: RouteNodeStateMeta, name: String, params: Record[String, _]): RouteNodeState = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteNodeState]
    }
    
    @scala.inline
    implicit class RouteNodeStateMutableBuilder[Self <: RouteNodeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: RouteNodeStateMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: Record[String, _]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteNodeStateMeta = StringDictionary[StringDictionary[query | url]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.routeNode.routeNodeStrings.default
    - typingsSlinky.routeNode.routeNodeStrings.never
    - typingsSlinky.routeNode.routeNodeStrings.always
  */
  trait TrailingSlashMode extends StObject
  object TrailingSlashMode {
    
    @scala.inline
    def default: typingsSlinky.routeNode.routeNodeStrings.default = "default".asInstanceOf[typingsSlinky.routeNode.routeNodeStrings.default]
    
    @scala.inline
    def always: typingsSlinky.routeNode.routeNodeStrings.always = "always".asInstanceOf[typingsSlinky.routeNode.routeNodeStrings.always]
    
    @scala.inline
    def never: typingsSlinky.routeNode.routeNodeStrings.never = "never".asInstanceOf[typingsSlinky.routeNode.routeNodeStrings.never]
  }
}
