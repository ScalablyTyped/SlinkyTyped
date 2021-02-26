package typingsSlinky.reactNativeFlipCard

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-flip-card", JSImport.Default)
  @js.native
  class default ()
    extends Component[FlipCardProps, js.Object, js.Any]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-flip-card", "Back")
  @js.native
  class Back protected ()
    extends Component[BackProps, js.Object, js.Any] {
    def this(props: BackProps) = this()
    def this(props: BackProps, context: js.Any) = this()
  }
  @JSImport("react-native-flip-card", "Back")
  @js.native
  val Back: ReactComponentClass[BackProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-flip-card", "Face")
  @js.native
  class Face protected ()
    extends Component[FaceProps, js.Object, js.Any] {
    def this(props: FaceProps) = this()
    def this(props: FaceProps, context: js.Any) = this()
  }
  @JSImport("react-native-flip-card", "Face")
  @js.native
  val Face: ReactComponentClass[FaceProps] = js.native
  
  @js.native
  trait BackProps extends StObject {
    
    var chilren: js.Array[ReactElement] = js.native
    
    var flipHorizontal: Boolean = js.native
    
    var flipVertical: Boolean = js.native
    
    var perspective: Double = js.native
  }
  object BackProps {
    
    @scala.inline
    def apply(
      chilren: js.Array[ReactElement],
      flipHorizontal: Boolean,
      flipVertical: Boolean,
      perspective: Double
    ): BackProps = {
      val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any], flipHorizontal = flipHorizontal.asInstanceOf[js.Any], flipVertical = flipVertical.asInstanceOf[js.Any], perspective = perspective.asInstanceOf[js.Any])
      __obj.asInstanceOf[BackProps]
    }
    
    @scala.inline
    implicit class BackPropsMutableBuilder[Self <: BackProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChilren(value: js.Array[ReactElement]): Self = StObject.set(x, "chilren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChilrenVarargs(value: ReactElement*): Self = StObject.set(x, "chilren", js.Array(value :_*))
      
      @scala.inline
      def setFlipHorizontal(value: Boolean): Self = StObject.set(x, "flipHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipVertical(value: Boolean): Self = StObject.set(x, "flipVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FaceProps extends StObject {
    
    var chilren: js.Array[ReactElement] = js.native
  }
  object FaceProps {
    
    @scala.inline
    def apply(chilren: js.Array[ReactElement]): FaceProps = {
      val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaceProps]
    }
    
    @scala.inline
    implicit class FacePropsMutableBuilder[Self <: FaceProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChilren(value: js.Array[ReactElement]): Self = StObject.set(x, "chilren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChilrenVarargs(value: ReactElement*): Self = StObject.set(x, "chilren", js.Array(value :_*))
    }
  }
  
  type FlipCard = ReactComponentClass[FlipCardProps]
  
  @js.native
  trait FlipCardProps extends StObject {
    
    var alignHeight: js.UndefOr[Boolean] = js.native
    
    var alignWidth: js.UndefOr[Boolean] = js.native
    
    var clickable: js.UndefOr[Boolean] = js.native
    
    var flip: js.UndefOr[Boolean] = js.native
    
    var flipHorizontal: js.UndefOr[Boolean] = js.native
    
    var flipVertical: js.UndefOr[Boolean] = js.native
    
    var friction: js.UndefOr[Double] = js.native
    
    var onFlipEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onFlipStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var perspective: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var useNativeDriver: js.UndefOr[Boolean] = js.native
  }
  object FlipCardProps {
    
    @scala.inline
    def apply(): FlipCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlipCardProps]
    }
    
    @scala.inline
    implicit class FlipCardPropsMutableBuilder[Self <: FlipCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignHeight(value: Boolean): Self = StObject.set(x, "alignHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignHeightUndefined: Self = StObject.set(x, "alignHeight", js.undefined)
      
      @scala.inline
      def setAlignWidth(value: Boolean): Self = StObject.set(x, "alignWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignWidthUndefined: Self = StObject.set(x, "alignWidth", js.undefined)
      
      @scala.inline
      def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipHorizontal(value: Boolean): Self = StObject.set(x, "flipHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipHorizontalUndefined: Self = StObject.set(x, "flipHorizontal", js.undefined)
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setFlipVertical(value: Boolean): Self = StObject.set(x, "flipVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipVerticalUndefined: Self = StObject.set(x, "flipVertical", js.undefined)
      
      @scala.inline
      def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      @scala.inline
      def setOnFlipEnd(value: () => Unit): Self = StObject.set(x, "onFlipEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFlipEndUndefined: Self = StObject.set(x, "onFlipEnd", js.undefined)
      
      @scala.inline
      def setOnFlipStart(value: () => Unit): Self = StObject.set(x, "onFlipStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFlipStartUndefined: Self = StObject.set(x, "onFlipStart", js.undefined)
      
      @scala.inline
      def setPerspective(value: Double): Self = StObject.set(x, "perspective", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerspectiveUndefined: Self = StObject.set(x, "perspective", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
}
