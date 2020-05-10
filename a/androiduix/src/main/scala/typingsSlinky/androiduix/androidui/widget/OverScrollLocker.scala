package typingsSlinky.androiduix.androidui.widget

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverScrollLocker extends js.Object {
  def getScrollContentBottom(): Double = js.native
  def lockOverScrollBottom(lockBottom: Double): Unit = js.native
  def lockOverScrollTop(lockTop: Double): Unit = js.native
}

@JSGlobal("androidui.widget.OverScrollLocker")
@js.native
object OverScrollLocker extends js.Object {
  def getFrom(view: View): OverScrollLocker = js.native
}

