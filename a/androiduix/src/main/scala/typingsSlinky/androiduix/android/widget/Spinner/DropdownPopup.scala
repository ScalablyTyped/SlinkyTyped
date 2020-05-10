package typingsSlinky.androiduix.android.widget.Spinner

import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import typingsSlinky.androiduix.android.widget.ListAdapter
import typingsSlinky.androiduix.android.widget.ListPopupWindow
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Spinner.DropdownPopup")
@js.native
class DropdownPopup protected ()
  extends ListPopupWindow
     with SpinnerPopup {
  def this(
    context: Context,
    defStyleRes: Map[String, String],
    arg: typingsSlinky.androiduix.android.widget.Spinner
  ) = this()
  var _Spinner_this: typingsSlinky.androiduix.android.widget.Spinner = js.native
  var mHintText: js.Any = js.native
  def computeContentWidth(): Unit = js.native
  /* InferMemberOverrides */
  override def dismiss(): Unit = js.native
  /* InferMemberOverrides */
  override def getBackground(): Drawable = js.native
  /* InferMemberOverrides */
  override def getHorizontalOffset(): Double = js.native
  /* InferMemberOverrides */
  override def getVerticalOffset(): Double = js.native
  /* InferMemberOverrides */
  override def isShowing(): Boolean = js.native
  /* InferMemberOverrides */
  override def setAdapter(adapter: ListAdapter): Unit = js.native
  /* InferMemberOverrides */
  override def setBackgroundDrawable(d: Drawable): Unit = js.native
  /* InferMemberOverrides */
  override def setHorizontalOffset(offset: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setVerticalOffset(offset: Double): Unit = js.native
}

