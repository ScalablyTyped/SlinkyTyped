package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a collection of filter conditions (filter fields).
  * @see SheetFilterDescriptor
  */
@js.native
trait XSheetFilterDescriptor extends XInterface {
  
  /** returns the collection of filter fields. */
  var FilterFields: SafeArray[TableFilterField] = js.native
  
  /** returns the collection of filter fields. */
  def getFilterFields(): SafeArray[TableFilterField] = js.native
  
  /** sets a new collection of filter fields. */
  def setFilterFields(aFilterFields: SeqEquiv[TableFilterField]): Unit = js.native
}
object XSheetFilterDescriptor {
  
  @scala.inline
  def apply(
    FilterFields: SafeArray[TableFilterField],
    acquire: () => Unit,
    getFilterFields: () => SafeArray[TableFilterField],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFilterFields: SeqEquiv[TableFilterField] => Unit
  ): XSheetFilterDescriptor = {
    val __obj = js.Dynamic.literal(FilterFields = FilterFields.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFilterFields = js.Any.fromFunction0(getFilterFields), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFilterFields = js.Any.fromFunction1(setFilterFields))
    __obj.asInstanceOf[XSheetFilterDescriptor]
  }
  
  @scala.inline
  implicit class XSheetFilterDescriptorMutableBuilder[Self <: XSheetFilterDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterFields(value: SafeArray[TableFilterField]): Self = StObject.set(x, "FilterFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFilterFields(value: () => SafeArray[TableFilterField]): Self = StObject.set(x, "getFilterFields", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFilterFields(value: SeqEquiv[TableFilterField] => Unit): Self = StObject.set(x, "setFilterFields", js.Any.fromFunction1(value))
  }
}
