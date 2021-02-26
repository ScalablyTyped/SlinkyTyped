package typingsSlinky.nodeHorseman

import typingsSlinky.nodeHorseman.nodeHorsemanStrings.A3
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.A4
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.A5
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.Legal
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.Letter
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.Tabloid
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.landscape
import typingsSlinky.nodeHorseman.nodeHorsemanStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Format extends StObject {
    
    var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.native
    
    var margin: js.UndefOr[String] = js.native
    
    var orientation: js.UndefOr[portrait | landscape] = js.native
  }
  object Format {
    
    @scala.inline
    def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
}
