package typingsSlinky.accessibility

import typingsSlinky.accessibility.mod.SizeOrPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Buttons extends StObject {
    
    /** @default true */
    var buttons: js.UndefOr[Boolean] = js.native
  }
  object Buttons {
    
    @scala.inline
    def apply(): Buttons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Buttons]
    }
    
    @scala.inline
    implicit class ButtonsMutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: Boolean): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    }
  }
  
  @js.native
  trait CBackground extends StObject {
    
    /** @default '#000000' */
    var cBackground: js.UndefOr[String] = js.native
    
    /** @default '#20ff69' */
    var cBorder: js.UndefOr[String] = js.native
    
    /** @default '12px' */
    var height: js.UndefOr[String] = js.native
  }
  object CBackground {
    
    @scala.inline
    def apply(): CBackground = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CBackground]
    }
    
    @scala.inline
    implicit class CBackgroundMutableBuilder[Self <: CBackground] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCBackground(value: String): Self = StObject.set(x, "cBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCBackgroundUndefined: Self = StObject.set(x, "cBackground", js.undefined)
      
      @scala.inline
      def setCBorder(value: String): Self = StObject.set(x, "cBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCBorderUndefined: Self = StObject.set(x, "cBorder", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    }
  }
  
  @js.native
  trait Dimensions extends StObject {
    
    var dimensions: js.UndefOr[typingsSlinky.accessibility.mod.Dimensions] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
  }
  object Dimensions {
    
    @scala.inline
    def apply(): Dimensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDimensions(value: typingsSlinky.accessibility.mod.Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    }
  }
  
  @js.native
  trait Font extends StObject {
    
    var font: SizeOrPosition = js.native
  }
  object Font {
    
    @scala.inline
    def apply(font: SizeOrPosition): Font = {
      val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
      __obj.asInstanceOf[Font]
    }
    
    @scala.inline
    implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFont(value: SizeOrPosition): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Persistent extends StObject {
    
    /** @default true */
    var persistent: js.UndefOr[Boolean] = js.native
  }
  object Persistent {
    
    @scala.inline
    def apply(): Persistent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Persistent]
    }
    
    @scala.inline
    implicit class PersistentMutableBuilder[Self <: Persistent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
}
