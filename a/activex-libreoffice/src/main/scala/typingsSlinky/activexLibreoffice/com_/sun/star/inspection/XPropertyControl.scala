package typingsSlinky.activexLibreoffice.com_.sun.star.inspection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the interface for a single control in an {@link ObjectInspector}
  * @since OOo 2.0.3
  */
@js.native
trait XPropertyControl extends js.Object {
  /**
    * specifies the context of the control within the {@link ObjectInspector} .
    *
    * The property control should actively notify its state changes to the context. In particular, changes in the focus and the value of the control must be
    * notified.
    */
  var ControlContext: XPropertyControlContext = js.native
  /** denotes the type of the control, as one of the {@link PropertyControlType} constants */
  var ControlType: Double = js.native
  /**
    * denotes the window which is the real UI representation of the property control.
    *
    * The {@link ObjectInspector} will automatically position and size this control as needed, care for its Z-order, and so on.
    *
    * This Window must not be `NULL` , else the whole control is not usable.
    */
  var ControlWindow: XWindow = js.native
  /**
    * denotes the current content of the control.
    *
    * At every point in time, this value is either `VOID` , or of the type described by {@link ValueType} .
    * @throws com::sun::star::beans::IllegalTypeException if an attempt is made to set a value which is not `VOID` and whose type does not equal {@link ValueType} .
    */
  var Value: js.Any = js.native
  /**
    * denotes the value type of the control.
    * @see Value
    */
  var ValueType: `type` = js.native
  /**
    * determines whether the control content is currently modified
    *
    * An {@link XPropertyControl} internally manages a flag indicating whether its content is modified. This flag is reset to `FALSE` every time our {@link
    * ControlContext} is notified of our current value. Also, the control implementation must set this flag to `TRUE` if and only if the user changed the
    * control content.
    * @see notifyModifiedValue
    * @see ControlContext
    * @see XPropertyControlContext.valueChanged
    */
  def isModified(): Boolean = js.native
  /**
    * notifies the context in which the control lives of the current control value, if this value is currently modified
    * @see isModified
    * @see ControlContext
    * @see XPropertyControlListener.valueChanged
    */
  def notifyModifiedValue(): Unit = js.native
}

object XPropertyControl {
  @scala.inline
  def apply(
    ControlContext: XPropertyControlContext,
    ControlType: Double,
    ControlWindow: XWindow,
    Value: js.Any,
    ValueType: `type`,
    isModified: () => Boolean,
    notifyModifiedValue: () => Unit
  ): XPropertyControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext.asInstanceOf[js.Any], ControlType = ControlType.asInstanceOf[js.Any], ControlWindow = ControlWindow.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], isModified = js.Any.fromFunction0(isModified), notifyModifiedValue = js.Any.fromFunction0(notifyModifiedValue))
    __obj.asInstanceOf[XPropertyControl]
  }
  @scala.inline
  implicit class XPropertyControlOps[Self <: XPropertyControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withControlContext(value: XPropertyControlContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControlWindow(value: XWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ControlWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueType(value: `type`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsModified(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isModified")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotifyModifiedValue(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyModifiedValue")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

