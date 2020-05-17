package typingsSlinky.androiduix.global.android.graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.Paint")
@js.native
class Paint ()
  extends typingsSlinky.androiduix.android.graphics.Paint {
  def this(flag: Double) = this()
}

/* static members */
@JSGlobal("android.graphics.Paint")
@js.native
object Paint extends js.Object {
  @js.native
  class FontMetrics ()
    extends typingsSlinky.androiduix.android.graphics.Paint.FontMetrics
  
  @js.native
  class FontMetricsInt ()
    extends typingsSlinky.androiduix.android.graphics.Paint.FontMetricsInt
  
  var ANTI_ALIAS_FLAG: Double = js.native
  var AUTO_HINTING_TEXT_FLAG: Double = js.native
  var CURSOR_AFTER: Double = js.native
  var CURSOR_AT: Double = js.native
  var CURSOR_AT_OR_AFTER: Double = js.native
  var CURSOR_AT_OR_BEFORE: Double = js.native
  var CURSOR_BEFORE: Double = js.native
  var CURSOR_OPT_MAX_VALUE: js.Any = js.native
  var DEFAULT_PAINT_FLAGS: Double = js.native
  var DEV_KERN_TEXT_FLAG: Double = js.native
  var DIRECTION_LTR: Double = js.native
  var DIRECTION_RTL: Double = js.native
  var DITHER_FLAG: Double = js.native
  var EMBEDDED_BITMAP_TEXT_FLAG: Double = js.native
  var FAKE_BOLD_TEXT_FLAG: Double = js.native
  var FILTER_BITMAP_FLAG: Double = js.native
  var FontMetrics_Size_Ascent: js.Any = js.native
  var FontMetrics_Size_Bottom: js.Any = js.native
  var FontMetrics_Size_Descent: js.Any = js.native
  var FontMetrics_Size_Leading: js.Any = js.native
  var FontMetrics_Size_Top: js.Any = js.native
  var LCD_RENDER_TEXT_FLAG: Double = js.native
  var LINEAR_TEXT_FLAG: Double = js.native
  var STRIKE_THRU_TEXT_FLAG: Double = js.native
  var SUBPIXEL_TEXT_FLAG: Double = js.native
  var UNDERLINE_TEXT_FLAG: Double = js.native
  var VERTICAL_TEXT_FLAG: Double = js.native
  @js.native
  object Align extends js.Object {
    /* 1 */ val CENTER: typingsSlinky.androiduix.android.graphics.Paint.Align.CENTER with Double = js.native
    /* 0 */ val LEFT: typingsSlinky.androiduix.android.graphics.Paint.Align.LEFT with Double = js.native
    /* 2 */ val RIGHT: typingsSlinky.androiduix.android.graphics.Paint.Align.RIGHT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.androiduix.android.graphics.Paint.Align with Double] = js.native
  }
  
  @js.native
  object Cap extends js.Object {
    /* 0 */ val BUTT: typingsSlinky.androiduix.android.graphics.Paint.Cap.BUTT with Double = js.native
    /* 1 */ val ROUND: typingsSlinky.androiduix.android.graphics.Paint.Cap.ROUND with Double = js.native
    /* 2 */ val SQUARE: typingsSlinky.androiduix.android.graphics.Paint.Cap.SQUARE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.androiduix.android.graphics.Paint.Cap with Double] = js.native
  }
  
  @js.native
  object Join extends js.Object {
    /* 2 */ val BEVEL: typingsSlinky.androiduix.android.graphics.Paint.Join.BEVEL with Double = js.native
    /* 0 */ val MITER: typingsSlinky.androiduix.android.graphics.Paint.Join.MITER with Double = js.native
    /* 1 */ val ROUND: typingsSlinky.androiduix.android.graphics.Paint.Join.ROUND with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.androiduix.android.graphics.Paint.Join with Double] = js.native
  }
  
  @js.native
  object Style extends js.Object {
    /* 0 */ val FILL: typingsSlinky.androiduix.android.graphics.Paint.Style.FILL with Double = js.native
    /* 2 */ val FILL_AND_STROKE: typingsSlinky.androiduix.android.graphics.Paint.Style.FILL_AND_STROKE with Double = js.native
    /* 1 */ val STROKE: typingsSlinky.androiduix.android.graphics.Paint.Style.STROKE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.androiduix.android.graphics.Paint.Style with Double] = js.native
  }
  
}

