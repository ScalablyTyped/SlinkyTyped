package typingsSlinky.phosphorCommands.mod.CommandRegistry

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which represents a key binding.
  *
  * #### Notes
  * A key binding is an immutable object created by a registry.
  */
@js.native
trait IKeyBinding extends js.Object {
  /**
    * The arguments for the command.
    */
  val args: ReadonlyJSONObject = js.native
  /**
    * The command executed when the binding is matched.
    */
  val command: String = js.native
  /**
    * The key sequence for the binding.
    */
  val keys: js.Array[String] = js.native
  /**
    * The CSS selector for the binding.
    */
  val selector: String = js.native
}

object IKeyBinding {
  @scala.inline
  def apply(args: ReadonlyJSONObject, command: String, keys: js.Array[String], selector: String): IKeyBinding = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyBinding]
  }
  @scala.inline
  implicit class IKeyBindingOps[Self <: IKeyBinding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: ReadonlyJSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

