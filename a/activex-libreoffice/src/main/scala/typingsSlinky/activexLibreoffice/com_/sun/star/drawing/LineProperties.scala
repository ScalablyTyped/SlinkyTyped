package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a set of properties to describe the style for rendering a Line.
  *
  * The properties for line ends and line starts are only supported by shapes with open line ends.
  */
@js.native
trait LineProperties extends js.Object {
  /** This property defines the rendering of ends of thick lines */
  var LineCap: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineCap = js.native
  /** This property contains the line color. */
  var LineColor: Color = js.native
  /** This property contains the dash of the line. */
  var LineDash: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineDash = js.native
  /** This property contains the name of the dash of the line. */
  var LineDashName: String = js.native
  /** This property contains the line end in the form of a poly polygon Bezier. */
  var LineEnd: PolyPolygonBezierCoords = js.native
  /** If this property is `TRUE` , the line will end in the center of the polygon. */
  var LineEndCenter: Boolean = js.native
  /**
    * This property contains the name of the line end poly polygon Bezier.
    *
    * If this string is empty, no line end polygon is rendered.
    */
  var LineEndName: String = js.native
  /** This property contains the width of the line end polygon. */
  var LineEndWidth: Double = js.native
  /** This property defines the rendering of joints between thick lines */
  var LineJoint: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineJoint = js.native
  /** This property contains the line start in the form of a poly polygon Bezier. */
  var LineStart: PolyPolygonBezierCoords = js.native
  /** If this property is `TRUE` , the line will start from the center of the polygon. */
  var LineStartCenter: Boolean = js.native
  /**
    * This property contains the name of the line start poly polygon Bezier.
    *
    * If this string is empty, no line start polygon is rendered.
    */
  var LineStartName: String = js.native
  /** This property contains the width of the line start polygon. */
  var LineStartWidth: Double = js.native
  /** This property contains the type of the line. */
  var LineStyle: typingsSlinky.activexLibreoffice.com_.sun.star.drawing.LineStyle = js.native
  /** This property contains the extent of transparency. */
  var LineTransparence: Double = js.native
  /** This property contains the width of the line in 1/100th mm. */
  var LineWidth: Double = js.native
}

object LineProperties {
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
    LineWidth: Double
  ): LineProperties = {
    val __obj = js.Dynamic.literal(LineCap = LineCap.asInstanceOf[js.Any], LineColor = LineColor.asInstanceOf[js.Any], LineDash = LineDash.asInstanceOf[js.Any], LineDashName = LineDashName.asInstanceOf[js.Any], LineEnd = LineEnd.asInstanceOf[js.Any], LineEndCenter = LineEndCenter.asInstanceOf[js.Any], LineEndName = LineEndName.asInstanceOf[js.Any], LineEndWidth = LineEndWidth.asInstanceOf[js.Any], LineJoint = LineJoint.asInstanceOf[js.Any], LineStart = LineStart.asInstanceOf[js.Any], LineStartCenter = LineStartCenter.asInstanceOf[js.Any], LineStartName = LineStartName.asInstanceOf[js.Any], LineStartWidth = LineStartWidth.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineTransparence = LineTransparence.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProperties]
  }
  @scala.inline
  implicit class LinePropertiesOps[Self <: LineProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineCap(value: LineCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineDash(value: LineDash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineDash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineDashName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineDashName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineEnd(value: PolyPolygonBezierCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineEndCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineEndCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineEndName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineEndName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineEndWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineEndWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineJoint(value: LineJoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineJoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStart(value: PolyPolygonBezierCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStartCenter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineStartCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStartName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineStartName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStartWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineStartWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStyle(value: LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineTransparence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineTransparence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

