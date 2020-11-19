package typingsSlinky.androiduix.android.text.style

import typingsSlinky.androiduix.android.graphics.Paint.FontMetricsInt
import typingsSlinky.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineHeightSpan extends ParagraphStyle {
  
  def chooseHeight(text: String, start: Double, end: Double, spanstartv: Double, v: Double, fm: FontMetricsInt): Unit = js.native
}
@JSGlobal("android.text.style.LineHeightSpan")
@js.native
object LineHeightSpan extends js.Object {
  
  @js.native
  trait WithDensity extends LineHeightSpan {
    
    def chooseHeight(
      text: String,
      start: Double,
      end: Double,
      spanstartv: Double,
      v: Double,
      fm: FontMetricsInt,
      paint: TextPaint
    ): Unit = js.native
  }
}
