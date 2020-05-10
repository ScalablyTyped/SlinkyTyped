package typingsSlinky.ngbootbox

import typingsSlinky.bootbox.BootboxDefaultOptions
import typingsSlinky.bootbox.BootboxLocaleValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootboxService extends js.Object {
  def addLocale(name: String, values: BootboxLocaleValues): Unit = js.native
  def alert(msg: String): js.Promise[_] = js.native
  def confirm(msg: String): js.Promise[_] = js.native
  def customDialog(options: NgBootboxDialog): Unit = js.native
  def hideAll(): Unit = js.native
  def prompt(msg: String): js.Promise[_] = js.native
  def removeLocale(name: String): Unit = js.native
  def setDefaults(options: BootboxDefaultOptions): Unit = js.native
  def setLocale(name: String): Unit = js.native
}

object BootboxService {
  @scala.inline
  def apply(
    addLocale: (String, BootboxLocaleValues) => Unit,
    alert: String => js.Promise[_],
    confirm: String => js.Promise[_],
    customDialog: NgBootboxDialog => Unit,
    hideAll: () => Unit,
    prompt: String => js.Promise[_],
    removeLocale: String => Unit,
    setDefaults: BootboxDefaultOptions => Unit,
    setLocale: String => Unit
  ): BootboxService = {
    val __obj = js.Dynamic.literal(addLocale = js.Any.fromFunction2(addLocale), alert = js.Any.fromFunction1(alert), confirm = js.Any.fromFunction1(confirm), customDialog = js.Any.fromFunction1(customDialog), hideAll = js.Any.fromFunction0(hideAll), prompt = js.Any.fromFunction1(prompt), removeLocale = js.Any.fromFunction1(removeLocale), setDefaults = js.Any.fromFunction1(setDefaults), setLocale = js.Any.fromFunction1(setLocale))
    __obj.asInstanceOf[BootboxService]
  }
  @scala.inline
  implicit class BootboxServiceOps[Self <: BootboxService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLocale(value: (String, BootboxLocaleValues) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLocale")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAlert(value: String => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConfirm(value: String => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCustomDialog(value: NgBootboxDialog => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDialog")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHideAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPrompt(value: String => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveLocale(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLocale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDefaults(value: BootboxDefaultOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLocale(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLocale")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

