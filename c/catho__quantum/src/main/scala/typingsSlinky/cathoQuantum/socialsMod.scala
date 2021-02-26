package typingsSlinky.cathoQuantum

import slinky.core.ReactComponentClass
import typingsSlinky.cathoQuantum.anon.Name
import typingsSlinky.cathoQuantum.anon.`1`
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object socialsMod {
  
  @JSImport("@catho/quantum/Socials", JSImport.Default)
  @js.native
  class default ()
    extends Component[SocialsProps, js.Object, js.Any]
  
  type NonEmptyArray[T] = Array[T]
  
  type Socials = ReactComponentClass[SocialsProps]
  
  @js.native
  trait SocialsProps extends StObject {
    
    var items: NonEmptyArray[Name] = js.native
    
    var size: js.UndefOr[String] = js.native
    
    var theme: js.UndefOr[`1`] = js.native
    
    var withBox: js.UndefOr[Boolean] = js.native
  }
  object SocialsProps {
    
    @scala.inline
    def apply(items: NonEmptyArray[Name]): SocialsProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[SocialsProps]
    }
    
    @scala.inline
    implicit class SocialsPropsMutableBuilder[Self <: SocialsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: NonEmptyArray[Name]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTheme(value: `1`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setWithBox(value: Boolean): Self = StObject.set(x, "withBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithBoxUndefined: Self = StObject.set(x, "withBox", js.undefined)
    }
  }
}
