package typingsSlinky.activexLibreoffice.com_.sun.star.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the style settings of the border lines of all cells in a cell range.
  *
  * {@link TableBorder2} is nearly identical to {@link TableBorder} , except that it has members of {@link BorderLine2} instead of {@link BorderLine} .
  *
  * In a queried structure, the flags in TableBorder2::Is...LineValid indicate that not all lines of the boxes have the same values.
  *
  * In a structure which is used for setting, these flags determine if the corresponding line should be set or if the old value should be kept.
  * @since LibreOffice 3.6
  */
@js.native
trait TableBorder2 extends StObject {
  
  /** determines the line style at the bottom edge. */
  var BottomLine: BorderLine2 = js.native
  
  /** contains the distance between the lines and other contents. */
  var Distance: Double = js.native
  
  /** determines the line style of horizontal lines for the inner part of a cell range. */
  var HorizontalLine: BorderLine2 = js.native
  
  /** specifies whether the value of {@link TableBorder2.BottomLine} is used. */
  var IsBottomLineValid: Boolean = js.native
  
  /** specifies whether the value of {@link TableBorder2.Distance} is used. */
  var IsDistanceValid: Boolean = js.native
  
  /** specifies whether the value of {@link TableBorder2.HorizontalLine} is used. */
  var IsHorizontalLineValid: Boolean = js.native
  
  /** specifies whether the value of {@link TableBorder2.LeftLine} is used. */
  var IsLeftLineValid: Boolean = js.native
  
  /** specifies whether the value of {@link TableBorder2.RightLine} is used. */
  var IsRightLineValid: Boolean = js.native
  
  /** specifies whether the value of {@link TableBorder2.TopLine} is used. */
  var IsTopLineValid: Boolean = js.native
  
  /** specifies whether the value of {@link TableBorder2.VerticalLine} is used. */
  var IsVerticalLineValid: Boolean = js.native
  
  /** determines the line style at the left edge. */
  var LeftLine: BorderLine2 = js.native
  
  /** determines the line style at the right edge. */
  var RightLine: BorderLine2 = js.native
  
  /** determines the line style at the top edge. */
  var TopLine: BorderLine2 = js.native
  
  /** determines the line style of vertical lines for the inner part of a cell range. */
  var VerticalLine: BorderLine2 = js.native
}
object TableBorder2 {
  
  @scala.inline
  def apply(
    BottomLine: BorderLine2,
    Distance: Double,
    HorizontalLine: BorderLine2,
    IsBottomLineValid: Boolean,
    IsDistanceValid: Boolean,
    IsHorizontalLineValid: Boolean,
    IsLeftLineValid: Boolean,
    IsRightLineValid: Boolean,
    IsTopLineValid: Boolean,
    IsVerticalLineValid: Boolean,
    LeftLine: BorderLine2,
    RightLine: BorderLine2,
    TopLine: BorderLine2,
    VerticalLine: BorderLine2
  ): TableBorder2 = {
    val __obj = js.Dynamic.literal(BottomLine = BottomLine.asInstanceOf[js.Any], Distance = Distance.asInstanceOf[js.Any], HorizontalLine = HorizontalLine.asInstanceOf[js.Any], IsBottomLineValid = IsBottomLineValid.asInstanceOf[js.Any], IsDistanceValid = IsDistanceValid.asInstanceOf[js.Any], IsHorizontalLineValid = IsHorizontalLineValid.asInstanceOf[js.Any], IsLeftLineValid = IsLeftLineValid.asInstanceOf[js.Any], IsRightLineValid = IsRightLineValid.asInstanceOf[js.Any], IsTopLineValid = IsTopLineValid.asInstanceOf[js.Any], IsVerticalLineValid = IsVerticalLineValid.asInstanceOf[js.Any], LeftLine = LeftLine.asInstanceOf[js.Any], RightLine = RightLine.asInstanceOf[js.Any], TopLine = TopLine.asInstanceOf[js.Any], VerticalLine = VerticalLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableBorder2]
  }
  
  @scala.inline
  implicit class TableBorder2MutableBuilder[Self <: TableBorder2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomLine(value: BorderLine2): Self = StObject.set(x, "BottomLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "Distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalLine(value: BorderLine2): Self = StObject.set(x, "HorizontalLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBottomLineValid(value: Boolean): Self = StObject.set(x, "IsBottomLineValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDistanceValid(value: Boolean): Self = StObject.set(x, "IsDistanceValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHorizontalLineValid(value: Boolean): Self = StObject.set(x, "IsHorizontalLineValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLeftLineValid(value: Boolean): Self = StObject.set(x, "IsLeftLineValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRightLineValid(value: Boolean): Self = StObject.set(x, "IsRightLineValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTopLineValid(value: Boolean): Self = StObject.set(x, "IsTopLineValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVerticalLineValid(value: Boolean): Self = StObject.set(x, "IsVerticalLineValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftLine(value: BorderLine2): Self = StObject.set(x, "LeftLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightLine(value: BorderLine2): Self = StObject.set(x, "RightLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLine(value: BorderLine2): Self = StObject.set(x, "TopLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalLine(value: BorderLine2): Self = StObject.set(x, "VerticalLine", value.asInstanceOf[js.Any])
  }
}
