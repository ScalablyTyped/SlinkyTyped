package typingsSlinky.androiduix.global.android.text

import typingsSlinky.androiduix.android.text.BoringLayout.Metrics
import typingsSlinky.androiduix.android.text.Layout.Alignment
import typingsSlinky.androiduix.android.text.TextDirectionHeuristic
import typingsSlinky.androiduix.android.text.TextUtils.TruncateAt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.BoringLayout")
@js.native
class BoringLayout protected ()
  extends typingsSlinky.androiduix.android.text.BoringLayout {
  def this(
    source: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean
  ) = this()
  def this(
    source: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt
  ) = this()
  def this(
    source: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: js.UndefOr[scala.Nothing],
    ellipsizedWidth: Double
  ) = this()
  def this(
    source: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ) = this()
}
object BoringLayout {
  
  @JSGlobal("android.text.BoringLayout")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.text.BoringLayout.FIRST_RIGHT_TO_LEFT")
  @js.native
  def FIRST_RIGHT_TO_LEFT: js.Any = js.native
  @scala.inline
  def FIRST_RIGHT_TO_LEFT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIRST_RIGHT_TO_LEFT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.text.BoringLayout.Metrics")
  @js.native
  class Metrics ()
    extends typingsSlinky.androiduix.android.text.BoringLayout.Metrics
  
  /* static member */
  @JSGlobal("android.text.BoringLayout.isBoring")
  @js.native
  def isBoring(text: String, paint: typingsSlinky.androiduix.android.text.TextPaint): typingsSlinky.androiduix.android.text.BoringLayout.Metrics = js.native
  @JSGlobal("android.text.BoringLayout.isBoring")
  @js.native
  def isBoring(
    text: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    textDir: js.UndefOr[scala.Nothing],
    metrics: typingsSlinky.androiduix.android.text.BoringLayout.Metrics
  ): typingsSlinky.androiduix.android.text.BoringLayout.Metrics = js.native
  @JSGlobal("android.text.BoringLayout.isBoring")
  @js.native
  def isBoring(
    text: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    textDir: TextDirectionHeuristic
  ): typingsSlinky.androiduix.android.text.BoringLayout.Metrics = js.native
  @JSGlobal("android.text.BoringLayout.isBoring")
  @js.native
  def isBoring(
    text: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    textDir: TextDirectionHeuristic,
    metrics: typingsSlinky.androiduix.android.text.BoringLayout.Metrics
  ): typingsSlinky.androiduix.android.text.BoringLayout.Metrics = js.native
  
  /* static member */
  @JSGlobal("android.text.BoringLayout.make")
  @js.native
  def make(
    source: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: typingsSlinky.androiduix.android.text.BoringLayout.Metrics,
    includepad: Boolean
  ): typingsSlinky.androiduix.android.text.BoringLayout = js.native
  @JSGlobal("android.text.BoringLayout.make")
  @js.native
  def make(
    source: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: typingsSlinky.androiduix.android.text.BoringLayout.Metrics,
    includepad: Boolean,
    ellipsize: js.UndefOr[scala.Nothing],
    ellipsizedWidth: Double
  ): typingsSlinky.androiduix.android.text.BoringLayout = js.native
  @JSGlobal("android.text.BoringLayout.make")
  @js.native
  def make(
    source: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: typingsSlinky.androiduix.android.text.BoringLayout.Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt
  ): typingsSlinky.androiduix.android.text.BoringLayout = js.native
  @JSGlobal("android.text.BoringLayout.make")
  @js.native
  def make(
    source: String,
    paint: typingsSlinky.androiduix.android.text.TextPaint,
    outerwidth: Double,
    align: Alignment,
    spacingmult: Double,
    spacingadd: Double,
    metrics: typingsSlinky.androiduix.android.text.BoringLayout.Metrics,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ): typingsSlinky.androiduix.android.text.BoringLayout = js.native
  
  /* static member */
  @JSGlobal("android.text.BoringLayout.sTemp")
  @js.native
  def sTemp: js.Any = js.native
  @scala.inline
  def sTemp_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sTemp")(x.asInstanceOf[js.Any])
}
