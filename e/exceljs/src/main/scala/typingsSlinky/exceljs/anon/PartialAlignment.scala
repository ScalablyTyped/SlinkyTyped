package typingsSlinky.exceljs.anon

import typingsSlinky.exceljs.exceljsStrings.bottom
import typingsSlinky.exceljs.exceljsStrings.center
import typingsSlinky.exceljs.exceljsStrings.centerContinuous
import typingsSlinky.exceljs.exceljsStrings.distributed
import typingsSlinky.exceljs.exceljsStrings.fill
import typingsSlinky.exceljs.exceljsStrings.justify
import typingsSlinky.exceljs.exceljsStrings.left
import typingsSlinky.exceljs.exceljsStrings.ltr
import typingsSlinky.exceljs.exceljsStrings.middle
import typingsSlinky.exceljs.exceljsStrings.right
import typingsSlinky.exceljs.exceljsStrings.rtl
import typingsSlinky.exceljs.exceljsStrings.top
import typingsSlinky.exceljs.exceljsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Alignment> */
@js.native
trait PartialAlignment extends js.Object {
  
  var horizontal: js.UndefOr[left | center | right | fill | justify | centerContinuous | distributed] = js.native
  
  var indent: js.UndefOr[Double] = js.native
  
  var readingOrder: js.UndefOr[rtl | ltr] = js.native
  
  var shrinkToFit: js.UndefOr[Boolean] = js.native
  
  var textRotation: js.UndefOr[Double | vertical] = js.native
  
  var vertical: js.UndefOr[top | middle | bottom | distributed | justify] = js.native
  
  var wrapText: js.UndefOr[Boolean] = js.native
}
object PartialAlignment {
  
  @scala.inline
  def apply(): PartialAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAlignment]
  }
  
  @scala.inline
  implicit class PartialAlignmentOps[Self <: PartialAlignment] (val x: Self) extends AnyVal {
    
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
    def setHorizontal(value: left | center | right | fill | justify | centerContinuous | distributed): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setReadingOrder(value: rtl | ltr): Self = this.set("readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadingOrder: Self = this.set("readingOrder", js.undefined)
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = this.set("shrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShrinkToFit: Self = this.set("shrinkToFit", js.undefined)
    
    @scala.inline
    def setTextRotation(value: Double | vertical): Self = this.set("textRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRotation: Self = this.set("textRotation", js.undefined)
    
    @scala.inline
    def setVertical(value: top | middle | bottom | distributed | justify): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    
    @scala.inline
    def setWrapText(value: Boolean): Self = this.set("wrapText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapText: Self = this.set("wrapText", js.undefined)
  }
}
