package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the interface for binding programmatic names to aliases. Aliases can be provided in several locales for the same programmatic name. */
@js.native
trait XLocalizedAliases extends XInterface {
  /** registers an alias for a programmatic name. */
  def bindAlias(programmaticName: String, locale: Locale, alias: String): Unit = js.native
  /**
    * retrieves a list of all registered aliases for a certain language.
    * @param locale specifies the locale scope.
    * @returns a sequence of registered pair of alias and programmatic name.
    */
  def listAliases(locale: Locale): SafeArray[AliasProgrammaticPair] = js.native
  /** retrieves a registered programmatic name identified by an alias. */
  def lookupAlias(locale: Locale, Alias: String): String = js.native
  /** retrieves a given alias for a programmatic name. */
  def lookupProgrammatic(locale: Locale, programmatic: String): String = js.native
  /** rebinds all aliases registered to a given {@link URL} to a new one. */
  def rebindAliases(currentProgrammatic: String, newProgrammatic: String): Unit = js.native
  /** renames an alias for a programmatic name. */
  def renameAlias(locale: Locale, oldName: String, aNewName: String): Unit = js.native
  /** revokes an alias for a programmatic name. */
  def unbindAlias(locale: Locale, alias: String): Unit = js.native
  /** removes all aliases for a programmatic name. */
  def unbindAliases(programmaticName: String): Unit = js.native
}

object XLocalizedAliases {
  @scala.inline
  def apply(
    acquire: () => Unit,
    bindAlias: (String, Locale, String) => Unit,
    listAliases: Locale => SafeArray[AliasProgrammaticPair],
    lookupAlias: (Locale, String) => String,
    lookupProgrammatic: (Locale, String) => String,
    queryInterface: `type` => js.Any,
    rebindAliases: (String, String) => Unit,
    release: () => Unit,
    renameAlias: (Locale, String, String) => Unit,
    unbindAlias: (Locale, String) => Unit,
    unbindAliases: String => Unit
  ): XLocalizedAliases = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), bindAlias = js.Any.fromFunction3(bindAlias), listAliases = js.Any.fromFunction1(listAliases), lookupAlias = js.Any.fromFunction2(lookupAlias), lookupProgrammatic = js.Any.fromFunction2(lookupProgrammatic), queryInterface = js.Any.fromFunction1(queryInterface), rebindAliases = js.Any.fromFunction2(rebindAliases), release = js.Any.fromFunction0(release), renameAlias = js.Any.fromFunction3(renameAlias), unbindAlias = js.Any.fromFunction2(unbindAlias), unbindAliases = js.Any.fromFunction1(unbindAliases))
    __obj.asInstanceOf[XLocalizedAliases]
  }
  @scala.inline
  implicit class XLocalizedAliasesOps[Self <: XLocalizedAliases] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindAlias(value: (String, Locale, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindAlias")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withListAliases(value: Locale => SafeArray[AliasProgrammaticPair]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listAliases")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLookupAlias(value: (Locale, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupAlias")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLookupProgrammatic(value: (Locale, String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupProgrammatic")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRebindAliases(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rebindAliases")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRenameAlias(value: (Locale, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameAlias")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUnbindAlias(value: (Locale, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindAlias")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnbindAliases(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbindAliases")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

