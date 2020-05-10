package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgRadialMenuMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit = js.native
  /**
  	 * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
  	 * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
  	 *
  	 * @param $container Optional parameter - if not set it would use the element of the widget as $container
  	 */
  def changeLocale($container: js.Object): Unit = js.native
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Exports visual data from the radial menu to aid in unit testing
  	 */
  def exportVisualData(): Unit = js.native
  /**
  	 * Forces any pending deferred work to render on the radial menu before continuing
  	 */
  def flush(): Unit = js.native
  /**
  	 * Gets or sets the value of a property for the item created with the specified key
  	 *
  	 * @param itemKey The name of the item
  	 * @param key The name of the property/option
  	 * @param value The new value for the property or undefined to obtain the current value
  	 */
  def itemOption(itemKey: String, key: String, value: js.Object): js.Object = js.native
  /**
  	 * Notify the radial menu that style information used for rendering the menu may have been updated.
  	 */
  def styleUpdated(): Unit = js.native
}

object IgRadialMenuMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    destroy: () => Unit,
    exportVisualData: () => Unit,
    flush: () => Unit,
    itemOption: (String, String, js.Object) => js.Object,
    styleUpdated: () => Unit
  ): IgRadialMenuMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), itemOption = js.Any.fromFunction3(itemOption), styleUpdated = js.Any.fromFunction0(styleUpdated))
    __obj.asInstanceOf[IgRadialMenuMethods]
  }
  @scala.inline
  implicit class IgRadialMenuMethodsOps[Self <: IgRadialMenuMethods] (val x: Self) extends AnyVal {
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
    def withChangeLocale(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeLocale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExportVisualData(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportVisualData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlush(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItemOption(value: (String, String, js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemOption")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStyleUpdated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleUpdated")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

