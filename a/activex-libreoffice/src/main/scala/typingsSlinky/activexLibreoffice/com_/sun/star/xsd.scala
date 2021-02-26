package typingsSlinky.activexLibreoffice.com_.sun.star

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`10`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`11`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`12`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`13`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`14`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`15`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`16`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`17`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`18`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`19`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`8`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`9`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xsd {
  
  /** specifies an [XSD compliant boolean type]{@link url="http://www.w3.org/TR/xmlschema-2/#boolean"} */
  type Boolean = XDataType
  
  object DataTypeClass {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`17`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`16`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`9`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`13`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`14`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`12`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`11`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`10`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`15`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`19`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`18`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`8`
    */
    trait Constants extends StObject
    object Constants {
      
      @scala.inline
      def BOOLEAN: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def DATE: `9` = 9.asInstanceOf[`9`]
      
      @scala.inline
      def DATETIME: `7` = 7.asInstanceOf[`7`]
      
      @scala.inline
      def DECIMAL: `3` = 3.asInstanceOf[`3`]
      
      @scala.inline
      def DOUBLE: `5` = 5.asInstanceOf[`5`]
      
      @scala.inline
      def DURATION: `6` = 6.asInstanceOf[`6`]
      
      @scala.inline
      def FLOAT: `4` = 4.asInstanceOf[`4`]
      
      @scala.inline
      def NOTATION: `19` = 19.asInstanceOf[`19`]
      
      @scala.inline
      def QName: `18` = 18.asInstanceOf[`18`]
      
      @scala.inline
      def STRING: `1` = 1.asInstanceOf[`1`]
      
      @scala.inline
      def TIME: `8` = 8.asInstanceOf[`8`]
      
      @scala.inline
      def anyURI: `17` = 17.asInstanceOf[`17`]
      
      @scala.inline
      def base64Binary: `16` = 16.asInstanceOf[`16`]
      
      @scala.inline
      def gDay: `13` = 13.asInstanceOf[`13`]
      
      @scala.inline
      def gMonth: `14` = 14.asInstanceOf[`14`]
      
      @scala.inline
      def gMonthDay: `12` = 12.asInstanceOf[`12`]
      
      @scala.inline
      def gYear: `11` = 11.asInstanceOf[`11`]
      
      @scala.inline
      def gYearMonth: `10` = 10.asInstanceOf[`10`]
      
      @scala.inline
      def hexBinary: `15` = 15.asInstanceOf[`15`]
    }
  }
  
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
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxExclusiveDate(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date): Self = StObject.set(x, "MaxExclusiveDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInclusiveDate(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date): Self = StObject.set(x, "MaxInclusiveDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExclusiveDate(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date): Self = StObject.set(x, "MinExclusiveDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinInclusiveDate(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Date): Self = StObject.set(x, "MinInclusiveDate", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant dateTime type]{@link url="http://www.w3.org/TR/xmlschema-2/#dateTime"} */
  @js.native
  trait DateTime extends XDataType {
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveDateTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime = js.native
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveDateTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime = js.native
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveDateTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime = js.native
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveDateTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime = js.native
  }
  object DateTime {
    
    @scala.inline
    def apply(
      IsBasic: scala.Boolean,
      MaxExclusiveDateTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime,
      MaxInclusiveDateTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime,
      MinExclusiveDateTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime,
      MinInclusiveDateTime: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime,
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
    ): DateTime = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveDateTime = MaxExclusiveDateTime.asInstanceOf[js.Any], MaxInclusiveDateTime = MaxInclusiveDateTime.asInstanceOf[js.Any], MinExclusiveDateTime = MinExclusiveDateTime.asInstanceOf[js.Any], MinInclusiveDateTime = MinInclusiveDateTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[DateTime]
    }
    
    @scala.inline
    implicit class DateTimeMutableBuilder[Self <: DateTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxExclusiveDateTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "MaxExclusiveDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInclusiveDateTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "MaxInclusiveDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExclusiveDateTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "MinExclusiveDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinInclusiveDateTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "MinInclusiveDateTime", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant gDay type]{@link url="http://www.w3.org/TR/xmlschema-2/#gDay"} */
  @js.native
  trait Day extends XDataType {
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveInt: Double = js.native
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveInt: Double = js.native
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveInt: Double = js.native
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveInt: Double = js.native
  }
  object Day {
    
    @scala.inline
    def apply(
      IsBasic: scala.Boolean,
      MaxExclusiveInt: Double,
      MaxInclusiveInt: Double,
      MinExclusiveInt: Double,
      MinInclusiveInt: Double,
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
    ): Day = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveInt = MaxExclusiveInt.asInstanceOf[js.Any], MaxInclusiveInt = MaxInclusiveInt.asInstanceOf[js.Any], MinExclusiveInt = MinExclusiveInt.asInstanceOf[js.Any], MinInclusiveInt = MinInclusiveInt.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Day]
    }
    
    @scala.inline
    implicit class DayMutableBuilder[Self <: Day] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxExclusiveInt(value: Double): Self = StObject.set(x, "MaxExclusiveInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInclusiveInt(value: Double): Self = StObject.set(x, "MaxInclusiveInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExclusiveInt(value: Double): Self = StObject.set(x, "MinExclusiveInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinInclusiveInt(value: Double): Self = StObject.set(x, "MinInclusiveInt", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant decimal type]{@link url="http://www.w3.org/TR/xmlschema-2/#decimal"} */
  @js.native
  trait Decimal extends XDataType {
    
    /**
      * fractionDigits is the maximum number of digits in the fractional part of values of decimal data
      *
      * The value of fractionDigits must be a non negative integer.
      *
      * See [http://www.w3.org/TR/xmlschema-2/#rf-fractionDigits]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-fractionDigits"}
      */
    var FractionDigits: Double = js.native
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveDouble: Double = js.native
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveDouble: Double = js.native
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveDouble: Double = js.native
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveDouble: Double = js.native
    
    /**
      * totalDigits is the maximum number of digits in values of decimal data types.
      *
      * The value of totalDigits must be a positive integer.
      *
      * See [http://www.w3.org/TR/xmlschema-2/#rf-totalDigits]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-totalDigits"}
      */
    var TotalDigits: Double = js.native
  }
  object Decimal {
    
    @scala.inline
    def apply(
      FractionDigits: Double,
      IsBasic: scala.Boolean,
      MaxExclusiveDouble: Double,
      MaxInclusiveDouble: Double,
      MinExclusiveDouble: Double,
      MinInclusiveDouble: Double,
      Name: java.lang.String,
      Pattern: java.lang.String,
      PropertySetInfo: XPropertySetInfo,
      TotalDigits: Double,
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
    ): Decimal = {
      val __obj = js.Dynamic.literal(FractionDigits = FractionDigits.asInstanceOf[js.Any], IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveDouble = MaxExclusiveDouble.asInstanceOf[js.Any], MaxInclusiveDouble = MaxInclusiveDouble.asInstanceOf[js.Any], MinExclusiveDouble = MinExclusiveDouble.asInstanceOf[js.Any], MinInclusiveDouble = MinInclusiveDouble.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TotalDigits = TotalDigits.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Decimal]
    }
    
    @scala.inline
    implicit class DecimalMutableBuilder[Self <: Decimal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFractionDigits(value: Double): Self = StObject.set(x, "FractionDigits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxExclusiveDouble(value: Double): Self = StObject.set(x, "MaxExclusiveDouble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInclusiveDouble(value: Double): Self = StObject.set(x, "MaxInclusiveDouble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExclusiveDouble(value: Double): Self = StObject.set(x, "MinExclusiveDouble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinInclusiveDouble(value: Double): Self = StObject.set(x, "MinInclusiveDouble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalDigits(value: Double): Self = StObject.set(x, "TotalDigits", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant gMonth type]{@link url="http://www.w3.org/TR/xmlschema-2/#gMonth"} */
  @js.native
  trait Month extends XDataType {
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveInt: Double = js.native
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveInt: Double = js.native
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveInt: Double = js.native
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveInt: Double = js.native
  }
  object Month {
    
    @scala.inline
    def apply(
      IsBasic: scala.Boolean,
      MaxExclusiveInt: Double,
      MaxInclusiveInt: Double,
      MinExclusiveInt: Double,
      MinInclusiveInt: Double,
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
    ): Month = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveInt = MaxExclusiveInt.asInstanceOf[js.Any], MaxInclusiveInt = MaxInclusiveInt.asInstanceOf[js.Any], MinExclusiveInt = MinExclusiveInt.asInstanceOf[js.Any], MinInclusiveInt = MinInclusiveInt.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Month]
    }
    
    @scala.inline
    implicit class MonthMutableBuilder[Self <: Month] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxExclusiveInt(value: Double): Self = StObject.set(x, "MaxExclusiveInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInclusiveInt(value: Double): Self = StObject.set(x, "MaxInclusiveInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExclusiveInt(value: Double): Self = StObject.set(x, "MinExclusiveInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinInclusiveInt(value: Double): Self = StObject.set(x, "MinInclusiveInt", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant string type]{@link url="http://www.w3.org/TR/xmlschema-2/#string"} */
  @js.native
  trait String extends XDataType {
    
    /**
      * specifies the length of the string
      *
      * Note that you cannot specify {@link Length} together with {@link MinLength} or {@link MaxLength} .
      */
    var Length: Double = js.native
    
    /**
      * specifies the maximum length of the string
      *
      * Note that you cannot specify {@link MaxLength} together with {@link Length} .
      */
    var MaxLength: Double = js.native
    
    /**
      * specifies the minimum length of the string
      *
      * Note that you cannot specify {@link MinLength} together with {@link Length} .
      */
    var MinLength: Double = js.native
  }
  object String {
    
    @scala.inline
    def apply(
      IsBasic: scala.Boolean,
      Length: Double,
      MaxLength: Double,
      MinLength: Double,
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
    ): String = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], MinLength = MinLength.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[String]
    }
    
    @scala.inline
    implicit class StringMutableBuilder[Self <: String] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "MinLength", value.asInstanceOf[js.Any])
    }
  }
  
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
    implicit class TimeMutableBuilder[Self <: Time] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxExclusiveTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time): Self = StObject.set(x, "MaxExclusiveTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInclusiveTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time): Self = StObject.set(x, "MaxInclusiveTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExclusiveTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time): Self = StObject.set(x, "MinExclusiveTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinInclusiveTime(value: typingsSlinky.activexLibreoffice.com_.sun.star.util.Time): Self = StObject.set(x, "MinInclusiveTime", value.asInstanceOf[js.Any])
    }
  }
  
  object WhiteSpaceTreatment {
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
      - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
    */
    trait Constants extends StObject
    object Constants {
      
      @scala.inline
      def Collapse: `2` = 2.asInstanceOf[`2`]
      
      @scala.inline
      def Preserve: `0` = 0.asInstanceOf[`0`]
      
      @scala.inline
      def Replace: `1` = 1.asInstanceOf[`1`]
    }
  }
  
  /** specifies an [XSD compliant simple data type]{@link url="http://www.w3.org/TR/xmlschema-2/#built-in-datatypes"} */
  @js.native
  trait XDataType extends XPropertySet {
    
    /**
      * specifies whether the type is a basic type
      *
      * Basic types are built into the type system, and cannot be changed by the user.
      */
    var IsBasic: scala.Boolean = js.native
    
    /** provides access to the name of the type */
    var Name: java.lang.String = js.native
    
    /**
      * specifies the pattern which strings conforming to this type comply to
      *
      * See [http://www.w3.org/TR/xmlschema-2/#rf-pattern]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-pattern"}
      */
    var Pattern: java.lang.String = js.native
    
    /**
      * class of the type
      * @see DataTypeClass
      */
    var TypeClass: Double = js.native
    
    /**
      * specifies how strings of this data type are to be processed, with respect to white spaces
      *
      * See [http://www.w3.org/TR/xmlschema-2/#rf-whiteSpace]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-whiteSpace"}
      */
    var WhiteSpaceTreatment: Double = js.native
    
    def explainInvalid(value: java.lang.String): java.lang.String = js.native
    
    def validate(value: java.lang.String): scala.Boolean = js.native
  }
  object XDataType {
    
    @scala.inline
    def apply(
      IsBasic: scala.Boolean,
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
    ): XDataType = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[XDataType]
    }
    
    @scala.inline
    implicit class XDataTypeMutableBuilder[Self <: XDataType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExplainInvalid(value: java.lang.String => java.lang.String): Self = StObject.set(x, "explainInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsBasic(value: scala.Boolean): Self = StObject.set(x, "IsBasic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPattern(value: java.lang.String): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeClass(value: Double): Self = StObject.set(x, "TypeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: java.lang.String => scala.Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWhiteSpaceTreatment(value: Double): Self = StObject.set(x, "WhiteSpaceTreatment", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant gYear type]{@link url="http://www.w3.org/TR/xmlschema-2/#gYear"} */
  @js.native
  trait Year extends XDataType {
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveInt: Double = js.native
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveInt: Double = js.native
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveInt: Double = js.native
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveInt: Double = js.native
  }
  object Year {
    
    @scala.inline
    def apply(
      IsBasic: scala.Boolean,
      MaxExclusiveInt: Double,
      MaxInclusiveInt: Double,
      MinExclusiveInt: Double,
      MinInclusiveInt: Double,
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
    ): Year = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveInt = MaxExclusiveInt.asInstanceOf[js.Any], MaxInclusiveInt = MaxInclusiveInt.asInstanceOf[js.Any], MinExclusiveInt = MinExclusiveInt.asInstanceOf[js.Any], MinInclusiveInt = MinInclusiveInt.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Year]
    }
    
    @scala.inline
    implicit class YearMutableBuilder[Self <: Year] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxExclusiveInt(value: Double): Self = StObject.set(x, "MaxExclusiveInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxInclusiveInt(value: Double): Self = StObject.set(x, "MaxInclusiveInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinExclusiveInt(value: Double): Self = StObject.set(x, "MinExclusiveInt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinInclusiveInt(value: Double): Self = StObject.set(x, "MinInclusiveInt", value.asInstanceOf[js.Any])
    }
  }
}
