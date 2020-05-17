package typingsSlinky.activexLibreoffice.com_.sun.star.xsd

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an [XSD compliant date type]{@link url="http://www.w3.org/TR/xmlschema-2/#date"} */
@js.native
trait Date extends XDataType {
  /**
    * specifies the exclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
    */
  var MaxExclusiveDate: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date = js.native
  /**
    * specifies the inclusive upper bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
    */
  var MaxInclusiveDate: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date = js.native
  /**
    * specifies the exclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
    */
  var MinExclusiveDate: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date = js.native
  /**
    * specifies the inclusive lower bound for the value
    * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
    */
  var MinInclusiveDate: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date = js.native
}

object Date {
  @scala.inline
  def apply(
    IsBasic: scala.Boolean,
    MaxExclusiveDate: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date,
    MaxInclusiveDate: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date,
    MinExclusiveDate: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date,
    MinInclusiveDate: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date,
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
  ): Date = {
    val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveDate = MaxExclusiveDate.asInstanceOf[js.Any], MaxInclusiveDate = MaxInclusiveDate.asInstanceOf[js.Any], MinExclusiveDate = MinExclusiveDate.asInstanceOf[js.Any], MinInclusiveDate = MinInclusiveDate.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Date]
  }
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxExclusiveDate(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxExclusiveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxInclusiveDate(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxInclusiveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinExclusiveDate(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinExclusiveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinInclusiveDate(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinInclusiveDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

