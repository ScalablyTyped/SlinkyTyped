package typingsSlinky.reactNativeModal

import slinky.core.SyntheticEvent
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAnimatable.mod.Animation
import typingsSlinky.reactNativeAnimatable.mod.CustomAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type AnimationEvent = js.Function1[/* repeated */ js.Any, Unit]
  
  @js.native
  trait Animations extends StObject {
    
    var animationIn: String = js.native
    
    var animationOut: String = js.native
  }
  object Animations {
    
    @scala.inline
    def apply(animationIn: String, animationOut: String): Animations = {
      val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animations]
    }
    
    @scala.inline
    implicit class AnimationsMutableBuilder[Self <: Animations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationIn(value: String): Self = StObject.set(x, "animationIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationOut(value: String): Self = StObject.set(x, "animationOut", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.up
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.down
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.left
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.right
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def down: typingsSlinky.reactNativeModal.reactNativeModalStrings.down = "down".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.down]
    
    @scala.inline
    def left: typingsSlinky.reactNativeModal.reactNativeModalStrings.left = "left".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.left]
    
    @scala.inline
    def right: typingsSlinky.reactNativeModal.reactNativeModalStrings.right = "right".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.right]
    
    @scala.inline
    def up: typingsSlinky.reactNativeModal.reactNativeModalStrings.up = "up".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.up]
  }
  
  type OnOrientationChange = js.Function1[SyntheticEvent[NodeHandle, js.Any], Unit]
  
  type OrNull[T] = Null | T
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.portrait
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.`portrait-upside-down`
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.landscape
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.`landscape-left`
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.`landscape-right`
  */
  trait Orientation extends StObject
  object Orientation {
    
    @scala.inline
    def landscape: typingsSlinky.reactNativeModal.reactNativeModalStrings.landscape = "landscape".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.landscape]
    
    @scala.inline
    def `landscape-left`: typingsSlinky.reactNativeModal.reactNativeModalStrings.`landscape-left` = "landscape-left".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.`landscape-left`]
    
    @scala.inline
    def `landscape-right`: typingsSlinky.reactNativeModal.reactNativeModalStrings.`landscape-right` = "landscape-right".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.`landscape-right`]
    
    @scala.inline
    def portrait: typingsSlinky.reactNativeModal.reactNativeModalStrings.portrait = "portrait".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.portrait]
    
    @scala.inline
    def `portrait-upside-down`: typingsSlinky.reactNativeModal.reactNativeModalStrings.`portrait-upside-down` = "portrait-upside-down".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.`portrait-upside-down`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.fullScreen
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.pageSheet
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.formSheet
    - typingsSlinky.reactNativeModal.reactNativeModalStrings.overFullScreen
  */
  trait PresentationStyle extends StObject
  object PresentationStyle {
    
    @scala.inline
    def formSheet: typingsSlinky.reactNativeModal.reactNativeModalStrings.formSheet = "formSheet".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.formSheet]
    
    @scala.inline
    def fullScreen: typingsSlinky.reactNativeModal.reactNativeModalStrings.fullScreen = "fullScreen".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.fullScreen]
    
    @scala.inline
    def overFullScreen: typingsSlinky.reactNativeModal.reactNativeModalStrings.overFullScreen = "overFullScreen".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.overFullScreen]
    
    @scala.inline
    def pageSheet: typingsSlinky.reactNativeModal.reactNativeModalStrings.pageSheet = "pageSheet".asInstanceOf[typingsSlinky.reactNativeModal.reactNativeModalStrings.pageSheet]
  }
  
  type SupportedAnimation = Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])
}
