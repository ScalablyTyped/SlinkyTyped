package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes what and how to replace strings. */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.util.XSearchDescriptor because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.util.XReplaceDescriptor because var conflicts: SearchString. Inlined getReplaceString, ReplaceString, setReplaceString */ @js.native
trait ReplaceDescriptor extends SearchDescriptor {
  
  /** @returns the string which replaces the found occurrences. */
  var ReplaceString: String = js.native
  
  /** @returns the string which replaces the found occurrences. */
  def getReplaceString(): String = js.native
  
  /** sets the string which replaces the found occurrences. */
  def setReplaceString(aReplaceString: String): Unit = js.native
}
object ReplaceDescriptor {
  
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    ReplaceString: String,
    SearchBackwards: Boolean,
    SearchCaseSensitive: Boolean,
    SearchRegularExpression: Boolean,
    SearchSimilarity: Boolean,
    SearchSimilarityAdd: Double,
    SearchSimilarityExchange: Double,
    SearchSimilarityRelax: Boolean,
    SearchSimilarityRemove: Double,
    SearchString: String,
    SearchStyles: Boolean,
    SearchWildcard: Boolean,
    SearchWords: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getReplaceString: () => String,
    getSearchString: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setReplaceString: String => Unit,
    setSearchString: String => Unit
  ): ReplaceDescriptor = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReplaceString = ReplaceString.asInstanceOf[js.Any], SearchBackwards = SearchBackwards.asInstanceOf[js.Any], SearchCaseSensitive = SearchCaseSensitive.asInstanceOf[js.Any], SearchRegularExpression = SearchRegularExpression.asInstanceOf[js.Any], SearchSimilarity = SearchSimilarity.asInstanceOf[js.Any], SearchSimilarityAdd = SearchSimilarityAdd.asInstanceOf[js.Any], SearchSimilarityExchange = SearchSimilarityExchange.asInstanceOf[js.Any], SearchSimilarityRelax = SearchSimilarityRelax.asInstanceOf[js.Any], SearchSimilarityRemove = SearchSimilarityRemove.asInstanceOf[js.Any], SearchString = SearchString.asInstanceOf[js.Any], SearchStyles = SearchStyles.asInstanceOf[js.Any], SearchWildcard = SearchWildcard.asInstanceOf[js.Any], SearchWords = SearchWords.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getReplaceString = js.Any.fromFunction0(getReplaceString), getSearchString = js.Any.fromFunction0(getSearchString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setReplaceString = js.Any.fromFunction1(setReplaceString), setSearchString = js.Any.fromFunction1(setSearchString))
    __obj.asInstanceOf[ReplaceDescriptor]
  }
  
  @scala.inline
  implicit class ReplaceDescriptorMutableBuilder[Self <: ReplaceDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetReplaceString(value: () => String): Self = StObject.set(x, "getReplaceString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceString(value: String): Self = StObject.set(x, "ReplaceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetReplaceString(value: String => Unit): Self = StObject.set(x, "setReplaceString", js.Any.fromFunction1(value))
  }
}
