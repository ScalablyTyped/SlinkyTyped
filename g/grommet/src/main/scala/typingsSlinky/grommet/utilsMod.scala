package typingsSlinky.grommet

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.grommet.anon.Dark
import typingsSlinky.grommet.anon.Error
import typingsSlinky.grommet.anon.Image
import typingsSlinky.grommet.anon.`28`
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("grommet/utils", "deepFreeze")
  @js.native
  val deepFreeze: DeepFreeze_ = js.native
  
  @JSImport("grommet/utils", "deepMerge")
  @js.native
  val deepMerge: DeepMerge_ = js.native
  
  @JSImport("grommet/utils", "isObject")
  @js.native
  def isObject(item: js.Any): Boolean = js.native
  
  @JSImport("grommet/utils", "normalizeColor")
  @js.native
  def normalizeColor(color: String, theme: js.Object): String = js.native
  @JSImport("grommet/utils", "normalizeColor")
  @js.native
  def normalizeColor(color: String, theme: js.Object, required: Boolean): String = js.native
  @JSImport("grommet/utils", "normalizeColor")
  @js.native
  def normalizeColor(color: Dark, theme: js.Object): String = js.native
  @JSImport("grommet/utils", "normalizeColor")
  @js.native
  def normalizeColor(color: Dark, theme: js.Object, required: Boolean): String = js.native
  
  @JSImport("grommet/utils", "removeUndefined")
  @js.native
  def removeUndefined[T /* <: js.Object */](obj: T): NonUndefinedProps[T] = js.native
  
  type A11yTitleType = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.start
    - typingsSlinky.grommet.grommetStrings.center
    - typingsSlinky.grommet.grommetStrings.end
    - typingsSlinky.grommet.grommetStrings.between
    - typingsSlinky.grommet.grommetStrings.around
    - typingsSlinky.grommet.grommetStrings.stretch
  */
  trait AlignContentType extends StObject
  object AlignContentType {
    
    @scala.inline
    def around: typingsSlinky.grommet.grommetStrings.around = "around".asInstanceOf[typingsSlinky.grommet.grommetStrings.around]
    
    @scala.inline
    def between: typingsSlinky.grommet.grommetStrings.between = "between".asInstanceOf[typingsSlinky.grommet.grommetStrings.between]
    
    @scala.inline
    def center: typingsSlinky.grommet.grommetStrings.center = "center".asInstanceOf[typingsSlinky.grommet.grommetStrings.center]
    
    @scala.inline
    def end: typingsSlinky.grommet.grommetStrings.end = "end".asInstanceOf[typingsSlinky.grommet.grommetStrings.end]
    
    @scala.inline
    def start: typingsSlinky.grommet.grommetStrings.start = "start".asInstanceOf[typingsSlinky.grommet.grommetStrings.start]
    
    @scala.inline
    def stretch: typingsSlinky.grommet.grommetStrings.stretch = "stretch".asInstanceOf[typingsSlinky.grommet.grommetStrings.stretch]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.start
    - typingsSlinky.grommet.grommetStrings.center
    - typingsSlinky.grommet.grommetStrings.end
    - typingsSlinky.grommet.grommetStrings.stretch
  */
  trait AlignSelfType extends StObject
  object AlignSelfType {
    
    @scala.inline
    def center: typingsSlinky.grommet.grommetStrings.center = "center".asInstanceOf[typingsSlinky.grommet.grommetStrings.center]
    
    @scala.inline
    def end: typingsSlinky.grommet.grommetStrings.end = "end".asInstanceOf[typingsSlinky.grommet.grommetStrings.end]
    
    @scala.inline
    def start: typingsSlinky.grommet.grommetStrings.start = "start".asInstanceOf[typingsSlinky.grommet.grommetStrings.start]
    
    @scala.inline
    def stretch: typingsSlinky.grommet.grommetStrings.stretch = "stretch".asInstanceOf[typingsSlinky.grommet.grommetStrings.stretch]
  }
  
  type AnimateType = Boolean
  
  type BackgroundType = String | Image
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.xxsmall
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - typingsSlinky.grommet.grommetStrings.xxlarge
    - typingsSlinky.grommet.grommetStrings.full
    - typingsSlinky.grommet.grommetStrings.`1Slash2`
    - typingsSlinky.grommet.grommetStrings.`1Slash3`
    - typingsSlinky.grommet.grommetStrings.`2Slash3`
    - typingsSlinky.grommet.grommetStrings.`1Slash4`
    - typingsSlinky.grommet.grommetStrings.`2Slash4`
    - typingsSlinky.grommet.grommetStrings.`3Slash4`
    - typingsSlinky.grommet.grommetStrings.auto
    - java.lang.String
  */
  type BasisType = _BasisType | String
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.grommet.utilsMod.BoxSideType
    - typingsSlinky.grommet.anon.Error
    - js.Array[typingsSlinky.grommet.anon.Error]
  */
  type BorderType = _BorderType | js.Array[Error] | Boolean
  
  // Extracting types for common properties among components
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.top
    - typingsSlinky.grommet.grommetStrings.left
    - typingsSlinky.grommet.grommetStrings.bottom
    - typingsSlinky.grommet.grommetStrings.right
    - typingsSlinky.grommet.grommetStrings.start
    - typingsSlinky.grommet.grommetStrings.end
    - typingsSlinky.grommet.grommetStrings.horizontal
    - typingsSlinky.grommet.grommetStrings.vertical
    - typingsSlinky.grommet.grommetStrings.all
    - typingsSlinky.grommet.grommetStrings.between
  */
  trait BoxSideType extends _BorderType
  object BoxSideType {
    
    @scala.inline
    def all: typingsSlinky.grommet.grommetStrings.all = "all".asInstanceOf[typingsSlinky.grommet.grommetStrings.all]
    
    @scala.inline
    def between: typingsSlinky.grommet.grommetStrings.between = "between".asInstanceOf[typingsSlinky.grommet.grommetStrings.between]
    
    @scala.inline
    def bottom: typingsSlinky.grommet.grommetStrings.bottom = "bottom".asInstanceOf[typingsSlinky.grommet.grommetStrings.bottom]
    
    @scala.inline
    def end: typingsSlinky.grommet.grommetStrings.end = "end".asInstanceOf[typingsSlinky.grommet.grommetStrings.end]
    
    @scala.inline
    def horizontal: typingsSlinky.grommet.grommetStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.grommet.grommetStrings.horizontal]
    
    @scala.inline
    def left: typingsSlinky.grommet.grommetStrings.left = "left".asInstanceOf[typingsSlinky.grommet.grommetStrings.left]
    
    @scala.inline
    def right: typingsSlinky.grommet.grommetStrings.right = "right".asInstanceOf[typingsSlinky.grommet.grommetStrings.right]
    
    @scala.inline
    def start: typingsSlinky.grommet.grommetStrings.start = "start".asInstanceOf[typingsSlinky.grommet.grommetStrings.start]
    
    @scala.inline
    def top: typingsSlinky.grommet.grommetStrings.top = "top".asInstanceOf[typingsSlinky.grommet.grommetStrings.top]
    
    @scala.inline
    def vertical: typingsSlinky.grommet.grommetStrings.vertical = "vertical".asInstanceOf[typingsSlinky.grommet.grommetStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type BoxSizeType = _BoxSizeType | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.solid
    - typingsSlinky.grommet.grommetStrings.dashed
    - typingsSlinky.grommet.grommetStrings.dotted
    - typingsSlinky.grommet.grommetStrings.double
    - typingsSlinky.grommet.grommetStrings.groove
    - typingsSlinky.grommet.grommetStrings.ridge
    - typingsSlinky.grommet.grommetStrings.inset
    - typingsSlinky.grommet.grommetStrings.outset
    - typingsSlinky.grommet.grommetStrings.hidden
  */
  trait BoxStyleType extends StObject
  object BoxStyleType {
    
    @scala.inline
    def dashed: typingsSlinky.grommet.grommetStrings.dashed = "dashed".asInstanceOf[typingsSlinky.grommet.grommetStrings.dashed]
    
    @scala.inline
    def dotted: typingsSlinky.grommet.grommetStrings.dotted = "dotted".asInstanceOf[typingsSlinky.grommet.grommetStrings.dotted]
    
    @scala.inline
    def double: typingsSlinky.grommet.grommetStrings.double = "double".asInstanceOf[typingsSlinky.grommet.grommetStrings.double]
    
    @scala.inline
    def groove: typingsSlinky.grommet.grommetStrings.groove = "groove".asInstanceOf[typingsSlinky.grommet.grommetStrings.groove]
    
    @scala.inline
    def hidden: typingsSlinky.grommet.grommetStrings.hidden = "hidden".asInstanceOf[typingsSlinky.grommet.grommetStrings.hidden]
    
    @scala.inline
    def inset: typingsSlinky.grommet.grommetStrings.inset = "inset".asInstanceOf[typingsSlinky.grommet.grommetStrings.inset]
    
    @scala.inline
    def outset: typingsSlinky.grommet.grommetStrings.outset = "outset".asInstanceOf[typingsSlinky.grommet.grommetStrings.outset]
    
    @scala.inline
    def ridge: typingsSlinky.grommet.grommetStrings.ridge = "ridge".asInstanceOf[typingsSlinky.grommet.grommetStrings.ridge]
    
    @scala.inline
    def solid: typingsSlinky.grommet.grommetStrings.solid = "solid".asInstanceOf[typingsSlinky.grommet.grommetStrings.solid]
  }
  
  @js.native
  trait BreakpointBorderSize extends StObject {
    
    var large: js.UndefOr[String] = js.native
    
    var medium: js.UndefOr[String] = js.native
    
    var small: js.UndefOr[String] = js.native
    
    var xlarge: js.UndefOr[String] = js.native
    
    var xsmall: js.UndefOr[String] = js.native
  }
  object BreakpointBorderSize {
    
    @scala.inline
    def apply(): BreakpointBorderSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointBorderSize]
    }
    
    @scala.inline
    implicit class BreakpointBorderSizeMutableBuilder[Self <: BreakpointBorderSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      @scala.inline
      def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      @scala.inline
      def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
      
      @scala.inline
      def setXsmall(value: String): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
    }
  }
  
  @js.native
  trait BreakpointEdgeSize extends StObject {
    
    var hair: js.UndefOr[String] = js.native
    
    var large: js.UndefOr[String] = js.native
    
    var medium: js.UndefOr[String] = js.native
    
    var none: js.UndefOr[String] = js.native
    
    var small: js.UndefOr[String] = js.native
    
    var xlarge: js.UndefOr[String] = js.native
    
    var xsmall: js.UndefOr[String] = js.native
    
    var xxsmall: js.UndefOr[String] = js.native
  }
  object BreakpointEdgeSize {
    
    @scala.inline
    def apply(): BreakpointEdgeSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointEdgeSize]
    }
    
    @scala.inline
    implicit class BreakpointEdgeSizeMutableBuilder[Self <: BreakpointEdgeSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHair(value: String): Self = StObject.set(x, "hair", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHairUndefined: Self = StObject.set(x, "hair", js.undefined)
      
      @scala.inline
      def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      @scala.inline
      def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoneUndefined: Self = StObject.set(x, "none", js.undefined)
      
      @scala.inline
      def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      @scala.inline
      def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
      
      @scala.inline
      def setXsmall(value: String): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
      
      @scala.inline
      def setXxsmall(value: String): Self = StObject.set(x, "xxsmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxsmallUndefined: Self = StObject.set(x, "xxsmall", js.undefined)
    }
  }
  
  @js.native
  trait BreakpointSize extends StObject {
    
    var full: js.UndefOr[String] = js.native
    
    var large: js.UndefOr[String] = js.native
    
    var medium: js.UndefOr[String] = js.native
    
    var small: js.UndefOr[String] = js.native
    
    var xlarge: js.UndefOr[String] = js.native
    
    var xsmall: js.UndefOr[String] = js.native
    
    var xxsmall: js.UndefOr[String] = js.native
  }
  object BreakpointSize {
    
    @scala.inline
    def apply(): BreakpointSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointSize]
    }
    
    @scala.inline
    implicit class BreakpointSizeMutableBuilder[Self <: BreakpointSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      @scala.inline
      def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      @scala.inline
      def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      @scala.inline
      def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
      
      @scala.inline
      def setXsmall(value: String): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
      
      @scala.inline
      def setXxsmall(value: String): Self = StObject.set(x, "xxsmall", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXxsmallUndefined: Self = StObject.set(x, "xxsmall", js.undefined)
    }
  }
  
  type ColorType = js.UndefOr[String | Dark]
  
  type DeepFreeze_ = js.Function1[/* obj */ js.Object, DeepReadonly[js.Object]]
  
  @js.native
  trait DeepMerge_ extends StObject {
    
    def apply[T /* <: js.Object */, S /* <: js.Object */](target: T, source: S): T with S = js.native
  }
  
  type DeepReadonly[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias grommet.grommet/utils.DeepReadonly<T[K]> * / object : T[K]}
    */ typingsSlinky.grommet.grommetStrings.DeepReadonly with TopLevel[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.xxsmall
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
  */
  trait EdgeSizeType
    extends _EdgeType
       with _GapType
  object EdgeSizeType {
    
    @scala.inline
    def large: typingsSlinky.grommet.grommetStrings.large = "large".asInstanceOf[typingsSlinky.grommet.grommetStrings.large]
    
    @scala.inline
    def medium: typingsSlinky.grommet.grommetStrings.medium = "medium".asInstanceOf[typingsSlinky.grommet.grommetStrings.medium]
    
    @scala.inline
    def small: typingsSlinky.grommet.grommetStrings.small = "small".asInstanceOf[typingsSlinky.grommet.grommetStrings.small]
    
    @scala.inline
    def xlarge: typingsSlinky.grommet.grommetStrings.xlarge = "xlarge".asInstanceOf[typingsSlinky.grommet.grommetStrings.xlarge]
    
    @scala.inline
    def xsmall: typingsSlinky.grommet.grommetStrings.xsmall = "xsmall".asInstanceOf[typingsSlinky.grommet.grommetStrings.xsmall]
    
    @scala.inline
    def xxsmall: typingsSlinky.grommet.grommetStrings.xxsmall = "xxsmall".asInstanceOf[typingsSlinky.grommet.grommetStrings.xxsmall]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.none
    - typingsSlinky.grommet.utilsMod.EdgeSizeType
    - typingsSlinky.grommet.anon.Start
    - java.lang.String
  */
  type EdgeType = _EdgeType | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.none
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type ElevationType = _ElevationType | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.horizontal
    - typingsSlinky.grommet.grommetStrings.vertical
    - scala.Boolean
  */
  type FillType = _FillType | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.none
    - typingsSlinky.grommet.utilsMod.EdgeSizeType
    - java.lang.String
  */
  type GapType = _GapType | String
  
  type GraphColorsType = js.Array[String] | `28`
  
  type GridAreaType = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.start
    - typingsSlinky.grommet.grommetStrings.center
    - typingsSlinky.grommet.grommetStrings.end
    - typingsSlinky.grommet.grommetStrings.between
    - typingsSlinky.grommet.grommetStrings.around
    - typingsSlinky.grommet.grommetStrings.stretch
  */
  trait JustifyContentType extends StObject
  object JustifyContentType {
    
    @scala.inline
    def around: typingsSlinky.grommet.grommetStrings.around = "around".asInstanceOf[typingsSlinky.grommet.grommetStrings.around]
    
    @scala.inline
    def between: typingsSlinky.grommet.grommetStrings.between = "between".asInstanceOf[typingsSlinky.grommet.grommetStrings.between]
    
    @scala.inline
    def center: typingsSlinky.grommet.grommetStrings.center = "center".asInstanceOf[typingsSlinky.grommet.grommetStrings.center]
    
    @scala.inline
    def end: typingsSlinky.grommet.grommetStrings.end = "end".asInstanceOf[typingsSlinky.grommet.grommetStrings.end]
    
    @scala.inline
    def start: typingsSlinky.grommet.grommetStrings.start = "start".asInstanceOf[typingsSlinky.grommet.grommetStrings.start]
    
    @scala.inline
    def stretch: typingsSlinky.grommet.grommetStrings.stretch = "stretch".asInstanceOf[typingsSlinky.grommet.grommetStrings.stretch]
  }
  
  type KeyboardType = js.Function1[/* event */ SyntheticKeyboardEvent[HTMLElement], Unit]
  
  type MarginType = EdgeType
  
  type NonUndefined[T] = T
  
  type NonUndefinedProps[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? grommet.grommet/utils.NonUndefined<T[K]>}
    */ typingsSlinky.grommet.grommetStrings.NonUndefinedProps with TopLevel[T]
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.weak
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.strong
    - java.lang.String
    - typingsSlinky.grommet.grommetBooleans.`true`
    - typingsSlinky.grommet.grommetBooleans.`false`
    - scala.Double
  */
  type OpacityType = _OpacityType | String | Double
  
  type PadType = EdgeType
  
  type PlaceHolderType = String | ReactElement
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.a
    - typingsSlinky.grommet.grommetStrings.abbr
    - typingsSlinky.grommet.grommetStrings.address
    - typingsSlinky.grommet.grommetStrings.area
    - typingsSlinky.grommet.grommetStrings.article
    - typingsSlinky.grommet.grommetStrings.aside
    - typingsSlinky.grommet.grommetStrings.audio
    - typingsSlinky.grommet.grommetStrings.b
    - typingsSlinky.grommet.grommetStrings.base
    - typingsSlinky.grommet.grommetStrings.bdi
    - typingsSlinky.grommet.grommetStrings.bdo
    - typingsSlinky.grommet.grommetStrings.big
    - typingsSlinky.grommet.grommetStrings.blockquote
    - typingsSlinky.grommet.grommetStrings.body
    - typingsSlinky.grommet.grommetStrings.br
    - typingsSlinky.grommet.grommetStrings.button
    - typingsSlinky.grommet.grommetStrings.canvas
    - typingsSlinky.grommet.grommetStrings.caption
    - typingsSlinky.grommet.grommetStrings.cite
    - typingsSlinky.grommet.grommetStrings.code
    - typingsSlinky.grommet.grommetStrings.col
    - typingsSlinky.grommet.grommetStrings.colgroup
    - typingsSlinky.grommet.grommetStrings.data
    - typingsSlinky.grommet.grommetStrings.datalist
    - typingsSlinky.grommet.grommetStrings.dd
    - typingsSlinky.grommet.grommetStrings.del
    - typingsSlinky.grommet.grommetStrings.details
    - typingsSlinky.grommet.grommetStrings.dfn
    - typingsSlinky.grommet.grommetStrings.dialog
    - typingsSlinky.grommet.grommetStrings.div
    - typingsSlinky.grommet.grommetStrings.dl
    - typingsSlinky.grommet.grommetStrings.dt
    - typingsSlinky.grommet.grommetStrings.em
    - typingsSlinky.grommet.grommetStrings.embed
    - typingsSlinky.grommet.grommetStrings.fieldset
    - typingsSlinky.grommet.grommetStrings.figcaption
    - typingsSlinky.grommet.grommetStrings.figure
    - typingsSlinky.grommet.grommetStrings.footer
    - typingsSlinky.grommet.grommetStrings.form
    - typingsSlinky.grommet.grommetStrings.h1
    - typingsSlinky.grommet.grommetStrings.h2
    - typingsSlinky.grommet.grommetStrings.h3
    - typingsSlinky.grommet.grommetStrings.h4
    - typingsSlinky.grommet.grommetStrings.h5
    - typingsSlinky.grommet.grommetStrings.h6
    - typingsSlinky.grommet.grommetStrings.head
    - typingsSlinky.grommet.grommetStrings.header
    - typingsSlinky.grommet.grommetStrings.hgroup
    - typingsSlinky.grommet.grommetStrings.hr
    - typingsSlinky.grommet.grommetStrings.html
    - typingsSlinky.grommet.grommetStrings.i
    - typingsSlinky.grommet.grommetStrings.iframe
    - typingsSlinky.grommet.grommetStrings.img
    - typingsSlinky.grommet.grommetStrings.input
    - typingsSlinky.grommet.grommetStrings.ins
    - typingsSlinky.grommet.grommetStrings.kbd
    - typingsSlinky.grommet.grommetStrings.keygen
    - typingsSlinky.grommet.grommetStrings.label
    - typingsSlinky.grommet.grommetStrings.legend
    - typingsSlinky.grommet.grommetStrings.li
    - typingsSlinky.grommet.grommetStrings.link
    - typingsSlinky.grommet.grommetStrings.main
    - typingsSlinky.grommet.grommetStrings.map
    - typingsSlinky.grommet.grommetStrings.mark
    - typingsSlinky.grommet.grommetStrings.menu
    - typingsSlinky.grommet.grommetStrings.menuitem
    - typingsSlinky.grommet.grommetStrings.meta
    - typingsSlinky.grommet.grommetStrings.meter
    - typingsSlinky.grommet.grommetStrings.nav
    - typingsSlinky.grommet.grommetStrings.noindex
    - typingsSlinky.grommet.grommetStrings.noscript
    - typingsSlinky.grommet.grommetStrings.`object`
    - typingsSlinky.grommet.grommetStrings.ol
    - typingsSlinky.grommet.grommetStrings.optgroup
    - typingsSlinky.grommet.grommetStrings.option
    - typingsSlinky.grommet.grommetStrings.output
    - typingsSlinky.grommet.grommetStrings.p
    - typingsSlinky.grommet.grommetStrings.param
    - typingsSlinky.grommet.grommetStrings.picture
    - typingsSlinky.grommet.grommetStrings.pre
    - typingsSlinky.grommet.grommetStrings.progress
    - typingsSlinky.grommet.grommetStrings.q
    - typingsSlinky.grommet.grommetStrings.rp
    - typingsSlinky.grommet.grommetStrings.rt
    - typingsSlinky.grommet.grommetStrings.ruby
    - typingsSlinky.grommet.grommetStrings.s
    - typingsSlinky.grommet.grommetStrings.samp
    - typingsSlinky.grommet.grommetStrings.slot
    - typingsSlinky.grommet.grommetStrings.script
    - typingsSlinky.grommet.grommetStrings.section
    - typingsSlinky.grommet.grommetStrings.select
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.source
    - typingsSlinky.grommet.grommetStrings.span
    - typingsSlinky.grommet.grommetStrings.strong
    - typingsSlinky.grommet.grommetStrings.style
    - typingsSlinky.grommet.grommetStrings.sub
    - typingsSlinky.grommet.grommetStrings.summary
    - typingsSlinky.grommet.grommetStrings.sup
    - typingsSlinky.grommet.grommetStrings.table
    - typingsSlinky.grommet.grommetStrings.template
    - typingsSlinky.grommet.grommetStrings.tbody
    - typingsSlinky.grommet.grommetStrings.td
    - typingsSlinky.grommet.grommetStrings.textarea
    - typingsSlinky.grommet.grommetStrings.tfoot
    - typingsSlinky.grommet.grommetStrings.th
    - typingsSlinky.grommet.grommetStrings.thead
    - typingsSlinky.grommet.grommetStrings.time
    - typingsSlinky.grommet.grommetStrings.title
    - typingsSlinky.grommet.grommetStrings.tr
    - typingsSlinky.grommet.grommetStrings.track
    - typingsSlinky.grommet.grommetStrings.u
    - typingsSlinky.grommet.grommetStrings.ul
    - typingsSlinky.grommet.grommetStrings.`var`
    - typingsSlinky.grommet.grommetStrings.video
    - typingsSlinky.grommet.grommetStrings.wbr
    - typingsSlinky.grommet.grommetStrings.webview
    - typingsSlinky.grommet.grommetStrings.svg
    - typingsSlinky.grommet.grommetStrings.animate
    - typingsSlinky.grommet.grommetStrings.animateMotion
    - typingsSlinky.grommet.grommetStrings.animateTransform
    - typingsSlinky.grommet.grommetStrings.circle
    - typingsSlinky.grommet.grommetStrings.clipPath
    - typingsSlinky.grommet.grommetStrings.defs
    - typingsSlinky.grommet.grommetStrings.desc
    - typingsSlinky.grommet.grommetStrings.ellipse
    - typingsSlinky.grommet.grommetStrings.feBlend
    - typingsSlinky.grommet.grommetStrings.feColorMatrix
    - typingsSlinky.grommet.grommetStrings.feComponentTransfer
    - typingsSlinky.grommet.grommetStrings.feComposite
    - typingsSlinky.grommet.grommetStrings.feConvolveMatrix
    - typingsSlinky.grommet.grommetStrings.feDiffuseLighting
    - typingsSlinky.grommet.grommetStrings.feDisplacementMap
    - typingsSlinky.grommet.grommetStrings.feDistantLight
    - typingsSlinky.grommet.grommetStrings.feDropShadow
    - typingsSlinky.grommet.grommetStrings.feFlood
    - typingsSlinky.grommet.grommetStrings.feFuncA
    - typingsSlinky.grommet.grommetStrings.feFuncB
    - typingsSlinky.grommet.grommetStrings.feFuncG
    - typingsSlinky.grommet.grommetStrings.feFuncR
    - typingsSlinky.grommet.grommetStrings.feGaussianBlur
    - typingsSlinky.grommet.grommetStrings.feImage
    - typingsSlinky.grommet.grommetStrings.feMerge
    - typingsSlinky.grommet.grommetStrings.feMergeNode
    - typingsSlinky.grommet.grommetStrings.feMorphology
    - typingsSlinky.grommet.grommetStrings.feOffset
    - typingsSlinky.grommet.grommetStrings.fePointLight
    - typingsSlinky.grommet.grommetStrings.feSpecularLighting
    - typingsSlinky.grommet.grommetStrings.feSpotLight
    - typingsSlinky.grommet.grommetStrings.feTile
    - typingsSlinky.grommet.grommetStrings.feTurbulence
    - typingsSlinky.grommet.grommetStrings.filter
    - typingsSlinky.grommet.grommetStrings.foreignObject
    - typingsSlinky.grommet.grommetStrings.g
    - typingsSlinky.grommet.grommetStrings.image
    - typingsSlinky.grommet.grommetStrings.line
    - typingsSlinky.grommet.grommetStrings.linearGradient
    - typingsSlinky.grommet.grommetStrings.marker
    - typingsSlinky.grommet.grommetStrings.mask
    - typingsSlinky.grommet.grommetStrings.metadata
    - typingsSlinky.grommet.grommetStrings.mpath
    - typingsSlinky.grommet.grommetStrings.path
    - typingsSlinky.grommet.grommetStrings.pattern
    - typingsSlinky.grommet.grommetStrings.polygon
    - typingsSlinky.grommet.grommetStrings.polyline
    - typingsSlinky.grommet.grommetStrings.radialGradient
    - typingsSlinky.grommet.grommetStrings.rect
    - typingsSlinky.grommet.grommetStrings.stop
    - typingsSlinky.grommet.grommetStrings.switch
    - typingsSlinky.grommet.grommetStrings.symbol
    - typingsSlinky.grommet.grommetStrings.text
    - typingsSlinky.grommet.grommetStrings.textPath
    - typingsSlinky.grommet.grommetStrings.tspan
    - typingsSlinky.grommet.grommetStrings.use
    - typingsSlinky.grommet.grommetStrings.view
    - typingsSlinky.react.mod.ComponentType[js.Any]
  */
  type PolymorphicType = _PolymorphicType | ReactComponentClass[js.Any]
  
  type PropsOf[TComponent] = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - typingsSlinky.grommet.grommetStrings.full
    - java.lang.String
    - typingsSlinky.grommet.anon.Corner
  */
  type RoundType = _RoundType | Boolean | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.start
    - typingsSlinky.grommet.grommetStrings.center
    - typingsSlinky.grommet.grommetStrings.end
  */
  trait TextAlignType extends StObject
  object TextAlignType {
    
    @scala.inline
    def center: typingsSlinky.grommet.grommetStrings.center = "center".asInstanceOf[typingsSlinky.grommet.grommetStrings.center]
    
    @scala.inline
    def end: typingsSlinky.grommet.grommetStrings.end = "end".asInstanceOf[typingsSlinky.grommet.grommetStrings.end]
    
    @scala.inline
    def start: typingsSlinky.grommet.grommetStrings.start = "start".asInstanceOf[typingsSlinky.grommet.grommetStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.hair
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - typingsSlinky.grommet.grommetStrings.none
    - java.lang.String
    - scala.Double
  */
  type ThicknessType = _ThicknessType | String | Double
  
  trait _BasisType extends StObject
  
  trait _BorderType extends StObject
  
  trait _BoxSizeType extends StObject
  
  trait _EdgeType extends StObject
  
  trait _ElevationType extends StObject
  
  trait _FillType extends StObject
  
  trait _GapType extends StObject
  
  trait _OpacityType extends StObject
  
  trait _PolymorphicType extends StObject
  
  trait _RoundType extends StObject
  
  trait _ThicknessType extends StObject
}
