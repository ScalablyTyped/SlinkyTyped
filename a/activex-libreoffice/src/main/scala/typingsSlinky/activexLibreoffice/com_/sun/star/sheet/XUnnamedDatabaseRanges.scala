package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functions to manage the sheet local databases
  * @since LibreOffice 3.5
  */
@js.native
trait XUnnamedDatabaseRanges extends XInterface {
  
  def getByTable(nTab: Double): js.Any = js.native
  
  def hasByTable(nTab: Double): Boolean = js.native
  
  def setByTable(aRange: CellRangeAddress): Unit = js.native
}
object XUnnamedDatabaseRanges {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getByTable: Double => js.Any,
    hasByTable: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setByTable: CellRangeAddress => Unit
  ): XUnnamedDatabaseRanges = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getByTable = js.Any.fromFunction1(getByTable), hasByTable = js.Any.fromFunction1(hasByTable), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setByTable = js.Any.fromFunction1(setByTable))
    __obj.asInstanceOf[XUnnamedDatabaseRanges]
  }
  
  @scala.inline
  implicit class XUnnamedDatabaseRangesMutableBuilder[Self <: XUnnamedDatabaseRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetByTable(value: Double => js.Any): Self = StObject.set(x, "getByTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasByTable(value: Double => Boolean): Self = StObject.set(x, "hasByTable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetByTable(value: CellRangeAddress => Unit): Self = StObject.set(x, "setByTable", js.Any.fromFunction1(value))
  }
}
