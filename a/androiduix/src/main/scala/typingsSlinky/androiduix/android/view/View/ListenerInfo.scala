package typingsSlinky.androiduix.android.view.View

import typingsSlinky.androiduix.java_.lang.util.concurrent.CopyOnWriteArrayList
import typingsSlinky.androiduix.java_.util.ArrayList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerInfo extends js.Object {
  var mOnAttachStateChangeListeners: CopyOnWriteArrayList[OnAttachStateChangeListener] = js.native
  var mOnClickListener: OnClickListener = js.native
  var mOnFocusChangeListener: OnFocusChangeListener = js.native
  var mOnGenericMotionListener: OnGenericMotionListener = js.native
  var mOnKeyListener: OnKeyListener = js.native
  var mOnLayoutChangeListeners: ArrayList[OnLayoutChangeListener] = js.native
  var mOnLongClickListener: OnLongClickListener = js.native
  var mOnTouchListener: OnTouchListener = js.native
}

object ListenerInfo {
  @scala.inline
  def apply(
    mOnAttachStateChangeListeners: CopyOnWriteArrayList[OnAttachStateChangeListener],
    mOnClickListener: OnClickListener,
    mOnFocusChangeListener: OnFocusChangeListener,
    mOnGenericMotionListener: OnGenericMotionListener,
    mOnKeyListener: OnKeyListener,
    mOnLayoutChangeListeners: ArrayList[OnLayoutChangeListener],
    mOnLongClickListener: OnLongClickListener,
    mOnTouchListener: OnTouchListener
  ): ListenerInfo = {
    val __obj = js.Dynamic.literal(mOnAttachStateChangeListeners = mOnAttachStateChangeListeners.asInstanceOf[js.Any], mOnClickListener = mOnClickListener.asInstanceOf[js.Any], mOnFocusChangeListener = mOnFocusChangeListener.asInstanceOf[js.Any], mOnGenericMotionListener = mOnGenericMotionListener.asInstanceOf[js.Any], mOnKeyListener = mOnKeyListener.asInstanceOf[js.Any], mOnLayoutChangeListeners = mOnLayoutChangeListeners.asInstanceOf[js.Any], mOnLongClickListener = mOnLongClickListener.asInstanceOf[js.Any], mOnTouchListener = mOnTouchListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerInfo]
  }
  @scala.inline
  implicit class ListenerInfoOps[Self <: ListenerInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMOnAttachStateChangeListeners(value: CopyOnWriteArrayList[OnAttachStateChangeListener]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnAttachStateChangeListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnClickListener(value: OnClickListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnClickListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnFocusChangeListener(value: OnFocusChangeListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnFocusChangeListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnGenericMotionListener(value: OnGenericMotionListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnGenericMotionListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnKeyListener(value: OnKeyListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnKeyListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnLayoutChangeListeners(value: ArrayList[OnLayoutChangeListener]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnLayoutChangeListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnLongClickListener(value: OnLongClickListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnLongClickListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnTouchListener(value: OnTouchListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnTouchListener")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

