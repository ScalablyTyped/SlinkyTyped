package typingsSlinky.androiduix.android.widget.ListPopupWindow

import typingsSlinky.androiduix.android.view.MotionEvent
import typingsSlinky.androiduix.android.widget.ListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropDownListView extends ListView {
  var mDrawsInPressedState: js.Any = js.native
  var mHijackFocus: js.Any = js.native
  var mListSelectionHidden: js.Any = js.native
  /* private */ def clearPressedItem(): js.Any = js.native
  /* private */ def clickPressedItem(child: js.Any, position: js.Any): js.Any = js.native
  def onForwardedEvent(event: MotionEvent, activePointerId: Double): Boolean = js.native
  /* private */ def setPressedItem(child: js.Any, position: js.Any): js.Any = js.native
}

