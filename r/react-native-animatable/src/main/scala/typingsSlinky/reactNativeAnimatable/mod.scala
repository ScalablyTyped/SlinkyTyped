package typingsSlinky.reactNativeAnimatable

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.ClassicComponent
import typingsSlinky.react.mod.ClassicComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import typingsSlinky.reactNative.mod.ImageProperties
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.NativeMethods
import typingsSlinky.reactNative.mod.TextProperties
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewProperties
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAnimatable.anon.Finished
import typingsSlinky.reactNativeAnimatable.anon.Style
import typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.infinite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-animatable", "Image")
  @js.native
  val Image: AnimatableComponent[ImageProperties, ImageStyle] = js.native
  type Image = AnimatableComponent[ImageProperties, ImageStyle]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native-animatable", "Image")
  @js.native
  class ImageCls protected ()
    extends ClassicComponent[AnimatableProperties[ImageStyle] with ImageProperties, js.Object] {
    def this(props: AnimatableProperties[ImageStyle] with ImageProperties) = this()
    def this(props: AnimatableProperties[ImageStyle] with ImageProperties, context: js.Any) = this()
  }
  
  @JSImport("react-native-animatable", "Text")
  @js.native
  val Text: AnimatableComponent[TextProperties, TextStyle] = js.native
  type Text = AnimatableComponent[TextProperties, TextStyle]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native-animatable", "Text")
  @js.native
  class TextCls protected ()
    extends ClassicComponent[AnimatableProperties[TextStyle] with TextProperties, js.Object] {
    def this(props: AnimatableProperties[TextStyle] with TextProperties) = this()
    def this(props: AnimatableProperties[TextStyle] with TextProperties, context: js.Any) = this()
  }
  
  @JSImport("react-native-animatable", "View")
  @js.native
  val View: AnimatableComponent[ViewProperties, ViewStyle] = js.native
  type View = AnimatableComponent[ViewProperties, ViewStyle]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("react-native-animatable", "View")
  @js.native
  class ViewCls protected ()
    extends ClassicComponent[AnimatableProperties[ViewStyle] with ViewProperties, js.Object] {
    def this(props: AnimatableProperties[ViewStyle] with ViewProperties) = this()
    def this(props: AnimatableProperties[ViewStyle] with ViewProperties, context: js.Any) = this()
  }
  
  @JSImport("react-native-animatable", "createAnimatableComponent")
  @js.native
  def createAnimatableComponent[P /* <: Style */, S](Component: ClassicComponentClass[P]): AnimatableComponent[P, S] = js.native
  @JSImport("react-native-animatable", "createAnimatableComponent")
  @js.native
  def createAnimatableComponent[P /* <: Style */, S](Component: ComponentClass[P, js.Object]): AnimatableComponent[P, S] = js.native
  @JSImport("react-native-animatable", "createAnimatableComponent")
  @js.native
  def createAnimatableComponent[P /* <: Style */, S](Component: StatelessComponent[P]): AnimatableComponent[P, S] = js.native
  
  @JSImport("react-native-animatable", "createAnimation")
  @js.native
  def createAnimation(animation: CustomAnimation[TextStyle with ViewStyle with ImageStyle]): js.Object = js.native
  
  @JSImport("react-native-animatable", "initializeRegistryWithDefinitions")
  @js.native
  def initializeRegistryWithDefinitions(animations: StringDictionary[CustomAnimation[TextStyle with ViewStyle with ImageStyle]]): Unit = js.native
  
  @JSImport("react-native-animatable", "registerAnimation")
  @js.native
  def registerAnimation(name: String, animation: CustomAnimation[TextStyle with ViewStyle with ImageStyle]): Unit = js.native
  
  /* Inlined std.Partial<{[ k in react-native-animatable.react-native-animatable.Animation ]: (duration : number | undefined): std.Promise<{  finished :boolean}>}> */
  @js.native
  trait AnimatableAnimationMethods extends StObject {
    
    var bounce: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var bounceIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var bounceInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var bounceInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var bounceInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var bounceInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var bounceOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var bounceOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var bounceOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var bounceOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var bounceOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeInDownBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeInLeftBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeInRightBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeInUpBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeOutDownBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeOutLeftBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeOutRightBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var fadeOutUpBig: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var flash: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var flipInX: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var flipInY: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var flipOutX: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var flipOutY: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var jello: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var lightSpeedIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var lightSpeedOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var pulse: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var rotate: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var rubberBand: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var shake: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var slideInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var slideInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var slideInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var slideInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var slideOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var slideOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var slideOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var slideOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var swing: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var tada: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var wobble: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var zoomIn: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var zoomInDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var zoomInLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var zoomInRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var zoomInUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var zoomOut: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var zoomOutDown: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var zoomOutLeft: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var zoomOutRight: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
    
    var zoomOutUp: js.UndefOr[js.Function1[/* duration */ js.UndefOr[Double], js.Promise[Finished]]] = js.native
  }
  object AnimatableAnimationMethods {
    
    @scala.inline
    def apply(): AnimatableAnimationMethods = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatableAnimationMethods]
    }
    
    @scala.inline
    implicit class AnimatableAnimationMethodsMutableBuilder[Self <: AnimatableAnimationMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounce(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounce", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceInDownUndefined: Self = StObject.set(x, "bounceInDown", js.undefined)
      
      @scala.inline
      def setBounceInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceInLeftUndefined: Self = StObject.set(x, "bounceInLeft", js.undefined)
      
      @scala.inline
      def setBounceInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceInRightUndefined: Self = StObject.set(x, "bounceInRight", js.undefined)
      
      @scala.inline
      def setBounceInUndefined: Self = StObject.set(x, "bounceIn", js.undefined)
      
      @scala.inline
      def setBounceInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceInUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceInUpUndefined: Self = StObject.set(x, "bounceInUp", js.undefined)
      
      @scala.inline
      def setBounceOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceOutDownUndefined: Self = StObject.set(x, "bounceOutDown", js.undefined)
      
      @scala.inline
      def setBounceOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceOutLeftUndefined: Self = StObject.set(x, "bounceOutLeft", js.undefined)
      
      @scala.inline
      def setBounceOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceOutRightUndefined: Self = StObject.set(x, "bounceOutRight", js.undefined)
      
      @scala.inline
      def setBounceOutUndefined: Self = StObject.set(x, "bounceOut", js.undefined)
      
      @scala.inline
      def setBounceOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "bounceOutUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBounceOutUpUndefined: Self = StObject.set(x, "bounceOutUp", js.undefined)
      
      @scala.inline
      def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      @scala.inline
      def setFadeIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeInDownBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInDownBig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeInDownBigUndefined: Self = StObject.set(x, "fadeInDownBig", js.undefined)
      
      @scala.inline
      def setFadeInDownUndefined: Self = StObject.set(x, "fadeInDown", js.undefined)
      
      @scala.inline
      def setFadeInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeInLeftBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInLeftBig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeInLeftBigUndefined: Self = StObject.set(x, "fadeInLeftBig", js.undefined)
      
      @scala.inline
      def setFadeInLeftUndefined: Self = StObject.set(x, "fadeInLeft", js.undefined)
      
      @scala.inline
      def setFadeInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeInRightBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInRightBig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeInRightBigUndefined: Self = StObject.set(x, "fadeInRightBig", js.undefined)
      
      @scala.inline
      def setFadeInRightUndefined: Self = StObject.set(x, "fadeInRight", js.undefined)
      
      @scala.inline
      def setFadeInUndefined: Self = StObject.set(x, "fadeIn", js.undefined)
      
      @scala.inline
      def setFadeInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeInUpBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeInUpBig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeInUpBigUndefined: Self = StObject.set(x, "fadeInUpBig", js.undefined)
      
      @scala.inline
      def setFadeInUpUndefined: Self = StObject.set(x, "fadeInUp", js.undefined)
      
      @scala.inline
      def setFadeOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeOutDownBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutDownBig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeOutDownBigUndefined: Self = StObject.set(x, "fadeOutDownBig", js.undefined)
      
      @scala.inline
      def setFadeOutDownUndefined: Self = StObject.set(x, "fadeOutDown", js.undefined)
      
      @scala.inline
      def setFadeOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeOutLeftBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutLeftBig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeOutLeftBigUndefined: Self = StObject.set(x, "fadeOutLeftBig", js.undefined)
      
      @scala.inline
      def setFadeOutLeftUndefined: Self = StObject.set(x, "fadeOutLeft", js.undefined)
      
      @scala.inline
      def setFadeOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeOutRightBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutRightBig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeOutRightBigUndefined: Self = StObject.set(x, "fadeOutRightBig", js.undefined)
      
      @scala.inline
      def setFadeOutRightUndefined: Self = StObject.set(x, "fadeOutRight", js.undefined)
      
      @scala.inline
      def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
      
      @scala.inline
      def setFadeOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeOutUpBig(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "fadeOutUpBig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFadeOutUpBigUndefined: Self = StObject.set(x, "fadeOutUpBig", js.undefined)
      
      @scala.inline
      def setFadeOutUpUndefined: Self = StObject.set(x, "fadeOutUp", js.undefined)
      
      @scala.inline
      def setFlash(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flash", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlashUndefined: Self = StObject.set(x, "flash", js.undefined)
      
      @scala.inline
      def setFlipInX(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipInX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlipInXUndefined: Self = StObject.set(x, "flipInX", js.undefined)
      
      @scala.inline
      def setFlipInY(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipInY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlipInYUndefined: Self = StObject.set(x, "flipInY", js.undefined)
      
      @scala.inline
      def setFlipOutX(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipOutX", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlipOutXUndefined: Self = StObject.set(x, "flipOutX", js.undefined)
      
      @scala.inline
      def setFlipOutY(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "flipOutY", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFlipOutYUndefined: Self = StObject.set(x, "flipOutY", js.undefined)
      
      @scala.inline
      def setJello(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "jello", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJelloUndefined: Self = StObject.set(x, "jello", js.undefined)
      
      @scala.inline
      def setLightSpeedIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "lightSpeedIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLightSpeedInUndefined: Self = StObject.set(x, "lightSpeedIn", js.undefined)
      
      @scala.inline
      def setLightSpeedOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "lightSpeedOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLightSpeedOutUndefined: Self = StObject.set(x, "lightSpeedOut", js.undefined)
      
      @scala.inline
      def setPulse(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "pulse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPulseUndefined: Self = StObject.set(x, "pulse", js.undefined)
      
      @scala.inline
      def setRotate(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setRubberBand(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "rubberBand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRubberBandUndefined: Self = StObject.set(x, "rubberBand", js.undefined)
      
      @scala.inline
      def setShake(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "shake", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShakeUndefined: Self = StObject.set(x, "shake", js.undefined)
      
      @scala.inline
      def setSlideInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideInDownUndefined: Self = StObject.set(x, "slideInDown", js.undefined)
      
      @scala.inline
      def setSlideInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideInLeftUndefined: Self = StObject.set(x, "slideInLeft", js.undefined)
      
      @scala.inline
      def setSlideInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideInRightUndefined: Self = StObject.set(x, "slideInRight", js.undefined)
      
      @scala.inline
      def setSlideInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideInUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideInUpUndefined: Self = StObject.set(x, "slideInUp", js.undefined)
      
      @scala.inline
      def setSlideOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideOutDownUndefined: Self = StObject.set(x, "slideOutDown", js.undefined)
      
      @scala.inline
      def setSlideOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideOutLeftUndefined: Self = StObject.set(x, "slideOutLeft", js.undefined)
      
      @scala.inline
      def setSlideOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideOutRightUndefined: Self = StObject.set(x, "slideOutRight", js.undefined)
      
      @scala.inline
      def setSlideOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "slideOutUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlideOutUpUndefined: Self = StObject.set(x, "slideOutUp", js.undefined)
      
      @scala.inline
      def setSwing(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "swing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwingUndefined: Self = StObject.set(x, "swing", js.undefined)
      
      @scala.inline
      def setTada(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "tada", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTadaUndefined: Self = StObject.set(x, "tada", js.undefined)
      
      @scala.inline
      def setWobble(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "wobble", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWobbleUndefined: Self = StObject.set(x, "wobble", js.undefined)
      
      @scala.inline
      def setZoomIn(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomIn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomInDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomInDownUndefined: Self = StObject.set(x, "zoomInDown", js.undefined)
      
      @scala.inline
      def setZoomInLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomInLeftUndefined: Self = StObject.set(x, "zoomInLeft", js.undefined)
      
      @scala.inline
      def setZoomInRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomInRightUndefined: Self = StObject.set(x, "zoomInRight", js.undefined)
      
      @scala.inline
      def setZoomInUndefined: Self = StObject.set(x, "zoomIn", js.undefined)
      
      @scala.inline
      def setZoomInUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomInUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomInUpUndefined: Self = StObject.set(x, "zoomInUp", js.undefined)
      
      @scala.inline
      def setZoomOut(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomOutDown(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomOutDownUndefined: Self = StObject.set(x, "zoomOutDown", js.undefined)
      
      @scala.inline
      def setZoomOutLeft(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutLeft", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomOutLeftUndefined: Self = StObject.set(x, "zoomOutLeft", js.undefined)
      
      @scala.inline
      def setZoomOutRight(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomOutRightUndefined: Self = StObject.set(x, "zoomOutRight", js.undefined)
      
      @scala.inline
      def setZoomOutUndefined: Self = StObject.set(x, "zoomOut", js.undefined)
      
      @scala.inline
      def setZoomOutUp(value: /* duration */ js.UndefOr[Double] => js.Promise[Finished]): Self = StObject.set(x, "zoomOutUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomOutUpUndefined: Self = StObject.set(x, "zoomOutUp", js.undefined)
    }
  }
  
  @js.native
  trait AnimatableComponent[P /* <: js.Object */, S /* <: js.Object */]
    extends ClassicComponentClass[AnimatableProperties[S] with P]
       with NativeMethods
       with AnimatableAnimationMethods {
    
    def stopAnimation(): Unit = js.native
    
    def transition[T /* <: S */](fromValues: T, toValues: T): Unit = js.native
    def transition[T /* <: S */](fromValues: T, toValues: T, duration: js.UndefOr[scala.Nothing], easing: Easing): Unit = js.native
    def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double): Unit = js.native
    def transition[T /* <: S */](fromValues: T, toValues: T, duration: Double, easing: Easing): Unit = js.native
    
    def transitionTo[T /* <: S */](toValues: T): Unit = js.native
    def transitionTo[T /* <: S */](toValues: T, duration: js.UndefOr[scala.Nothing], easing: Easing): Unit = js.native
    def transitionTo[T /* <: S */](toValues: T, duration: Double): Unit = js.native
    def transitionTo[T /* <: S */](toValues: T, duration: Double, easing: Easing): Unit = js.native
  }
  
  @js.native
  trait AnimatableProperties[S /* <: js.Object */] extends StObject {
    
    var animation: js.UndefOr[Animation | String | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.native
    
    var delay: js.UndefOr[Double] = js.native
    
    var direction: js.UndefOr[Direction] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[Easing] = js.native
    
    var iterationCount: js.UndefOr[Double | infinite] = js.native
    
    var iterationDelay: js.UndefOr[Double] = js.native
    
    var onAnimationBegin: js.UndefOr[js.Function] = js.native
    
    var onAnimationEnd: js.UndefOr[js.Function] = js.native
    
    var onTransitionBegin: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.native
    
    var onTransitionEnd: js.UndefOr[js.Function1[/* property */ String, Unit]] = js.native
    
    var transition: js.UndefOr[(/* keyof S */ String) | (js.Array[/* keyof S */ String])] = js.native
    
    var useNativeDriver: js.UndefOr[Boolean] = js.native
  }
  object AnimatableProperties {
    
    @scala.inline
    def apply[S /* <: js.Object */](): AnimatableProperties[S] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatableProperties[S]]
    }
    
    @scala.inline
    implicit class AnimatablePropertiesMutableBuilder[Self <: AnimatableProperties[_], S /* <: js.Object */] (val x: Self with AnimatableProperties[S]) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: Animation | String | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingFunction1(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setIterationCount(value: Double | infinite): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
      
      @scala.inline
      def setIterationDelay(value: Double): Self = StObject.set(x, "iterationDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationDelayUndefined: Self = StObject.set(x, "iterationDelay", js.undefined)
      
      @scala.inline
      def setOnAnimationBegin(value: js.Function): Self = StObject.set(x, "onAnimationBegin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimationBeginUndefined: Self = StObject.set(x, "onAnimationBegin", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: js.Function): Self = StObject.set(x, "onAnimationEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnTransitionBegin(value: /* property */ String => Unit): Self = StObject.set(x, "onTransitionBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionBeginUndefined: Self = StObject.set(x, "onTransitionBegin", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: /* property */ String => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setTransition(value: (/* keyof S */ String) | (js.Array[/* keyof S */ String])): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setTransitionVarargs(value: (/* keyof S */ String)*): Self = StObject.set(x, "transition", js.Array(value :_*))
      
      @scala.inline
      def setUseNativeDriver(value: Boolean): Self = StObject.set(x, "useNativeDriver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDriverUndefined: Self = StObject.set(x, "useNativeDriver", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounce
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flash
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.jello
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.pulse
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.rotate
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.rubberBand
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.shake
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.swing
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.tada
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.wobble
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceIn
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInDown
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInUp
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInLeft
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInRight
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOut
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutDown
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutUp
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutLeft
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutRight
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeIn
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDown
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDownBig
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUp
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUpBig
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeft
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeftBig
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRight
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRightBig
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOut
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDown
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDownBig
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUp
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUpBig
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeft
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeftBig
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRight
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRightBig
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipInX
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipInY
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutX
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutY
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedIn
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedOut
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInDown
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInUp
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInLeft
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInRight
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutDown
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutUp
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutLeft
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutRight
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomIn
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInDown
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInUp
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInLeft
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInRight
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOut
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutDown
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutUp
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutLeft
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutRight
  */
  trait Animation extends StObject
  object Animation {
    
    @scala.inline
    def bounce: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounce = "bounce".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounce]
    
    @scala.inline
    def bounceIn: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceIn = "bounceIn".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceIn]
    
    @scala.inline
    def bounceInDown: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInDown = "bounceInDown".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInDown]
    
    @scala.inline
    def bounceInLeft: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInLeft = "bounceInLeft".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInLeft]
    
    @scala.inline
    def bounceInRight: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInRight = "bounceInRight".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInRight]
    
    @scala.inline
    def bounceInUp: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInUp = "bounceInUp".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceInUp]
    
    @scala.inline
    def bounceOut: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOut = "bounceOut".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOut]
    
    @scala.inline
    def bounceOutDown: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutDown = "bounceOutDown".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutDown]
    
    @scala.inline
    def bounceOutLeft: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutLeft = "bounceOutLeft".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutLeft]
    
    @scala.inline
    def bounceOutRight: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutRight = "bounceOutRight".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutRight]
    
    @scala.inline
    def bounceOutUp: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutUp = "bounceOutUp".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.bounceOutUp]
    
    @scala.inline
    def fadeIn: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeIn = "fadeIn".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeIn]
    
    @scala.inline
    def fadeInDown: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDown = "fadeInDown".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDown]
    
    @scala.inline
    def fadeInDownBig: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDownBig = "fadeInDownBig".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInDownBig]
    
    @scala.inline
    def fadeInLeft: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeft = "fadeInLeft".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeft]
    
    @scala.inline
    def fadeInLeftBig: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeftBig = "fadeInLeftBig".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInLeftBig]
    
    @scala.inline
    def fadeInRight: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRight = "fadeInRight".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRight]
    
    @scala.inline
    def fadeInRightBig: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRightBig = "fadeInRightBig".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInRightBig]
    
    @scala.inline
    def fadeInUp: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUp = "fadeInUp".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUp]
    
    @scala.inline
    def fadeInUpBig: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUpBig = "fadeInUpBig".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeInUpBig]
    
    @scala.inline
    def fadeOut: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOut = "fadeOut".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOut]
    
    @scala.inline
    def fadeOutDown: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDown = "fadeOutDown".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDown]
    
    @scala.inline
    def fadeOutDownBig: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDownBig = "fadeOutDownBig".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutDownBig]
    
    @scala.inline
    def fadeOutLeft: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeft = "fadeOutLeft".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeft]
    
    @scala.inline
    def fadeOutLeftBig: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeftBig = "fadeOutLeftBig".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutLeftBig]
    
    @scala.inline
    def fadeOutRight: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRight = "fadeOutRight".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRight]
    
    @scala.inline
    def fadeOutRightBig: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRightBig = "fadeOutRightBig".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutRightBig]
    
    @scala.inline
    def fadeOutUp: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUp = "fadeOutUp".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUp]
    
    @scala.inline
    def fadeOutUpBig: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUpBig = "fadeOutUpBig".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.fadeOutUpBig]
    
    @scala.inline
    def flash: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flash = "flash".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flash]
    
    @scala.inline
    def flipInX: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipInX = "flipInX".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipInX]
    
    @scala.inline
    def flipInY: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipInY = "flipInY".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipInY]
    
    @scala.inline
    def flipOutX: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutX = "flipOutX".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutX]
    
    @scala.inline
    def flipOutY: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutY = "flipOutY".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.flipOutY]
    
    @scala.inline
    def jello: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.jello = "jello".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.jello]
    
    @scala.inline
    def lightSpeedIn: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedIn = "lightSpeedIn".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedIn]
    
    @scala.inline
    def lightSpeedOut: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedOut = "lightSpeedOut".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.lightSpeedOut]
    
    @scala.inline
    def pulse: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.pulse = "pulse".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.pulse]
    
    @scala.inline
    def rotate: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.rotate = "rotate".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.rotate]
    
    @scala.inline
    def rubberBand: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.rubberBand = "rubberBand".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.rubberBand]
    
    @scala.inline
    def shake: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.shake = "shake".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.shake]
    
    @scala.inline
    def slideInDown: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInDown = "slideInDown".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInDown]
    
    @scala.inline
    def slideInLeft: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInLeft = "slideInLeft".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInLeft]
    
    @scala.inline
    def slideInRight: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInRight = "slideInRight".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInRight]
    
    @scala.inline
    def slideInUp: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInUp = "slideInUp".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideInUp]
    
    @scala.inline
    def slideOutDown: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutDown = "slideOutDown".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutDown]
    
    @scala.inline
    def slideOutLeft: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutLeft = "slideOutLeft".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutLeft]
    
    @scala.inline
    def slideOutRight: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutRight = "slideOutRight".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutRight]
    
    @scala.inline
    def slideOutUp: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutUp = "slideOutUp".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.slideOutUp]
    
    @scala.inline
    def swing: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.swing = "swing".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.swing]
    
    @scala.inline
    def tada: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.tada = "tada".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.tada]
    
    @scala.inline
    def wobble: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.wobble = "wobble".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.wobble]
    
    @scala.inline
    def zoomIn: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomIn = "zoomIn".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomIn]
    
    @scala.inline
    def zoomInDown: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInDown = "zoomInDown".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInDown]
    
    @scala.inline
    def zoomInLeft: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInLeft = "zoomInLeft".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInLeft]
    
    @scala.inline
    def zoomInRight: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInRight = "zoomInRight".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInRight]
    
    @scala.inline
    def zoomInUp: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInUp = "zoomInUp".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomInUp]
    
    @scala.inline
    def zoomOut: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOut = "zoomOut".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOut]
    
    @scala.inline
    def zoomOutDown: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutDown = "zoomOutDown".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutDown]
    
    @scala.inline
    def zoomOutLeft: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutLeft = "zoomOutLeft".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutLeft]
    
    @scala.inline
    def zoomOutRight: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutRight = "zoomOutRight".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutRight]
    
    @scala.inline
    def zoomOutUp: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutUp = "zoomOutUp".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.zoomOutUp]
  }
  
  @js.native
  trait CustomAnimation[T] extends /* progress */ NumberDictionary[T] {
    
    var easing: js.UndefOr[Easing] = js.native
    
    var from: js.UndefOr[T] = js.native
    
    var style: js.UndefOr[T] = js.native
    
    var to: js.UndefOr[T] = js.native
  }
  object CustomAnimation {
    
    @scala.inline
    def apply[T](): CustomAnimation[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomAnimation[T]]
    }
    
    @scala.inline
    implicit class CustomAnimationMutableBuilder[Self <: CustomAnimation[_], T] (val x: Self with CustomAnimation[T]) extends AnyVal {
      
      @scala.inline
      def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingFunction1(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFrom(value: T): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setStyle(value: T): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTo(value: T): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.normal
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.reverse
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.alternate
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse`
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def alternate: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.alternate = "alternate".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.alternate]
    
    @scala.inline
    def `alternate-reverse`: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse` = "alternate-reverse".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`alternate-reverse`]
    
    @scala.inline
    def normal: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.normal = "normal".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.normal]
    
    @scala.inline
    def reverse: typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.reverse = "reverse".asInstanceOf[typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.reverse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.linear
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.ease
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-cubic`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-cubic`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-cubic`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-circ`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-circ`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-circ`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-expo`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-expo`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-expo`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quad`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quad`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quad`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quart`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quart`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quart`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quint`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quint`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quint`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-sine`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-sine`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-sine`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-back`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-back`
    - typingsSlinky.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-back`
    - typingsSlinky.reactNativeAnimatable.mod.EasingFunction
  */
  type Easing = _Easing | EasingFunction
  
  type EasingFunction = js.Function1[/* t */ Double, Double]
  
  type GetPropertyType[B, K /* <: /* keyof B */ String */] = /* import warning: importer.ImportType#apply Failed type conversion: B[K] */ js.Any
  
  trait _Easing extends StObject
}
