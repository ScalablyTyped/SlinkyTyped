package typingsSlinky.jupyterlabLogconsoleExtension.statusMod.LogConsoleStatus

import typingsSlinky.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for creating a new LogConsoleStatus item
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The logger registry providing the logs.
    */
  var loggerRegistry: ILoggerRegistry = js.native
  /**
    * A click handler for the item. By default
    * Log Console panel is launched.
    */
  def handleClick(): Unit = js.native
}

object IOptions {
  @scala.inline
  def apply(handleClick: () => Unit, loggerRegistry: ILoggerRegistry): IOptions = {
    val __obj = js.Dynamic.literal(handleClick = js.Any.fromFunction0(handleClick), loggerRegistry = loggerRegistry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoggerRegistry(value: ILoggerRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loggerRegistry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

