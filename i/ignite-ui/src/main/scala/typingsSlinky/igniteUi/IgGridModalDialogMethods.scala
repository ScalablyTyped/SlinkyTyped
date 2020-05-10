package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridModalDialogMethods extends js.Object {
  /**
  	 * Changes the widget language to global language. Global language is the value in $.ig.util.language
  	 */
  def changeGlobalLanguage(): Unit = js.native
  /**
  	 * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
  	 */
  def changeGlobalRegional(): Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridmodaldialog#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridmodaldialog#options:language) or [locale](ui.iggridmodaldialog#options:locale) option setter
  	 */
  def changeLocale(): Unit = js.native
  def closeModalDialog(accepted: js.Object, e: js.Object): Unit = js.native
  def destroy(): Unit = js.native
  def getCaptionButtonContainer(): Unit = js.native
  def getContent(): Unit = js.native
  def getFooter(): Unit = js.native
  def openModalDialog(): Unit = js.native
}

object IgGridModalDialogMethods {
  @scala.inline
  def apply(
    changeGlobalLanguage: () => Unit,
    changeGlobalRegional: () => Unit,
    changeLocale: () => Unit,
    closeModalDialog: (js.Object, js.Object) => Unit,
    destroy: () => Unit,
    getCaptionButtonContainer: () => Unit,
    getContent: () => Unit,
    getFooter: () => Unit,
    openModalDialog: () => Unit
  ): IgGridModalDialogMethods = {
    val __obj = js.Dynamic.literal(changeGlobalLanguage = js.Any.fromFunction0(changeGlobalLanguage), changeGlobalRegional = js.Any.fromFunction0(changeGlobalRegional), changeLocale = js.Any.fromFunction0(changeLocale), closeModalDialog = js.Any.fromFunction2(closeModalDialog), destroy = js.Any.fromFunction0(destroy), getCaptionButtonContainer = js.Any.fromFunction0(getCaptionButtonContainer), getContent = js.Any.fromFunction0(getContent), getFooter = js.Any.fromFunction0(getFooter), openModalDialog = js.Any.fromFunction0(openModalDialog))
    __obj.asInstanceOf[IgGridModalDialogMethods]
  }
  @scala.inline
  implicit class IgGridModalDialogMethodsOps[Self <: IgGridModalDialogMethods] (val x: Self) extends AnyVal {
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
    def withCloseModalDialog(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeModalDialog")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCaptionButtonContainer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCaptionButtonContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFooter(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFooter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpenModalDialog(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openModalDialog")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

