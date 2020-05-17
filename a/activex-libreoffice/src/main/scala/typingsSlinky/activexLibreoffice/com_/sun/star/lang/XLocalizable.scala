package typingsSlinky.activexLibreoffice.com_.sun.star.lang

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to set a {@link Locale} to be used by the object. */
@js.native
trait XLocalizable extends XInterface {
  /** @returns the locale, which is used by this object. */
  var Locale: typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale = js.native
  /** @returns the locale, which is used by this object. */
  def getLocale(): Locale = js.native
  /** sets the locale to be used by this object. */
  def setLocale(eLocale: Locale): Unit = js.native
}

object XLocalizable {
  @scala.inline
  def apply(
    Locale: Locale,
    acquire: () => Unit,
    getLocale: () => Locale,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLocale: Locale => Unit
  ): XLocalizable = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLocale = js.Any.fromFunction0(getLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLocale = js.Any.fromFunction1(setLocale))
    __obj.asInstanceOf[XLocalizable]
  }
  @scala.inline
  implicit class XLocalizableOps[Self <: XLocalizable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocale(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLocale(value: () => Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLocale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetLocale(value: Locale => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocale")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

