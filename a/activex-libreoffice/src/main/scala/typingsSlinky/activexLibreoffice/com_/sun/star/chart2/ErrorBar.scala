package typingsSlinky.activexLibreoffice.com_.sun.star.chart2

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.XDataSink
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.XDataSource
import typingsSlinky.activexLibreoffice.com_.sun.star.chart2.data.XLabeledDataSequence
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineCap
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineDash
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineJoint
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorBar
  extends XDataSink
     with LineProperties
     with XDataSource {
  
  /** @see com.sun.star.chart.ErrorBarStyle */
  var ErrorBarStyle: Double = js.native
  
  var NegativeError: Double = js.native
  
  var PositiveError: Double = js.native
  
  var ShowNegativeError: Boolean = js.native
  
  var ShowPositiveError: Boolean = js.native
  
  /** The weight for the standard deviation. */
  var Weight: Double = js.native
}
object ErrorBar {
  
  @scala.inline
  def apply(
    DataSequences: SafeArray[XLabeledDataSequence],
    ErrorBarStyle: Double,
    LineCap: LineCap,
    LineColor: Color,
    LineDash: LineDash,
    LineDashName: String,
    LineEnd: PolyPolygonBezierCoords,
    LineEndCenter: Boolean,
    LineEndName: String,
    LineEndWidth: Double,
    LineJoint: LineJoint,
    LineStart: PolyPolygonBezierCoords,
    LineStartCenter: Boolean,
    LineStartName: String,
    LineStartWidth: Double,
    LineStyle: LineStyle,
    LineTransparence: Double,
    LineWidth: Double,
    NegativeError: Double,
    PositiveError: Double,
    ShowNegativeError: Boolean,
    ShowPositiveError: Boolean,
    Weight: Double,
    acquire: () => Unit,
    getDataSequences: () => SafeArray[XLabeledDataSequence],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setData: SeqEquiv[XLabeledDataSequence] => Unit
  ): ErrorBar = {
    val __obj = js.Dynamic.literal(DataSequences = DataSequences.asInstanceOf[js.Any], ErrorBarStyle = ErrorBarStyle.asInstanceOf[js.Any], LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], NegativeError = NegativeError.asInstanceOf[js.Any], PositiveError = PositiveError.asInstanceOf[js.Any], ShowNegativeError = ShowNegativeError.asInstanceOf[js.Any], ShowPositiveError = ShowPositiveError.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDataSequences = js.Any.fromFunction0(getDataSequences), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[ErrorBar]
  }
  
  @scala.inline
  implicit class ErrorBarOps[Self <: ErrorBar] (val x: Self) extends AnyVal {
    
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
    def setErrorBarStyle(value: Double): Self = this.set("ErrorBarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeError(value: Double): Self = this.set("NegativeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveError(value: Double): Self = this.set("PositiveError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNegativeError(value: Boolean): Self = this.set("ShowNegativeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPositiveError(value: Boolean): Self = this.set("ShowPositiveError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("Weight", value.asInstanceOf[js.Any])
  }
}
