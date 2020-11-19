package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents an extended property set for printer properties.
  *
  * All properties are vetoable properties. If you change the properties between {@link com.sun.star.awt.XPrinter.startPage()} and {@link
  * com.sun.star.awt.XPrinter.endPage()} , a {@link com.sun.star.beans.PropertyVetoException} is thrown.
  * @see XPrinter
  * @see XInfoPrinter
  */
@js.native
trait XPrinterPropertySet extends XPropertySet {
  
  /** returns a binary encoded version of the printer setup. */
  var BinarySetup: SafeArray[Double] = js.native
  
  /** returns descriptions of all available printer forms. */
  val FormDescriptions: SafeArray[String] = js.native
  
  /** returns a binary encoded version of the printer setup. */
  def getBinarySetup(): SafeArray[Double] = js.native
  
  /** returns descriptions of all available printer forms. */
  def getFormDescriptions(): SafeArray[String] = js.native
  
  /**
    * sets the form that should be used.
    *
    * Indirectly a printer is selected.
    */
  def selectForm(aFormDescription: String): Unit = js.native
  
  /**
    * sets the data specific to the printer driver.
    *
    * Get this data from the info printer and set the data to the printer.
    */
  def setBinarySetup(data: SeqEquiv[Double]): Unit = js.native
  
  /** sets the orientation. */
  def setHorizontal(bHorizontal: Boolean): Unit = js.native
}
object XPrinterPropertySet {
  
  @scala.inline
  def apply(
    BinarySetup: SafeArray[Double],
    FormDescriptions: SafeArray[String],
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getBinarySetup: () => SafeArray[Double],
    getFormDescriptions: () => SafeArray[String],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    selectForm: String => Unit,
    setBinarySetup: SeqEquiv[Double] => Unit,
    setHorizontal: Boolean => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): XPrinterPropertySet = {
    val __obj = js.Dynamic.literal(BinarySetup = BinarySetup.asInstanceOf[js.Any], FormDescriptions = FormDescriptions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getBinarySetup = js.Any.fromFunction0(getBinarySetup), getFormDescriptions = js.Any.fromFunction0(getFormDescriptions), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), selectForm = js.Any.fromFunction1(selectForm), setBinarySetup = js.Any.fromFunction1(setBinarySetup), setHorizontal = js.Any.fromFunction1(setHorizontal), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[XPrinterPropertySet]
  }
  
  @scala.inline
  implicit class XPrinterPropertySetOps[Self <: XPrinterPropertySet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBinarySetup(value: SafeArray[Double]): Self = this.set("BinarySetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormDescriptions(value: SafeArray[String]): Self = this.set("FormDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetBinarySetup(value: () => SafeArray[Double]): Self = this.set("getBinarySetup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFormDescriptions(value: () => SafeArray[String]): Self = this.set("getFormDescriptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelectForm(value: String => Unit): Self = this.set("selectForm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetBinarySetup(value: SeqEquiv[Double] => Unit): Self = this.set("setBinarySetup", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHorizontal(value: Boolean => Unit): Self = this.set("setHorizontal", js.Any.fromFunction1(value))
  }
}
