package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgBulletGraphMethods extends js.Object {
  /**
  	 * Adds a new range to the bullet graph.
  	 *
  	 * @param value The range object to be added.
  	 */
  def addRange(value: js.Object): Unit = js.native
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
  	 * Destroys widget.
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Returns information about how the bullet graph is rendered.
  	 */
  def exportVisualData(): js.Object = js.native
  /**
  	 * Causes all pending changes of the bullet graph e.g. by changed property values to be rendered immediately.
  	 */
  def flush(): Unit = js.native
  /**
  	 * Returns a string containing the names of all the ranges delimited with a \n symbol.
  	 */
  def getRangeNames(): Unit = js.native
  /**
  	 * Removes a range from the bullet graph.
  	 *
  	 * @param value A JS object with properties set as follows: name: nameOfTheRangeToRemove, remove: true
  	 */
  def removeRange(value: js.Object): Unit = js.native
  /**
  	 * Re-polls the css styles for the widget. Use this method when the css styles have been modified.
  	 */
  def styleUpdated(): Unit = js.native
  /**
  	 * Updates the specified range of the bullet graph.
  	 *
  	 * @param value The range object to be updated.
  	 */
  def updateRange(value: js.Object): Unit = js.native
}

object IgBulletGraphMethods {
  @scala.inline
  def apply(
    addRange: js.Object => Unit,
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: js.Object => Unit,
    destroy: () => Unit,
    exportVisualData: () => js.Object,
    flush: () => Unit,
    getRangeNames: () => Unit,
    removeRange: js.Object => Unit,
    styleUpdated: () => Unit,
    updateRange: js.Object => Unit
  ): IgBulletGraphMethods = {
    val __obj = js.Dynamic.literal(addRange = js.Any.fromFunction1(addRange), changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction1(changeLocale), destroy = js.Any.fromFunction0(destroy), exportVisualData = js.Any.fromFunction0(exportVisualData), flush = js.Any.fromFunction0(flush), getRangeNames = js.Any.fromFunction0(getRangeNames), removeRange = js.Any.fromFunction1(removeRange), styleUpdated = js.Any.fromFunction0(styleUpdated), updateRange = js.Any.fromFunction1(updateRange))
    __obj.asInstanceOf[IgBulletGraphMethods]
  }
  @scala.inline
  implicit class IgBulletGraphMethodsOps[Self <: IgBulletGraphMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddRange(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRange")(js.Any.fromFunction1(value))
        ret
    }
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
    def withExportVisualData(value: () => js.Object): Self = {
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
    def withGetRangeNames(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRangeNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveRange(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyleUpdated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleUpdated")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpdateRange(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRange")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

