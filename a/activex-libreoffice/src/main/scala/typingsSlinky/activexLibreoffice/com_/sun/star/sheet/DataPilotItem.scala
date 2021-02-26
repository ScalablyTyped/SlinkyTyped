package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a single item in a data pilot field. */
@js.native
trait DataPilotItem
  extends XNamed
     with XPropertySet {
  
  /** specifies whether the item is hidden. */
  var IsHidden: Boolean = js.native
  
  /**
    * specifies the item's position in its field if sorting is manual.
    * @since OOo 2.4
    */
  var Position: Double = js.native
  
  /** specifies whether the item is showing detail. */
  var ShowDetail: Boolean = js.native
}
object DataPilotItem {
  
  @scala.inline
  def apply(
    IsHidden: Boolean,
    Name: String,
    Position: Double,
    PropertySetInfo: XPropertySetInfo,
    ShowDetail: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getName: () => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setName: String => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): DataPilotItem = {
    val __obj = js.Dynamic.literal(IsHidden = IsHidden.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ShowDetail = ShowDetail.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getName = js.Any.fromFunction0(getName), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setName = js.Any.fromFunction1(setName), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[DataPilotItem]
  }
  
  @scala.inline
  implicit class DataPilotItemMutableBuilder[Self <: DataPilotItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsHidden(value: Boolean): Self = StObject.set(x, "IsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDetail(value: Boolean): Self = StObject.set(x, "ShowDetail", value.asInstanceOf[js.Any])
  }
}
