package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to search and replace properties. */
@js.native
trait XPropertyReplace extends XReplaceDescriptor {
  
  /** @returns the attribute values which are used to replace the found occurrences. */
  var ReplaceAttributes: SafeArray[PropertyValue] = js.native
  
  /** @returns the attributes to search for. */
  var SearchAttributes: SafeArray[PropertyValue] = js.native
  
  /** provides the information if specific property values are searched, or just the existence of the specified properties. */
  var ValueSearch: Boolean = js.native
  
  /** @returns the attribute values which are used to replace the found occurrences. */
  def getReplaceAttributes(): SafeArray[PropertyValue] = js.native
  
  /** @returns the attributes to search for. */
  def getSearchAttributes(): SafeArray[PropertyValue] = js.native
  
  /** provides the information if specific property values are searched, or just the existence of the specified properties. */
  def getValueSearch(): Boolean = js.native
  
  /** sets the properties to replace the found occurrences. */
  def setReplaceAttributes(aSearchAttribs: SeqEquiv[PropertyValue]): Unit = js.native
  
  /** sets the properties to search for. */
  def setSearchAttributes(aSearchAttribs: SeqEquiv[PropertyValue]): Unit = js.native
  
  /** specifies if specific property values are searched, or just the existence of the specified properties. */
  def setValueSearch(bValueSearch: Boolean): Unit = js.native
}
object XPropertyReplace {
  
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    ReplaceAttributes: SafeArray[PropertyValue],
    ReplaceString: String,
    SearchAttributes: SafeArray[PropertyValue],
    SearchString: String,
    ValueSearch: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getReplaceAttributes: () => SafeArray[PropertyValue],
    getReplaceString: () => String,
    getSearchAttributes: () => SafeArray[PropertyValue],
    getSearchString: () => String,
    getValueSearch: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setReplaceAttributes: SeqEquiv[PropertyValue] => Unit,
    setReplaceString: String => Unit,
    setSearchAttributes: SeqEquiv[PropertyValue] => Unit,
    setSearchString: String => Unit,
    setValueSearch: Boolean => Unit
  ): XPropertyReplace = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReplaceAttributes = ReplaceAttributes.asInstanceOf[js.Any], ReplaceString = ReplaceString.asInstanceOf[js.Any], SearchAttributes = SearchAttributes.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], ValueSearch = ValueSearch.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReplaceAttributes = js.Any.fromFunction0(getReplaceAttributes), getReplaceString = js.Any.fromFunction0(getReplaceString), getSearchAttributes = js.Any.fromFunction0(getSearchAttributes), getSearchString = js.Any.fromFunction0(getSearchString), getValueSearch = js.Any.fromFunction0(getValueSearch), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setReplaceAttributes = js.Any.fromFunction1(setReplaceAttributes), setReplaceString = js.Any.fromFunction1(setReplaceString), setSearchAttributes = js.Any.fromFunction1(setSearchAttributes), setSearchString = js.Any.fromFunction1(setSearchString), setValueSearch = js.Any.fromFunction1(setValueSearch))
    __obj.asInstanceOf[XPropertyReplace]
  }
  
  @scala.inline
  implicit class XPropertyReplaceMutableBuilder[Self <: XPropertyReplace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetReplaceAttributes(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getReplaceAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSearchAttributes(value: () => SafeArray[PropertyValue]): Self = StObject.set(x, "getSearchAttributes", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValueSearch(value: () => Boolean): Self = StObject.set(x, "getValueSearch", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceAttributes(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ReplaceAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchAttributes(value: SafeArray[PropertyValue]): Self = StObject.set(x, "SearchAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetReplaceAttributes(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "setReplaceAttributes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSearchAttributes(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "setSearchAttributes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueSearch(value: Boolean => Unit): Self = StObject.set(x, "setValueSearch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValueSearch(value: Boolean): Self = StObject.set(x, "ValueSearch", value.asInstanceOf[js.Any])
  }
}
