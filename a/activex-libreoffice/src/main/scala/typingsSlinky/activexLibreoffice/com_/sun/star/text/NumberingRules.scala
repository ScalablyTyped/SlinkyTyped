package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexReplace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the numbering rules.
  *
  * Numbering rules may be set at a {@link Paragraph} object. The numbering rules are levels of property values. Each level contains equal properties.
  */
@js.native
trait NumberingRules
  extends XIndexReplace
     with XPropertySet {
  
  /** id of default list for the numbering rules instance */
  var DefaultListId: String = js.native
  
  /** determines if the margins are absolute or relative to the preceding numbering level. */
  var IsAbsoluteMargins: Boolean = js.native
  
  /** determines if the numbering rules are automatically created as opposed to numbering rules that are part of a numbering style. */
  var IsAutomatic: Boolean = js.native
  
  /** determines if the numbering levels are counted continuously or if each numbering level is counted separately. */
  var IsContinuousNumbering: Boolean = js.native
  
  /** contains the name of the numbering rules. It is used to identify a certain numbering rules property */
  var Name: String = js.native
  
  /** This numbering is used in the outline of the document (e.g. headings). */
  var NumberingIsOutline: Boolean = js.native
  
  /** the type of numbering (Arabic, characters, roman numbers, etc.). */
  var NumberingType: Double = js.native
}
object NumberingRules {
  
  @scala.inline
  def apply(
    Count: Double,
    DefaultListId: String,
    ElementType: `type`,
    IsAbsoluteMargins: Boolean,
    IsAutomatic: Boolean,
    IsContinuousNumbering: Boolean,
    Name: String,
    NumberingIsOutline: Boolean,
    NumberingType: Double,
    PropertySetInfo: XPropertySetInfo,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    replaceByIndex: (Double, js.Any) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): NumberingRules = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DefaultListId = DefaultListId.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], IsAbsoluteMargins = IsAbsoluteMargins.asInstanceOf[js.Any], IsAutomatic = IsAutomatic.asInstanceOf[js.Any], IsContinuousNumbering = IsContinuousNumbering.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingIsOutline = NumberingIsOutline.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), replaceByIndex = js.Any.fromFunction2(replaceByIndex), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[NumberingRules]
  }
  
  @scala.inline
  implicit class NumberingRulesOps[Self <: NumberingRules] (val x: Self) extends AnyVal {
    
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
    def setDefaultListId(value: String): Self = this.set("DefaultListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAbsoluteMargins(value: Boolean): Self = this.set("IsAbsoluteMargins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutomatic(value: Boolean): Self = this.set("IsAutomatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsContinuousNumbering(value: Boolean): Self = this.set("IsContinuousNumbering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingIsOutline(value: Boolean): Self = this.set("NumberingIsOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingType(value: Double): Self = this.set("NumberingType", value.asInstanceOf[js.Any])
  }
}
