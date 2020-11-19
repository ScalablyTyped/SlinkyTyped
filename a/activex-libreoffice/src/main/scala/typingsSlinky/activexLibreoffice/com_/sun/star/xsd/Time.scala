package typingsSlinky.activexLibreoffice.com_.sun.star.xsd

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies an [XSD compliant time type]{@link url="http://www.w3.org/TR/xmlschema-2/#time"} */
@js.native
trait Time extends XDataType {
  
  /**
    * specifies the exclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
    */
  var MaxExclusiveTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time = js.native
  
  /**
    * specifies the inclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
    */
  var MaxInclusiveTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time = js.native
  
  /**
    * specifies the exclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
    */
  var MinExclusiveTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time = js.native
  
  /**
    * specifies the inclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
    */
  var MinInclusiveTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time = js.native
}
object Time {
  
  @scala.inline
  def apply(
    IsBasic: scala.Boolean,
    MaxExclusiveTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time,
    MaxInclusiveTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time,
    MinExclusiveTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time,
    MinInclusiveTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time,
    Name: java.lang.String,
    Pattern: java.lang.String,
    PropertySetInfo: XPropertySetInfo,
    TypeClass: Double,
    WhiteSpaceTreatment: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Unit,
    explainInvalid: java.lang.String => java.lang.String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Unit,
    setPropertyValue: (java.lang.String, js.Any) => Unit,
    validate: java.lang.String => scala.Boolean
  ): Time = {
    val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveTime = MaxExclusiveTime.asInstanceOf[js.Any], MaxInclusiveTime = MaxInclusiveTime.asInstanceOf[js.Any], MinExclusiveTime = MinExclusiveTime.asInstanceOf[js.Any], MinInclusiveTime = MinInclusiveTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Time]
  }
  
  @scala.inline
  implicit class TimeOps[Self <: Time] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxExclusiveTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time): Self = this.set("MaxExclusiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInclusiveTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time): Self = this.set("MaxInclusiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinExclusiveTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time): Self = this.set("MinExclusiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinInclusiveTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time): Self = this.set("MinInclusiveTime", value.asInstanceOf[js.Any])
  }
}
