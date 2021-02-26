package typingsSlinky.reactMdMedia

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaOverlayMod {
  
  @JSImport("@react-md/media/types/MediaOverlay", "MediaOverlay")
  @js.native
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps with RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactMdMedia.reactMdMediaStrings.top
    - typingsSlinky.reactMdMedia.reactMdMediaStrings.right
    - typingsSlinky.reactMdMedia.reactMdMediaStrings.bottom
    - typingsSlinky.reactMdMedia.reactMdMediaStrings.left
    - typingsSlinky.reactMdMedia.reactMdMediaStrings.middle
    - typingsSlinky.reactMdMedia.reactMdMediaStrings.center
    - typingsSlinky.reactMdMedia.reactMdMediaStrings.`absolute-center`
  */
  trait MediaOverlayPosition extends StObject
  object MediaOverlayPosition {
    
    @scala.inline
    def `absolute-center`: typingsSlinky.reactMdMedia.reactMdMediaStrings.`absolute-center` = "absolute-center".asInstanceOf[typingsSlinky.reactMdMedia.reactMdMediaStrings.`absolute-center`]
    
    @scala.inline
    def bottom: typingsSlinky.reactMdMedia.reactMdMediaStrings.bottom = "bottom".asInstanceOf[typingsSlinky.reactMdMedia.reactMdMediaStrings.bottom]
    
    @scala.inline
    def center: typingsSlinky.reactMdMedia.reactMdMediaStrings.center = "center".asInstanceOf[typingsSlinky.reactMdMedia.reactMdMediaStrings.center]
    
    @scala.inline
    def left: typingsSlinky.reactMdMedia.reactMdMediaStrings.left = "left".asInstanceOf[typingsSlinky.reactMdMedia.reactMdMediaStrings.left]
    
    @scala.inline
    def middle: typingsSlinky.reactMdMedia.reactMdMediaStrings.middle = "middle".asInstanceOf[typingsSlinky.reactMdMedia.reactMdMediaStrings.middle]
    
    @scala.inline
    def right: typingsSlinky.reactMdMedia.reactMdMediaStrings.right = "right".asInstanceOf[typingsSlinky.reactMdMedia.reactMdMediaStrings.right]
    
    @scala.inline
    def top: typingsSlinky.reactMdMedia.reactMdMediaStrings.top = "top".asInstanceOf[typingsSlinky.reactMdMedia.reactMdMediaStrings.top]
  }
  
  @js.native
  trait MediaOverlayProps extends HTMLAttributes[HTMLDivElement] {
    
    /**
      * The position of the overlay within the `MediaContainer`.
      */
    var position: js.UndefOr[MediaOverlayPosition] = js.native
  }
  object MediaOverlayProps {
    
    @scala.inline
    def apply(): MediaOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaOverlayProps]
    }
    
    @scala.inline
    implicit class MediaOverlayPropsMutableBuilder[Self <: MediaOverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: MediaOverlayPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
