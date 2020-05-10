package typingsSlinky.electronUnhandled.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnhandledOptions extends js.Object {
  /**
  		Custom logger that receives the error.
  		Can be useful if you for example integrate with Sentry.
  		@default console.error
  		*/
  val logger: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
  		When specified, the error dialog will include a `Report…` button, which when clicked, executes the given function with the error as the first argument.
  		@default undefined
  		@example
  		```
  		import unhandled = require('electron-unhandled');
  		import {openNewGitHubIssue, debugInfo} = require('electron-util');
  		unhandled({
  			reportButton: error => {
  				openNewGitHubIssue({
  					user: 'sindresorhus',
  					repo: 'electron-unhandled',
  					body: `\`\`\`\n${error.stack}\n\`\`\`\n\n---\n\n${debugInfo()}`
  				});
  			}
  		});
  		// Example of how the GitHub issue will look like: https://github.com/sindresorhus/electron-unhandled/issues/new?body=%60%60%60%0AError%3A+Test%0A++++at+%2FUsers%2Fsindresorhus%2Fdev%2Foss%2Felectron-unhandled%2Fexample.js%3A27%3A21%0A%60%60%60%0A%0A---%0A%0AExample+1.1.0%0AElectron+3.0.8%0Adarwin+18.2.0%0ALocale%3A+en-US
  		```
  		*/
  val reportButton: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.native
  /**
  		Present an error dialog to the user.
  		Default: [Only in production](https://github.com/sindresorhus/electron-is-dev).
  		*/
  val showDialog: js.UndefOr[Boolean] = js.native
}

object UnhandledOptions {
  @scala.inline
  def apply(): UnhandledOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnhandledOptions]
  }
  @scala.inline
  implicit class UnhandledOptionsOps[Self <: UnhandledOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogger(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withReportButton(value: /* error */ js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportButton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReportButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDialog(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDialog")(js.undefined)
        ret
    }
  }
  
}

