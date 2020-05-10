package typingsSlinky.jupyterlabSettingeditor.raweditorMod.RawEditor

import typingsSlinky.phosphorCommands.mod.CommandRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The toolbar commands and registry for the setting editor toolbar.
  */
@js.native
trait ICommandBundle extends js.Object {
  /**
    * The command registry.
    */
  var registry: CommandRegistry = js.native
  /**
    * The revert command ID.
    */
  var revert: String = js.native
  /**
    * The save command ID.
    */
  var save: String = js.native
}

object ICommandBundle {
  @scala.inline
  def apply(registry: CommandRegistry, revert: String, save: String): ICommandBundle = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBundle]
  }
  @scala.inline
  implicit class ICommandBundleOps[Self <: ICommandBundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegistry(value: CommandRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRevert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

