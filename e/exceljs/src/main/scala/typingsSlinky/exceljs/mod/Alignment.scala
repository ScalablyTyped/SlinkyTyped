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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alignment extends StObject {
  
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
  implicit class AlignmentMutableBuilder[Self <: Alignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: left | center | right | fill | justify | centerContinuous | distributed): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrder(value: rtl | ltr): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRotation(value: Double | vertical): Self = StObject.set(x, "textRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical(value: top | middle | bottom | distributed | justify): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
  }
}
