package typingsSlinky.jupyterlabApplication.routerMod.Router

import typingsSlinky.phosphorCommands.mod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for instantiating a JupyterLab URL router.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The fully qualified base URL for the router.
    */
  var base: String = js.native
  /**
    * The command registry used by the router.
    */
  var commands: CommandRegistry = js.native
}

object IOptions {
  @scala.inline
  def apply(base: String, commands: CommandRegistry): IOptions = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommands(value: CommandRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commands")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

