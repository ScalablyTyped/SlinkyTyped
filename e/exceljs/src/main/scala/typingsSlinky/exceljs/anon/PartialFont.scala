package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.exceljsStrings.double
import typingsSlinky.exceljs.exceljsStrings.doubleAccounting
import typingsSlinky.exceljs.exceljsStrings.major
import typingsSlinky.exceljs.exceljsStrings.minor
import typingsSlinky.exceljs.exceljsStrings.none_
import typingsSlinky.exceljs.exceljsStrings.single
import typingsSlinky.exceljs.exceljsStrings.singleAccounting
import typingsSlinky.exceljs.exceljsStrings.subscript
import typingsSlinky.exceljs.exceljsStrings.superscript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Font> */
@js.native
trait PartialFont extends js.Object {
  
  var bold: js.UndefOr[Boolean] = js.native
  
  var charset: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[PartialColor] = js.native
  
  var family: js.UndefOr[Double] = js.native
  
  var italic: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var outline: js.UndefOr[Boolean] = js.native
  
  var scheme: js.UndefOr[minor | major | none_] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var strike: js.UndefOr[Boolean] = js.native
  
  var underline: js.UndefOr[Boolean | none_ | single | double | singleAccounting | doubleAccounting] = js.native
  
  var vertAlign: js.UndefOr[superscript | subscript] = js.native
}
object PartialFont {
  
  @scala.inline
  def apply(): PartialFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFont]
  }
  
  @scala.inline
  implicit class PartialFontOps[Self <: PartialFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBold(value: Boolean): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBold: Self = this.set("bold", js.undefined)
    
    @scala.inline
    def setCharset(value: Double): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setColor(value: PartialColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFamily(value: Double): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItalic: Self = this.set("italic", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    
    @scala.inline
    def setScheme(value: minor | major | none_): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheme: Self = this.set("scheme", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStrike(value: Boolean): Self = this.set("strike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrike: Self = this.set("strike", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean | none_ | single | double | singleAccounting | doubleAccounting): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
    
    @scala.inline
    def setVertAlign(value: superscript | subscript): Self = this.set("vertAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertAlign: Self = this.set("vertAlign", js.undefined)
  }
}
