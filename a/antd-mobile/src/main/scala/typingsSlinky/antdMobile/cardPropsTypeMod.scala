package typingsSlinky.antdMobile

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardPropsTypeMod {
  
  @js.native
  trait CardFooterPropsType extends StObject {
    
    var content: js.UndefOr[ReactElement] = js.native
    
    var extra: js.UndefOr[ReactElement] = js.native
  }
  object CardFooterPropsType {
    
    @scala.inline
    def apply(): CardFooterPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardFooterPropsType]
    }
    
    @scala.inline
    implicit class CardFooterPropsTypeMutableBuilder[Self <: CardFooterPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentReactElement(value: ReactElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    }
  }
  
  @js.native
  trait CardHeaderPropsType extends StObject {
    
    var extra: js.UndefOr[ReactElement] = js.native
    
    /** need url of img, if this is string. */
    var thumb: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
  }
  object CardHeaderPropsType {
    
    @scala.inline
    def apply(): CardHeaderPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderPropsType]
    }
    
    @scala.inline
    implicit class CardHeaderPropsTypeMutableBuilder[Self <: CardHeaderPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtra(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraReactElement(value: ReactElement): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setThumb(value: ReactElement): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbReactElement(value: ReactElement): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait CardPropsType extends StObject {
    
    var full: js.UndefOr[Boolean] = js.native
  }
  object CardPropsType {
    
    @scala.inline
    def apply(): CardPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardPropsType]
    }
    
    @scala.inline
    implicit class CardPropsTypeMutableBuilder[Self <: CardPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    }
  }
}
