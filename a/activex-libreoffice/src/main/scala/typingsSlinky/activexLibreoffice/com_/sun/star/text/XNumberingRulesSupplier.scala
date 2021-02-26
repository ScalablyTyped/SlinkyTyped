package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface enables the object to handle numbering rules.
  * @see com.sun.star.text.NumberingRules
  */
@js.native
trait XNumberingRulesSupplier extends XInterface {
  
  /** @returns the collection of "NumberingRules" currently contained in the object. */
  val NumberingRules: XIndexAccess = js.native
  
  /** @returns the collection of "NumberingRules" currently contained in the object. */
  def getNumberingRules(): XIndexAccess = js.native
}
object XNumberingRulesSupplier {
  
  @scala.inline
  def apply(
    NumberingRules: XIndexAccess,
    acquire: () => Unit,
    getNumberingRules: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNumberingRulesSupplier = {
    val __obj = js.Dynamic.literal(NumberingRules = NumberingRules.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getNumberingRules = js.Any.fromFunction0(getNumberingRules), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XNumberingRulesSupplier]
  }
  
  @scala.inline
  implicit class XNumberingRulesSupplierMutableBuilder[Self <: XNumberingRulesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNumberingRules(value: () => XIndexAccess): Self = StObject.set(x, "getNumberingRules", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNumberingRules(value: XIndexAccess): Self = StObject.set(x, "NumberingRules", value.asInstanceOf[js.Any])
  }
}
