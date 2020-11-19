package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XRefreshable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a linked cell range.
  *
  * A linked cell range is a range which is linked to an equal-sized range in an external document. The contents of the external range is copied into the
  * range of this document.
  * @see com.sun.star.sheet.CellAreaLinks
  */
@js.native
trait CellAreaLink
  extends XAreaLink
     with XRefreshable
     with XPropertySet {
  
  /** specifies the name of the filter used to load the source document. */
  var Filter: String = js.native
  
  /** specifies the filter options needed to load the source document. */
  var FilterOptions: String = js.native
  
  /**
    * specifies the delay time between two refresh actions in seconds.
    * @deprecated Deprecated
    */
  var RefreshDelay: Double = js.native
  
  /**
    * specifies the time between two refresh actions in seconds.
    * @since OOo 2.0
    */
  var RefreshPeriod: Double = js.native
  
  /** specifies the URL of the source document. */
  var Url: String = js.native
}
object CellAreaLink {
  
  @scala.inline
  def apply(
    DestArea: CellRangeAddress,
    Filter: String,
    FilterOptions: String,
    PropertySetInfo: XPropertySetInfo,
    RefreshDelay: Double,
    RefreshPeriod: Double,
    SourceArea: String,
    Url: String,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addRefreshListener: XRefreshListener => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getDestArea: () => CellRangeAddress,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getSourceArea: () => String,
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeRefreshListener: XRefreshListener => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setDestArea: CellRangeAddress => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setSourceArea: String => Unit
  ): CellAreaLink = {
    val __obj = js.Dynamic.literal(DestArea = DestArea.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FilterOptions = FilterOptions.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RefreshDelay = RefreshDelay.asInstanceOf[js.Any], RefreshPeriod = RefreshPeriod.asInstanceOf[js.Any], SourceArea = SourceArea.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addRefreshListener = js.Any.fromFunction1(addRefreshListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getDestArea = js.Any.fromFunction0(getDestArea), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSourceArea = js.Any.fromFunction0(getSourceArea), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setDestArea = js.Any.fromFunction1(setDestArea), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setSourceArea = js.Any.fromFunction1(setSourceArea))
    __obj.asInstanceOf[CellAreaLink]
  }
  
  @scala.inline
  implicit class CellAreaLinkOps[Self <: CellAreaLink] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: String): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOptions(value: String): Self = this.set("FilterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshDelay(value: Double): Self = this.set("RefreshDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshPeriod(value: Double): Self = this.set("RefreshPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
  }
}
