package typingsSlinky.cypress.cypressMod.Cypress

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.cypress.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfig extends js.Object {
  /** The JQuery element for the command. This will highlight the command in the main window when debugging */
  @JSName("$el")
  var $el: JQuery_[HTMLElement] = js.native
  /** Override *name* for display purposes only */
  var displayName: String = js.native
  var message: js.Array[_] = js.native
  /** Allows the name of the command to be overwritten */
  var name: String = js.native
  /** Return an object that will be printed in the dev tools console */
  def consoleProps(): ObjectLike = js.native
}

object LogConfig {
  @scala.inline
  def apply(
    $el: JQuery_[HTMLElement],
    consoleProps: () => ObjectLike,
    displayName: String,
    message: js.Array[_],
    name: String
  ): LogConfig = {
    val __obj = js.Dynamic.literal($el = $el.asInstanceOf[js.Any], consoleProps = js.Any.fromFunction0(consoleProps), displayName = displayName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogConfig]
  }
  @scala.inline
  implicit class LogConfigOps[Self <: LogConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$el(value: JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsoleProps(value: () => ObjectLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consoleProps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

