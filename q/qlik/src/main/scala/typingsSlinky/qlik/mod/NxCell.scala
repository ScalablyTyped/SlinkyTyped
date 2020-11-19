package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.A
import typingsSlinky.qlik.qlikStrings.D
import typingsSlinky.qlik.qlikStrings.L
import typingsSlinky.qlik.qlikStrings.O
import typingsSlinky.qlik.qlikStrings.S
import typingsSlinky.qlik.qlikStrings.X
import typingsSlinky.qlik.qlikStrings.XL
import typingsSlinky.qlik.qlikStrings.XS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxCell extends js.Object {
  
  var qAttrDims: NxAttributeDimValues = js.native
  
  var qAttrExps: NxAttributeExpressionValues = js.native
  
  var qElemNumber: Double = js.native
  
  var qFrequency: String = js.native
  
  var qHighlightRanges: NxHighlightRanges = js.native
  
  var qIsEmpty: Boolean = js.native
  
  var qIsNull: Boolean = js.native
  
  var qIsOtherCell: Boolean = js.native
  
  var qIsTotalCell: Boolean = js.native
  
  var qNum: Double = js.native
  
  var qState: L | S | O | D | A | X | XS | XL = js.native
  
  var qText: String = js.native
}
object NxCell {
  
  @scala.inline
  def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qElemNumber: Double,
    qFrequency: String,
    qHighlightRanges: NxHighlightRanges,
    qIsEmpty: Boolean,
    qIsNull: Boolean,
    qIsOtherCell: Boolean,
    qIsTotalCell: Boolean,
    qNum: Double,
    qState: L | S | O | D | A | X | XS | XL,
    qText: String
  ): NxCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qElemNumber = qElemNumber.asInstanceOf[js.Any], qFrequency = qFrequency.asInstanceOf[js.Any], qHighlightRanges = qHighlightRanges.asInstanceOf[js.Any], qIsEmpty = qIsEmpty.asInstanceOf[js.Any], qIsNull = qIsNull.asInstanceOf[js.Any], qIsOtherCell = qIsOtherCell.asInstanceOf[js.Any], qIsTotalCell = qIsTotalCell.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCell]
  }
  
  @scala.inline
  implicit class NxCellOps[Self <: NxCell] (val x: Self) extends AnyVal {
    
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
    def setQAttrDims(value: NxAttributeDimValues): Self = this.set("qAttrDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExps(value: NxAttributeExpressionValues): Self = this.set("qAttrExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQElemNumber(value: Double): Self = this.set("qElemNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFrequency(value: String): Self = this.set("qFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQHighlightRanges(value: NxHighlightRanges): Self = this.set("qHighlightRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsEmpty(value: Boolean): Self = this.set("qIsEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsNull(value: Boolean): Self = this.set("qIsNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsOtherCell(value: Boolean): Self = this.set("qIsOtherCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsTotalCell(value: Boolean): Self = this.set("qIsTotalCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNum(value: Double): Self = this.set("qNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQState(value: L | S | O | D | A | X | XS | XL): Self = this.set("qState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
  }
}
