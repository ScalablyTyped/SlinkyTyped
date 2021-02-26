package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a consolidation descriptor.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.ConsolidationDescriptor
  */
@js.native
trait XConsolidationDescriptor extends XInterface {
  
  /** returns the function by which the ranges are consolidated. */
  var Function: GeneralFunction = js.native
  
  /** returns, whether links to the original data are inserted in the output area or not. */
  var InsertLinks: Boolean = js.native
  
  /** returns the cell ranges which are consolidated. */
  var Sources: SafeArray[CellRangeAddress] = js.native
  
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  var StartOutputPosition: CellAddress = js.native
  
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  var UseColumnHeaders: Boolean = js.native
  
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  var UseRowHeaders: Boolean = js.native
  
  /** returns the function by which the ranges are consolidated. */
  def getFunction(): GeneralFunction = js.native
  
  /** returns, whether links to the original data are inserted in the output area or not. */
  def getInsertLinks(): Boolean = js.native
  
  /** returns the cell ranges which are consolidated. */
  def getSources(): SafeArray[CellRangeAddress] = js.native
  
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  def getStartOutputPosition(): CellAddress = js.native
  
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  def getUseColumnHeaders(): Boolean = js.native
  
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  def getUseRowHeaders(): Boolean = js.native
  
  /** sets the function by which the ranges are consolidated. */
  def setFunction(nFunction: GeneralFunction): Unit = js.native
  
  /** specifies if links to the original data are inserted in the output area. */
  def setInsertLinks(bInsertLinks: Boolean): Unit = js.native
  
  /** sets the cell ranges which are consolidated. */
  def setSources(aSources: SeqEquiv[CellRangeAddress]): Unit = js.native
  
  /** sets the position of the top left cell of the cell range where the consolidated data are copied. */
  def setStartOutputPosition(aStartOutputPosition: CellAddress): Unit = js.native
  
  /** specifies if column headers from the cell ranges are used to find matching data. */
  def setUseColumnHeaders(bUseColumnHeaders: Boolean): Unit = js.native
  
  /** specifies if row headers from the cell ranges are used to find matching data. */
  def setUseRowHeaders(bUseRowHeaders: Boolean): Unit = js.native
}
object XConsolidationDescriptor {
  
  @scala.inline
  def apply(
    Function: GeneralFunction,
    InsertLinks: Boolean,
    Sources: SafeArray[CellRangeAddress],
    StartOutputPosition: CellAddress,
    UseColumnHeaders: Boolean,
    UseRowHeaders: Boolean,
    acquire: () => Unit,
    getFunction: () => GeneralFunction,
    getInsertLinks: () => Boolean,
    getSources: () => SafeArray[CellRangeAddress],
    getStartOutputPosition: () => CellAddress,
    getUseColumnHeaders: () => Boolean,
    getUseRowHeaders: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFunction: GeneralFunction => Unit,
    setInsertLinks: Boolean => Unit,
    setSources: SeqEquiv[CellRangeAddress] => Unit,
    setStartOutputPosition: CellAddress => Unit,
    setUseColumnHeaders: Boolean => Unit,
    setUseRowHeaders: Boolean => Unit
  ): XConsolidationDescriptor = {
    val __obj = js.Dynamic.literal(Function = Function.asInstanceOf[js.Any], InsertLinks = InsertLinks.asInstanceOf[js.Any], Sources = Sources.asInstanceOf[js.Any], StartOutputPosition = StartOutputPosition.asInstanceOf[js.Any], UseColumnHeaders = UseColumnHeaders.asInstanceOf[js.Any], UseRowHeaders = UseRowHeaders.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFunction = js.Any.fromFunction0(getFunction), getInsertLinks = js.Any.fromFunction0(getInsertLinks), getSources = js.Any.fromFunction0(getSources), getStartOutputPosition = js.Any.fromFunction0(getStartOutputPosition), getUseColumnHeaders = js.Any.fromFunction0(getUseColumnHeaders), getUseRowHeaders = js.Any.fromFunction0(getUseRowHeaders), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFunction = js.Any.fromFunction1(setFunction), setInsertLinks = js.Any.fromFunction1(setInsertLinks), setSources = js.Any.fromFunction1(setSources), setStartOutputPosition = js.Any.fromFunction1(setStartOutputPosition), setUseColumnHeaders = js.Any.fromFunction1(setUseColumnHeaders), setUseRowHeaders = js.Any.fromFunction1(setUseRowHeaders))
    __obj.asInstanceOf[XConsolidationDescriptor]
  }
  
  @scala.inline
  implicit class XConsolidationDescriptorMutableBuilder[Self <: XConsolidationDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunction(value: GeneralFunction): Self = StObject.set(x, "Function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFunction(value: () => GeneralFunction): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInsertLinks(value: () => Boolean): Self = StObject.set(x, "getInsertLinks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSources(value: () => SafeArray[CellRangeAddress]): Self = StObject.set(x, "getSources", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStartOutputPosition(value: () => CellAddress): Self = StObject.set(x, "getStartOutputPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseColumnHeaders(value: () => Boolean): Self = StObject.set(x, "getUseColumnHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUseRowHeaders(value: () => Boolean): Self = StObject.set(x, "getUseRowHeaders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertLinks(value: Boolean): Self = StObject.set(x, "InsertLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFunction(value: GeneralFunction => Unit): Self = StObject.set(x, "setFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetInsertLinks(value: Boolean => Unit): Self = StObject.set(x, "setInsertLinks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSources(value: SeqEquiv[CellRangeAddress] => Unit): Self = StObject.set(x, "setSources", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStartOutputPosition(value: CellAddress => Unit): Self = StObject.set(x, "setStartOutputPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseColumnHeaders(value: Boolean => Unit): Self = StObject.set(x, "setUseColumnHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUseRowHeaders(value: Boolean => Unit): Self = StObject.set(x, "setUseRowHeaders", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSources(value: SafeArray[CellRangeAddress]): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOutputPosition(value: CellAddress): Self = StObject.set(x, "StartOutputPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseColumnHeaders(value: Boolean): Self = StObject.set(x, "UseColumnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRowHeaders(value: Boolean): Self = StObject.set(x, "UseRowHeaders", value.asInstanceOf[js.Any])
  }
}
