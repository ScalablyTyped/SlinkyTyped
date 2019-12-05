package typingsSlinky.androiduix.android.support.v4.widget.DrawerLayout

import typingsSlinky.androiduix.android.support.v4.widget.ViewDragHelper
import typingsSlinky.androiduix.android.support.v4.widget.ViewDragHelper.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.support.v4.widget.DrawerLayout.ViewDragCallback")
@js.native
class ViewDragCallback protected () extends Callback {
  def this(arg: typingsSlinky.androiduix.android.support.v4.widget.DrawerLayout, gravity: Double) = this()
  var _DrawerLayout_this: typingsSlinky.androiduix.android.support.v4.widget.DrawerLayout = js.native
  var mAbsGravity: js.Any = js.native
  var mDragger: js.Any = js.native
  var mPeekRunnable: js.Any = js.native
  /* private */ def closeOtherDrawer(): js.Any = js.native
  /* private */ def peekDrawer(): js.Any = js.native
  def removeCallbacks(): Unit = js.native
  def setDragger(dragger: ViewDragHelper): Unit = js.native
}

