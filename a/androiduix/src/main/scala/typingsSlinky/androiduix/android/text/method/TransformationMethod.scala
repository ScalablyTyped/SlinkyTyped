package typingsSlinky.androiduix.android.text.method

import typingsSlinky.androiduix.android.graphics.Rect
import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformationMethod extends js.Object {
  def getTransformation(source: String, view: View): String = js.native
  def onFocusChanged(view: View, sourceText: String, focused: Boolean, direction: Double, previouslyFocusedRect: Rect): Unit = js.native
}

@JSGlobal("android.text.method.TransformationMethod")
@js.native
object TransformationMethod extends js.Object {
  def isImpl(obj: js.Any): Boolean = js.native
}

