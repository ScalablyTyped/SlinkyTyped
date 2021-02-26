package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.document.XActionLockable
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsSlinky.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a collection of named ranges in a spreadsheet document.
  *
  * In fact a named range is a named formula expression. A cell range address is one possible content of a named range.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
@js.native
trait NamedRanges
  extends XNamedRanges
     with XIndexAccess
     with XEnumerationAccess
     with XActionLockable
object NamedRanges {
  
  @scala.inline
  def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: () => Unit,
    addActionLock: () => Unit,
    addNewByName: (String, String, CellAddress, Double) => Unit,
    addNewFromTitles: (CellRangeAddress, Border) => Unit,
    createEnumeration: () => XEnumeration,
    getByIndex: Double => js.Any,
    getByName: String => js.Any,
    getCount: () => Double,
    getElementNames: () => SafeArray[String],
    getElementType: () => `type`,
    hasByName: String => Boolean,
    hasElements: () => Boolean,
    isActionLocked: () => Boolean,
    outputList: CellAddress => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActionLock: () => Unit,
    removeByName: String => Unit,
    resetActionLocks: () => Double,
    setActionLocks: Double => Unit
  ): NamedRanges = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addActionLock = js.Any.fromFunction0(addActionLock), addNewByName = js.Any.fromFunction4(addNewByName), addNewFromTitles = js.Any.fromFunction2(addNewFromTitles), createEnumeration = js.Any.fromFunction0(createEnumeration), getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = js.Any.fromFunction0(getCount), getElementNames = js.Any.fromFunction0(getElementNames), getElementType = js.Any.fromFunction0(getElementType), hasByName = js.Any.fromFunction1(hasByName), hasElements = js.Any.fromFunction0(hasElements), isActionLocked = js.Any.fromFunction0(isActionLocked), outputList = js.Any.fromFunction1(outputList), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActionLock = js.Any.fromFunction0(removeActionLock), removeByName = js.Any.fromFunction1(removeByName), resetActionLocks = js.Any.fromFunction0(resetActionLocks), setActionLocks = js.Any.fromFunction1(setActionLocks))
    __obj.asInstanceOf[NamedRanges]
  }
}
