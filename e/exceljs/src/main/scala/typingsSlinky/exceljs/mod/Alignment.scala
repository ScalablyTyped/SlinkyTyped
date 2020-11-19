package typingsSlinky.exceljs.mod

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

@js.native
trait Alignment extends js.Object {
  
  var horizontal: left | center | right | fill | justify | centerContinuous | distributed = js.native
  
  var indent: Double = js.native
  
  var readingOrder: rtl | ltr = js.native
  
  var shrinkToFit: Boolean = js.native
  
  var textRotation: Double | vertical = js.native
  
  var vertical: top | middle | bottom | distributed | justify = js.native
  
  var wrapText: Boolean = js.native
}
object Alignment {
  
  @scala.inline
  def apply(
    horizontal: left | center | right | fill | justify | centerContinuous | distributed,
    indent: Double,
    readingOrder: rtl | ltr,
    shrinkToFit: Boolean,
    textRotation: Double | vertical,
    vertical: top | middle | bottom | distributed | justify,
    wrapText: Boolean
  ): Alignment = {
    val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], readingOrder = readingOrder.asInstanceOf[js.Any], shrinkToFit = shrinkToFit.asInstanceOf[js.Any], textRotation = textRotation.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], wrapText = wrapText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alignment]
  }
  
  @scala.inline
  implicit class AlignmentOps[Self <: Alignment] (val x: Self) extends AnyVal {
    
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
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrder(value: rtl | ltr): Self = this.set("readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = this.set("shrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRotation(value: Double | vertical): Self = this.set("textRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: top | middle | bottom | distributed | justify): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapText(value: Boolean): Self = this.set("wrapText", value.asInstanceOf[js.Any])
  }
}
