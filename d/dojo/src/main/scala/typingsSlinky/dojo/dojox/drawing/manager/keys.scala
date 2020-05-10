package typingsSlinky.dojo.dojox.drawing.manager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/manager/keys.html
  *
  * A singleton, master object that detects
  * keyboard keys and events
  * Connect to it like:
  *
  * dojo.connect(this.keys, "onEnter", ....);
  *
  */
@js.native
trait keys extends js.Object {
  /**
    * Indicates whether the Alt or Option key is currently pressed
    *
    */
  var alt: Boolean = js.native
  /**
    * The amount, in pixels, a selected Stencil will
    * move on an arrow key event
    *
    */
  var arrowIncrement: Double = js.native
  /**
    * The amount, in pixels, a selected Stencil will
    * move on an arrow key + SHIFT event
    *
    */
  var arrowShiftIncrement: Double = js.native
  /**
    * Indicates whether the Apple Command key is currently pressed
    *
    */
  var cmmd: Boolean = js.native
  /**
    * Indicates whether the Control key is currently pressed
    *
    */
  var ctrl: Boolean = js.native
  /**
    *
    */
  var listeners: js.Array[_] = js.native
  /**
    * Indicates whether any 'meta' key is currently pressed:
    * shift || ctrl || cmd || alt
    *
    */
  var meta: Boolean = js.native
  /**
    * Indicates whether the Shift key is currently pressed
    *
    */
  var shift: Boolean = js.native
  /**
    * Relinquishes control of events to another portion
    * of Drawing; namely the TextBlock.
    *
    * @param _isedit
    */
  def editMode(_isedit: js.Any): Unit = js.native
  /**
    * Enables or disables key events, to relinquish
    * control to something outside of Drawing; input
    * fields for example.
    * You may need to call this directly if you are
    * using textareas or contenteditables.
    * NOTE: See scanForFields
    *
    * @param _enabled
    */
  def enable(_enabled: js.Any): Unit = js.native
  /**
    * Initialize the keys object
    *
    */
  def init(): Unit = js.native
  /**
    * Register an object and callback to be notified
    * of events.
    * NOTE: Not really used in code, but should work.
    * See manager.mouse for similar usage
    *
    * @param options
    */
  def register(options: js.Any): Unit = js.native
  /**
    * Scans the document for inputs
    * and calls this automatically. However you may need
    * to call this if you create inputs after the fact.
    *
    */
  def scanForFields(): Unit = js.native
}

object keys {
  @scala.inline
  def apply(
    alt: Boolean,
    arrowIncrement: Double,
    arrowShiftIncrement: Double,
    cmmd: Boolean,
    ctrl: Boolean,
    editMode: js.Any => Unit,
    enable: js.Any => Unit,
    init: () => Unit,
    listeners: js.Array[_],
    meta: Boolean,
    register: js.Any => Unit,
    scanForFields: () => Unit,
    shift: Boolean
  ): keys = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], arrowIncrement = arrowIncrement.asInstanceOf[js.Any], arrowShiftIncrement = arrowShiftIncrement.asInstanceOf[js.Any], cmmd = cmmd.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], editMode = js.Any.fromFunction1(editMode), enable = js.Any.fromFunction1(enable), init = js.Any.fromFunction0(init), listeners = listeners.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], register = js.Any.fromFunction1(register), scanForFields = js.Any.fromFunction0(scanForFields), shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[keys]
  }
  @scala.inline
  implicit class keysOps[Self <: keys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArrowShiftIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowShiftIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmmd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditMode(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnable(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withListeners(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeta(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegister(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("register")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScanForFields(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanForFields")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShift(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

