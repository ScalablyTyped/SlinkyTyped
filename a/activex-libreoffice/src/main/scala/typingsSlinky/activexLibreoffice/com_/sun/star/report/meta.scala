package typingsSlinky.activexLibreoffice.com_.sun.star.report

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FormulaOpCodeMapEntry
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FormulaToken
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.FunctionArgument
import typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XFormulaOpCodeMapper
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meta {
  
  /** identifies a {@link XFormulaParser} which allows to retrieve the meta data of all supported functions. */
  @js.native
  trait XFormulaParser
    extends XComponent
       with typingsSlinky.activexLibreoffice.com_.sun.star.sheet.XFormulaParser
       with XPropertySet {
    
    /** return the mapper for op codes. */
    var FormulaOpCodeMapper: XFormulaOpCodeMapper = js.native
    
    /**
      * The complete mapping of Names to OpCodes.
      *
      * Names and symbols not defined here lead to a parser/print error.
      */
    var OpCodeMap: SafeArray[FormulaOpCodeMapEntry] = js.native
  }
  object XFormulaParser {
    
    @scala.inline
    def apply(
      FormulaOpCodeMapper: XFormulaOpCodeMapper,
      OpCodeMap: SafeArray[FormulaOpCodeMapEntry],
      PropertySetInfo: XPropertySetInfo,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      dispose: () => Unit,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      parseFormula: (String, CellAddress) => SafeArray[FormulaToken],
      printFormula: (SeqEquiv[FormulaToken], CellAddress) => String,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): XFormulaParser = {
      val __obj = js.Dynamic.literal(FormulaOpCodeMapper = FormulaOpCodeMapper.asInstanceOf[js.Any], OpCodeMap = OpCodeMap.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), dispose = js.Any.fromFunction0(dispose), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), parseFormula = js.Any.fromFunction2(parseFormula), printFormula = js.Any.fromFunction2(printFormula), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[XFormulaParser]
    }
    
    @scala.inline
    implicit class XFormulaParserMutableBuilder[Self <: XFormulaParser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormulaOpCodeMapper(value: XFormulaOpCodeMapper): Self = StObject.set(x, "FormulaOpCodeMapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpCodeMap(value: SafeArray[FormulaOpCodeMapEntry]): Self = StObject.set(x, "OpCodeMap", value.asInstanceOf[js.Any])
    }
  }
  
  /** identifies a {@link XFunctionCategory} which allows to retrieve the meta data of all supported functions. */
  @js.native
  trait XFunctionCategory
    extends XIndexAccess
       with XPropertySet {
    
    /** returns the localized category's name. */
    var Name: String = js.native
    
    /** specifies the category number. */
    var Number: Double = js.native
    
    /**
      * same as getByIndex.
      * @see com.sun.star.container.XIndexAccess
      */
    def getFunction(position: Double): XFunctionDescription = js.native
  }
  object XFunctionCategory {
    
    @scala.inline
    def apply(
      Count: Double,
      ElementType: `type`,
      Name: String,
      Number: Double,
      PropertySetInfo: XPropertySetInfo,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      getByIndex: Double => js.Any,
      getCount: () => Double,
      getElementType: () => `type`,
      getFunction: Double => XFunctionDescription,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      hasElements: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): XFunctionCategory = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFunction = js.Any.fromFunction1(getFunction), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[XFunctionCategory]
    }
    
    @scala.inline
    implicit class XFunctionCategoryMutableBuilder[Self <: XFunctionCategory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetFunction(value: Double => XFunctionDescription): Self = StObject.set(x, "getFunction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    }
  }
  
  /** identifies a {@link XFunctionDescription} which allows to retrieve the meta data of all supported functions. */
  @js.native
  trait XFunctionDescription extends XPropertySet {
    
    /** returns a sequence of localized descriptions of the function's arguments (in the order specified by the function). */
    var Arguments: SafeArray[FunctionArgument] = js.native
    
    /** specifies the category number. */
    var Category: XFunctionCategory = js.native
    
    /** returns a localized description of the function. */
    var Description: String = js.native
    
    /** returns the localized function's name. */
    var Name: String = js.native
    
    /** returns the signature of the function. */
    var Signature: String = js.native
    
    def createFormula(arguments: SeqEquiv[String]): String = js.native
  }
  object XFunctionDescription {
    
    @scala.inline
    def apply(
      Arguments: SafeArray[FunctionArgument],
      Category: XFunctionCategory,
      Description: String,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      Signature: String,
      acquire: () => Unit,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      createFormula: SeqEquiv[String] => String,
      getPropertySetInfo: () => XPropertySetInfo,
      getPropertyValue: String => js.Any,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
      setPropertyValue: (String, js.Any) => Unit
    ): XFunctionDescription = {
      val __obj = js.Dynamic.literal(Arguments = Arguments.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createFormula = js.Any.fromFunction1(createFormula), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
      __obj.asInstanceOf[XFunctionDescription]
    }
    
    @scala.inline
    implicit class XFunctionDescriptionMutableBuilder[Self <: XFunctionDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArguments(value: SafeArray[FunctionArgument]): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategory(value: XFunctionCategory): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFormula(value: SeqEquiv[String] => String): Self = StObject.set(x, "createFormula", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    }
  }
  
  /** identifies a {@link XFunctionManager} which allows to retrieve the meta data of all supported functions. */
  @js.native
  trait XFunctionManager
    extends XIndexAccess
       with XComponent {
    
    /**
      * same as getByIndex.
      * @param position The position.
      * @see com.sun.star.container.XIndexAccess
      */
    def getCategory(position: Double): XFunctionCategory = js.native
    
    /**
      * get the function description by name
      * @param name the name of the function
      */
    def getFunctionByName(name: String): XFunctionDescription = js.native
  }
  object XFunctionManager {
    
    @scala.inline
    def apply(
      Count: Double,
      ElementType: `type`,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      dispose: () => Unit,
      getByIndex: Double => js.Any,
      getCategory: Double => XFunctionCategory,
      getCount: () => Double,
      getElementType: () => `type`,
      getFunctionByName: String => XFunctionDescription,
      hasElements: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit,
      removeEventListener: XEventListener => Unit
    ): XFunctionManager = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getCategory = js.Any.fromFunction1(getCategory), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFunctionByName = js.Any.fromFunction1(getFunctionByName), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
      __obj.asInstanceOf[XFunctionManager]
    }
    
    @scala.inline
    implicit class XFunctionManagerMutableBuilder[Self <: XFunctionManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetCategory(value: Double => XFunctionCategory): Self = StObject.set(x, "getCategory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFunctionByName(value: String => XFunctionDescription): Self = StObject.set(x, "getFunctionByName", js.Any.fromFunction1(value))
    }
  }
}
