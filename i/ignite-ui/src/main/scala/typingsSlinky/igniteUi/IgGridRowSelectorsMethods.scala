package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridRowSelectorsMethods extends js.Object {
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridrowselectors#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridrowselectors#options:language) or [locale](ui.iggridrowselectors#options:locale) option setter
  	 */
  def changeLocale(): Unit = js.native
  def destroy(): Unit = js.native
  def rsRenderColgroup(): Unit = js.native
}

object IgGridRowSelectorsMethods {
  @scala.inline
  def apply(changeLocale: () => Unit, destroy: () => Unit, rsRenderColgroup: () => Unit): IgGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal(changeLocale = js.Any.fromFunction0(changeLocale), destroy = js.Any.fromFunction0(destroy), rsRenderColgroup = js.Any.fromFunction0(rsRenderColgroup))
    __obj.asInstanceOf[IgGridRowSelectorsMethods]
  }
  @scala.inline
  implicit class IgGridRowSelectorsMethodsOps[Self <: IgGridRowSelectorsMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeLocale(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeLocale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRsRenderColgroup(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rsRenderColgroup")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

