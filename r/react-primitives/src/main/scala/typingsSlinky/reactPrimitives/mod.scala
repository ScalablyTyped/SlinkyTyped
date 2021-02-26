package typingsSlinky.reactPrimitives

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentPropsWithRef
import typingsSlinky.reactNative.anon.TypeofImage
import typingsSlinky.reactNative.anon.TypeofView
import typingsSlinky.reactNative.anon.Y
import typingsSlinky.reactNative.mod.Animated.AnimatedProps
import typingsSlinky.reactNative.mod.Animated.AnimatedValue
import typingsSlinky.reactNative.mod.Animated.AnimatedValueXY
import typingsSlinky.reactNative.mod.Animated.CompositeAnimation
import typingsSlinky.reactNative.mod.Animated.DecayAnimationConfig
import typingsSlinky.reactNative.mod.Animated.EventConfig
import typingsSlinky.reactNative.mod.Animated.LoopAnimationConfig
import typingsSlinky.reactNative.mod.Animated.Mapping
import typingsSlinky.reactNative.mod.Animated.ParallelConfig
import typingsSlinky.reactNative.mod.Animated.SpringAnimationConfig
import typingsSlinky.reactNative.mod.Animated.TimingAnimationConfig
import typingsSlinky.reactNative.mod.EasingStatic
import typingsSlinky.reactNative.mod.FlatListProps
import typingsSlinky.reactNative.mod.ImageProps
import typingsSlinky.reactNative.mod.ImageResolvedAssetSource
import typingsSlinky.reactNative.mod.ImageSourcePropType
import typingsSlinky.reactNative.mod.PixelRatioStatic
import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.SectionListProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.StyleSheet.AbsoluteFillStyle
import typingsSlinky.reactNative.mod.StyleSheet.NamedStyles
import typingsSlinky.reactNative.mod.TextProps
import typingsSlinky.reactNative.mod.TouchableOpacityProps
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNative.mod._ScrollView
import typingsSlinky.reactNative.mod._Text
import typingsSlinky.reactPrimitives.reactPrimitivesStrings.disk
import typingsSlinky.reactPrimitives.reactPrimitivesStrings.diskSlashmemory
import typingsSlinky.reactPrimitives.reactPrimitivesStrings.memory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Animated {
    
    @JSImport("react-primitives", "Animated.Animated")
    @js.native
    class Animated ()
      extends typingsSlinky.reactNative.mod.Animated.Animated
    
    @JSImport("react-primitives", "Animated.AnimatedAddition")
    @js.native
    class AnimatedAddition ()
      extends typingsSlinky.reactNative.mod.Animated.AnimatedAddition
    
    @JSImport("react-primitives", "Animated.AnimatedDiffClamp")
    @js.native
    class AnimatedDiffClamp ()
      extends typingsSlinky.reactNative.mod.Animated.AnimatedDiffClamp
    
    @JSImport("react-primitives", "Animated.AnimatedDivision")
    @js.native
    class AnimatedDivision ()
      extends typingsSlinky.reactNative.mod.Animated.AnimatedDivision
    
    @JSImport("react-primitives", "Animated.AnimatedInterpolation")
    @js.native
    class AnimatedInterpolation ()
      extends typingsSlinky.reactNative.mod.Animated.AnimatedInterpolation
    
    @JSImport("react-primitives", "Animated.AnimatedModulo")
    @js.native
    class AnimatedModulo ()
      extends typingsSlinky.reactNative.mod.Animated.AnimatedModulo
    
    @JSImport("react-primitives", "Animated.AnimatedMultiplication")
    @js.native
    class AnimatedMultiplication ()
      extends typingsSlinky.reactNative.mod.Animated.AnimatedMultiplication
    
    @JSImport("react-primitives", "Animated.AnimatedSubtraction")
    @js.native
    class AnimatedSubtraction ()
      extends typingsSlinky.reactNative.mod.Animated.AnimatedSubtraction
    
    @JSImport("react-primitives", "Animated.AnimatedWithChildren")
    @js.native
    class AnimatedWithChildren ()
      extends typingsSlinky.reactNative.mod.Animated.AnimatedWithChildren
    
    @JSImport("react-primitives", "Animated.FlatList")
    @js.native
    class FlatList[ItemT] protected ()
      extends typingsSlinky.reactNative.mod.Animated.FlatList[ItemT] {
      def this(props: AnimatedProps[FlatListProps[ItemT]]) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: AnimatedProps[FlatListProps[ItemT]], context: js.Any) = this()
    }
    
    @JSImport("react-primitives", "Animated.Image")
    @js.native
    val Image: ReactComponentClass[AnimatedProps[ComponentPropsWithRef[TypeofImage]]] = js.native
    
    @JSImport("react-primitives", "Animated.ScrollView")
    @js.native
    val ScrollView: ReactComponentClass[AnimatedProps[ComponentPropsWithRef[Instantiable0[_ScrollView]]]] = js.native
    
    @JSImport("react-primitives", "Animated.SectionList")
    @js.native
    class SectionList[ItemT, SectionT] protected ()
      extends typingsSlinky.reactNative.mod.Animated.SectionList[ItemT, SectionT] {
      def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]]) = this()
      /**
        * @deprecated
        * @see https://reactjs.org/docs/legacy-context.html
        */
      def this(props: AnimatedProps[SectionListProps[ItemT, SectionT]], context: js.Any) = this()
    }
    
    @JSImport("react-primitives", "Animated.Text")
    @js.native
    val Text: ReactComponentClass[AnimatedProps[ComponentPropsWithRef[Instantiable0[_Text]]]] = js.native
    
    @JSImport("react-primitives", "Animated.Value")
    @js.native
    class Value protected ()
      extends typingsSlinky.reactNative.mod.Animated.Value {
      def this(value: Double) = this()
    }
    
    @JSImport("react-primitives", "Animated.ValueXY")
    @js.native
    class ValueXY ()
      extends typingsSlinky.reactNative.mod.Animated.ValueXY {
      def this(valueIn: Y) = this()
    }
    
    @JSImport("react-primitives", "Animated.View")
    @js.native
    val View: ReactComponentClass[AnimatedProps[ComponentPropsWithRef[TypeofView]]] = js.native
    
    @JSImport("react-primitives", "Animated.add")
    @js.native
    def add(
      a: typingsSlinky.reactNative.mod.Animated.Animated,
      b: typingsSlinky.reactNative.mod.Animated.Animated
    ): typingsSlinky.reactNative.mod.Animated.AnimatedAddition = js.native
    
    @JSImport("react-primitives", "Animated.createAnimatedComponent")
    @js.native
    def createAnimatedComponent[T /* <: ReactComponentClass[_] */](component: T): ReactComponentClass[AnimatedProps[ComponentPropsWithRef[T]]] = js.native
    
    @JSImport("react-primitives", "Animated.decay")
    @js.native
    def decay(value: AnimatedValueXY, config: DecayAnimationConfig): CompositeAnimation = js.native
    @JSImport("react-primitives", "Animated.decay")
    @js.native
    def decay(value: AnimatedValue, config: DecayAnimationConfig): CompositeAnimation = js.native
    
    @JSImport("react-primitives", "Animated.delay")
    @js.native
    def delay(time: Double): CompositeAnimation = js.native
    
    @JSImport("react-primitives", "Animated.diffClamp")
    @js.native
    def diffClamp(a: typingsSlinky.reactNative.mod.Animated.Animated, min: Double, max: Double): typingsSlinky.reactNative.mod.Animated.AnimatedDiffClamp = js.native
    
    @JSImport("react-primitives", "Animated.divide")
    @js.native
    def divide(
      a: typingsSlinky.reactNative.mod.Animated.Animated,
      b: typingsSlinky.reactNative.mod.Animated.Animated
    ): typingsSlinky.reactNative.mod.Animated.AnimatedDivision = js.native
    
    @JSImport("react-primitives", "Animated.event")
    @js.native
    def event[T](argMapping: js.Array[Mapping | Null]): js.Function1[/* repeated */ js.Any, Unit] = js.native
    @JSImport("react-primitives", "Animated.event")
    @js.native
    def event[T](argMapping: js.Array[Mapping | Null], config: EventConfig[T]): js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    @JSImport("react-primitives", "Animated.loop")
    @js.native
    def loop(animation: CompositeAnimation): CompositeAnimation = js.native
    @JSImport("react-primitives", "Animated.loop")
    @js.native
    def loop(animation: CompositeAnimation, config: LoopAnimationConfig): CompositeAnimation = js.native
    
    @JSImport("react-primitives", "Animated.modulo")
    @js.native
    def modulo(a: typingsSlinky.reactNative.mod.Animated.Animated, modulus: Double): typingsSlinky.reactNative.mod.Animated.AnimatedModulo = js.native
    
    @JSImport("react-primitives", "Animated.multiply")
    @js.native
    def multiply(
      a: typingsSlinky.reactNative.mod.Animated.Animated,
      b: typingsSlinky.reactNative.mod.Animated.Animated
    ): typingsSlinky.reactNative.mod.Animated.AnimatedMultiplication = js.native
    
    @JSImport("react-primitives", "Animated.parallel")
    @js.native
    def parallel(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
    @JSImport("react-primitives", "Animated.parallel")
    @js.native
    def parallel(animations: js.Array[CompositeAnimation], config: ParallelConfig): CompositeAnimation = js.native
    
    @JSImport("react-primitives", "Animated.sequence")
    @js.native
    def sequence(animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
    
    @JSImport("react-primitives", "Animated.spring")
    @js.native
    def spring(value: AnimatedValueXY, config: SpringAnimationConfig): CompositeAnimation = js.native
    @JSImport("react-primitives", "Animated.spring")
    @js.native
    def spring(value: AnimatedValue, config: SpringAnimationConfig): CompositeAnimation = js.native
    
    @JSImport("react-primitives", "Animated.stagger")
    @js.native
    def stagger(time: Double, animations: js.Array[CompositeAnimation]): CompositeAnimation = js.native
    
    @JSImport("react-primitives", "Animated.subtract")
    @js.native
    def subtract(
      a: typingsSlinky.reactNative.mod.Animated.Animated,
      b: typingsSlinky.reactNative.mod.Animated.Animated
    ): typingsSlinky.reactNative.mod.Animated.AnimatedSubtraction = js.native
    
    @JSImport("react-primitives", "Animated.timing")
    @js.native
    def timing(value: AnimatedValueXY, config: TimingAnimationConfig): CompositeAnimation = js.native
    @JSImport("react-primitives", "Animated.timing")
    @js.native
    def timing(value: AnimatedValue, config: TimingAnimationConfig): CompositeAnimation = js.native
  }
  
  @JSImport("react-primitives", "Dimensions")
  @js.native
  val Dimensions: typingsSlinky.reactNative.mod.Dimensions = js.native
  
  @JSImport("react-primitives", "Easing")
  @js.native
  val Easing: EasingStatic = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-primitives", "Image")
  @js.native
  class Image protected ()
    extends typingsSlinky.reactNative.mod.Image {
    def this(props: ImageProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ImageProps, context: js.Any) = this()
  }
  /* static members */
  object Image {
    
    @JSImport("react-primitives", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-primitives", "Image.abortPrefetch")
    @js.native
    def abortPrefetch: js.UndefOr[js.Function1[/* requestId */ Double, Unit]] = js.native
    @scala.inline
    def abortPrefetch_=(x: js.UndefOr[js.Function1[/* requestId */ Double, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("abortPrefetch")(x.asInstanceOf[js.Any])
    
    @JSImport("react-primitives", "Image.getSize")
    @js.native
    def getSize(uri: String, success: js.Function2[/* width */ Double, /* height */ Double, Unit]): js.Any = js.native
    @JSImport("react-primitives", "Image.getSize")
    @js.native
    def getSize(
      uri: String,
      success: js.Function2[/* width */ Double, /* height */ Double, Unit],
      failure: js.Function1[/* error */ js.Any, Unit]
    ): js.Any = js.native
    
    @JSImport("react-primitives", "Image.getSizeWithHeaders")
    @js.native
    def getSizeWithHeaders(
      uri: String,
      headers: StringDictionary[String],
      success: js.Function2[/* width */ Double, /* height */ Double, Unit]
    ): js.Any = js.native
    @JSImport("react-primitives", "Image.getSizeWithHeaders")
    @js.native
    def getSizeWithHeaders(
      uri: String,
      headers: StringDictionary[String],
      success: js.Function2[/* width */ Double, /* height */ Double, Unit],
      failure: js.Function1[/* error */ js.Any, Unit]
    ): js.Any = js.native
    
    @JSImport("react-primitives", "Image.prefetch")
    @js.native
    def prefetch(url: String): js.Promise[Boolean] = js.native
    
    @JSImport("react-primitives", "Image.queryCache")
    @js.native
    def queryCache: js.UndefOr[
        js.Function1[
          /* urls */ js.Array[String], 
          js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
        ]
      ] = js.native
    @scala.inline
    def queryCache_=(
      x: js.UndefOr[
          js.Function1[
            /* urls */ js.Array[String], 
            js.Promise[StringDictionary[memory | disk | diskSlashmemory]]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryCache")(x.asInstanceOf[js.Any])
    
    /**
      * @see https://reactnative.dev/docs/image#resolveassetsource
      */
    @JSImport("react-primitives", "Image.resolveAssetSource")
    @js.native
    def resolveAssetSource(source: ImageSourcePropType): ImageResolvedAssetSource = js.native
  }
  
  @JSImport("react-primitives", "PixelRatio")
  @js.native
  val PixelRatio: PixelRatioStatic = js.native
  
  @JSImport("react-primitives", "Platform")
  @js.native
  val Platform: PlatformStatic = js.native
  
  object StyleSheet {
    
    @JSImport("react-primitives", "StyleSheet.absoluteFill")
    @js.native
    val absoluteFill: RegisteredStyle[AbsoluteFillStyle] = js.native
    
    @JSImport("react-primitives", "StyleSheet.absoluteFillObject")
    @js.native
    val absoluteFillObject: AbsoluteFillStyle = js.native
    
    @JSImport("react-primitives", "StyleSheet.compose")
    @js.native
    def compose[T](style1: js.Array[StyleProp[T]], style2: js.Array[StyleProp[T]]): StyleProp[T] = js.native
    @JSImport("react-primitives", "StyleSheet.compose")
    @js.native
    def compose[T](style1: js.Array[StyleProp[T]], style2: StyleProp[T]): StyleProp[T] = js.native
    @JSImport("react-primitives", "StyleSheet.compose")
    @js.native
    def compose[T](style1: StyleProp[T], style2: js.Array[StyleProp[T]]): StyleProp[T] = js.native
    @JSImport("react-primitives", "StyleSheet.compose")
    @js.native
    def compose[T](style1: StyleProp[T], style2: StyleProp[T]): StyleProp[T] = js.native
    
    @JSImport("react-primitives", "StyleSheet.create")
    @js.native
    def create[T /* <: NamedStyles[_ | T] */](styles: T): T = js.native
    @JSImport("react-primitives", "StyleSheet.create")
    @js.native
    def create[T /* <: NamedStyles[_ | T] */](styles: NamedStyles[T]): T = js.native
    
    @JSImport("react-primitives", "StyleSheet.flatten")
    @js.native
    def flatten[T](): T = js.native
    @JSImport("react-primitives", "StyleSheet.flatten")
    @js.native
    def flatten[T](style: StyleProp[T]): T = js.native
    
    @JSImport("react-primitives", "StyleSheet.hairlineWidth")
    @js.native
    val hairlineWidth: Double = js.native
    
    @JSImport("react-primitives", "StyleSheet.setStyleAttributePreprocessor")
    @js.native
    def setStyleAttributePreprocessor(property: String, process: js.Function1[/* nextProp */ js.Any, _]): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-primitives", "Text")
  @js.native
  class Text protected ()
    extends typingsSlinky.reactNative.mod.Text {
    def this(props: TextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TextProps, context: js.Any) = this()
  }
  
  @JSImport("react-primitives", "Touchable")
  @js.native
  val Touchable: ReactComponentClass[TouchableOpacityProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped new (args : ...any): react-native.react-native.NativeMethodsMixinType */ @JSImport("react-primitives", "View")
  @js.native
  class View protected ()
    extends typingsSlinky.reactNative.mod.View {
    def this(props: ViewProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ViewProps, context: js.Any) = this()
  }
  /* static members */
  object View {
    
    @JSImport("react-primitives", "View")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Is 3D Touch / Force Touch available (i.e. will touch events include `force`)
      * @platform ios
      */
    @JSImport("react-primitives", "View.forceTouchAvailable")
    @js.native
    def forceTouchAvailable: Boolean = js.native
    @scala.inline
    def forceTouchAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceTouchAvailable")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNative.mod.PlatformOSType
    - typingsSlinky.reactPrimitives.reactPrimitivesStrings.sketch
    - typingsSlinky.reactPrimitives.reactPrimitivesStrings.vr
  */
  type PlatformOSType = _PlatformOSType | typingsSlinky.reactNative.mod.PlatformOSType
  
  @js.native
  trait PlatformStatic extends StObject {
    
    var OS: PlatformOSType = js.native
    
    var Version: Double | String = js.native
    
    @JSName("select")
    def select_default[T](
      specifics: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
      */ typingsSlinky.reactPrimitives.reactPrimitivesStrings.PlatformStatic with TopLevel[js.Any]
    ): T = js.native
  }
  object PlatformStatic {
    
    @scala.inline
    def apply(
      OS: PlatformOSType,
      Version: Double | String,
      select: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
      */ typingsSlinky.reactPrimitives.reactPrimitivesStrings.PlatformStatic with TopLevel[js.Any] => js.Any
    ): PlatformStatic = {
      val __obj = js.Dynamic.literal(OS = OS.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any], select = js.Any.fromFunction1(select))
      __obj.asInstanceOf[PlatformStatic]
    }
    
    @scala.inline
    implicit class PlatformStaticMutableBuilder[Self <: PlatformStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOS(value: PlatformOSType): Self = StObject.set(x, "OS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelect(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ platform in react-primitives.react-primitives.PlatformOSType | 'default' ]:? T}
        */ typingsSlinky.reactPrimitives.reactPrimitivesStrings.PlatformStatic with TopLevel[js.Any] => js.Any
      ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVersion(value: Double | String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    }
  }
  
  trait _PlatformOSType extends StObject
}
