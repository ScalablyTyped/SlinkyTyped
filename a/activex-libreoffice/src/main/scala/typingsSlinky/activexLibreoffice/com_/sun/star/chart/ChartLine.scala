package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineCap
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineDash
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineJoint
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineProperties
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineStyle
import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.PolyPolygonBezierCoords
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies line elements in a chart (regression lines, etc.). */
@js.native
trait ChartLine
  extends XPropertySet
     with LineProperties
object ChartLine {
  
  @scala.inline
  def apply(
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
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ChartLine = {
    val __obj = js.Dynamic.literal(LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ChartLine]
  }
}
