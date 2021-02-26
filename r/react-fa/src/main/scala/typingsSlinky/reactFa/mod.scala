package typingsSlinky.reactFa

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-fa", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IconProps] = js.native
  
  @JSImport("react-fa", "Icon")
  @js.native
  val Icon: ReactComponentClass[IconProps] = js.native
  type Icon = ReactComponentClass[IconProps]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-fa", "Icon")
  @js.native
  class IconCls protected ()
    extends Component[IconProps, js.Object, js.Any] {
    def this(props: IconProps) = this()
    def this(props: IconProps, context: js.Any) = this()
  }
  
  @JSImport("react-fa", "IconStack")
  @js.native
  val IconStack: ReactComponentClass[IconStackProps] = js.native
  type IconStack = ReactComponentClass[IconStackProps]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-fa", "IconStack")
  @js.native
  class IconStackCls protected ()
    extends Component[IconStackProps, js.Object, js.Any] {
    def this(props: IconStackProps) = this()
    def this(props: IconStackProps, context: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-fa", JSImport.Default)
  @js.native
  class defaultCls protected ()
    extends Component[IconProps, js.Object, js.Any] {
    def this(props: IconProps) = this()
    def this(props: IconProps, context: js.Any) = this()
  }
  
  type CustomComponent = String | ReactComponentClass[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactFa.reactFaStrings.horizontal
    - typingsSlinky.reactFa.reactFaStrings.vertical
  */
  trait IconFlip extends StObject
  object IconFlip {
    
    @scala.inline
    def horizontal: typingsSlinky.reactFa.reactFaStrings.horizontal = "horizontal".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.horizontal]
    
    @scala.inline
    def vertical: typingsSlinky.reactFa.reactFaStrings.vertical = "vertical".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.vertical]
  }
  
  @js.native
  trait IconProps extends SizeOverrideHTMLProps[ReactComponentClass[IconProps]] {
    
    var Component: js.UndefOr[CustomComponent] = js.native
    
    var fixedWidth: js.UndefOr[Boolean] = js.native
    
    var flip: js.UndefOr[IconFlip] = js.native
    
    var inverse: js.UndefOr[Boolean] = js.native
    
    @JSName("name")
    var name_IconProps: String = js.native
    
    var pulse: js.UndefOr[Boolean] = js.native
    
    var rotate: js.UndefOr[IconRotation] = js.native
    
    @JSName("size")
    var size_IconProps: js.UndefOr[IconSize] = js.native
    
    var spin: js.UndefOr[Boolean] = js.native
    
    var stack: js.UndefOr[IconStackSize] = js.native
  }
  object IconProps {
    
    @scala.inline
    def apply(name: String): IconProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    @scala.inline
    implicit class IconPropsMutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: CustomComponent): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentComponentClass(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentFunctionComponent(value: ReactComponentClass[js.Any]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      @scala.inline
      def setFixedWidth(value: Boolean): Self = StObject.set(x, "fixedWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedWidthUndefined: Self = StObject.set(x, "fixedWidth", js.undefined)
      
      @scala.inline
      def setFlip(value: IconFlip): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulse(value: Boolean): Self = StObject.set(x, "pulse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulseUndefined: Self = StObject.set(x, "pulse", js.undefined)
      
      @scala.inline
      def setRotate(value: IconRotation): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setSize(value: IconSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpin(value: Boolean): Self = StObject.set(x, "spin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      
      @scala.inline
      def setStack(value: IconStackSize): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactFa.reactFaStrings.`45`
    - typingsSlinky.reactFa.reactFaStrings.`90`
    - typingsSlinky.reactFa.reactFaStrings.`135`
    - typingsSlinky.reactFa.reactFaStrings.`180`
    - typingsSlinky.reactFa.reactFaStrings.`225`
    - typingsSlinky.reactFa.reactFaStrings.`270`
    - typingsSlinky.reactFa.reactFaStrings.`315`
  */
  trait IconRotation extends StObject
  object IconRotation {
    
    @scala.inline
    def `135`: typingsSlinky.reactFa.reactFaStrings.`135` = "135".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`135`]
    
    @scala.inline
    def `180`: typingsSlinky.reactFa.reactFaStrings.`180` = "180".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`180`]
    
    @scala.inline
    def `225`: typingsSlinky.reactFa.reactFaStrings.`225` = "225".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`225`]
    
    @scala.inline
    def `270`: typingsSlinky.reactFa.reactFaStrings.`270` = "270".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`270`]
    
    @scala.inline
    def `315`: typingsSlinky.reactFa.reactFaStrings.`315` = "315".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`315`]
    
    @scala.inline
    def `45`: typingsSlinky.reactFa.reactFaStrings.`45` = "45".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`45`]
    
    @scala.inline
    def `90`: typingsSlinky.reactFa.reactFaStrings.`90` = "90".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`90`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactFa.reactFaStrings.lg
    - typingsSlinky.reactFa.reactFaStrings.`2x`
    - typingsSlinky.reactFa.reactFaStrings.`3x`
    - typingsSlinky.reactFa.reactFaStrings.`4x`
    - typingsSlinky.reactFa.reactFaStrings.`5x`
  */
  trait IconSize extends StObject
  object IconSize {
    
    @scala.inline
    def `2x`: typingsSlinky.reactFa.reactFaStrings.`2x` = "2x".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`2x`]
    
    @scala.inline
    def `3x`: typingsSlinky.reactFa.reactFaStrings.`3x` = "3x".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`3x`]
    
    @scala.inline
    def `4x`: typingsSlinky.reactFa.reactFaStrings.`4x` = "4x".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`4x`]
    
    @scala.inline
    def `5x`: typingsSlinky.reactFa.reactFaStrings.`5x` = "5x".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`5x`]
    
    @scala.inline
    def lg: typingsSlinky.reactFa.reactFaStrings.lg = "lg".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.lg]
  }
  
  @js.native
  trait IconStackProps extends SizeOverrideHTMLProps[ReactComponentClass[IconStackProps]] {
    
    @JSName("children")
    var children_IconStackProps: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.native
    
    @JSName("size")
    var size_IconStackProps: js.UndefOr[IconSize] = js.native
  }
  object IconStackProps {
    
    @scala.inline
    def apply(): IconStackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconStackProps]
    }
    
    @scala.inline
    implicit class IconStackPropsMutableBuilder[Self <: IconStackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: IconSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactFa.reactFaStrings.`1x`
    - typingsSlinky.reactFa.reactFaStrings.`2x`
  */
  trait IconStackSize extends StObject
  object IconStackSize {
    
    @scala.inline
    def `1x`: typingsSlinky.reactFa.reactFaStrings.`1x` = "1x".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`1x`]
    
    @scala.inline
    def `2x`: typingsSlinky.reactFa.reactFaStrings.`2x` = "2x".asInstanceOf[typingsSlinky.reactFa.reactFaStrings.`2x`]
  }
  
  // fake intermediate interface to remove typing on size, as the typing
  // is overrided by react-fa
  @js.native
  trait SizeOverrideHTMLProps[T] extends HTMLProps[T] {
    
    @JSName("size")
    var size_SizeOverrideHTMLProps: js.UndefOr[js.Any] = js.native
  }
  object SizeOverrideHTMLProps {
    
    @scala.inline
    def apply[T](): SizeOverrideHTMLProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeOverrideHTMLProps[T]]
    }
    
    @scala.inline
    implicit class SizeOverrideHTMLPropsMutableBuilder[Self <: SizeOverrideHTMLProps[_], T] (val x: Self with SizeOverrideHTMLProps[T]) extends AnyVal {
      
      @scala.inline
      def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[IconProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ReactComponentClass[IconProps] = default
}
