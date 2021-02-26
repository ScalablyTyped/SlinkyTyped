package typingsSlinky.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jointjs.jointjsStrings.arc
import typingsSlinky.jointjs.jointjsStrings.cubic
import typingsSlinky.jointjs.jointjsStrings.gap
import typingsSlinky.jointjs.jointjsStrings.jumpover
import typingsSlinky.jointjs.jointjsStrings.normal
import typingsSlinky.jointjs.jointjsStrings.rounded
import typingsSlinky.jointjs.jointjsStrings.smooth
import typingsSlinky.jointjs.mod.dia.Point
import typingsSlinky.jointjs.mod.g.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectors {
  
  @JSImport("jointjs", "connectors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "connectors.jumpover")
  @js.native
  def jumpover: GenericConnector[typingsSlinky.jointjs.jointjsStrings.jumpover] = js.native
  @scala.inline
  def jumpover_=(x: GenericConnector[jumpover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jumpover")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectors.normal")
  @js.native
  def normal: GenericConnector[typingsSlinky.jointjs.jointjsStrings.normal] = js.native
  @scala.inline
  def normal_=(x: GenericConnector[normal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("normal")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectors.rounded")
  @js.native
  def rounded: GenericConnector[typingsSlinky.jointjs.jointjsStrings.rounded] = js.native
  @scala.inline
  def rounded_=(x: GenericConnector[rounded]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rounded")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "connectors.smooth")
  @js.native
  def smooth: GenericConnector[typingsSlinky.jointjs.jointjsStrings.smooth] = js.native
  @scala.inline
  def smooth_=(x: GenericConnector[smooth]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("smooth")(x.asInstanceOf[js.Any])
  
  type Connector = GenericConnector[ConnectorType]
  
  /* Inlined jointjs.jointjs.connectors.GenericConnectorArguments<jointjs.jointjs.connectors.ConnectorType> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jointjs.jointjsStrings.raw
    - typingsSlinky.jointjs.jointjsStrings.radius
    - typingsSlinky.jointjs.jointjsStrings.size
    - typingsSlinky.jointjs.jointjsStrings.jump
  */
  trait ConnectorArguments extends StObject
  object ConnectorArguments {
    
    @scala.inline
    def jump: typingsSlinky.jointjs.jointjsStrings.jump = "jump".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.jump]
    
    @scala.inline
    def radius: typingsSlinky.jointjs.jointjsStrings.radius = "radius".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.radius]
    
    @scala.inline
    def raw: typingsSlinky.jointjs.jointjsStrings.raw = "raw".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.raw]
    
    @scala.inline
    def size: typingsSlinky.jointjs.jointjsStrings.size = "size".asInstanceOf[typingsSlinky.jointjs.jointjsStrings.size]
  }
  
  @js.native
  trait ConnectorArgumentsMap
    extends /* key */ StringDictionary[StringDictionary[js.Any]] {
    
    var jumpover: JumpOverConnectorArguments = js.native
    
    var normal: NormalConnectorArguments = js.native
    
    var rounded: RoundedConnectorArguments = js.native
    
    var smooth: SmoothConnectorArguments = js.native
  }
  object ConnectorArgumentsMap {
    
    @scala.inline
    def apply(
      jumpover: JumpOverConnectorArguments,
      normal: NormalConnectorArguments,
      rounded: RoundedConnectorArguments,
      smooth: SmoothConnectorArguments
    ): ConnectorArgumentsMap = {
      val __obj = js.Dynamic.literal(jumpover = jumpover.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], rounded = rounded.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectorArgumentsMap]
    }
    
    @scala.inline
    implicit class ConnectorArgumentsMapMutableBuilder[Self <: ConnectorArgumentsMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJumpover(value: JumpOverConnectorArguments): Self = StObject.set(x, "jumpover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormal(value: NormalConnectorArguments): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRounded(value: RoundedConnectorArguments): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmooth(value: SmoothConnectorArguments): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectorJSON = GenericConnectorJSON[ConnectorType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jointjs.jointjsStrings.normal
    - typingsSlinky.jointjs.jointjsStrings.rounded
    - typingsSlinky.jointjs.jointjsStrings.smooth
    - typingsSlinky.jointjs.jointjsStrings.jumpover
  */
  trait ConnectorType extends StObject
  
  type GenericConnector[K /* <: ConnectorType */] = js.Function4[
    /* sourcePoint */ Point, 
    /* targetPoint */ Point, 
    /* routePoints */ js.Array[Point], 
    /* args */ js.UndefOr[GenericConnectorArguments[K]], 
    String | Path
  ]
  
  type GenericConnectorArguments[K /* <: ConnectorType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectors.ConnectorArgumentsMap[K] */ js.Any
  
  @js.native
  trait GenericConnectorJSON[K /* <: ConnectorType */] extends StObject {
    
    var args: js.UndefOr[GenericConnectorArguments[K]] = js.native
    
    var name: K = js.native
  }
  object GenericConnectorJSON {
    
    @scala.inline
    def apply[K /* <: ConnectorType */](name: K): GenericConnectorJSON[K] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericConnectorJSON[K]]
    }
    
    @scala.inline
    implicit class GenericConnectorJSONMutableBuilder[Self <: GenericConnectorJSON[_], K /* <: ConnectorType */] (val x: Self with GenericConnectorJSON[K]) extends AnyVal {
      
      @scala.inline
      def setArgs(value: GenericConnectorArguments[K]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JumpOverConnectorArguments extends StObject {
    
    var jump: js.UndefOr[arc | gap | cubic] = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object JumpOverConnectorArguments {
    
    @scala.inline
    def apply(): JumpOverConnectorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JumpOverConnectorArguments]
    }
    
    @scala.inline
    implicit class JumpOverConnectorArgumentsMutableBuilder[Self <: JumpOverConnectorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJump(value: arc | gap | cubic): Self = StObject.set(x, "jump", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJumpUndefined: Self = StObject.set(x, "jump", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait NormalConnectorArguments extends StObject {
    
    var raw: js.UndefOr[Boolean] = js.native
  }
  object NormalConnectorArguments {
    
    @scala.inline
    def apply(): NormalConnectorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalConnectorArguments]
    }
    
    @scala.inline
    implicit class NormalConnectorArgumentsMutableBuilder[Self <: NormalConnectorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  @js.native
  trait RoundedConnectorArguments extends StObject {
    
    var radius: js.UndefOr[Double] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
  }
  object RoundedConnectorArguments {
    
    @scala.inline
    def apply(): RoundedConnectorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RoundedConnectorArguments]
    }
    
    @scala.inline
    implicit class RoundedConnectorArgumentsMutableBuilder[Self <: RoundedConnectorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  @js.native
  trait SmoothConnectorArguments extends StObject {
    
    var raw: js.UndefOr[Boolean] = js.native
  }
  object SmoothConnectorArguments {
    
    @scala.inline
    def apply(): SmoothConnectorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmoothConnectorArguments]
    }
    
    @scala.inline
    implicit class SmoothConnectorArgumentsMutableBuilder[Self <: SmoothConnectorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
}
