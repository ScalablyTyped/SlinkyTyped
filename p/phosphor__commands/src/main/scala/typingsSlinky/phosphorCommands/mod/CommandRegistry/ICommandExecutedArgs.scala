package typingsSlinky.phosphorCommands.mod.CommandRegistry

import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `commandExecuted` signal.
  */
@js.native
trait ICommandExecutedArgs extends js.Object {
  /**
    * The arguments object passed to the command.
    */
  val args: ReadonlyJSONObject = js.native
  /**
    * The id of the associated command.
    */
  val id: String = js.native
  /**
    * The promise which resolves with the result of the command.
    */
  val result: js.Promise[_] = js.native
}

object ICommandExecutedArgs {
  @scala.inline
  def apply(args: ReadonlyJSONObject, id: String, result: js.Promise[_]): ICommandExecutedArgs = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandExecutedArgs]
  }
  @scala.inline
  implicit class ICommandExecutedArgsOps[Self <: ICommandExecutedArgs] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

