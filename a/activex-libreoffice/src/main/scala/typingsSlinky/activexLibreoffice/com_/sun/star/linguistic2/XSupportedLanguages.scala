package typingsSlinky.activexLibreoffice.com_.sun.star.linguistic2

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XSupportedLanguages extends XInterface {
  val Languages: SafeArray[Double] = js.native
  def getLanguages(): SafeArray[Double] = js.native
  def hasLanguage(nLanguage: Double): Boolean = js.native
}

object XSupportedLanguages {
  @scala.inline
  def apply(
    Languages: SafeArray[Double],
    acquire: () => Unit,
    getLanguages: () => SafeArray[Double],
    hasLanguage: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSupportedLanguages = {
    val __obj = js.Dynamic.literal(Languages = Languages.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLanguages = js.Any.fromFunction0(getLanguages), hasLanguage = js.Any.fromFunction1(hasLanguage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSupportedLanguages]
  }
  @scala.inline
  implicit class XSupportedLanguagesOps[Self <: XSupportedLanguages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguages(value: SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Languages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLanguages(value: () => SafeArray[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLanguages")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasLanguage(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLanguage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

