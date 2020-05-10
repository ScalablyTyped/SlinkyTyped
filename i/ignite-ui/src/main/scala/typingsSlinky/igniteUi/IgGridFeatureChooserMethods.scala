package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridFeatureChooserMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridfeaturechooser#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridfeaturechooser#options:language) or [locale](ui.iggridfeaturechooser#options:locale) option setter
  	 */
  def changeLocale(): Unit = js.native
  def destroy(e: js.Object, args: js.Object): Unit = js.native
  /**
  	 * Get jQuery representation of the div holding dropdown for the specified columnKey
  	 *
  	 * @param columnKey Key of the column
  	 */
  def getDropDownByColumnKey(columnKey: String): Unit = js.native
  /**
  	 * Hide feature chooser dialog by column key
  	 *
  	 * @param columnKey Key of the column that should be hidden.
  	 */
  def hideDropDown(columnKey: String): Unit = js.native
  def shouldShowFeatureIcon(key: js.Object): Unit = js.native
  /**
  	 * Show feature chooser dialog by the specified column key
  	 *
  	 * @param columnKey Key of the column that should be shown.
  	 */
  def showDropDown(columnKey: String): Unit = js.native
  /**
  	 * Show/hide feature chooser dialog by column key
  	 *
  	 * @param columnKey Key of the column that should be shown/hidden.
  	 */
  def toggleDropDown(columnKey: String): Unit = js.native
}

object IgGridFeatureChooserMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    destroy: (js.Object, js.Object) => Unit,
    getDropDownByColumnKey: String => Unit,
    hideDropDown: String => Unit,
    shouldShowFeatureIcon: js.Object => Unit,
    showDropDown: String => Unit,
    toggleDropDown: String => Unit
  ): IgGridFeatureChooserMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), destroy = js.Any.fromFunction2(destroy), getDropDownByColumnKey = js.Any.fromFunction1(getDropDownByColumnKey), hideDropDown = js.Any.fromFunction1(hideDropDown), shouldShowFeatureIcon = js.Any.fromFunction1(shouldShowFeatureIcon), showDropDown = js.Any.fromFunction1(showDropDown), toggleDropDown = js.Any.fromFunction1(toggleDropDown))
    __obj.asInstanceOf[IgGridFeatureChooserMethods]
  }
  @scala.inline
  implicit class IgGridFeatureChooserMethodsOps[Self <: IgGridFeatureChooserMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeGlobalLanguage(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeGlobalLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangeGlobalRegional(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeGlobalRegional")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChangeLocale(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeLocale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDropDownByColumnKey(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDropDownByColumnKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHideDropDown(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDropDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldShowFeatureIcon(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldShowFeatureIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowDropDown(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDropDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToggleDropDown(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleDropDown")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

