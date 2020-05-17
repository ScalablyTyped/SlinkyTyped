package typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout

import typingsSlinky.androiduix.android.widget.FrameLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FooterView extends FrameLayout {
  var state: js.Any = js.native
  var stateBeforeReady: js.Any = js.native
  def onStateChange(newState: Double, oldState: Double): Unit = js.native
  /* protected */ def setStateInner(prll: typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout, state: Double): Unit = js.native
}

