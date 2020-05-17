package typingsSlinky.activexLibreoffice.com_.sun.star.inspection

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.Optional
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the interface for an {@link XPropertyControl} which supports displaying and entering numerical values.
  * @since OOo 2.0.3
  */
@js.native
trait XNumericControl extends XPropertyControl {
  /** describes the number of decimal digits to use for the value */
  var DecimalDigits: Double = js.native
  /**
    * describes a {@link com.sun.star.util.MeasureUnit} to be applied for displaying values.
    *
    * Only a certain set of {@link com.sun.star.util.MeasureUnit} values is supported. In particular, every value which denotes a fraction of another unit
    * (like 100th millimeters) cannot be used as DisplayUnit.
    * @throws com::sun::star::lang::IllegalArgumentException if the caller attempts to set an unsupported {@link com.sun.star.util.MeasureUnit}
    */
  var DisplayUnit: Double = js.native
  /** describes the maximum value which is allowed to be entered in the control */
  var MaxValue: Optional[Double] = js.native
  /** describes the minimum value which is allowed to be entered in the control */
  var MinValue: Optional[Double] = js.native
  /**
    * describes a {@link com.sun.star.util.MeasureUnit} to be applied for transferring values.
    *
    * The core measurement unit for a property value might differ from the unit which is used by the control to display it. For instance, your property
    * value might require that your values denote 100th millimeters, but to the user, you want to present the value as, say, inches. In this case, a numeric
    * control can automatically handle the value conversion for you, if you give it a ValueUnit different from the DisplayUnit.
    * @see XPropertyControl.Value
    */
  var ValueUnit: Double = js.native
}

object XNumericControl {
  @scala.inline
  def apply(
    ControlContext: XPropertyControlContext,
    ControlType: Double,
    ControlWindow: XWindow,
    DecimalDigits: Double,
    DisplayUnit: Double,
    MaxValue: Optional[Double],
    MinValue: Optional[Double],
    Value: js.Any,
    ValueType: `type`,
    ValueUnit: Double,
    isModified: () => Boolean,
    notifyModifiedValue: () => Unit
  ): XNumericControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext.asInstanceOf[js.Any], ControlType = ControlType.asInstanceOf[js.Any], ControlWindow = ControlWindow.asInstanceOf[js.Any], DecimalDigits = DecimalDigits.asInstanceOf[js.Any], DisplayUnit = DisplayUnit.asInstanceOf[js.Any], MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], ValueUnit = ValueUnit.asInstanceOf[js.Any], isModified = js.Any.fromFunction0(isModified), notifyModifiedValue = js.Any.fromFunction0(notifyModifiedValue))
    __obj.asInstanceOf[XNumericControl]
  }
  @scala.inline
  implicit class XNumericControlOps[Self <: XNumericControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimalDigits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DecimalDigits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxValue(value: Optional[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinValue(value: Optional[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueUnit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValueUnit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

