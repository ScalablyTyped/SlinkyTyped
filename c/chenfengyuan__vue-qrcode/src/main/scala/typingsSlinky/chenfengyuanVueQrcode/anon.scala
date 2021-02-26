package typingsSlinky.chenfengyuanVueQrcode

import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`0`
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`1`
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`2`
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`3`
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`4`
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`5`
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`6`
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeNumbers.`7`
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.H
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.L
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.M
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.Q
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.high
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.low
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.medium
import typingsSlinky.chenfengyuanVueQrcode.chenfengyuanVueQrcodeStrings.quartile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Color extends StObject {
    
    var color: js.UndefOr[Dark] = js.native
    
    // Error correction level.
    var errorCorrectionLevel: js.UndefOr[low | medium | quartile | high | L | M | Q | H] = js.native
    
    // Define how much wide the quiet zone should be.
    var margin: js.UndefOr[Double] = js.native
    
    // Mask pattern used to mask the symbol.
    var maskPattern: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
    
    // Scale factor.
    var scale: js.UndefOr[Double] = js.native
    
    // QR Code version.
    var version: js.UndefOr[Double] = js.native
    
    // Forces a specific width for the output image.
    var width: js.UndefOr[Double] = js.native
  }
  object Color {
    
    @scala.inline
    def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Dark): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setErrorCorrectionLevel(value: low | medium | quartile | high | L | M | Q | H): Self = StObject.set(x, "errorCorrectionLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCorrectionLevelUndefined: Self = StObject.set(x, "errorCorrectionLevel", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMaskPattern(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = StObject.set(x, "maskPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskPatternUndefined: Self = StObject.set(x, "maskPattern", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Dark extends StObject {
    
    var dark: js.UndefOr[String] = js.native
    
    var light: js.UndefOr[String] = js.native
  }
  object Dark {
    
    @scala.inline
    def apply(): Dark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dark]
    }
    
    @scala.inline
    implicit class DarkMutableBuilder[Self <: Dark] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      @scala.inline
      def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
    }
  }
}
