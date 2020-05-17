package typingsSlinky.androiduix.global.android.text

import typingsSlinky.androiduix.android.text.Layout.Alignment
import typingsSlinky.androiduix.android.text.TextDirectionHeuristic
import typingsSlinky.androiduix.android.text.TextUtils.TruncateAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.StaticLayout")
@js.native
class StaticLayout protected ()
  extends typingsSlinky.androiduix.android.text.StaticLayout {
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean
  ) = this()
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt
  ) = this()
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ) = this()
  def this(
    source: String,
    bufstart: Double,
    bufend: Double,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double,
    maxLines: Double
  ) = this()
}

/* static members */
@JSGlobal("android.text.StaticLayout")
@js.native
object StaticLayout extends js.Object {
  var CHAR_FIRST_CJK: js.Any = js.native
  var CHAR_FIRST_HIGH_SURROGATE: js.Any = js.native
  var CHAR_HYPHEN: js.Any = js.native
  var CHAR_LAST_LOW_SURROGATE: js.Any = js.native
  var CHAR_NEW_LINE: js.Any = js.native
  var CHAR_SLASH: js.Any = js.native
  var CHAR_SPACE: js.Any = js.native
  var CHAR_TAB: js.Any = js.native
  var CHAR_ZWSP: js.Any = js.native
  var COLUMNS_ELLIPSIZE: js.Any = js.native
  var COLUMNS_NORMAL: js.Any = js.native
  var DESCENT: js.Any = js.native
  var DIR: js.Any = js.native
  var DIR_SHIFT: js.Any = js.native
  var ELLIPSIS_COUNT: js.Any = js.native
  var ELLIPSIS_START: js.Any = js.native
  var EXTRA_ROUNDING: js.Any = js.native
  var START: js.Any = js.native
  var START_MASK: js.Any = js.native
  var TAB: js.Any = js.native
  var TAB_MASK: js.Any = js.native
  var TAG: String = js.native
  var TOP: js.Any = js.native
  /* private */ def isIdeographic(c: js.Any, includeNonStarters: js.Any): js.Any = js.native
}

