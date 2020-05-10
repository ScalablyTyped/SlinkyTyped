package typingsSlinky.ngDialog.mod.angularAugmentingMod.dialog

import typingsSlinky.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDialogProvider extends IServiceProvider {
  /**
  			 * Default options for the dialogs.
  			 * @param defaultOptions
  			 * @returns {}
  			 */
  def setDefaults(defaultOptions: IDialogOptions): Unit = js.native
  /**
  			 * Adds additional listener on every $locationChangeSuccess event and gets updated version of body into dialog.
  			 * Maybe useful in some rare cases when you're dependant on DOM changes, defaults to false. Use it in module's
  			 * config as provider instance:
  			 * @param {boolean} force
  			 */
  def setForceBodyReload(force: Boolean): Unit = js.native
  /**
  			 * Adds an additional listener on every $locationChangeSuccess event and gets update version of html into dialog.
  			 * May be useful in some rare cases when you're dependant on DOM changes, defaults to false.
  			 * @param {boolean} force
  			 */
  def setForceHtmlReload(force: Boolean): Unit = js.native
}

object IDialogProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    setDefaults: IDialogOptions => Unit,
    setForceBodyReload: Boolean => Unit,
    setForceHtmlReload: Boolean => Unit
  ): IDialogProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], setDefaults = js.Any.fromFunction1(setDefaults), setForceBodyReload = js.Any.fromFunction1(setForceBodyReload), setForceHtmlReload = js.Any.fromFunction1(setForceHtmlReload))
    __obj.asInstanceOf[IDialogProvider]
  }
  @scala.inline
  implicit class IDialogProviderOps[Self <: IDialogProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetDefaults(value: IDialogOptions => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaults")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetForceBodyReload(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setForceBodyReload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetForceHtmlReload(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setForceHtmlReload")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

