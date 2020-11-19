package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
@js.native
trait XSpellChecker1 extends XSupportedLanguages {
  
  def isValid(aWord: String, nLanguage: Double, aProperties: PropertyValues): Boolean = js.native
  
  def spell(aWord: String, nLanguage: Double, aProperties: PropertyValues): XSpellAlternatives = js.native
}
object XSpellChecker1 {
  
  @scala.inline
  def apply(
    Languages: SafeArray[Double],
    acquire: () => Unit,
    getLanguages: () => SafeArray[Double],
    hasLanguage: Double => Boolean,
    isValid: (String, Double, PropertyValues) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    spell: (String, Double, PropertyValues) => XSpellAlternatives
  ): XSpellChecker1 = {
    val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLanguages = js.Any.fromFunction0(getLanguages), hasLanguage = js.Any.fromFunction1(hasLanguage), isValid = js.Any.fromFunction3(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), spell = js.Any.fromFunction3(spell))
    __obj.asInstanceOf[XSpellChecker1]
  }
  
  @scala.inline
  implicit class XSpellChecker1Ops[Self <: XSpellChecker1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsValid(value: (String, Double, PropertyValues) => Boolean): Self = this.set("isValid", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSpell(value: (String, Double, PropertyValues) => XSpellAlternatives): Self = this.set("spell", js.Any.fromFunction3(value))
  }
}
