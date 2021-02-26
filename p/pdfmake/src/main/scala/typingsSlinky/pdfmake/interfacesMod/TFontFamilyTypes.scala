package typingsSlinky.pdfmake.interfacesMod

import typingsSlinky.pdfkit.PDFKit.Mixins.PDFFontSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TFontFamilyTypes extends StObject {
  
  var bold: js.UndefOr[PDFFontSource] = js.native
  
  var bolditalics: js.UndefOr[PDFFontSource] = js.native
  
  var italics: js.UndefOr[PDFFontSource] = js.native
  
  var normal: js.UndefOr[PDFFontSource] = js.native
}
object TFontFamilyTypes {
  
  @scala.inline
  def apply(): TFontFamilyTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TFontFamilyTypes]
  }
  
  @scala.inline
  implicit class TFontFamilyTypesMutableBuilder[Self <: TFontFamilyTypes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBold(value: PDFFontSource): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setBolditalics(value: PDFFontSource): Self = StObject.set(x, "bolditalics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBolditalicsArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "bolditalics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBolditalicsUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bolditalics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBolditalicsUndefined: Self = StObject.set(x, "bolditalics", js.undefined)
    
    @scala.inline
    def setItalics(value: PDFFontSource): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicsArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicsUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    @scala.inline
    def setNormal(value: PDFFontSource): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
  }
}
