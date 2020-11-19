package typingsSlinky.androiduix.global.android.text

import typingsSlinky.androiduix.android.graphics.Paint.FontMetricsInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.text.TextLine")
@js.native
class TextLine ()
  extends typingsSlinky.androiduix.android.text.TextLine
/* static members */
@JSGlobal("android.text.TextLine")
@js.native
object TextLine extends js.Object {
  
  var DEBUG: js.Any = js.native
  
  var TAB_INCREMENT: js.Any = js.native
  
  /* private */ def expandMetricsFromPaint(fmi: js.Any, wp: js.Any): js.Any = js.native
  
  def obtain(): typingsSlinky.androiduix.android.text.TextLine = js.native
  
  def recycle(tl: typingsSlinky.androiduix.android.text.TextLine): typingsSlinky.androiduix.android.text.TextLine = js.native
  
  var sCached: js.Any = js.native
  
  def updateMetrics(
    fmi: FontMetricsInt,
    previousTop: Double,
    previousAscent: Double,
    previousDescent: Double,
    previousBottom: Double,
    previousLeading: Double
  ): Unit = js.native
}
