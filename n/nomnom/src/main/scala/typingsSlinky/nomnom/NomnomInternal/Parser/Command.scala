package typingsSlinky.nomnom.NomnomInternal.Parser

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
  /**
    * The name of the command.
    */
  var name: String = js.native
  /**
    * Sets a callback for the command.
    * @param func The callback function.
    * @returns The command.
    */
  def callback(func: js.Function1[/* options */ js.Any, Unit]): Command = js.native
  /**
    * Sets the help string for the command.
    * @param help The help string.
    * @returns The command.
    */
  def help(help: String): Command = js.native
  /**
    * Sets an option of the command.
    * @param name The name of the option.
    * @param spec The specifiction of the option.
    * @returns The command.
    */
  def option(name: String, spec: Option): Command = js.native
  /**
    * Sets the options of the command.
    * @param specs The specifications of the options.
    * @returns The command.
    */
  def options(specs: StringDictionary[Option]): Command = js.native
  /**
    * Sets the usage string for the command.
    * @param usage The usage string.
    * @returns The command.
    */
  def usage(usage: String): Command = js.native
}

object Command {
  @scala.inline
  def apply(
    callback: js.Function1[/* options */ js.Any, Unit] => Command,
    help: String => Command,
    name: String,
    option: (String, Option) => Command,
    options: StringDictionary[Option] => Command,
    usage: String => Command
  ): Command = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), help = js.Any.fromFunction1(help), name = name.asInstanceOf[js.Any], option = js.Any.fromFunction2(option), options = js.Any.fromFunction1(options), usage = js.Any.fromFunction1(usage))
    __obj.asInstanceOf[Command]
  }
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: js.Function1[/* options */ js.Any, Unit] => Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHelp(value: String => Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: (String, Option) => Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[Option] => Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUsage(value: String => Command): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usage")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

