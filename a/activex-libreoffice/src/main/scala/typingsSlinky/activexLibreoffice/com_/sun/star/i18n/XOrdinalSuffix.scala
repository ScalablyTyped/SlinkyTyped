package typingsSlinky.activexLibreoffice.com_.sun.star.i18n

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to locale specific ordinal suffix systems.
  * @since OOo 2.2
  */
@js.native
trait XOrdinalSuffix extends XInterface {
  
  /**
    * Returns all the possible ordinal suffixes for the number.
    *
    * This method will provide "<b>st</b>", "<b>nd</b>", "<b>rd</b>", "<b>th</b>" for an English locale, depending on the provided number. In some locales
    * like French, Italian or Spanish it ca return several suffixes for one number.
    *
    * Examples: for the number '1', the values will be **st** in English, but **er** and **re** in French. All these values may depend on the underlying
    * version of ICU.
    */
  def getOrdinalSuffix(nNumber: Double, aLocale: Locale): SafeArray[String] = js.native
}
object XOrdinalSuffix {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getOrdinalSuffix: (Double, Locale) => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XOrdinalSuffix = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getOrdinalSuffix = js.Any.fromFunction2(getOrdinalSuffix), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XOrdinalSuffix]
  }
  
  @scala.inline
  implicit class XOrdinalSuffixOps[Self <: XOrdinalSuffix] (val x: Self) extends AnyVal {
    
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
    def setGetOrdinalSuffix(value: (Double, Locale) => SafeArray[String]): Self = this.set("getOrdinalSuffix", js.Any.fromFunction2(value))
  }
}
