package typingsSlinky.phosphorCommands.mod.CommandRegistry

import typingsSlinky.phosphorCommands.phosphorCommandsStrings.`many-changed`
import typingsSlinky.phosphorCommands.phosphorCommandsStrings.added
import typingsSlinky.phosphorCommands.phosphorCommandsStrings.changed
import typingsSlinky.phosphorCommands.phosphorCommandsStrings.removed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `commandChanged` signal.
  */
@js.native
trait ICommandChangedArgs extends js.Object {
  /**
    * The id of the associated command.
    *
    * This will be `undefined` when the type is `'many-changed'`.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * Whether the command was added, removed, or changed.
    */
  val `type`: added | removed | changed | `many-changed` = js.native
}

object ICommandChangedArgs {
  @scala.inline
  def apply(`type`: added | removed | changed | `many-changed`): ICommandChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandChangedArgs]
  }
  @scala.inline
  implicit class ICommandChangedArgsOps[Self <: ICommandChangedArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: added | removed | changed | `many-changed`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
  }
  
}

