package typingsSlinky.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jointjs.jointjsStrings.manhattan
import typingsSlinky.jointjs.jointjsStrings.metro
import typingsSlinky.jointjs.jointjsStrings.normal
import typingsSlinky.jointjs.jointjsStrings.oneSide
import typingsSlinky.jointjs.jointjsStrings.orthogonal
import typingsSlinky.jointjs.mod.dia.LinkEnd
import typingsSlinky.jointjs.mod.dia.LinkView
import typingsSlinky.jointjs.mod.dia.OrthogonalDirection
import typingsSlinky.jointjs.mod.dia.Point
import typingsSlinky.jointjs.mod.dia.Sides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routers {
  
  @JSImport("jointjs", "routers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "routers.manhattan")
  @js.native
  def manhattan: GenericRouter[typingsSlinky.jointjs.jointjsStrings.manhattan] = js.native
  @scala.inline
  def manhattan_=(x: GenericRouter[manhattan]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manhattan")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "routers.metro")
  @js.native
  def metro: GenericRouter[typingsSlinky.jointjs.jointjsStrings.metro] = js.native
  @scala.inline
  def metro_=(x: GenericRouter[metro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metro")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "routers.normal")
  @js.native
  def normal: GenericRouter[typingsSlinky.jointjs.jointjsStrings.normal] = js.native
  @scala.inline
  def normal_=(x: GenericRouter[normal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "routers.oneSide")
  @js.native
  def oneSide: GenericRouter[typingsSlinky.jointjs.jointjsStrings.oneSide] = js.native
  @scala.inline
  def oneSide_=(x: GenericRouter[oneSide]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oneSide")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "routers.orthogonal")
  @js.native
  def orthogonal: GenericRouter[typingsSlinky.jointjs.jointjsStrings.orthogonal] = js.native
  @scala.inline
  def orthogonal_=(x: GenericRouter[orthogonal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orthogonal")(x.asInstanceOf[js.Any])
  
  type GenericRouter[K /* <: RouterType */] = js.Function3[
    /* vertices */ js.Array[Point], 
    /* args */ js.UndefOr[GenericRouterArguments[K]], 
    /* linkView */ js.UndefOr[LinkView], 
    js.Array[Point]
  ]
  
  type GenericRouterArguments[K /* <: RouterType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.routers.RouterArgumentsMap[K] */ js.Any
  
  @js.native
  trait GenericRouterJSON[K /* <: RouterType */] extends StObject {
    
    var args: js.UndefOr[GenericRouterArguments[K]] = js.native
    
    var name: K = js.native
  }
  object GenericRouterJSON {
    
    @scala.inline
    def apply[K /* <: RouterType */](name: K): GenericRouterJSON[K] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericRouterJSON[K]]
    }
    
    @scala.inline
    implicit class GenericRouterJSONMutableBuilder[Self <: GenericRouterJSON[_], K /* <: RouterType */] (val x: Self with GenericRouterJSON[K]) extends AnyVal {
      
      @scala.inline
      def setArgs(value: GenericRouterArguments[K]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ManhattanRouterArguments extends StObject {
    
    var endDirections: js.UndefOr[js.Array[OrthogonalDirection]] = js.native
    
    var excludeEnds: js.UndefOr[js.Array[LinkEnd]] = js.native
    
    var excludeTypes: js.UndefOr[js.Array[String]] = js.native
    
    var maxAllowedDirectionChange: js.UndefOr[Double] = js.native
    
    var maximumLoops: js.UndefOr[Double] = js.native
    
    var padding: js.UndefOr[Sides] = js.native
    
    var perpendicular: js.UndefOr[Boolean] = js.native
    
    var startDirections: js.UndefOr[js.Array[OrthogonalDirection]] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object ManhattanRouterArguments {
    
    @scala.inline
    def apply(): ManhattanRouterArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManhattanRouterArguments]
    }
    
    @scala.inline
    implicit class ManhattanRouterArgumentsMutableBuilder[Self <: ManhattanRouterArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndDirections(value: js.Array[OrthogonalDirection]): Self = StObject.set(x, "endDirections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDirectionsUndefined: Self = StObject.set(x, "endDirections", js.undefined)
      
      @scala.inline
      def setEndDirectionsVarargs(value: OrthogonalDirection*): Self = StObject.set(x, "endDirections", js.Array(value :_*))
      
      @scala.inline
      def setExcludeEnds(value: js.Array[LinkEnd]): Self = StObject.set(x, "excludeEnds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeEndsUndefined: Self = StObject.set(x, "excludeEnds", js.undefined)
      
      @scala.inline
      def setExcludeEndsVarargs(value: LinkEnd*): Self = StObject.set(x, "excludeEnds", js.Array(value :_*))
      
      @scala.inline
      def setExcludeTypes(value: js.Array[String]): Self = StObject.set(x, "excludeTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeTypesUndefined: Self = StObject.set(x, "excludeTypes", js.undefined)
      
      @scala.inline
      def setExcludeTypesVarargs(value: String*): Self = StObject.set(x, "excludeTypes", js.Array(value :_*))
      
      @scala.inline
      def setMaxAllowedDirectionChange(value: Double): Self = StObject.set(x, "maxAllowedDirectionChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAllowedDirectionChangeUndefined: Self = StObject.set(x, "maxAllowedDirectionChange", js.undefined)
      
      @scala.inline
      def setMaximumLoops(value: Double): Self = StObject.set(x, "maximumLoops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumLoopsUndefined: Self = StObject.set(x, "maximumLoops", js.undefined)
      
      @scala.inline
      def setPadding(value: Sides): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPerpendicular(value: Boolean): Self = StObject.set(x, "perpendicular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerpendicularUndefined: Self = StObject.set(x, "perpendicular", js.undefined)
      
      @scala.inline
      def setStartDirections(value: js.Array[OrthogonalDirection]): Self = StObject.set(x, "startDirections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDirectionsUndefined: Self = StObject.set(x, "startDirections", js.undefined)
      
      @scala.inline
      def setStartDirectionsVarargs(value: OrthogonalDirection*): Self = StObject.set(x, "startDirections", js.Array(value :_*))
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  @js.native
  trait NormalRouterArguments extends StObject
  
  @js.native
  trait OneSideRouterArguments extends StObject {
    
    var padding: js.UndefOr[Sides] = js.native
    
    var side: js.UndefOr[OrthogonalDirection] = js.native
  }
  object OneSideRouterArguments {
    
    @scala.inline
    def apply(): OneSideRouterArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OneSideRouterArguments]
    }
    
    @scala.inline
    implicit class OneSideRouterArgumentsMutableBuilder[Self <: OneSideRouterArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPadding(value: Sides): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setSide(value: OrthogonalDirection): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    }
  }
  
  @js.native
  trait OrthogonalRouterArguments extends StObject {
    
    var elementPadding: js.UndefOr[Double] = js.native
    
    var padding: js.UndefOr[Sides] = js.native
  }
  object OrthogonalRouterArguments {
    
    @scala.inline
    def apply(): OrthogonalRouterArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OrthogonalRouterArguments]
    }
    
    @scala.inline
    implicit class OrthogonalRouterArgumentsMutableBuilder[Self <: OrthogonalRouterArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElementPadding(value: Double): Self = StObject.set(x, "elementPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementPaddingUndefined: Self = StObject.set(x, "elementPadding", js.undefined)
      
      @scala.inline
      def setPadding(value: Sides): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  type Router = GenericRouter[RouterType]
  
  /* Inlined jointjs.jointjs.routers.GenericRouterArguments<jointjs.jointjs.routers.RouterType> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jointjs.jointjsStrings.excludeTypes
    - typingsSlinky.jointjs.jointjsStrings.maxAllowedDirectionChange
    - typingsSlinky.jointjs.jointjsStrings.startDirections
    - typingsSlinky.jointjs.jointjsStrings.elementPadding
    - typingsSlinky.jointjs.jointjsStrings.maximumLoops
    - typingsSlinky.jointjs.jointjsStrings.step
    - typingsSlinky.jointjs.jointjsStrings.padding
    - typingsSlinky.jointjs.jointjsStrings.endDirections
    - typingsSlinky.jointjs.jointjsStrings.perpendicular
    - typingsSlinky.jointjs.jointjsStrings.excludeEnds
    - typingsSlinky.jointjs.jointjsStrings.side
  */
  trait RouterArguments extends StObject
  object RouterArguments {
    
    @scala.inline
    def elementPadding: typingsSlinky.jointjs.jointjsStrings.elementPadding = "elementPadding".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.elementPadding]
    
    @scala.inline
    def endDirections: typingsSlinky.jointjs.jointjsStrings.endDirections = "endDirections".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.endDirections]
    
    @scala.inline
    def excludeEnds: typingsSlinky.jointjs.jointjsStrings.excludeEnds = "excludeEnds".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.excludeEnds]
    
    @scala.inline
    def excludeTypes: typingsSlinky.jointjs.jointjsStrings.excludeTypes = "excludeTypes".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.excludeTypes]
    
    @scala.inline
    def maxAllowedDirectionChange: typingsSlinky.jointjs.jointjsStrings.maxAllowedDirectionChange = "maxAllowedDirectionChange".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.maxAllowedDirectionChange]
    
    @scala.inline
    def maximumLoops: typingsSlinky.jointjs.jointjsStrings.maximumLoops = "maximumLoops".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.maximumLoops]
    
    @scala.inline
    def padding: typingsSlinky.jointjs.jointjsStrings.padding = "padding".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.padding]
    
    @scala.inline
    def perpendicular: typingsSlinky.jointjs.jointjsStrings.perpendicular = "perpendicular".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.perpendicular]
    
    @scala.inline
    def side: typingsSlinky.jointjs.jointjsStrings.side = "side".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.side]
    
    @scala.inline
    def startDirections: typingsSlinky.jointjs.jointjsStrings.startDirections = "startDirections".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.startDirections]
    
    @scala.inline
    def step: typingsSlinky.jointjs.jointjsStrings.step = "step".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.step]
  }
  
  @js.native
  trait RouterArgumentsMap
    extends /* key */ StringDictionary[StringDictionary[js.Any]] {
    
    var manhattan: ManhattanRouterArguments = js.native
    
    var metro: ManhattanRouterArguments = js.native
    
    var normal: NormalRouterArguments = js.native
    
    var oneSide: OneSideRouterArguments = js.native
    
    var orthogonal: OrthogonalRouterArguments = js.native
  }
  object RouterArgumentsMap {
    
    @scala.inline
    def apply(
      manhattan: ManhattanRouterArguments,
      metro: ManhattanRouterArguments,
      normal: NormalRouterArguments,
      oneSide: OneSideRouterArguments,
      orthogonal: OrthogonalRouterArguments
    ): RouterArgumentsMap = {
      val __obj = js.Dynamic.literal(manhattan = manhattan.asInstanceOf[js.Any], metro = metro.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], oneSide = oneSide.asInstanceOf[js.Any], orthogonal = orthogonal.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterArgumentsMap]
    }
    
    @scala.inline
    implicit class RouterArgumentsMapMutableBuilder[Self <: RouterArgumentsMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManhattan(value: ManhattanRouterArguments): Self = StObject.set(x, "manhattan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetro(value: ManhattanRouterArguments): Self = StObject.set(x, "metro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormal(value: NormalRouterArguments): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOneSide(value: OneSideRouterArguments): Self = StObject.set(x, "oneSide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrthogonal(value: OrthogonalRouterArguments): Self = StObject.set(x, "orthogonal", value.asInstanceOf[js.Any])
    }
  }
  
  type RouterJSON = GenericRouterJSON[RouterType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jointjs.jointjsStrings.normal
    - typingsSlinky.jointjs.jointjsStrings.manhattan
    - typingsSlinky.jointjs.jointjsStrings.metro
    - typingsSlinky.jointjs.jointjsStrings.orthogonal
    - typingsSlinky.jointjs.jointjsStrings.oneSide
  */
  trait RouterType extends StObject
}
