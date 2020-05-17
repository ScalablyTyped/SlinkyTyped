package typingsSlinky.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Measure extends js.Object {
  /**
    * Get the text property associated to the raw value property holding theformatted value related to
    * this measure
    * @returns The DataJS object representing the property holding the         formatted value text of
    * this measure or null if this measure         does not have a unit
    */
  def getFormattedValueProperty(): js.Any = js.native
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         measure
    */
  def getLabelText(): String = js.native
  /**
    * Get the name of the measure
    * @returns The name of the measure, which is identical to the name         of the measure raw value
    * property in the entity type
    */
  def getName(): String = js.native
  /**
    * Get the raw value property
    * @returns The DataJS object representing the property holding the         raw value of this measure
    */
  def getRawValueProperty(): js.Any = js.native
  /**
    * Get the unit property related to this measure
    * @returns The DataJS object representing the unit property or         null if this measure does not
    * have a unit
    */
  def getUnitProperty(): js.Any = js.native
  /**
    * Get indicator whether or not the measure is updatable
    * @returns True iff the measure is updatable
    */
  def isUpdatable(): Boolean = js.native
}

object Measure {
  @scala.inline
  def apply(
    getFormattedValueProperty: () => js.Any,
    getLabelText: () => String,
    getName: () => String,
    getRawValueProperty: () => js.Any,
    getUnitProperty: () => js.Any,
    isUpdatable: () => Boolean
  ): Measure = {
    val __obj = js.Dynamic.literal(getFormattedValueProperty = js.Any.fromFunction0(getFormattedValueProperty), getLabelText = js.Any.fromFunction0(getLabelText), getName = js.Any.fromFunction0(getName), getRawValueProperty = js.Any.fromFunction0(getRawValueProperty), getUnitProperty = js.Any.fromFunction0(getUnitProperty), isUpdatable = js.Any.fromFunction0(isUpdatable))
    __obj.asInstanceOf[Measure]
  }
  @scala.inline
  implicit class MeasureOps[Self <: Measure] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetFormattedValueProperty(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFormattedValueProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLabelText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelText")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRawValueProperty(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawValueProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetUnitProperty(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUnitProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsUpdatable(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUpdatable")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

