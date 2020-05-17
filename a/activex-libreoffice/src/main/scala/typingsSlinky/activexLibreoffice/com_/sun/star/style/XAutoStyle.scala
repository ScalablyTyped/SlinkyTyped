package typingsSlinky.activexLibreoffice.com_.sun.star.style

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XMultiPropertyStates
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows access to a single automatic style. */
@js.native
trait XAutoStyle
  extends XMultiPropertySet
     with XMultiPropertyStates {
  /** returns a sequence of all properties that are set in the style */
  val Properties: PropertyValues = js.native
  /** returns a sequence of all properties that are set in the style */
  def getProperties(): PropertyValues = js.native
}

object XAutoStyle {
  @scala.inline
  def apply(
    Properties: PropertyValues,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getProperties: () => PropertyValues,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    setAllPropertiesToDefault: () => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit
  ): XAutoStyle = {
    val __obj = js.Dynamic.literal(Properties = Properties.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getProperties = js.Any.fromFunction0(getProperties), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValues = js.Any.fromFunction1(getPropertyValues), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[XAutoStyle]
  }
  @scala.inline
  implicit class XAutoStyleOps[Self <: XAutoStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProperties(value: PropertyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProperties(value: () => PropertyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProperties")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

