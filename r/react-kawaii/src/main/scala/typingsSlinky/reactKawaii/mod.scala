package typingsSlinky.reactKawaii

import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-kawaii", "Backpack")
  @js.native
  val Backpack: ReactComponentClass[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Browser")
  @js.native
  val Browser: ReactComponentClass[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Cat")
  @js.native
  val Cat: ReactComponentClass[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "CreditCard")
  @js.native
  val CreditCard: ReactComponentClass[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "File")
  @js.native
  val File: ReactComponentClass[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Ghost")
  @js.native
  val Ghost: ReactComponentClass[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "IceCream")
  @js.native
  val IceCream: ReactComponentClass[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Mug")
  @js.native
  val Mug: ReactComponentClass[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "Planet")
  @js.native
  val Planet: ReactComponentClass[KawaiiProps] = js.native
  
  @JSImport("react-kawaii", "SpeechBubble")
  @js.native
  val SpeechBubble: ReactComponentClass[KawaiiProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactKawaii.reactKawaiiStrings.sad
    - typingsSlinky.reactKawaii.reactKawaiiStrings.shocked
    - typingsSlinky.reactKawaii.reactKawaiiStrings.happy
    - typingsSlinky.reactKawaii.reactKawaiiStrings.blissful
    - typingsSlinky.reactKawaii.reactKawaiiStrings.lovestruck
    - typingsSlinky.reactKawaii.reactKawaiiStrings.excited
    - typingsSlinky.reactKawaii.reactKawaiiStrings.ko
  */
  trait KawaiiMood extends StObject
  object KawaiiMood {
    
    @scala.inline
    def blissful: typingsSlinky.reactKawaii.reactKawaiiStrings.blissful = "blissful".asInstanceOf[typingsSlinky.reactKawaii.reactKawaiiStrings.blissful]
    
    @scala.inline
    def excited: typingsSlinky.reactKawaii.reactKawaiiStrings.excited = "excited".asInstanceOf[typingsSlinky.reactKawaii.reactKawaiiStrings.excited]
    
    @scala.inline
    def happy: typingsSlinky.reactKawaii.reactKawaiiStrings.happy = "happy".asInstanceOf[typingsSlinky.reactKawaii.reactKawaiiStrings.happy]
    
    @scala.inline
    def ko: typingsSlinky.reactKawaii.reactKawaiiStrings.ko = "ko".asInstanceOf[typingsSlinky.reactKawaii.reactKawaiiStrings.ko]
    
    @scala.inline
    def lovestruck: typingsSlinky.reactKawaii.reactKawaiiStrings.lovestruck = "lovestruck".asInstanceOf[typingsSlinky.reactKawaii.reactKawaiiStrings.lovestruck]
    
    @scala.inline
    def sad: typingsSlinky.reactKawaii.reactKawaiiStrings.sad = "sad".asInstanceOf[typingsSlinky.reactKawaii.reactKawaiiStrings.sad]
    
    @scala.inline
    def shocked: typingsSlinky.reactKawaii.reactKawaiiStrings.shocked = "shocked".asInstanceOf[typingsSlinky.reactKawaii.reactKawaiiStrings.shocked]
  }
  
  @js.native
  trait KawaiiProps extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var mood: js.UndefOr[KawaiiMood] = js.native
    
    var size: js.UndefOr[Double] = js.native
  }
  object KawaiiProps {
    
    @scala.inline
    def apply(): KawaiiProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KawaiiProps]
    }
    
    @scala.inline
    implicit class KawaiiPropsMutableBuilder[Self <: KawaiiProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setMood(value: KawaiiMood): Self = StObject.set(x, "mood", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoodUndefined: Self = StObject.set(x, "mood", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
