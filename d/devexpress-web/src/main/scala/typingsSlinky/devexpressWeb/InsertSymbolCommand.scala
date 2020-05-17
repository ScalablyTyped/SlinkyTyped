package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to insert a character into the document.
  */
@js.native
trait InsertSymbolCommand extends js.Object {
  /**
    * Executes the InsertSymbolCommand command with the specified parameters. true if the command has been successfully executed; false if the command execution has failed.
    * @param symbol A string value specifying symbols to insert.
    * @param fontName A string value specifying the font of symbols to insert.
    */
  def execute(symbol: String, fontName: String): Boolean = js.native
  /**
    * Gets information about the command's state.
    */
  def getState(): SimpleCommandState = js.native
}

object InsertSymbolCommand {
  @scala.inline
  def apply(execute: (String, String) => Boolean, getState: () => SimpleCommandState): InsertSymbolCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), getState = js.Any.fromFunction0(getState))
    __obj.asInstanceOf[InsertSymbolCommand]
  }
  @scala.inline
  implicit class InsertSymbolCommandOps[Self <: InsertSymbolCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetState(value: () => SimpleCommandState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getState")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

