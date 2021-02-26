package typingsSlinky.devextreme.mod.DevExpress

import typingsSlinky.devextreme.devextremeStrings.double
import typingsSlinky.devextreme.devextremeStrings.doubleAccounting
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.singleAccounting
import typingsSlinky.devextreme.devextremeStrings.single_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exporter {
  
  @js.native
  trait ExcelFont extends StObject {
    
    /**
      * [descr:ExcelFont.bold]
      */
    var bold: js.UndefOr[Boolean] = js.native
    
    /**
      * [descr:ExcelFont.color]
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * [descr:ExcelFont.italic]
      */
    var italic: js.UndefOr[Boolean] = js.native
    
    /**
      * [descr:ExcelFont.name]
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * [descr:ExcelFont.size]
      */
    var size: js.UndefOr[Double] = js.native
    
    /**
      * [descr:ExcelFont.underline]
      */
    var underline: js.UndefOr[double | doubleAccounting | none | single_ | singleAccounting] = js.native
  }
  object ExcelFont {
    
    @scala.inline
    def apply(): ExcelFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcelFont]
    }
    
    @scala.inline
    implicit class ExcelFontMutableBuilder[Self <: ExcelFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setUnderline(value: double | doubleAccounting | none | single_ | singleAccounting): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    }
  }
}
