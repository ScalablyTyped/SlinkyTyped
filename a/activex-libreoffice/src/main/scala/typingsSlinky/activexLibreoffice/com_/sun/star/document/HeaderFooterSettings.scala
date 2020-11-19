package typingsSlinky.activexLibreoffice.com_.sun.star.document

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes properties that control the formatting of headers and footers for documents that do not allow individual settings for individual parts like
  * pages or slides.
  */
@js.native
trait HeaderFooterSettings extends XPropertySet {
  
  /** enables or disables the printing of the date in the header or footer */
  var IsPrintDate: Boolean = js.native
  
  /** enables or disables the printing of the page name in the header or footer */
  var IsPrintPageName: Boolean = js.native
  
  /** enables or disables the printing of the current time in the header or footer */
  var IsPrintTime: Boolean = js.native
}
object HeaderFooterSettings {
  
  @scala.inline
  def apply(
    IsPrintDate: Boolean,
    IsPrintPageName: Boolean,
    IsPrintTime: Boolean,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): HeaderFooterSettings = {
    val __obj = js.Dynamic.literal(IsPrintDate = IsPrintDate.asInstanceOf[js.Any], IsPrintPageName = IsPrintPageName.asInstanceOf[js.Any], IsPrintTime = IsPrintTime.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[HeaderFooterSettings]
  }
  
  @scala.inline
  implicit class HeaderFooterSettingsOps[Self <: HeaderFooterSettings] (val x: Self) extends AnyVal {
    
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
    def setIsPrintDate(value: Boolean): Self = this.set("IsPrintDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrintPageName(value: Boolean): Self = this.set("IsPrintPageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrintTime(value: Boolean): Self = this.set("IsPrintTime", value.asInstanceOf[js.Any])
  }
}
