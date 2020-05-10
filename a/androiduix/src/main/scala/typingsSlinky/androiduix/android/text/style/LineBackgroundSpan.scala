package typingsSlinky.androiduix.android.text.style

import typingsSlinky.androiduix.android.graphics.Canvas
import typingsSlinky.androiduix.android.graphics.Paint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineBackgroundSpan extends ParagraphStyle {
  def drawBackground(
    c: Canvas,
    p: Paint,
    left: Double,
    right: Double,
    top: Double,
    baseline: Double,
    bottom: Double,
    text: String,
    start: Double,
    end: Double,
    lnum: Double
  ): Unit = js.native
}

@JSGlobal("android.text.style.LineBackgroundSpan")
@js.native
object LineBackgroundSpan extends js.Object {
  var `type`: js.Symbol = js.native
}

